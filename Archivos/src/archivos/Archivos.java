/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author capacita_mecon
 */
public class Archivos {
//LECTURA Y ESCRITURA DE ARCHIVOS DE TEXTO

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws URISyntaxException, IOException {

        escribirEnTxt();
        
        System.out.println("LEEMOS DEL ARCHIVO");
        
        leerDeTxt();
        
    }

    public static void escribirEnTxt() {

        File file = new File("archivo.txt");
        PrintWriter pw = null; 
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println(file.getName() + " Ha sido creado");
            } catch (IOException ex) {
                System.out.println("Ruta inexistente");
            }
            finally
                    {
                       
                    }
        } else {
            try {
                pw = new PrintWriter(file, "utf-8");
                pw.println("Primera linea");//13
                pw.println("Segunda linea");//13
                pw.println(" ");//1
                pw.printf("hola como estan todos hoy?", 10);//25
                pw.println(" ");//1
                pw.printf("Hola %s en %d veces", "mundo", 100);//23
               
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            finally
            {
                 pw.close();
            }
        }

        System.out.println("Nombre: " + file.getName());
        System.out.println("Ruta: " + file.getPath());
        System.out.println("Se Puede leer: " + file.canRead());
        System.out.println("Se puede escribir: " + file.canWrite());
        System.out.println("Es Un directorio: " + file.isDirectory());

        System.out.println("Tamaño: " + file.length());
        
    }

    public static void leerDeTxt() throws FileNotFoundException, IOException {
        File f;
        FileReader lectorArchivo;

        f = new File("archivo.txt");

        String l = "";
        String aux = "";

        lectorArchivo = new FileReader(f);
        BufferedReader br = new BufferedReader(lectorArchivo);
        while (true) {

            aux = br.readLine();
            if (aux != null) {
                l = l + aux + "\n";
            } else {
                break;
            }
        } 
        System.out.println(l);
        br.close();
        lectorArchivo.close();
    }
}