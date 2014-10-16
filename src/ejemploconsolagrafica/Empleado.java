/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploconsolagrafica;

import java.sql.Connection;

/**
 *
 * @author Carlos
 */
public class Empleado {
     Connection cn;
     private int codigo;
     private String nombre;
     private int edad;
     private float sueldo;
     

public Empleado(){
Conexion con=new Conexion();
}
}