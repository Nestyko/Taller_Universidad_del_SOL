package aux_classes.nestor;

import java.util.Random;

import aux_classes.nestor.Aleatorio.Aleatorio;
import aux_classes.nestor.input_output.Print;
import aux_classes.nestor.strings.StrFunction;



public class Prueba_Clases{


	private static Random rand =  new Random();
	
	public static void main (String[] args){

		int[] vec = new int[5];
		vec = Aleatorio.vector(vec , 20);
		
		Print.imprimir_fila(vec , "Notas" , "Mat");
		
//		for (int i = 0; i < vec.length; i++) {
//			System.out.println(vec[i]);
//		}
		
		
		
		




		}//main
}//class