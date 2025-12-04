package Veterinaria;
import java.util.Random;
import java.util.Scanner;

public abstract class Animal {

    // ⚠ Antes: enum padecimientos iniciaba con minúscula.
    // ❌ Antipatrón: Convención incorrecta de nombres.
    // ✔ Solución: Se renombra a Padecimiento (UpperCamelCase).
public enum Padecimientos {
    GRIPE, FRACTURA, INFECCION, OTRO
}

    protected String nombre, colorPelaje, comidaFavorita;
    protected padecimientos padecimiento;
    // ⚠ Antes: Cada Animal tenía su propio Scanner, y Perro lo cerraba.
    // ❌ Antipatrón: Cerrar System.in inutiliza todas las lecturas del programa.
    // ✔ Solución: Crear un único Scanner estático compartido y jamás cerrarlo.
    protected static final Scanner scanner = new Scanner(System.in);
    
    public abstract void registrarAnimal();
    public abstract padecimientos revisarAnimal();
    public abstract void tratarAnimal();

    Animal(String nombre, String colorPelaje, String comidaFavorita) {
        this.nombre = nombre;
        this.colorPelaje = colorPelaje;
        this.comidaFavorita = comidaFavorita;
        asignarPadecimientoAleatorio();
    }
    
    public void mostrarInfoBasica() {

        System.out.println("\nNombre: " + nombre);
        System.out.println("Color de Pelaje: " + colorPelaje);
        System.out.println("Comida Favorita: " + comidaFavorita);
        System.out.println("El animal presenta el siguiente padecimiento: " + padecimiento + "\n" );
    }


    public void asignarPadecimientoAleatorio() {
        Random random = new Random();
        padecimientos[] valores = padecimientos.values();
        this.padecimiento = valores[random.nextInt(valores.length)];
    }

}
