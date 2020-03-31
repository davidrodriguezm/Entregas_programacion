import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class principal {
    public static void main(String[] args) {
        RecorridoDOM reco_dom = new RecorridoDOM("src\\Clientesbanco.xml");
        System.out.println("Metodo numNodosHijos:\n");
        reco_dom.numNodosHijos();
        System.out.println("\nMetodo mostrarXMLDom:\n");
        reco_dom.mostrarXMLDom();
        Document documento = reco_dom.getDocumento();
        NodeList listaNodos=documento.getElementsByTagName("cliente");
        Element etiquerta = (Element) listaNodos.item(0);
        System.out.println("\nMetodo mostrarContenidoEtiqueta:\n");
        reco_dom.mostrarContenidoEtiqueta(etiquerta);
        RecorridoSax reco_sax = new RecorridoSax();
        try {
            SAXParserFactory factoria = SAXParserFactory.newInstance();
            SAXParser parser_sax = factoria.newSAXParser();
            parser_sax.parse(new File("src\\Clientesbanco.xml"),reco_sax);
        }  catch (SAXException | ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
    }
}
