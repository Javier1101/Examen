/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package music;

/**
 *
 * @author brand
 */
public class Cumbia extends Persona {
    private String artista;
    private String nombre1;
    private int duracion;

    public Cumbia(String artista, String nombre1, int duracion) {
        this.artista = artista;
        this.nombre1 = nombre1;
        this.duracion = duracion;
    }

    
@Override
public void escuahaTiempoLibre() {

System.out.println("Escucha en su teimpo libre");

}
@Override
public void escuchaEstudiando() {
System.out.println("Escucha para estudiar");

}
}