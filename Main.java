import Veterinaria.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // ⚠ Antes: Animal[] animales = new Animal[2];
        // ❌ Antipatrón: Uso de arreglo fijo → no escalable ni flexible.
        // ✔ Solución: Se usa List<Animal> para permitir crecimiento dinámico.
        List<Animal> animales = new ArrayList<>();
        
        animales.add(new Perro("Firulais", "Café", "Croquetas"));
        animales.add(new Perro("Max", "Negro", "Pollo"));
        
        Veterinaria veterinaria = new Veterinaria("El perro Feliz", animales);

        veterinaria.mostrarAnimales();
        veterinaria.tratarAnimales();
        veterinaria.mostrarAnimales();
    }
}
