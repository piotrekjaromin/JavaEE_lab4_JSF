package netBeansExercise.backing;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlSelectBooleanCheckbox;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import java.io.Serializable;

@ManagedBean(name="loginBean")
@RequestScoped
public class LoginBean implements Serializable {
    private String username;
    private String password;
    private HtmlSelectBooleanCheckbox acceptCheckbox;
    private HtmlCommandButton loginButton;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String login() {
        if (username.equals(password)) {
            return "success.xhtml";
        } else {
            return "failure.xhtml";
        }
    }

    public HtmlSelectBooleanCheckbox getAcceptCheckbox() {
        return acceptCheckbox;
    }

    public void setAcceptCheckbox(HtmlSelectBooleanCheckbox acceptCheckbox) {
        this.acceptCheckbox = acceptCheckbox;
    }

    public HtmlCommandButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(HtmlCommandButton loginButton) {
        this.loginButton = loginButton;
    }

    public void activateButton(ValueChangeEvent e)
    {
        if (acceptCheckbox.isSelected())
            loginButton.setDisabled(false);
        else
            loginButton.setDisabled(true);

        FacesContext context = FacesContext.getCurrentInstance();
        context.renderResponse();
    }
}
