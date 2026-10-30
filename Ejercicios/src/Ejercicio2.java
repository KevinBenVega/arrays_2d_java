import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de columnas de la matriz: ");
        int columnas = sc.nextInt();

        int[][] matriz = new int[3][columnas];

        int[] sumaColumnas = new int[matriz[0].length];
        int[] valorMaxColumnas = new int[matriz[0].length];
        int[] valorMinColumnas = new int[matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese el valor (" + i + ", " + j + "): ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        for (int j = 0; j < matriz[0].length; j++) {
            int suma = 0;

            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[i][j];
            }

            sumaColumnas[j] = suma;
        }

        for (int j = 0; j < matriz[0].length; j++) {
            int numeroMax = matriz[0][j];


            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][j] > numeroMax) {
                    numeroMax = matriz[i][j];
                }

            }

            valorMaxColumnas[j] = numeroMax;
        }

        for (int j = 0; j < matriz[0].length; j++) {
            int numeroMin = matriz[0][j];

            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][j] < numeroMin) {
                    numeroMin = matriz[i][j];
                }

            }

            valorMinColumnas[j] = numeroMin;
        }

        for (int i = 0; i < sumaColumnas.length; i++) {
            System.out.println("La suma de la columna " + i + " es: " + sumaColumnas[i]);
        }

        System.out.println();

        for (int i = 0; i < valorMaxColumnas.length; i++) {
            System.out.println("El valor maximo de la columna " + i + " es: " + valorMaxColumnas[i]);
        }

        System.out.println();

        for (int i = 0; i < valorMinColumnas.length; i++) {
            System.out.println("El valor minimo de la columna " + i + " es: " + valorMinColumnas[i]);
        }

    }
}