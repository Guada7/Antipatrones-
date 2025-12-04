package Veterinaria;

public class Perro extends Animal {
    
    public Perro(String nombre, String colorPelaje, String comidaFavorita) {
        super(nombre, colorPelaje, comidaFavorita);
    }

    @Override
    public void registrarAnimal() {

        // ⚠ Antes: se cerraba scanner.close(), causando error en el resto del programa.
        // ❌ Antipatrón grave: cerrar System.in → rompe toda futura lectura.
        // ✔ Solución: Eliminar scanner.close() y centralizar Scanner como estático.
        
        System.out.println("Ingrese el nombre del perro:");
        nombre = scanner.nextLine();

        System.out.println("Ingrese el color del pelaje:");
        colorPelaje = scanner.nextLine();

        System.out.println("Ingrese la comida favorita:");
        comidaFavorita = scanner.nextLine();
    }

    @Override
    public padecimientos revisarAnimal() {
        // ⚠ Antes: un montón de if (padecimiento == X) return padecimiento;
        // ❌ Antipatrón: Código duplicado e inútil (siempre retornaba lo mismo).
        // ✔ Solución: simplificar completamente.
        return this.padecimiento;
    }
    
    @Override
    public void tratarAnimal() {
        switch (padecimiento) {
            case GRIPE:
                System.out.println("Tratando la gripe del perro con medicamentos y reposo.");
                break;
            case FRACTURA:
                System.out.println("Tratando la fractura del perro con inmovilización y cirugía si es necesario.");
                break;
            case INFECCION:
                System.out.println("Tratando la infección del perro con antibióticos.");
                break;
            default:
                System.out.println("Tratando el padecimiento del perro de manera general.");
                break;
        }
        this.padecimiento = null;
        System.out.println("se ha tratado al animal");
    }

}
