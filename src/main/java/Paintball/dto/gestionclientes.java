
package Paintball.dto;

import java.util.List;
import java.util.ArrayList;

public class gestionclientes {
    
     private static List<Cliente> listausuarios = new ArrayList<>();
     private static int id;
     private static String apellidos;
     private static String nif;
     private static String nombre;
     
    public static void aniadirClienete(int id, String apellidos, String nif, String nombre){
        gestionclientes.id = id;
        gestionclientes.apellidos = apellidos;
        gestionclientes.nif = nif;
        gestionclientes.nombre = nombre;
        

    } 
    
    public static void actualizarCliente(int numero, Cliente cliente){
        listausuarios.set(numero,cliente);

    } 
    
    public static void borrarCliente(int numero){
        listausuarios.remove(numero);
    } 
    
    public static int getIdCliente(){
         
        return id;
    }
    
    public static String getNomCliente(){
         
        return nombre;
    }
    
    public static String getApeCliente(){
         
        return apellidos;
    }
    
    public static String getnifCliente(){
         
        return nif;
    }
    
    
    
}
