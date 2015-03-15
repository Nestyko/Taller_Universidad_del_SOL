// Autor M.Sc. Maria Eugenia Fossi Medina


public class Leer
{
	//METODO PARA LEER NUMEROS TIPO BYTE
	public static byte NByte(String texto)
	{	System.out.print(texto);
		return Byte.parseByte(KbInput.read());
	}//NByte

	//METODO PARA LEER NUMEROS TIPO SHORT
	public static short NShort(String texto)
	{	System.out.print(texto);
		return Short.parseShort(KbInput.read());
	}//NShort

	//METODO PARA LEER NUMEROS TIPO INT
	public static int NInt(String texto)
	{	System.out.print(texto);
		return Integer.parseInt(KbInput.read());
	}//NInt

	//METODO PARA LEER NUMEROS TIPO LONG
	public static long NLong(String texto)
	{	System.out.print(texto);
		return Long.parseLong(KbInput.read());
	}//NLong

	//METODO PARA LEER NUMEROS TIPO FLOAT
	public static float NFloat(String texto)
	{	System.out.print(texto);
		return Float.parseFloat(KbInput.read());
	}//NFloat

	//METODO PARA LEER NUMEROS TIPO DOUBLE
	public static double NDouble(String texto)
	{	System.out.print(texto);
		return Double.parseDouble(KbInput.read());
	}//NDouble

	//METODO PARA LEER UN CARECTER
	public static char CChar(String texto)
	{	System.out.print(texto);
		return KbInputChar.read();
	}//CChar

	//METODO PARA INGRESAR UN TEXTO
	public static String CString(String texto)
	{	String t;
		do{	System.out.print(texto);
			t = KbInput.read();
			if((t.startsWith(" ") == true) || (t.length()<=0))
			{ 	System.out.println("ERROR. DEBE INGRESAR UN TEXTO Y COMENZAR SIN");
			 	System.out.println("             ESPACIOS EN BLANCO");
			}
		}while((t.startsWith(" ") == true) || (t.length()<=0));
		return t;
	}//IngTex

}//class