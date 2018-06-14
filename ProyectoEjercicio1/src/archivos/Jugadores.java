package archivos;

public class Jugadores {
	private int numero;
	private String nombre;
	Jugadores(int numero, String nombre){
		this.setNumero(numero);
		this.setNombre(nombre);
	}
	public int getNumero() {
		return numero;
	}
	private void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
