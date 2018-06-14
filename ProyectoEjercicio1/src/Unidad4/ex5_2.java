package Unidad4;

public class ex5_2 {

	public static void main(String[] args) {
		String [] array = {"yo","tu","el","nos"};
		System.out.println(array.length);
		System.out.println(array[0] + " largo: " + array[0].length());
		System.out.println(array[1] + " largo: " + array[1].length());
		System.out.println(array[2] + " largo: " + array[2].length());
		System.out.println(array[3] + " largo: " + array[3].length());
		System.out.println(array[3].indexOf('s'));
		System.out.println(array[3].substring(1, 3));
		
	}

}

