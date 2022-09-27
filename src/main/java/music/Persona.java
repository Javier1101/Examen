/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package music;

/**
 *
 * @author brand
 */
public abstract class Persona {
    protected String nombre;
    protected String Apellido;
    protected int edad;
   
    public void Escuchar(){ 
System.out.println("escuchar");

}
public abstract void escuahaTiempoLibre();
public abstract void escuchaEstudiando();
}

