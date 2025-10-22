
/* Esta es una clase base abstracta que representa un personaje genérico.
*  Contiene un método que se implementa en cada tipo de personaje,
*  mostrando los conceptos de herencia, encapsulamiento y polimorfismo.
*/

public abstract class Personaje {
    int salud;

    public abstract int entrenar(int habilidad);

    public static void main(String[] args) {

        // Espadachín: tiene ataque, y el entrenamiento le sube 10 pts.
        Personaje espadachin = new Personaje() {
            int ataque;

            public int getAtaque() {
                return ataque;
            }

            public void setAtaque(int nuevoAtaque) {
                this.ataque = nuevoAtaque;
            }

            @Override
            public int entrenar(int ataque) {
                this.ataque = ataque + 10;
                return this.ataque;
            }
        };

        // Torre: tiene nivel y al entrenar sube 1 punto
        Personaje torre = new Personaje() {
            int nivel;

            public int getNivel() {
                return nivel;
            }

            public void setNivel(int nuevoNivel) {
                this.nivel = nuevoNivel;
            }

            @Override
            public int entrenar(int nivel) {
                this.nivel = nivel + 1;
                return this.nivel;
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
                System.out.println("Los magos no entrenan porque son vagos.\n");
                return 0;
            }
        };

    }
}
