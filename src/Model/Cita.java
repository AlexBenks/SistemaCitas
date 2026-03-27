/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.time.LocalDate;
import java.time.LocalTime;
/**
 *
 * @author victo
 */
public class Cita {
    //Atributos Cita
    private int id;
    private Cliente cliente;
    private LocalDate fecha;
    private LocalTime hora;
    private String motivo;
    
    // Constructor Cita
    public Cita(int id, Cliente cliente, LocalDate fecha, LocalTime hora, String motivo){
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;}
    //Constructor vacio
    public Cita(){
    }
    
    //Setters
    public void setId(int id){
    this.id = id;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public void setFecha(LocalDate fecha){
        this.fecha = fecha;
    }
    public void setHora (LocalTime hora){
        this.hora = hora;
    }
    public void setMotivo(String motivo){
        this.motivo = motivo;}
    
    //Getters
    public int getId(){
    return id;
    }
    
    public Cliente getCliente (){
    return cliente;
    }
    
    public LocalDate getFecha(){
        return fecha;
    }
    public LocalTime getHora(){
        return hora;
    }
    public String getMotivo(){
        return motivo;
    }
    
    //ToString
@Override
public String toString(){
    String nombreCliente = (cliente != null) ?  cliente.getNombre() : "Sin Cliente";
    return "Cliente: " + cliente.getNombre() +
           " | Fecha: " + fecha +
           " | Hora: " + hora +
           " | Motivo: " + motivo;
}
}