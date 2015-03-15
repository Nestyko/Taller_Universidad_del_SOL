// Autor M.Sc. Maria Eugenia Fossi Medina

public class MCursor
{

	// METODO PARA BAJAR N NUMEROS DE LINEAS
	public static void BLinea(int nl)
	{	for(int i=1; i<=nl; i++)
			System.out.print("\n");
		return;
	}//BLinea

	// METODO PARA UBICAR EL CURSOR EN UN LUGAR ESPECIFICO DE LA LINEA
	public static void UCursor(int nc)
	{	System.out.print("\r");
		for(int i=1; i<=nc; i++)
			System.out.print(" ");
		return;
	}//UCursor

	// METODO PARA RETROCEDER EL CURSOR EN N ESPACIOS ESPECIFICOS DE LA LINEA
	public static void RCursor(int ne)
	{	for(int i=1; i<=ne; i++)
			System.out.print("\b");
		return;
	}//RCursor

	// METODO PARA CENTRAR UN TEXTO
	public static void TCen(int m, String texto)
	{	UCursor(m); System.out.println(texto);
		return;
	}

	// METODO PARA MOSTRAR LA SEÑAL DE SALIDA
	public static void Salida()
	{	BLinea(2);
		TCen(26,"PRESIONE ENTER PARA CONTINUAR");
		KbInput.read();
		return;
	}
}//class