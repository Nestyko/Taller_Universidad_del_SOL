

public class AluPre extends Estudiante
{	
	
	/**
	 * Static variables: son las variables que son propias de la clase pero y que no se ingresan manualmente
	 * como por ejemplo los contadores
	 */
	private static int cant_alumnos;
	private static int[] cant_alumnos_materias;//Preguntar por el maximo de materias
	private static int promedio_total;
	private static int[] cant_alumnos_semestre;// Y maximo de semestres
	private static float sumatoria_promedios;

	
	String carrera;
	byte semestre;
	byte num_materias;
	float notas[];
	float promedio;
	
	public static void comenzar(){
		cant_alumnos = 0;
		cant_alumnos_materias = new int[13];
		promedio_total = 0;
		cant_alumnos_semestre = new int[13];
		sumatoria_promedios = 0;
	}

	//CONSTRUCTOR
	public AluPre(String apellido, String nombre, int cedula, Fecha fechaNacimiento, String carrera, byte semestre, byte materias, float[] notas)
	{	super(apellido,nombre,cedula,fechaNacimiento);
		cant_alumnos++;
		this.carrera = carrera;
		this.semestre = semestre;
		cant_alumnos_semestre[semestre]++;
		this.num_materias = materias;
		cant_alumnos_materias[num_materias]++;
		this.notas = new float [num_materias];
		this.notas = notas;
		this.promedio = PromNot();
	}//AluPre

	//METODO PARA CALCULAR EL PROMEDIO
	private float PromNot()
	{	int Tot = 0;
		for(int i=0; i<num_materias; i++)	Tot += notas[i];
		return Tot/num_materias;
		
	}//PromNot
	
	private void agregar_promedio(float promedio){
		sumatoria_promedios += promedio;
	}
	
	public static float promedio_total(){
		return sumatoria_promedios/cant_alumnos;
	}


	//METODO PARA MOSTRAR LOS DATOS
	public void MostDat()
	{	MCursor.BLinea(30);
		MCursor.TCen(10,"------------------------------------------------------------");
		super.MostDat();
		MCursor.TCen(20,"CARRERA = "+ carrera);
		MCursor.TCen(20,"SEMESTRE = "+semestre);
		MCursor.TCen(20,"MATERIAS INSCRITAS = "+num_materias);
		MCursor.TCen(20,"NOTA DE LAS MATERIAS");
		for(int i=0; i<num_materias; i++) MCursor.TCen(25,"MATERIA ["+(i+1)+"] = "+notas[i]);
		MCursor.TCen(10,"------------------------------------------------------------");
		MCursor.TCen(20,"PROMEDIO = "+promedio);
		MCursor.TCen(10,"------------------------------------------------------------");
	}//MostDat

}//class