package aux_classes.input_output;

import java.util.Scanner;


public class C {

	public static Scanner input = new Scanner(System.in);

	public static void pausa(){
		try{
		input.nextLine();
		input.nextLine();
		}
		catch(Exception e){
			return;
		}
	}

	public static String in_String(String msg){
		boolean err = true;

		String a = null;
		do{

		try{
			System.out.print("          " + msg);
			//input.nextLine();
			a = input.nextLine();
			err = false;
		}
		catch(Exception e){
			Print.errorCen("Debe Ingresar una cadena de caracteres");
			err = true;
		}
		}while(err);
		return a;
	}

	public static char in_char(String msg){
		boolean err = true;
		String character = null;
		char a = ' ';
		do{
		System.out.print("          " + msg);

		try{
			character = input.next();
			err = false;
		}
		catch(Exception e){
			Print.errorCen("Debe Ingresar un caracter");
			err = true;
		}
		if(character.length() > 1){
			Print.errorCen("Debe Ingresar un caracter");
			err = true;
		}
		else{
			a = character.charAt(0);
		}

		}while(err);
		return a;
	}

	public static double in_double(){
		double a = 0.0;
		boolean err = false;
		do{
		try {
			a = input.nextDouble();
			err = false;
		}//try
		catch(Exception e){
				Print.errorCen("Debe ingresar un numero ");
				err = true;
			}//catch
		}while(err);
		return a;
	}

	public static double in_double(String msg){
		double a = 0.0;
		boolean err = false;
		do{
		try {
			System.out.print("          " + msg);
			a = input.nextDouble();
			err = false;
		}//try
		catch(Exception e){
				Print.errorCen("Debe ingresar un numero (puede tener decimales)");
				err = true;
			}//catch
		}while(err);

		return a;
	}//in_double

	public static float in_float(String msg){
		float a = (float)0.0;
		boolean err = false;
		do{
		try {
			System.out.print("          " + msg);
			a = input.nextFloat();
			err = false;
		}//try
		catch(Exception e){
				Print.errorCen("Debe ingresar un numero (puede tener decimales)");
				err = true;
			}//catch
		}while(err);

		return a;
	}//in_float

	public static int in_int(String msg){
		int a = 0;
		boolean err = false;
		do{
		try {
			System.out.print("          " + msg);
			a = input.nextInt();
			err = false;
		}//try
		catch(Exception e){
				Print.errorCen("Debe ingresar un numero (puede tener decimales)");
				err = true;
			}//catch
		}while(err);

		return a;
	}//in_int
	
	
	public static int in_int(){
		int a = 0;
		boolean err = false;
		do{
		try {
			a = input.nextInt();
			err = false;
		}//try
		catch(Exception e){
				Print.errorCen("Debe ingresar un numero (puede tener decimales)");
				err = true;
			}//catch
		}while(err);

		return a;
	}//in_int

	public static short in_short(String msg){
		short a = 0;
		boolean err = false;
		do{
		try {
			System.out.print("          " + msg);
			a = input.nextShort();
			err = false;
		}//try
		catch(Exception e){
				Print.errorCen("Debe ingresar un numero (puede tener decimales)");
				err = true;
			}//catch
		}while(err);

		return a;
	}//in_short

	public static byte in_byte(String msg){
		byte a = 0;
		boolean err = false;
		do{
		try {
			System.out.print("          " + msg);
			a = input.nextByte();
			err = false;
		}//try
		catch(Exception e){
				Print.errorCen("Debe ingresar un numero (puede tener decimales)");
				err = true;
			}//catch
		}while(err);

		return a;
	}//in_byte

	public static long in_long(String msg){
		long a = 0;
		boolean err = false;
		do{
		try {
			System.out.print("          " + msg);
			a = input.nextLong();
			err = false;
		}//try
		catch(Exception e){
				Print.errorCen("Debe ingresar un numero (puede tener decimales)");
				err = true;
			}//catch
		}while(err);

		return a;
	}//in_long

	//VALIDACIONES PARA POSITIVOS


		public static int unsigned (int a){
			while (a < 0){
				a = in_int("Por favor, ingrese un numero positivo: ");
				Print.endl(1);
				}//while
				return a;
			}//unsigned

		public static double unsigned (double a){
			while (a < 0){
				a = in_double("Por favor, ingrese un numero positivo: ");
				Print.endl(1);
				}//while
				return a;
			}//unsigned

		public static byte unsigned (byte a){
			while (a < 0){
				a = in_byte("Por favor, ingrese un numero positivo: ");
				Print.endl(1);
				}//while
				return a;
			}//unsigned

		public static short unsigned (short a){
			while (a < 0){
				a = in_short("Por favor, ingrese un numero positivo: ");
				Print.endl(1);
				}//while
				return a;
			}//unsigned

		public static long unsigned (long a){
			while (a < 0){
				a =  in_long("Por favor, ingrese un numero positivo: ");
				Print.endl(1);

				}//while

		return a;
		}//unsigned

					//Validar que sean solo letras

		public static String solo_letras(String a){

			boolean numero = false;
			do{
				if(a.length() == 0){
								numero = false;
					}//if
			for(int i = 0; i< a.length();i++){
				switch(a.charAt(i)){
					case '0': numero = true; break;
					case '1': numero = true;break;
					case '2': numero = true;break;
					case '3': numero = true;break;
					case '4': numero = true;break;
					case '5': numero = true;break;
					case '6': numero = true;break;
					case '7': numero = true;break;
					case '8': numero = true;break;
					case '9': numero = true;break;
					default: numero = false;break;
					}//switch
				}//for
			if(numero){
				a = in_String("Por favor ingrese solo letras: ");
			}//if
			}while ( numero);



		return a;
			}//solo_letras

		//LEER VECTORES
//Los vectores tienen que estar incializado, es decir, deben de tener un tamaño prestablecido
//String elemento: es el objeto abstracto del que esta hecho el objeto, es decir, si el vector guarda sueldos, o trabajadores, etc


		public static void in_vector (int[] vec, String elemento){
			for(int i = 0;i < vec.length;i++){
				vec[i] = in_int(elemento + " " + (i+1) + ": ");
			}//for
		}//in_vector

		public static void in_vector (double[] vec, String elemento){
			for(int i = 0;i < vec.length;i++){
				vec[i] = in_double(elemento + " " + (i+1) + ": ");
			}//for
		}//in_vector

		public static void in_vector (short[] vec, String elemento){
			for(int i = 0;i < vec.length;i++){
				vec[i] = in_short(elemento + " " + (i+1) + ": ");
			}//for
		}//in_vector

		public static void in_vector (long[] vec, String elemento){
			for(int i = 0;i < vec.length;i++){
				vec[i] = in_long(elemento + " " + (i+1) + ": ");
			}//for
		}//in_vector

		public static void in_vector (byte[] vec, String elemento){
			for(int i = 0;i < vec.length;i++){
				vec[i] = in_byte(elemento + " " + (i+1) + ": ");
			}//for
		}//in_vector

		public static void in_vector (float[] vec, String elemento){
			for(int i = 0;i < vec.length;i++){
				vec[i] = in_float(elemento + " " + (i+1) + ": ");
			}//for
		}//in_vector




}
