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
		{	n = Byte.parseByte(KbInput.read());
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
		{	n = Short.parseShort(KbInput.read());
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
			{	n = Integer.parseInt(KbInput.read());
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
			{	n = Long.parseLong(KbInput.read());
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
			{	n = Float.parseFloat(KbInput.read());
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
			{	n = Double.parseDouble(KbInput.read());
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
			return KbInputChar.read();
		}//Cchar

	//METODO PARA LEER UNA CADENA STRING
	public static String Cstring(String texto)
		{	String t;
			do{	System.out.print(texto);
				t = KbInput.read();
				if((t.startsWith(" ") == true) || (t.length()<=0))
				{
					System.out.println("\t\t\t\t\t\t\t(ERROR) NO INGRESO TEXTO O COMIENZA CON ESPACIO");

				}
			}while((t.startsWith(" ") == true) || (t.length()<=0));
			return t;
	}//Cstring


	//METODO PARA MOSTRAR MENSAJE DE ERROR
	public static void error()
	{	MCursor.BLinea(5);
		MCursor.TCen(32,"E   R   R   O  R");
		MCursor.TCen(30,"VALOR FUERA DE RANGO");
		MCursor.BLinea(5);
	}//error

}//class