package Algoritmos;

public class Algoritmos {
	//int num1,num2;
	
	/**
	 * Devuelve el sumatorio de un numero
	 * 
	 * @param num1
	 * @return
	 * throws IllegalArgumentException si el numero no es valido
	 */
	
	public static int sumatorio(int num1) {
		if(num1<=0) {
			throw new IllegalArgumentException("El numero debe ser mayor a 0");
		}
		int numero=0;
		for(int a=0;a<=numero;a++) {
			numero+=a;
		}
		
		
		
		return numero;
	}

}
