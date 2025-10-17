import java.util.Locale;

public class Practica4 {
    public static void main(String[] args) {
        // Datos base
        String personaje = "Goku";
        String raza = "Saiyajin";
        String forma = "Base";           // Base, SSJ, SSJ2, SSJ3, God, Blue
        int nivelPoder = 9000;

        // ===== IF simple =====
        if (nivelPoder > 8000) {
            System.out.println(personaje + " supera los 8000 de poder.");
        }

        // ===== IF - ELSE IF - ELSE (múltiples ramas) =====
        if (nivelPoder < 3000) {
            System.out.println("Nivel: aprendiz");
        } else if (nivelPoder < 8000) {
            System.out.println("Nivel: guerrero intermedio");
        } else if (nivelPoder < 15000) {
            System.out.println("Nivel: élite");
        } else {
            System.out.println("Nivel: dios");
        }

        // ===== Condición compuesta (AND / OR) =====
        if (raza.equals("Saiyajin") && nivelPoder >= 10000) {
            System.out.println("Habilitado para transformar a Super Saiyajin.");
        }
        if (raza.equals("Namekiano") || personaje.equals("Piccolo")) {
            System.out.println("Puede usar regeneración.");
        }

        // ===== IF anidado =====
        if (raza.equals("Saiyajin")) {
            if (forma.equals("SSJ")) {
                System.out.println(personaje + " está en Super Saiyajin.");
            } else {
                System.out.println(personaje + " aún no transformó a SSJ.");
            }
        }

        // ===== SWITCH (selección por valor) =====
        switch (forma) {
            case "Base":
                System.out.println("Multiplicador de forma: x1");
                break;
            case "SSJ":
                System.out.println("Multiplicador de forma: x50");
                break;
            case "SSJ2":
                System.out.println("Multiplicador de forma: x100");
                break;
            case "SSJ3":
                System.out.println("Multiplicador de forma: x400");
                break;
            case "God":
                System.out.println("Multiplicador de forma: x1000");
                break;
            case "Blue":
                System.out.println("Multiplicador de forma: x2000");
                break;
            default:
                System.out.println("Forma no reconocida.");
        }

        // ===== SWITCH con varias opciones que comparten lógica (fall-through) =====
        String villano = "Freezer".toLowerCase(Locale.ROOT);
        switch (villano) {
            case "freezer":
            case "cell":
            case "buu":
                System.out.println("Enemigo de arco principal detectado.");
                break;
            default:
                System.out.println("Enemigo menor o aliado temporal.");
        }

        // ===== Ejemplo práctico: decisión de batalla =====
        int vida = 70;        // 0..100
        int ki = 60;          // 0..100
        boolean senzu = true; // tiene semilla del ermitaño

        if (vida < 30 && senzu) {
            System.out.println("Usar semilla del ermitaño.");
        } else if (vida < 30 && !senzu) {
            System.out.println("Retirarse para recuperarse.");
        } else if (ki > 80 || forma.equals("Blue")) {
            System.out.println("Atacar con todo.");
        } else {
            System.out.println("Mantener distancia y cargar ki.");
        }
    }
}