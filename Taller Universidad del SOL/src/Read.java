//Jose Delgado

public class Read
{
	//METODO PARA LEER NUMEROS TIPO BYTE
	public static byte Nbyte(String mensaje)
	{	boolean sal;
		byte n = 0;
		do
		{	System.out.print(mensaje);
		try
		{	n = Byte.parseByte(Imput.read());
			sal = true;
		}//try
		catch(NumberFormatException exc)
		{	error();
			sal = false;
		}//catch
		}while(sal == false );
		return n;
	}//Nbyte

	//METODO PARA LEER NUMEROS TIPO SHORT
	public static short Nshort(String mensaje)
	{	boolean sal;
		short n = 0;
		do
		{	System.out.print(mensaje);
		try
		{	n = Short.parseShort(Imput.read());
			sal = true;
		}//try
		catch(NumberFormatException exc)
		{	error();
			sal = false;
		}//catch
		}while(sal == false );
		return n;
	}//Nshort

	//METODO PARA LEER NUMEROS TIPO INTEGER
	public static int Nint(String mensaje)
	{	boolean sal;
		int n = 0;
		do
		{	System.out.print(mensaje);
			try
			{	n = Integer.parseInt(Imput.read());
				sal = true;
			}//try
			catch(NumberFormatException exc)
			{	error();
				sal = false;
			}//catch
		}while(sal == false );
		return n;
	}//Nint

	//METODO PARA LEER NUMEROS TIPO LONG
	public static long Nlong(String mensaje)
	{	boolean sal;
		long n = 0;
		do
		{	System.out.print(mensaje);
			try
			{	n = Long.parseLong(Imput.read());
				sal = true;
			}//try
			catch(NumberFormatException exc)
			{	error();
				sal = false;
			}//catch
		}while(sal == false );
		return n;
	}//Nlong

	//METODO PARA LEER NUMEROS TIPO FLOAT
	public static float Nfloat(String mensaje)
	{	boolean sal;
		float n = 0;
		do
		{	System.out.print(mensaje);
			try
			{	n = Float.parseFloat(Imput.read());
				sal = true;
			}//try
			catch(NumberFormatException exc)
			{	error();
			sal = false;
			}//catch
		}while(sal == false );
		return n;
	}//Nfloat

	//METODO PARA LEER NUMEROS TIPO DOUBLE
	public static double Ndouble(String mensaje)
	{	boolean sal;
		double n = 0;
		do
		{	System.out.print(mensaje);
			try
			{	n = Double.parseDouble(Imput.read());
				sal = true;
			}//try
			catch(NumberFormatException exc)
			{	error();
				sal = false;
			}//catch
		}while(sal == false );
		return n;
	}//Ndouble

	//METODO PARA LEER UN CHAR
		public static char Cchar (String mensaje)
		{	System.out.print(mensaje);
			return ImputChar.read();
		}//Cchar

	//METODO PARA LEER UNA CADENA STRING
	public static String Cstring(String texto)
		{	String t;
			do{	System.out.print(texto);
				t = Imput.read();
				if((t.startsWith(" ") == true) || (t.length()<=0))
				{ 	System.out.println("\n\n\nERROR. DEBE INGRESAR UN TEXTO Y COMENZAR SIN");
				 	System.out.println("             ESPACIOS EN BLANCO\n\n\n");
				}
			}while((t.startsWith(" ") == true) || (t.length()<=0));
			return t;
	}//Cstring


	//METODO PARA MOSTRAR MENSAJE DE ERROR
	public static void error()
	{	System.out.println("\n\n\n\n\n                                E   R   R   O  R");
	    System.out.println("                              VALOR FUERA DE RANGO\n\n\n\n\n");
	}//error

}//class