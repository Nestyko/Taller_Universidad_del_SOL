package aux_classes;

import java.util.Random;

import aux_classes.strings.StrFunction;

import aux_classes.strings.StrFunction;


public class Prueba_Clases{


	private static Random rand =  new Random();
	
	public static void main (String[] args){

		int[] numeros =  new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = rand.nextInt(50);
		}
		
		System.out.println(StrFunction.toString(numeros));
		
		
		int[] numbers = new int[]{
			4,5,8,6,7
		};
		
		Integer[] numbs =  new Integer[numbers.length];
		for (int i = 0; i < numbs.length; i++) {
			numbs[i] = Integer.valueOf(numbers[i]);
		}
		
		StrFunction.toString(numbs);
		
		
		
		




		}//main
}//class