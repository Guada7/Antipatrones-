package Veterinaria;

import java.util.List;

public class Veterinaria {

    // ⚠ Antes: atributos sin encapsulación (package-private)
    // ❌ Antipatrón: Falta de encapsulamiento → rompe POO y expone estado interno.
    // ✔ Solución: Se cambian a privados.
    private String nombre;
    private List<Animal> animals;

    // ⚠ Antes: Array fijo recibido por constructor.
    // ✔ Ahora: Se usa List<Animal>.
    public Veterinaria(String nombre, List<Animal> animals){
        this.nombre = nombre;
        this.animals = animals;
    }

    public void mostrarAnimales(){
        for(Animal animal : animals){
            animal.mostrarInfoBasica();
        }
    }
    public void tratarAnimales(){
        for(Animal animal : animals){
            animal.tratarAnimal();
        }
    }
}
