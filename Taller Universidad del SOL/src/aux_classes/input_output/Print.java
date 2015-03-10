package aux_classes.input_output;


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

//Imprime el mensaje
public static void outln(String mensaje){
	System.out.println(mensaje);
}

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

	//Imprime Doubles de menos de 10 caracteres en forma de fila
	//Llena la pantalla si empieza en el espacio 8

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
