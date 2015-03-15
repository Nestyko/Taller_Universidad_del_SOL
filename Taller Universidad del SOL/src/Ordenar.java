

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

	/**
	 * Inicializa el Vector con todas sus posiciones en 0
	 * @param vec es el vector
	 * @return vector con todas sus posiciones en 0
	 */
	public static int[] inicializar(int[] vec){
		for (int i = 0; i < vec.length; i++) {
			vec[i] = 0;
		}
		return vec;
	}
	
	/**
	 * Inicializa el Vector con todas sus posiciones en 0
	 * @param vec es el vector
	 * @return vector con todas sus posiciones en 0
	 */
	public static float[] inicializar(float[] vec){
		for (int i = 0; i < vec.length; i++) {
			vec[i] = 0;
		}
		return vec;
	}
	
	/**
	 * Inicializa el Vector con todas sus posiciones en 0
	 * @param vec es el vector
	 * @return vector con todas sus posiciones en 0
	 */
	public static double[] inicializar(double[] vec){
		for (int i = 0; i < vec.length; i++) {
			vec[i] = 0;
		}
		return vec;
	}
	/**
	 * Inicializa el Vector con todas sus posiciones en 0
	 * @param vec es el vector
	 * @return vector con todas sus posiciones en 0
	 */
	public static short[] inicializar(short[] vec){
		for (int i = 0; i < vec.length; i++) {
			vec[i] = 0;
		}
		return vec;
	}
	
	/**
	 * Inicializa el Vector con todas sus posiciones en 0
	 * @param vec es el vector
	 * @return vector con todas sus posiciones en 0
	 */
	public static byte[] inicializar(byte[] vec){
		for (int i = 0; i < vec.length; i++) {
			vec[i] = 0;
		}
		return vec;
	}
	
	/**
	 * Inicializa el Vector con todas sus posiciones en 0
	 * @param vec es el vector
	 * @return vector con todas sus posiciones en 0
	 */
	public static long[] inicializar(long[] vec){
		for (int i = 0; i < vec.length; i++) {
			vec[i] = 0;
		}
		return vec;
	}
}