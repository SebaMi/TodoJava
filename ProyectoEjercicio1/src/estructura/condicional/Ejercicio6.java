package estructura.condicional;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int entrada;
		String input;
		Scanner scan = new Scanner( System.in);
		
		
		System.out.println("Introduzca un numero");
		//if(scan.hasNextInt()) {
			 input = scan.nextLine();//entrada = nextInt();
					
			System.out.println("el numero es: " + input);
			
			if(validadLongitud(input))
				if(!validarEntrada2(input))
					System.out.println("El numero introducido no esta incluido entre 0 y 9");
				else
					System.out.println("El numero "+input+" introducido es valido");
			else
				System.out.println("El numero no tiene la longitud correcta");
	//	}else
		//	System.out.println("El caracter introducido no es un numero");
		
		

	}
	
	private static boolean validadLongitud(String input) {
		if(input.length()>1)
			return false;
		else
			return true;
	}

	private static boolean validarEntrada2(String input) {
		try {
			Integer entero = new Integer (input);
			if(entero >= 0 && entero < 10) {
				System.out.println("El numero ingresado "+input + " es valido");
			}else {
				System.out.println("El numero no esta comprendido entre 0 y 9");
			}
			return true;
		}catch (NumberFormatException e){
			e.printStackTrace();
			System.out.println("No se introdujo un numero");
			return false;
		}
		
		
		
	}

	public static boolean validarEntrada(int entrada) {
		if (9 > entrada && entrada >= 0) {
			return true;
		} else
			return false;
	}

	
}
