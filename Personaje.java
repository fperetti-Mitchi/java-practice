/* Esta es una clase base abstracta que representa un personaje genérico.
*  Contiene un método que se implementa en cada tipo de personaje,
*  mostrando los conceptos de herencia, encapsulamiento y polimorfismo.
*/

import java.util.Scanner;

public abstract class Personaje {
    int salud;

    public abstract int entrenar(int habilidad);

    public static void main(String[] args) {

        // Espadachín: tiene ataque, y el entrenamiento le sube 10 pts.
        var espadachin = new Personaje() {
            int ataque;

            public int getAtaque() {
                return ataque;
            }

            public void setAtaque(int nuevoAtaque) {
                this.ataque = nuevoAtaque;
            }

            @Override
            public int entrenar(int ataque) {
                ataque = getAtaque();
                setAtaque(ataque + 10);
                return ataque;
            }
        };

        // Torre: tiene nivel y al entrenar sube 1 punto
        var torre = new Personaje() {
            int nivel;

            public int getNivel() {
                return nivel;
            }

            public void setNivel(int nuevoNivel) {
                this.nivel = nuevoNivel;
            }

            @Override
            public int entrenar(int nivel) {
                nivel = getNivel();
                setNivel(nivel + 1);
                return nivel;
            }
        };

        // Mago: tiene magia; entrenar no afecta sus atributos.
        Personaje mago = new Personaje() {
            String magia;

            public String getMagia() {
                return magia;
            }

            public void setMagia(String nuevaMagia) {
                this.magia = nuevaMagia;
            }

            @Override
            public int entrenar(int habilidad) {
                return 0;
            }
        };

        // Pruebo las habilidades
        System.out.println("\nBienvenidx a la sala de entrenamiento!");

        char resp = 's';
        try {
            while (resp == 's') {
                System.out.println("Seleccioná un personaje.");
                Scanner s1 = new Scanner(System.in);
                System.out.println("1. Espadachín\n2. Torre\n3. Mago\n");
                int opcion = s1.nextInt();

                // Usuario ingresa un número para el personaje eligió
                // En base a eso, se ejecuta el método correspondiente al mismo
                switch (opcion) {
                    case 1:
                        espadachin.entrenar(0);
                        System.out.println(
                                "Genial! Tu espadachín ahora tiene " + espadachin.getAtaque() + " de ataque!\n");
                        break;
                    case 2:
                        torre.entrenar(0);
                        System.out.println("Genial! Tu torre ahora es nivel " + torre.getNivel() + "\n");
                        break;
                    case 3:
                        mago.entrenar(0);
                        System.out.println("Los magos no entrenan porque son vagos :D\n");
                        break;
                    default:
                        System.err.println("Opción no válida.\n");
                        break;
                }

                System.out.println("Querés continuar? (S/N)\n");
                Scanner s2 = new Scanner(System.in);
                resp = s2.next().toLowerCase().charAt(0);
            }
            // Excepción
        } catch (Exception e) {
            System.err.println("Nah, lo rompiste.\n");
        }
    }
}