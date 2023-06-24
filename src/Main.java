// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int resultado = suma(20, 20, 30);
        System.out.println("resultado suma " + resultado);

        Coche miCoche = new Coche();
        miCoche.incrementarPuerta();
        miCoche.incrementarPuerta();
        System.out.println("puertas coche1 " + miCoche.puertas );

    }

    public static int suma(int numero1, int numero2, int numero3) {
        int resultado = numero1 + numero2 + numero3;
        return resultado;

    }


}
