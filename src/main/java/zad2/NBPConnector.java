package zad2;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;


public class NBPConnector {
	public static final String URL_NBP = "http://www.nbp.pl/Kursy/KursyA.html";
	public static final String URL_NBP_XML = "http://www.nbp.pl/Kursy/xml/";
	
	public static String exchangeRate(String currencyShort) {
		return conectAndGetCurrency(currencyShort, connectAndGetActualXMLExchangeRate());
	}
	
	public static String connectAndGetActualXMLExchangeRate() {
		String filename = null;
		try {
			
			URL url = new URL(URL_NBP);
			DataInputStream inputStream = new DataInputStream(url.openStream());
			BufferedReader reader = new BufferedReader( new InputStreamReader( inputStream) );
			while (true) {
				String s= reader.readLine();
			    if (s.indexOf(".xml") != -1) 
			    { 
			         filename = s.substring(s.indexOf(".xml") - 11, s.indexOf(".xml") +	4);
			         break; 
			    } 			
			}
					
		} catch(IOException e) {
			System.err.println(e);
		}
		return filename;
	}
	
	
	public static String conectAndGetCurrency(String currencyShort, String xml) {
		String xmlFilename = URL_NBP_XML+xml;
		try {
			
			URL url = new URL(xmlFilename);
			DataInputStream inputStream = new DataInputStream(url.openStream());
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc = builder.parse(inputStream);
			XPath path = XPathFactory.newInstance().newXPath();

			String value = path.evaluate("//tabela_kursow/pozycja[kod_waluty=\""+currencyShort+"\"]/kurs_sredni", doc);
			if ( !"".equals(value) ) {
				return value;
			}
					
		} catch(IOException e) {
			System.err.println(e);
		} catch(ParserConfigurationException e) {
			System.err.println(e);
		} catch(SAXException e) {
			System.err.println(e);
		} catch(XPathExpressionException e) {
			System.err.println(e);
		}
		return null;
	}
	
}
