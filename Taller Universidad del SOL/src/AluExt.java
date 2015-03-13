import aux_classes.jose.Fecha;
import aux_classes.jose.MCursor;
import aux_classes.nestor.Ordenar;

public class AluExt extends Estudiante
{	
	
	/**
	 * Static variables: son las variables que son propias de la clase pero y que no se ingresan manualmente
	 * como por ejemplo los contadores
	 */
	private static int cant_alumnos;
	private static int[] cant_alumnos_nivel;//Preguntar por el maximo de niveles
	private static float sumatoria_promedios;

	
	String curso;
	byte nivel;
	float notas[];
	float promedio;

	//CONSTRUCTOR
	public AluExt(String A, String No, int Ce, Fecha Na, String C, byte N, float[]Nt)
	{	super(A,No,Ce,Na);
		this.curso = C;
		nivel = N;
		cant_alumnos_nivel[nivel]++;
		this.notas = new float [nivel];
		notas = Nt;
		promedio = PromNot();
		agregar_promedio(promedio);
	}//AluExt
	
	/**
	 * Inicializa los contadores y crea los vectores
	 */
	public static void comenzar(){
		cant_alumnos = 0;
		cant_alumnos_nivel = new int[6];
		cant_alumnos_nivel = Ordenar.inicializar(cant_alumnos_nivel);
		sumatoria_promedios = 0;
	}

	//METODO PARA CALCULAR EL PROMEDIO
	public float PromNot()
	{	int Tot = 0;
		for(int i=0; i<nivel; i++) Tot += notas[i];
		return Tot/nivel;
	}//PromNot
	
	/**
	 * Agrega el promedio a la base de de datos dentro de la clase
	 * @param promedio es el promdio a guardar
	 */
	private void agregar_promedio(float promedio){
		sumatoria_promedios += promedio;
	}
	
	/**
	 * Calcula el promedio de todos los alumnos de Pre-Grado
	 * @return el promedio total como flotante
	 */
	public static float promedio_total(){
		return sumatoria_promedios/cant_alumnos;
	}

	//METODO PARA MOSTRAR LOS DATOS
	public void MostDat()
	{	MCursor.BLinea(30);
		MCursor.TCen(10,"------------------------------------------------------------");
		super.MostDat();
		MCursor.TCen(20,"CURSO = "+curso);
		MCursor.TCen(20,"NIVELES INSCRITOS = "+nivel);
		MCursor.TCen(20,"NOTA DE LOS NIVELES");
		for(int i=0; i<nivel; i++) MCursor.TCen(25,"NIVEL ["+(i+1)+"] = "+notas[i]);
		MCursor.TCen(10,"------------------------------------------------------------");
		MCursor.TCen(20,"PROMEDIO = "+promedio);
		MCursor.TCen(10,"------------------------------------------------------------");
	}
}//class
