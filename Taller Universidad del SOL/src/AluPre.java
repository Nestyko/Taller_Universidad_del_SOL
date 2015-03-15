import java.util.ArrayList;

import aux_classes.jose.Fecha;
import aux_classes.jose.MCursor;
import aux_classes.nestor.Ordenar;
import aux_classes.nestor.input_output.Print;



public class AluPre extends Estudiante
{	
	
	//CONSTRUCTOR
		public AluPre(String apellido, String nombre, int cedula, Fecha fechaNacimiento, 
			String carrera, byte semestre, byte materias, float[] notas)
		{	super(apellido,nombre,cedula,fechaNacimiento);
			cant_alumnos++;
			this.carrera = carrera;
			this.semestre = semestre;
			cant_alumnos_semestre[semestre-1]++;
			this.num_materias = materias;
			cant_alumnos_materias[num_materias-1]++;
			this.notas = new float [num_materias];
			this.notas = notas;
			this.promedio = PromNot();
			agregar_promedio(this.promedio);
		}//AluPre
	
	/**
	 * Static variables: son las variables que son propias de la clase pero y que no se ingresan manualmente
	 * como por ejemplo los contadores
	 */
	private static int cant_alumnos;
	private static int[] cant_alumnos_materias;//Preguntar por el maximo de materias
	private static int[] cant_alumnos_semestre;// Y maximo de semestres
	private static float sumatoria_promedios;
	private static int aprobados;
	private static int reprobados;

	
	String carrera;
	byte semestre;
	byte num_materias;
	float notas[];
	float promedio;
	
	/**
	 * Inicializa los contadores y crea los vectores
	 */
	public static void comenzar(){
		cant_alumnos = 0;
		cant_alumnos_materias = new int[8];
		cant_alumnos_materias = Ordenar.inicializar(cant_alumnos_materias);
		cant_alumnos_semestre = new int[12];
		cant_alumnos_semestre = Ordenar.inicializar(cant_alumnos_semestre);
		sumatoria_promedios = 0;
		aprobados = 0;
		reprobados = 0;
	}

	

	//METODO PARA CALCULAR EL PROMEDIO
	private float PromNot()
	{	float Tot = 0;
		for(int i=0; i<num_materias; i++)	{
			Tot += notas[i];
		}
		return Tot/num_materias;
		
	}//PromNot
	
	/**
	 * Agrega el promedio a la base de de datos dentro de la clase
	 * @param promedio es el promdio a guardar
	 */
	private void agregar_promedio(float promedio){
		sumatoria_promedios += promedio;
		if(promedio >= 9.5){
			aprobados++;
		}
		else{
			reprobados++;
		}
	}
	
	public static final int getAprobados(){
		return aprobados;
	}
	
	public static final int getReprobados(){
		return reprobados;
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
		MCursor.TCen(20,"CARRERA = "+ carrera);
		MCursor.TCen(20,"SEMESTRE = "+semestre);
		MCursor.TCen(20,"MATERIAS INSCRITAS = "+num_materias);
		MCursor.TCen(20,"NOTA DE LAS MATERIAS");
		Print.imprimir_fila(notas, "NOTAS", "MATERIA");
		MCursor.TCen(10,"------------------------------------------------------------");
		MCursor.TCen(20,"PROMEDIO = "+promedio);
		MCursor.TCen(10,"------------------------------------------------------------");
	}//MostDat
	
	/**
	 * Ordena el ArrayList<AluPre> por apellido de forma ascendente
	 *  por el metodo burbuja
	 * @param estudiante es el Arraylist a ordenar
	 * @return el ArrayList ya ordenado por apellido
	 */
	public static ArrayList<AluPre> OrdenarPorApellido(ArrayList<AluPre> estudiante){
		if (estudiante.size() > 1) {
			AluPre temp;
			for (int i = 0; i < (estudiante.size()-1); i++) {
				for (int j = 0; j < (estudiante.size()-1); j++) {
					if (estudiante.get(j).apellido.compareTo(estudiante
							.get(j + 1).apellido) > 0) {
						temp = estudiante.get(j);
						estudiante.set(j, estudiante.get(j + 1));
						estudiante.set((j + 1), temp);
					}
					else if (estudiante.get(j).apellido.compareTo(estudiante
							.get(j + 1).apellido) == 0){
						if (estudiante.get(j).nombre.compareTo(estudiante
								.get(j + 1).nombre) > 0) {
							temp = estudiante.get(j);
							estudiante.set(j, estudiante.get(j + 1));
							estudiante.set((j + 1), temp);
						}
					}
				}
			}
		}
		return estudiante;
	}
	
	/**
	 * Ordena el ArrayList<AluPre> por promedio de forma Descendente
	 *  por el metodo burbuja
	 * @param estudiante es el Arraylist a ordenar
	 * @return el ArrayList ya ordenado por Promedio
	 */
	public static ArrayList<AluPre> OrdenarPorPromedio(ArrayList<AluPre> estudiante){
		if (estudiante.size() > 1) {
			AluPre temp;
			for (int i = 0; i < (estudiante.size()-1); i++) {
				for (int j = 0; j < (estudiante.size()-1); j++) {
					if (estudiante.get(j).promedio < estudiante.get(j+1).promedio) {
						temp = estudiante.get(j);
						estudiante.set(j, estudiante.get(j + 1));
						estudiante.set((j + 1), temp);
					}
				}
			}
		}
		return estudiante;
	}

}//class
