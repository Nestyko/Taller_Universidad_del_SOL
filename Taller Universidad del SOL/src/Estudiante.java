
import java.util.ArrayList;
abstract class Estudiante
{	String apellido;
	String nombre;
	int cedula;
	Fecha nacimiento;
	static ArrayList<Integer> todas_cedulas = new ArrayList<Integer>();

	//CONSTRUCTOR
	public Estudiante(String apellido, String nombre, int cedula, Fecha nacimiento)
	{	this.apellido = apellido.toUpperCase();
		this.nombre = nombre.toUpperCase();
		this.cedula = cedula;
		todas_cedulas.add(this.cedula);
		this.nacimiento = nacimiento;
	}//Estudiante

	//METODO PARA MOSTRAR LOS DATOS
	public void MostDat()
	{	MCursor.TCen(20,"APELLIDO = "+apellido);
		MCursor.TCen(20,"NOMBRE = "+nombre);
		MCursor.TCen(20,"CEDULA = "+cedula);
		nacimiento.Mostrar(20,"FECHA DE NACIMIENTO = ");
	}
	

	/**
	 * Revisa si la cedula esta repetida
	 * @param cedula es la cedula a buscar
	 * @return true si la cedula esta repetida
	 */
	public static boolean validarCedula(int cedula){
		if (todas_cedulas.contains(cedula)){
			return true;
		}
		else{
			return false;
		}
		
	}
	
}//class