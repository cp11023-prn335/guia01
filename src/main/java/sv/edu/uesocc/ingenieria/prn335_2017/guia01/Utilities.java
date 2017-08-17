/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.guia01;

/**
 *
 * @author PC24
 */
public class Utilities {
    
//devolver los primeros 30 caracteres 
   public String getResume(String texto){
   char cad30; 
   String salida="";   
   
   texto="Cadena de texto que contiene la introducción de un determinado post.";  
       for ( int i = 0; i < 30; i++) {
       cad30=texto.charAt(i);
       salida=salida+""+cad30; 
       }
   
   return salida;
   }
   
//el texto que se ha recibido con cada palabra capitalizada y sin dobles espacios
   public String capitalizar(String texto){
   texto="Cadena de texto que contiene el título de un determinado post.";
   char capi;
   String salida="";
   for ( int i = 0; i < texto.length(); i++) {
       capi=texto.charAt(i);
       if(capi==' '){
       capi=texto.charAt(i+1);
      
       }
       salida=salida+""+capi; 
       }
   
   return "";    
   }
   
//La cantidad de coincidencias(case-ignore) de la frase en el texto recibido.   
 public int contarCoincidencias(String frase, String texto){

 return 0;
 }  
    
    
    
}
