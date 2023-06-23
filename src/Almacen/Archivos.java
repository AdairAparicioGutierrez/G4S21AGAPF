/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen;


import Informacion.Convertir;

import Informacion.Datos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author tesoem
 */
public class Archivos {
     List<Datos> contenido = new ArrayList<>();
    
    public List<Datos> Leer(){
        String linea;
        Datos Datos;
        if (verificar()){
        try { 
            FileReader Archivos = new FileReader("Datos.adair");
            BufferedReader br = new BufferedReader(Archivos);
            while((linea = br.readLine()) != null){
                Datos = new Datos();
                Convertir Convertir = new Convertir();
                Datos = Convertir.aclase(linea);
                contenido.add(Datos);               
            }
            br.close();
            Archivos.close();
            if (!!contenido.isEmpty()){
                contenido = null;
            }
        } catch (FileNotFoundException ex) {
           ex.printStackTrace();
        } catch (IOException ex) {
           ex.printStackTrace();
        }
        }else{
            contenido = null;
        }
        return contenido;
        
}
    public boolean Grabar(List<Datos> Lista){
        Convertir convertir = new Convertir();
        boolean estado = true;
        try {
            FileWriter Archivos = new FileWriter("datos.vic");
            BufferedWriter bw = new BufferedWriter(Archivos);
            for (Datos cadena : Lista)
            bw.write(convertir.ajson(cadena)+"\n");
            bw.close();
            Archivos.close();
            
        } catch (IOException ex) {
           ex.printStackTrace();
           estado = false;
        }
        return estado;
    }
   private boolean verificar(){
       File archivo = new File("datos.vic");
       if (archivo.exists())
           return true;
       else
           return false;
   }

}
    
    
