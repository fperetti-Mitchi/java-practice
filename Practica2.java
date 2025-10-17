import java.util.ArrayList;

public class Practica2 {
    public static void main(String[] args) {
        // === ARRAY ===
        String[] guerrerosZ = new String[3]; // tamaño fijo
        guerrerosZ[0] = "Goku";
        guerrerosZ[1] = "Vegeta";
        guerrerosZ[2] = "Piccolo";

        System.out.println("Array de Guerreros Z:");
        for (int i = 0; i < guerrerosZ.length; i++) {
            System.out.println("Posición " + i + ": " + guerrerosZ[i]);
        }

        // Intento de acceso inválido en array
        try {
            System.out.println(guerrerosZ[3]); // fuera de rango
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error en array: " + e.getMessage());
        }

        // === LISTA ===
        ArrayList<String> saiyajins = new ArrayList<>();
        saiyajins.add("Gohan");
        saiyajins.add("Trunks");
        saiyajins.add("Broly");

        System.out.println("\nLista de Saiyajins:");
        for (int i = 0; i < saiyajins.size(); i++) {
            System.out.println("Posición " + i + ": " + saiyajins.get(i));
        }

        // Agregar un nuevo personaje
        saiyajins.add("Bardock");
        System.out.println("Después de agregar: " + saiyajins);

        // Eliminar un personaje
        saiyajins.remove("Trunks");
        System.out.println("Después de eliminar: " + saiyajins);

        // Intento de acceso inválido en lista
        try {
            System.out.println(saiyajins.get(10)); // fuera de rango
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error en lista: " + e.getMessage());
        }
    }
}