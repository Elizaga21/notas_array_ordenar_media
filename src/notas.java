import java.util.*;
public class notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numAlum = 10, i, j, aux;
        double suma = 0, med, promedio;
        double medianota = -1;

        double[] leernotas = new double[numAlum];

        for (i = 0; i < leernotas.length; i++) {
            System.out.print("Nota del Alumno " + (i + 1) + ": ");
            leernotas[i] = sc.nextDouble();}

        int[] ordenar = new int[10];

        for (i = 1; i < 10; i++){
            aux = ordenar[i];
            j = i - 1;
            while ( (j >= 0) && ordenar[j] > aux );
            ordenar[j+1] = ordenar[j--];
            ordenar [j+1] = aux;
        }

    int num = 3;

    for (i = (leernotas.length - num); i < leernotas.length; i++) {
        suma = suma + leernotas[i];
    }
    med = suma / num;
    System.out.print("La media de las " + num + " mejores notas es:" + med);

        }



        }



        /*
        for (i = 0; i < leernotas.length; i++) {suma = suma + leernotas[i];

            media = suma / leernotas.length;

            System.out.println("Media de cada alumno:  " + (i + 1) + media);
        }
*/





