/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clubpadel;

/**
 *
 * @author SUSANA
 */
public class Persona {
    
    String name;
    String dni;
    int edad;

    public Persona(String name, String dni, int edad) {
        this.name = name;
        this.dni = dni;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + "\nDNI: " + dni + "\nEdad: " + edad;
    }
}
