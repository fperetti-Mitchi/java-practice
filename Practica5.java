// Mostrar por pantalla el mensaje "Hola mundo" 5 veces utilizando las tres estructuras de repetición.
// Qué pasa si la condición de un bucle siempre es verdadero?

public class Practica5 {
    public static void main(String[] args) {

        // ===== WHILE =====
        System.out.println("== WHILE ==");
        int i = 0;
        while (i < 5) { // se ejecuta mientras la condición sea verdadera
            System.out.println("Entrenamiento WHILE (" + i + "): Goku grita Kamehameha");
            i++; // ¡no olvides incrementar!
        }

        // ===== DO-WHILE =====
        System.out.println("\n== DO-WHILE ==");
        int j = 0;
        do {
            System.out.println("Entrenamiento DO-WHILE (" + j + "): Vegeta aumenta el ki");
            j++;
        } while (j < 5); // se evalúa al final: garantiza al menos 1 ejecución

        // ===== FOR =====
        System.out.println("\n== FOR ==");
        for (int k = 0; k < 5; k++) { // ideal cuando sabés cuántas repeticiones querés
            System.out.println("Entrenamiento FOR (" + k + "): Piccolo concentra su mente");
        }

        // ===== ¿Qué pasa si la condición siempre es verdadera? =====
        // Ejemplo controlado: usamos break para evitar bucle infinito
        System.out.println("\n== Bucle con condición siempre verdadera (controlado con break) ==");
        int golpes = 0;
        while (true) { // siempre verdadero
            System.out.println("Combo infinito... golpe #" + golpes);
            golpes++;
            if (golpes == 5) { // cortamos a propósito
                System.out.println("Se corta el combo con break para evitar bucle infinito.");
                break;
            }
        }

    }
}