import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas de la matriz: ");
        int filas = sc.nextInt();
        System.out.print("Ingrese el numero de columnas de la matriz: ");
        int columnas = sc.nextInt();

        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print("Ingrese el valor (" + i +", "+  + j+"): ");
                matriz[i][j] = sc.nextInt();
            }
        }

        int[] sumaColumnas = new int[matriz[0].length];

        for (int j = 0; j < matriz[0].length; j++) {
            int suma = 0;

            for (int i = 0; i < matriz.length; i++) {
                suma += matriz[i][j];
            }

            sumaColumnas[j] = suma;
        }

        for (int i = 0; i < sumaColumnas.length; i++) {
            System.out.println("La suma de la columna " + i + " es: " + sumaColumnas[i]);
        }

    }
}
