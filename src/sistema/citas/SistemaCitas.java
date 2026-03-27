/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema.citas;

import Model.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

public class SistemaCitas {


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Cita> listaCitas = new ArrayList<>();
            int opcion;
            
            do{
                System.out.println("\n=============SISTEMA DE CITAS=======");
                System.out.println("1. Crear cita");
                System.out.println("2. Ver citas");
                System.out.println("3. Eliminar cita");
                System.out.println("4. Salir");
                System.out.println("Selecciona...");
                opcion = sc.nextInt();
                sc.nextLine();
                
                switch(opcion){
                    
                    case 1 -> {
                        //Crear Cliente
                        System.out.println("Nombre del Cliente: ");
                        String nombre = sc.nextLine();
                        
                        System.out.println("Telefono; ");
                        String telefono = sc.nextLine();
                        
                        Cliente cliente = new Cliente(0, nombre, telefono);
                        
                        //Crear Cita
                        System.out.println("Fecha (YYYY-MM-DD): ");
                        LocalDate fecha = LocalDate.parse(sc.nextLine());
                        
                        System.out.println("Hora (HH:MM): ");
                        LocalTime hora = LocalTime.parse(sc.nextLine());
                        
                        System.out.println("Motivo: ");
                        String motivo = sc.nextLine();
                        
                        Cita cita = new Cita(listaCitas.size()+1, cliente, fecha, hora, motivo);
                        
                        listaCitas.add(cita);
                        
                        System.out.println("====CITA CREADA CORRECTAMENTE======");
                    }
                        
                    case 2 -> {
                        System.out.println("\n========== LISTA DE CITAS==========");
                        for(Cita c : listaCitas){
                            System.out.println(c);
                        }
                    }
                        
                    case 3 -> {
                        System.out.println("ID DE LA CITA A ELIMINAR: ");
                        int idEliminar = sc.nextInt();
                        
                        listaCitas.removeIf(c -> c.getId() == idEliminar);
                        System.out.println("CITA ELIMINADA");
                    }
                        
                    case 4 -> System.out.println("SALIENDO DEL SISTEMA...");
                        
                    default -> System.out.println("OPCION INVALIDA");
                        
                }
            } while(opcion !=4);
        }
    }
    
}