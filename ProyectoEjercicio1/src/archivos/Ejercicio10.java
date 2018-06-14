package archivos;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        int cont = 0, n, cantidad;

        do{
            System.out.println("Introduce número de caracteres: ");
            cantidad = sc.nextInt();
        }while(cantidad < 1);

        try (PrintWriter salida = new PrintWriter("c:/ficheros/caracteres.txt")) {

            while (cont < cantidad) {

                n = rnd.nextInt(255); //se obtiene un número 

                //si el número corresponde a una letra o a un espacio se escribe en el fichero
                if ( n < 1000 ){
                    salida.println(n);
                    cont++;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}