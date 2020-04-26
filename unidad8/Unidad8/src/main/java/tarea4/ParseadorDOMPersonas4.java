package tarea4;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;


abstract class ParseadorDOMPersonas4 {

    public static void parse(String nomFile) {
        Document docu = null;
        try {
            DocumentBuilderFactory df = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db = df.newDocumentBuilder();
            docu = db.parse(new File(nomFile));
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if ( docu != null) {
           leeDOM(docu);
        }
    }

    public static void leeDOM( Node nodo ) {
        if ( nodo != null ) {
            NodeList hijos = nodo.getChildNodes();
            if ( nodo.getNodeType() == Node.ELEMENT_NODE) {
                System.out.println("-------------------------------------------");
                Element elemento = (Element) nodo;
                System.out.println("Etiqueta " + elemento.getTagName() + ":");
                if ( elemento.hasAttributes() ) {
                    NamedNodeMap atributos = elemento.getAttributes();
                    System.out.print("Atributos:");
                    for (int i = 0; i < atributos.getLength() ; i++) {
                        System.out.print(" " + atributos.item(i).getNodeName() + "=" + atributos.item(i).getNodeValue());
                    }
                    System.out.println();
                }
            } else if ( nodo.getNodeType() == Node.TEXT_NODE ) {
                Text texto = (Text) nodo;
                System.out.println( "Texto: " + texto.getWholeText() );
            } else if ( nodo.getNodeType() == Node.COMMENT_NODE ) {
                Comment comentario = (Comment) nodo;
                System.out.println( "comentario: " + comentario.getTextContent() );
            }
            for (int i = 0; i < hijos.getLength() ; i++) {
                Node nieto = hijos.item(i);
                leeDOM(nieto);
            }
        }
    }

}
