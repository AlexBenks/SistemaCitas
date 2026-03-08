/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author victo
 */
public class Cliente {
    //atributos clase cliente
    private int id;
    private String nombre;
    private String telefono;
    
    //Constructor Clase cliente
    
    public Cliente(int id, String nombre, String telefono){
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    // COnstructor vacio
    public Cliente(){
    }
    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    //Getters
    public String getNombre(){
        return nombre;
    }
    public String getTelefono(){
        return telefono;
    }
    @Override
    public String toString(){
        return "Cliente: " + nombre +"| Tel: " + telefono;
    }
}
