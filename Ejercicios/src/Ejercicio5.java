import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int numNotasParciales = 3;
        float[][] notas = new float[20][6];

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < numNotasParciales; j++) {
                System.out.print("Ingrese la nota de la asignatura " + j + " del alumno " + (i+1) + " : ");
                notas[i][j] = sc.nextFloat();
            }
        }

        for (int i = 0; i < notas.length; i++) {
            float sumaNotas = 0;
            float notaMax = notas[i][0];
            float notaMin = notas[i][0];

            for (int j = 0; j < numNotasParciales; j++) {
                sumaNotas += notas[i][j];

                if(notas[i][j] > notaMax){
                    notaMax = notas[i][j];
                }

                if(notas[i][j] < notaMin){
                    notaMin = notas[i][j];
                }

            }

            notas[i][3] = sumaNotas/numNotasParciales;
            notas[i][4] = notaMax;
            notas[i][5] = notaMin;
        }


        System.out.println();
        System.out.println("Matriz resultante de notas");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Alumno " + (i+1) + " : " + "|");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + "|");
            }
            System.out.println();
        }


        float mejorNota = notas[0][4];
        float peorNota = notas[0][5];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i][4] > mejorNota){
                mejorNota = notas[i][4];
            }

            if (notas[i][5] < peorNota){
                peorNota = notas[i][5];
            }
        }


        System.out.println();
        System.out.println("La mejor nota del curso es: " + mejorNota);
        System.out.println("La peor nota del curso es: " + peorNota);


    }
}
