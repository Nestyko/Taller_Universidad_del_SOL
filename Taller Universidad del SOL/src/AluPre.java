public class AluPre extends Estudiante
{	String carrera;
	byte semestre;
	byte num_materias;
	float notas[];
	float promedio;

	//CONSTRUCTOR
	public AluPre(String apellido, String nombre, int cedula, Fecha fechaNacimiento, String carrera, byte semestre, byte materias, float[] notas)
	{	super(apellido,nombre,cedula,fechaNacimiento);
		this.carrera = carrera;
		this.semestre = semestre;
		this.num_materias = materias;
		this.notas = new float [num_materias];
		this.notas = notas;
		this.promedio = PromNot();
	}//AluPre

	//METODO PARA CALCULAR EL PROMEDIO
	public float PromNot()
	{	int Tot = 0;
		for(int i=0; i<num_materias; i++)	Tot += notas[i];
		return Tot/num_materias;
	}//PromNot

	//METODO PARA MOSTRAR LOS DATOS
	public void MostDat()
	{	MCursor.BLinea(30);
		MCursor.TCen(10,"------------------------------------------------------------");
		super.MostDat();
		MCursor.TCen(20,"CARRERA = "+carrera);
		MCursor.TCen(20,"SEMESTRE = "+semestre);
		MCursor.TCen(20,"MATERIAS INSCRITAS = "+num_materias);
		MCursor.TCen(20,"NOTA DE LAS MATERIAS");
		for(int i=0; i<num_materias; i++) MCursor.TCen(25,"MATERIA ["+(i+1)+"] = "+notas[i]);
		MCursor.TCen(10,"------------------------------------------------------------");
		MCursor.TCen(20,"PROMEDIO = "+promedio);
		MCursor.TCen(10,"------------------------------------------------------------");
	}//MostDat

}//class