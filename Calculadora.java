// Ejercicio 1. Calculadora.
// Para contexto, ver ExamenConsigna.md
// Funcionamiento: pide dos valores, realiza una operación, y devuelve un resultado.

import java.util.Scanner;

public class Calculadora {
    // Defino métodos de operaciones
    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        // Declaro e inicializo variables
        int a = 0, b = 0;
        int resultado = 0;

        // Creo una instancia de Calculadora
        Calculadora calcu = new Calculadora();

        // Leo los valores por consola. Repito 5 veces máx.
        for (int i = 0; i < 5; i++) {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese operación (+, -, *, /): ");
            String operador = entrada.nextLine();
            System.out.print("Ingrese el primer valor: ");
            a = entrada.nextInt();
            System.out.print("Ingrese el segundo valor: ");
            b = entrada.nextInt();

            // Realizo la operación según el operador ingresado
            switch (operador) {
                case "+":
                    resultado = calcu.sumar(a, b);
                    break;
                case "-":
                    resultado = calcu.restar(a, b);
                    break;
                case "*":
                    resultado = calcu.multiplicar(a, b);
                    break;
                case "/":
                    resultado = calcu.dividir(a, b);
                    break;
                default:
                    System.out.println("Operación no válida");
                    break;
            }
            // Muestro el resultado
            System.out.println("El resultado es: " + resultado);

            // Agrego un comentario sobre el resultado
            if (resultado < 0) {
                System.out.println("Tené cuidado, el resultado es negativo!");
            } else if (resultado >= 0 && resultado <= 10000) {
                System.out.println("Resultado dentro de los límites.");
            } else {
                System.out.println("Error! Resultado muy grande.");
            }
        }
    }
}