/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemas_de_archivos_de_la_alianza_rebelde;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.io.File;

/**
 *
 * @author Pablo Miguel paso 1 y 2, Ortigosa paso 3 y Alejandro Parra paso 4
 */
public class Sistemas_de_Archivos_de_la_Alianza_Rebelde {

    public static void main(String[] args) {
        
        //Paso 2
        try{
            //Instancio la factoria y el constructor DOM y cargo en archivo en memoria
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new File("imperio.xml"));
            
            //Cojo el elemento raiz del documento y lo muestro por pantalla
            System.out.println("Elemento raíz: " + doc.getDocumentElement().getNodeName());
            
            //Creo una lista con los nodos naves para poder recorrerla
            NodeList listaNaves = doc.getElementsByTagName("nave");
            for (int i = 0; i<listaNaves.getLength(); i++){
                Node nodo = listaNaves.item(i);
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    
                    //Cojo el elemento de la tablay de él cojo el id, el nombre y el piloto y los muestro en pantalla
                    Element elemento = (Element) nodo;
                    String id = elemento.getAttribute("id");
                    String nombre = elemento.getElementsByTagName("nombre").item(0).getTextContent();
                    String piloto = elemento.getElementsByTagName("piloto").item(0).getTextContent();
                    System.out.println("ID: "+id+", nave: "+nombre+", pilotada por: "+piloto);
                }
            }
            
        }catch (Exception e){
            System.err.println("Error al parsear con DOM: " + e.getMessage());
        }
    }
}
