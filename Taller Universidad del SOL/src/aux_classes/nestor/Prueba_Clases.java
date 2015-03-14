package aux_classes.nestor;



import aux_classes.nestor.Aleatorio.Aleatorio;
import aux_classes.nestor.input_output.Print;




public class Prueba_Clases{
	
	public static void main (String[] args){

		float[] vec = new float[3];
		vec = Aleatorio.vector(vec , 20);
		
		Print.imprimir_fila(vec , "Notas" , "Mate");
		
//		for (int i = 0; i < vec.length; i++) {
//			System.out.println(vec[i]);
//		}
		
		
		
		




		}//main
}//class