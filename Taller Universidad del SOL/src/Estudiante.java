abstract class Estudiante
{	String Ape;
	String Nom;
	int Ced;
	Fecha Nam;

	//CONSTRUCTOR
	public Estudiante(String A, String No, int C, Fecha Na)
	{	Ape = A.toUpperCase();
		Nom = No.toUpperCase();
		Ced = C;
		Nam = Na;
	}//Estudiante

	//METODO PARA MOSTRAR LOS DATOS
	public void MostDat()
	{	MCursor.TCen(20,"APELLIDO = "+Ape);
		MCursor.TCen(20,"NOMBRE = "+Nom);
		MCursor.TCen(20,"CEDULA = "+Ced);
		Nam.Mostrar(20,"FECHA DE NACIMIENTO = ");
	}
}//class