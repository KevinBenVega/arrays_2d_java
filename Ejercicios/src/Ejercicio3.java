import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[][] matriz = new String[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i == 0 || i == j || i == matriz.length - 1){
                    matriz[i][j] = "X";
                } else {
                    matriz[i][j] = " ";
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println();
        }

    }
}
