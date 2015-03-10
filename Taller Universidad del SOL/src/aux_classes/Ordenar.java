package aux_classes;

public class Ordenar{
	
				//Metodo Burbuja
	public static int[] Ascendente(int[] vec){
		int aux = 0;
		for (int i = 0; i < (vec.length-1); i++) {
			for (int j = 0; j < (vec.length-1); j++) {
				if(vec[j] > vec[j+1]){
					aux = vec[j];
					vec[j] = vec[j+1];
					vec[j+1] = aux;
				}
			}
		}
		return vec;
	}
	
				//Metodo Burbuja
	public static int[] Descendente(int[] vec){
		int aux = 0;
		for (int i = 0; i < (vec.length-1); i++) {
			for (int j = 0; j > (vec.length-1); j++) {
				if(vec[j] < vec[j+1]){
					aux = vec[j];
					vec[j] = vec[j+1];
					vec[j+1] = aux;
				}
			}
		}
		return vec;
	}
	
	
	
}