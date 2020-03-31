import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class RecorridoDOM {
    private Document documento;

    public RecorridoDOM(String fichero) {
        Document docu = null;
        try {
            DocumentBuilderFactory df = DocumentBuilderFactory.newDefaultInstance();
            DocumentBuilder db = df.newDocumentBuilder();
            docu = db.parse(new File(fichero));
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        if ( docu != null) {
            documento = docu;
        } else {
            System.out.println("El documento no se ha leido correctamente");
        }
    }

    public Document getDocumento() {
        return documento;
    }

    public void numNodosHijos(){
        Element raiz = documento.getDocumentElement();
        System.out.println("Hijos del elemento raiz: " + raiz .getChildNodes().getLength());
        System.out.println("Tipos de nodos hijo: ");
        NodeList lista_n = raiz .getChildNodes();
        for (int i = 0; i < lista_n.getLength(); i++) {
            if ( lista_n.item(i).getNodeType() == Node.ELEMENT_NODE) {
                System.out.println("Nodo Etiqueta: " + lista_n.item(i).getNodeName());
            } else if ( lista_n.item(i).getNodeType() == Node.TEXT_NODE ) {
                System.out.println( "Nodo Texto: " + lista_n.item(i).getNodeName() );
            } else if ( lista_n.item(i).getNodeType() == Node.COMMENT_NODE ) {
                System.out.println( "Nodo comentario: " + lista_n.item(i).getNodeName());
            } else if ( lista_n.item(i).getNodeType() == Node.ATTRIBUTE_NODE ) {
                System.out.println("Nodo Atributo:" + lista_n.item(i).getNodeName());
            }
        }
        System.out.println();
    }

    public void mostrarXMLDom() {
        Element raiz = documento.getDocumentElement();
        NodeList lista_n = raiz.getChildNodes();
        for (int i = 0; i < lista_n.getLength(); i++) {
            if ( lista_n.item(i).getNodeType() == Node.ELEMENT_NODE) {
                Element elemento = (Element) lista_n.item(i);
                System.out.println("Etiqueta " + elemento.getTagName() + ": " +lista_n.item(i).getTextContent() );
                if ( elemento.hasAttributes() ) {
                    NamedNodeMap atributos = elemento.getAttributes();
                    System.out.print("Atributos:");
                    for (int j = 0; j < atributos.getLength() ; j++) {
                        System.out.print(" " + atributos.item(j).getNodeName() + "=" + atributos.item(j).getNodeValue());
                    }
                    System.out.println();
                }
                NodeList comentarios = elemento.getChildNodes();
                for (int j = 0; j < comentarios.getLength(); j++) {
                    if ( comentarios.item(j).getNodeType() == Node.COMMENT_NODE ) {
                        System.out.println( "Comentario: " + comentarios.item(j).getTextContent());
                    }
                }
                System.out.println("---------------------------------------");
            } else if ( lista_n.item(i).getNodeType() == Node.TEXT_NODE ) {
                System.out.println( "Texto: " + lista_n.item(i).getTextContent());
                System.out.println("---------------------------------------");
            } else if ( lista_n.item(i).getNodeType() == Node.COMMENT_NODE ) {
                System.out.println( "Comentario: " + lista_n.item(i).getTextContent());
                System.out.println("---------------------------------------");
            }
        }
    }

    public void mostrarContenidoEtiqueta(Element e) {
        if ( e.hasChildNodes() ) {
            leeRecursivo(e);
        } else {
            System.out.println("Esta etiqueta esta vacia");
        }
    }

    public void leeRecursivo( Node nodo ) {
        if (nodo != null) {
            NodeList hijos = nodo.getChildNodes();
            if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                Element elemento = (Element) nodo;
                System.out.println("Etiqueta " + elemento.getTagName() + ": ");
                System.out.println(nodo.getTextContent());
                if (elemento.hasAttributes()) {
                    NamedNodeMap atributos = elemento.getAttributes();
                    System.out.print("Atributos:");
                    for (int i = 0; i < atributos.getLength(); i++) {
                        System.out.print(" " + atributos.item(i).getNodeName() + "=" + atributos.item(i).getNodeValue());
                    }
                    System.out.println();
                }
                NodeList comentarios = elemento.getChildNodes();
                for (int j = 0; j < comentarios.getLength(); j++) {
                    if ( comentarios.item(j).getNodeType() == Node.COMMENT_NODE ) {
                        System.out.println( "Comentario: " + comentarios.item(j).getTextContent());
                    }
                }
                System.out.println("---------------------------------------");
            } else if (nodo.getNodeType() == Node.TEXT_NODE) {
                Text texto = (Text) nodo;
                System.out.println("Texto: " + texto.getWholeText());
                System.out.println("---------------------------------------");
            } else if (nodo.getNodeType() == Node.COMMENT_NODE) {
                Comment comentario = (Comment) nodo;
                System.out.println("Comentario: " + comentario.getTextContent());
                System.out.println("---------------------------------------");
            }
            for (int i = 0; i < hijos.getLength(); i++) {
                Node nieto = hijos.item(i);
                leeRecursivo(nieto);
            }
        }
    }

}
