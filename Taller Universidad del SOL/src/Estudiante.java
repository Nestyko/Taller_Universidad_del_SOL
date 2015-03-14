import java.util.ArrayList;

import aux_classes.jose.Fecha;
import aux_classes.jose.MCursor;

abstract class Estudiante
{	String apellido;
	String nombre;
	int cedula;
	Fecha nacimiento;

	//CONSTRUCTOR
	public Estudiante(String apellido, String nombre, int cedula, Fecha nacimiento)
	{	this.apellido = apellido.toUpperCase();
		this.nombre = nombre.toUpperCase();
		this.cedula = cedula;
		this.nacimiento = nacimiento;
	}//Estudiante

	//METODO PARA MOSTRAR LOS DATOS
	public void MostDat()
	{	MCursor.TCen(20,"APELLIDO = "+apellido);
		MCursor.TCen(20,"NOMBRE = "+nombre);
		MCursor.TCen(20,"CEDULA = "+cedula);
		nacimiento.Mostrar(20,"FECHA DE NACIMIENTO = ");
	}
	
	
}//class