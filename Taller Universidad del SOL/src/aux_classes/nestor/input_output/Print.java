package aux_classes.nestor.input_output;


public class Print{

//Limpia pantalla agregando varias lineas
public static void cls(){
	for(int i = 0;i < 30;i++)
	System.out.println("\n");
}


public static void espacio_atras(int a){
	for(int i = 0;i <a;i++){
		System.out.print(bespacio());
		}//for
	}//espacio_atras

public static String bespacio(){
			return "\b";
	}

//Agrega una sangria al texto
public static void outS(String msg){
	espacio(10);
	System.out.print(msg);
	}//outSang

public static void outSln(String msg){
	espacio(10);
	System.out.println(msg);
	}//outSang

//Muestra el mensaje en el centro de la pantalla
public static void outCen(String mensaje){
	//Total de carateres de margen a margen 80
	if ((mensaje.charAt(0)==' ') || (mensaje.endsWith(" ")))
		mensaje = mensaje.trim();
	int margen = (40-(mensaje.length()/2));
	espacio(margen);
	System.out.print(mensaje);

}

public static void outCenln(String mensaje){
	//Total de carateres de margen a margen 80
	if ((mensaje.charAt(0)==' ')|| (mensaje.endsWith(" ")))
		mensaje = mensaje.trim();
	int margen = (40-(mensaje.length()/2));
	espacio(margen);
	System.out.println(mensaje);

}

//Imprime un separador
public static void separador(){
	for(int i = 0;i<80;i++)
	System.out.print("-");
	endl(1);
}

/**
 * Imprime n cantidad de "-" e ingresa una nueva linea
 * @param n es la cantidad de "-"
 */
public static void separador(int n){
	for(int i = 0;i<n;i++){
		System.out.print("-");
	}
	endl(1);
}

//Imprime el mensaje
public static void outln(String mensaje){
	System.out.println(mensaje);
}

/**
 * Imprime espacios n cantidad de veces
 * @param n
 */
public static void espacio(int n){
	for(int i = 0;i<n ;i++)
	System.out.print(" ");
}

//Imprime el mensaje
public static void out(String mensaje){
	System.out.print(mensaje);
}

public static void out(int mensaje){
	System.out.print(mensaje);
}

public static void out(double mensaje){
	System.out.print(mensaje);
}

public static void out(short mensaje){
	System.out.print(mensaje);
}

public static void out(long mensaje){
	System.out.print(mensaje);
}

public static void out(byte mensaje){
	System.out.print(mensaje);
}


//Agrega tantas lineas como lo indique n
public static void endl(int n){
	for(int i = 0;i < n;i++)
	System.out.print("\n");
}

public static void error(String errorMsg){
	endl(1);
	System.out.println("E\tR\tR\tO\tR");
	System.out.println("DESCRIPCION: " + errorMsg);
	Print.endl(1);
	System.out.println("PRESIONE ENTER PARA CONTINUAR");
	Print.pausa();
}

public static void errorCen(String errorMsg){
	endl(1);
	Print.espacio(24);
	Print.outln("E\tR\tR\tO\tR");
	Print.outCenln("DESCRIPCION: " + errorMsg);
	Print.endl(1);
	Print.outCenln("PRESIONE ENTER PARA CONTINUAR");
	Print.pausa();
}

public static void error(){
	endl(1);
	Print.espacio(24);
	System.out.println("E\tR\tR\tO\tR");
	Print.outCenln("PRESIONE ENTER PARA CONTINUAR");
	Print.pausa();
}

public static void pausa(String msg){
	Print.endl(1);
	Print.outCenln(msg);
	C.pausa();
}

public static void pausa(){
	Print.endl(1);
	C.pausa();
}

	//Imprime Strings de menos de 10 caracteres en forma de fila
	//Llena la pantalla si empieza en el espacio 8

public static  void imprimir_fila(String[] vec){
	if (vec.length > 6){
	for (int i = 0; i < 6;i++){
					Print.out(vec[i]);
					if(i < 6){
					Print.espacio(12-((vec[i]).length()));
				}//if
				}//for
			}//if
		else{
			for (int i = 0; i < vec.length;i++){
								Print.out(vec[i]);
								if(i < vec.length){
								Print.espacio(12-((vec[i]).length()));
							}//if
				}//for
			}//else
		}//imprimir

		//Empieza el vector desde la posicion i

public static  void imprimir_fila(String[] vec, int i){

			for (; i < vec.length;i++){
								Print.out(vec[i]);
								if(i < vec.length){
								Print.espacio(12-((vec[i]).length()));
							}//if
				}//for
		}//imprimir

	//Imprime Integers de menos de 10 caracteres en forma de fila
	//Llena la pantalla si empieza en el espacio 8

public static  void imprimir_fila(int[] vec){
	if (vec.length > 6){
	for (int i = 0; i < 6;i++){
					Print.out(vec[i]);
					if(i < 6){
					Print.espacio(12-((vec[i]+"").length()));
				}//if
				}//for
			}//if
		else{
			for (int i = 0; i < vec.length;i++){
								Print.out(vec[i]);
								if(i < vec.length){
								Print.espacio(12-((vec[i]+"").length()));
							}//if
				}//for
			}//else
		}//imprimir

/**
 * Imprime una fila con un titulo, con celdas de estapacio 10 y con un titulo unico 
 * para cada columna que utiliza un contador. Por ejempo Columna1 , Columna2, etc.
 * @param vec vector con los datos
 * @param titulo nombre para la fila
 * @param columna nombre para todas las columnas
 */
public static  void imprimir_fila(float[] vec, String titulo, String columna){
	int cant_columnas = vec.length;
	float aux = (float)cant_columnas/7;
	int cant_filas = 0;
	if(aux % 2 == 0){
		cant_filas = (int)aux;
	}else{
		cant_filas = (int)aux+1;
	}
	
	if((columna.length() >= 7) || ( (titulo.length() >= 7))){
		final int esp = 15;
		final float esp_col = (float)((esp - (columna.length() + 2))*0.5);
		final float esp_col2 = (float)((esp - (titulo.length()))*0.5);
		final int sangria = ((80-(((cant_columnas+1)*esp+1)+1))/2);
		final int tam_fila = ((cant_columnas+1)*esp+1)+1;
		Print.espacio(sangria);
		Print.separador(tam_fila);
		Print.espacio(sangria);
		Print.out("|");
		Print.espacio(esp);
		Print.out("|");
		if((esp_col > 0) && (esp_col < 1)){
			for (int j = 0; j < cant_columnas; j++) {
				Print.out(columna + " " + (j + 1));
				Print.espacio(1);
				Print.out("|");
			}
		}else if(esp_col >= 1){
			if(esp_col % 2 == 0){
				for (int j = 0; j < cant_columnas; j++) {
					Print.espacio((int)esp_col);
					Print.out(columna + " " + (j + 1));
					Print.espacio((int)esp_col);
					Print.out("|");
				}
			}else{
				for (int j = 0; j < cant_columnas; j++) {
					Print.espacio((int)esp_col);
					Print.out(columna + " " + (j + 1));
					Print.espacio((int)Math.round(esp_col));
					Print.out("|");
				}
			}
			
		}
		Print.endl(1);
		//Print.espacio((80-(cant_columnas*10))/2);
		Print.espacio(sangria);
		Print.separador(tam_fila);
		//Print.endl(1);
		//Imprimir casilla de titulo
		Print.espacio(sangria);
		Print.out("|");
		Print.espacio((int)esp_col2);
		Print.out(titulo);
		Print.espacio((int)Math.round(esp_col2));
		Print.out("|");
		
		
			float esp_col1 = 0;
		for (int j= 0; j < cant_columnas; j++) {
			esp_col1 = (float)((esp - (((int)vec[j]+"").length() + 3))*0.5);
			if((esp_col1 > 0) && (esp_col1 < 1)){
				System.out.printf("%.2f", vec[j]);
				Print.espacio((int)Math.round(esp_col1));
				Print.out("|");
			}
			else if(esp_col1 >= 1) {
					Print.espacio((int)(esp_col1));
					System.out.printf("%.2f", vec[j]);
					Print.espacio((int)Math.round(esp_col1));
					Print.out("|");
			}
		}
		Print.endl(1);
		Print.espacio(sangria);
		Print.separador(tam_fila);
		
	}

			if ((columna.length() < 7) && (titulo.length() < 7)) {
				final int esp = 9;
				final float esp_col = (float)((esp - (columna.length() + 2))*0.5);
				final float esp_col2 = (float)((esp - (titulo.length()))*0.5);
				final int sangria = ((80-(((cant_columnas+1)*esp+1)+1))/2);
				final int tam_fila = ((cant_columnas+1)*(esp+1))+1;
				Print.espacio(sangria);
				Print.separador(tam_fila);
				Print.espacio(sangria);
				Print.out("|");
				Print.espacio(esp);
				Print.out("|");
				if((esp_col > 0) && (esp_col < 1)){
					for (int j = 0; j < cant_columnas; j++) {
						Print.out(columna + " " + (j + 1));
						Print.espacio(1);
						Print.out("|");
					}
				}else if(esp_col >= 1){
					for (int j = 0; j < cant_columnas; j++) {
						Print.espacio((int)esp_col);
						Print.out(columna + " " + (j + 1));
						Print.espacio((int)Math.round(esp_col));
						Print.out("|");
					}
				}
				Print.endl(1);
				//Print.espacio((80-(cant_columnas*10))/2);
				Print.espacio(sangria);
				Print.separador(tam_fila);
				//Print.endl(1);
				//Imprimir casilla de titulo
				Print.espacio(sangria);
				Print.out("|");
				Print.espacio((int)esp_col2);
				Print.out(titulo);
				Print.espacio((int)Math.round(esp_col2));
				Print.out("|");
					float esp_col1 = 0;
				for (int j= 0; j < cant_columnas; j++) {
					esp_col1 = (float)((esp - (((int)vec[j]+"").length() + 3))*0.5);
					if((esp_col1 > 0) && (esp_col1 < 1)){
						System.out.printf("%.2f", vec[j]);
						Print.espacio((int)Math.round(esp_col1));
						Print.out("|");
					}
					else if(esp_col1 >= 1) {
						if(esp_col1 % 2 == 0){
						Print.espacio((int)(esp_col1));
						System.out.printf("%.2f", vec[j]);
						Print.espacio((int)(esp_col1));
						Print.out("|");
						}
						else{
							Print.espacio((int)(esp_col1));
							System.out.printf("%.2f", vec[j]);
							Print.espacio((int)Math.round(esp_col1));
							Print.out("|");
						}
					}
				}
				Print.endl(1);
				Print.espacio(sangria);
				Print.separador(tam_fila);
		}
			
	}//imprimir_fila


	//Imprime Doubles de menos de 10 caracteres en forma de fila
	//Llena la pantalla si empieza en el espacio 8
/**
 * Imprime Doubles de menos de 10 caracteres en forma de fila. 
 * Llena la pantalla si empieza en el espacio 8
 * @param vec vector a imprimir
 */
public static  void imprimir_fila(double[] vec){
	if (vec.length > 6){
	for (int i = 0; i < 6;i++){
					Print.out(vec[i]);
					if(i < 6){
					Print.espacio(12-((vec[i]+"").length()));
				}//if
				}//for
			}//if
		else{
			for (int i = 0; i < vec.length;i++){
								Print.out(vec[i]);
								if(i < vec.length){
								Print.espacio(12-((vec[i]+"").length()));
							}//if
				}//for
			}
		}

		//Empieza el vector desde la posicion i
		/**
		 * Imprimir el vector en forma de fila
		 * @param vec vector a imprimir
		 * @param i posicion desde la cual comenzar a imprimir
		 */
		public static  void imprimir_fila(double[] vec, int i){

					for (; i < vec.length;i++){
										Print.out(vec[i]);
										if(i < vec.length){
										Print.espacio(12-((vec[i]+"").length()));
									}//if
						}//for
		}//imprimir

		public static  void imprimir_fila(int[] vec, int i){

							for (; i < vec.length;i++){
												Print.out(vec[i]);
												if(i < vec.length){
												Print.espacio(12-((vec[i]+"").length()));
											}//if
								}//for
		}//imprimir
		
		
		

				
								





}//class
