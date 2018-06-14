package archivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

public class EjercicioLennard {
	static ArrayList <Jugadores >listado;
	
	public static void main(String[] args) {
		String cadena;
		String[] separada;
		String file = "C:\\Users\\Java\\eclipse-workspace\\TPnro1\\Jugadores.txt";
		FileReader f;
		listado = new ArrayList();
		try {
			f = new FileReader(file);
			BufferedReader b = new BufferedReader(f);
		    while((cadena = b.readLine())!=null) {
		    	separada = cadena.split(",");
		    	listado.add(new Jugadores(Integer.parseInt(separada[0]), separada[1]));
		    }
		    b.close();
		    escribirPares();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void escribirPares() {
		Random rnd = new Random();
		try (PrintWriter salida = new PrintWriter("c:/ficheros/jugadores.txt")) {
			int cont = 0, n;
            while (cont < listado.size()) {
            	if (cont%2!=0) salida.println(listado.get(cont).getNombre());
              	cont++;
            }
            salida.write("El ganador es: "+listado.get(rnd.nextInt(cont)).getNombre());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
		
	}
}
