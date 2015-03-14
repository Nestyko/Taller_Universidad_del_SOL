import aux_classes.jose.Fecha;
import aux_classes.nestor.Aleatorio.Aleatorio;
import aux_classes.nestor.input_output.C;
import aux_classes.nestor.input_output.Print;

import java.util.ArrayList;


/**
 * 
 * @author Nestor Luis Tobon Arrieta C.I: 23.863.118
 * @author Jose Delgado C.I: 
 * @author Seccion N-511
 * 
 * Clase Principal del Taller de programacion Universidad del SOL
 *
 */

public class Universidad_SOL{
	
	/**
	* Variables globales
	*/
	public static ArrayList<AluPre> pregrado = new ArrayList<AluPre>();
	public static ArrayList<AluExt> extension = new ArrayList<AluExt>();
	
	public static void main(String[] args){
		//Inicializar los contadores
		comenzar();

			byte opc;
			do{
			Print.cls();
			opc = menu();
			Print.cls();
			switch(opc){
				case 0:{
					opc = 1;
					continue;

					}
				case 1:{
					Print.outSln("Ingresando datos de Alumno de PRE-GRADO");
					Print.endl(1);
					String nombre = C.solo_letras(C.in_String("INGRESE EL NOMBRE DEL ALUMNO: "));
					String apellido = C.solo_letras(C.in_String("INGRESE EL APELLIDO DEL ALUMNO: "));
					int cedula = C.unsigned(C.in_int("INGRESE LA CEDULA: "));
					Fecha nacimiento = ing_fecha();
					String carrera = C.solo_letras(C.in_String("INGRESE LA CARRERA: "));
					byte semestre = 0;
					while ((semestre <= 0) || (semestre > 12)){
					semestre = C.unsigned(C.in_byte("INGRESE EL SEMESTRE: "));
						if  (semestre > 12){
							Print.errorCen("EL MAXIMO DE SEMESTRES ES 12");
						}
					}
					byte materias = 0;
					while ((materias <= 0) || (materias > 8)){
					materias = C.unsigned(C.in_byte("INGRESE LA CANTIDAD DE MATERIAS: "));
						if (materias > 8){
							Print.errorCen("EL MAXIMO DE MATERIAS ES 8");
						}
					}
					float[] notas = new float[materias];
					for (int i = 0; i < notas.length; i++) {
						notas[i] = C.in_nota("INGRESE LA NOTA " + (i+1) + ": ");
					}
					
					// constructor
					AluPre nuevo = new AluPre(apellido, nombre, cedula,nacimiento,carrera, semestre, materias, notas);
					
					// agregar el obejto nuevo al vector
					pregrado.add(nuevo);
					
					pregrado = AluPre.OrdenarPorApellido(pregrado);
					
					opc = 0;
					continue;
				}//case 1
				
				case 2:{
							Print.outSln("Ingresando datos de Alumno de PRE-GRADO");
							Print.endl(1);
							String nombre = C.solo_letras(C.in_String("INGRESE EL NOMBRE DEL ALUMNO: "));
							String apellido = C.solo_letras(C.in_String("INGRESE EL APELLIDO DEL ALUMNO: "));
							int cedula = C.unsigned(C.in_int("INGRESE LA CEDULA: "));
							Fecha nacimiento = ing_fecha();
							String curso = C.solo_letras(C.in_String("INGRESE CURSO: "));
							byte nivel = 0;
							while ((nivel <= 0) ||(nivel > 6)){
								nivel = C.unsigned(C.in_byte("INGRESE EL NIVEL: "));
								if (nivel > 6){
									Print.errorCen("EL MAXIMO DE NIVELES SON 6");
								}
							}
							
							float[] notas = new float[nivel];
							for (int i = 0; i < notas.length; i++) {
								notas[i] = C.in_nota("INGRESE LA NOTA " + (i+1) + ": ");
							}

							// constructor
							AluExt nuevo = new AluExt(apellido, nombre, cedula,nacimiento,
							curso, nivel, notas);

							// agregar el obejto nuevo al vector
							extension.add(nuevo);
							extension = AluExt.OrdenarPorApellido(extension);
					
					
					opc =0;continue;
				}//case 2
				case 3:{
							if(pregrado.size()==0){
								Print.errorCen("NO HAY ALUMNOS DE PREGRADO REGISTRADOS");
							}
					for(int i = 0;i<pregrado.size();i++){
						pregrado.get(i).MostDat();
						Print.pausa();
					}
					opc=0;continue;
				}
				case 4:{
					if(extension.size()==0){
						Print.errorCen("NO HAY ALUMNOS DE EXTENSION REGISTRADOS");
					}
							for(int i = 0;i<extension.size();i++){
								extension.get(i).MostDat();
								Print.pausa();
							}
							opc=0;continue;
				}
				case 6:{
					CuadroDeHonor_AluPre();
					Print.pausa();
					opc = 0; break;
				}
				case 8:{
					ing_AluPreAleatorio();
					opc=0;
					break;
				}
				case 9:{
					ing_AluExtAleatorio();
					opc=0;
					break;
				}
				
				case 10:{
					acerca_de();
					Print.pausa("PRESIONE ENTER PARA CONTINUAR");
					opc = 0;
					continue;
					}//case 10
				default:{
					Print.errorCen("Seleccion Invalida");
					opc = 0;
					continue;
				}//default
			}//switch
			
			//C.espacio(10);
			//opc = C.in_byte("Si desea Salir del programa Presione 1: ");

		}while(opc != 1);


	}//main

/**
 * Inicializa los contadores staticos de las clases AluPre y AluExt
 */
public static void comenzar(){
	AluPre.comenzar();
	AluExt.comenzar();
}
	
public static byte menu(){

   byte opc;
			Print.separador();
				Print.outCenln("2do TALLER DE PROGRAMACION");
				Print.outCenln("UNIVERSIDAD DEL SOL");
				Print.separador();
				Print.espacio(40);
				Print.outln("Numero de Alumnos Registrados: " + (pregrado.size()+extension.size()));// + variable que cuenta el numero de vendedores
				Print.endl(1);
				Print.outSln("0.- Salir del Programa");
				Print.outSln("1.- INGRESAR DATOS DE UN ALUMNO DE PREGRADO");
				Print.outSln("2.- INGRESAR DATOS DE UN ALUMNO DE EXTENSION");
				Print.outSln("3.- MOSTRAR EL LISTADO DE LOS ALUMNOS DE PREGRADO");
				Print.outSln("4.- MOSTRAR EL LISTADO DE LOS ALUMNOS DE EXTENSION");
				Print.outSln("5.- Mostrar Promedios");
				Print.outSln("6.- Cuadro de Honor");
				//Print.outSln("5.- Borrar a algun estudiante");
				Print.endl(2);
				
				Print.outSln("8.- GENERAR ALUMNO DE PREGRADO ALEATORIO");
				Print.outSln("9.- GENERAR ALUMNO DE EXTENSION ALEATORIO");
				Print.outSln("10.- Acerca del Programa");
				Print.endl(1);
				opc = C.in_byte("Seleccione una opcion: [  ]\b\b\b");
		return opc;
							

	}//menu

	/**
	 * Metodo para ingresar una fecha y comprobarla
	 * @return Fecha con dia mes a�o.
	 */
	public static Fecha ing_fecha(){
		Fecha nueva;
		boolean aux = true;
		do {
			Print.outSln("FECHA DE NACIMIENTO");
			byte dia = C.unsigned(C.in_byte("DIA: "));
			byte mes = C.unsigned(C.in_byte("MES: "));
			int anno = C.unsigned(C.in_int("A�O: "));
			nueva = new Fecha(dia, mes, anno);
			if(nueva.ComFec()){
				aux = false;
			}
			else{
				aux = true;
			}
		} while (aux);
		return nueva;
	}
	
	public static void ing_AluPreAleatorio(){
		Aleatorio hobbit = new Aleatorio();
		Fecha nacimiento = new Fecha(hobbit.getDia(),hobbit.getMes(),hobbit.getYear());
		byte materias = 0;
		while(materias == 0){
			materias = (byte) (Math.random()*8);
		}
		float[] notas = new float[materias];
		notas = Aleatorio.vector(notas, 21);
		
		AluPre nuevo = new AluPre(hobbit.getApellido(),hobbit.getNombre(), hobbit.getCedula(), 
				nacimiento, "Carrera aleatoria", (byte)(Math.random()*12),materias, notas);
		
		pregrado.add(nuevo);
		pregrado = AluPre.OrdenarPorApellido(pregrado);
	}
	
	public static void ing_AluExtAleatorio(){
		Aleatorio hobbit = new Aleatorio();
		Fecha nacimiento = new Fecha(hobbit.getDia(),hobbit.getMes(),hobbit.getYear());
		byte nivel = 0;
		while (nivel == 0){
		nivel = (byte) (Math.random()*6);
		}
		float[] notas = new float[nivel];
		notas = Aleatorio.vector(notas, 21);
		
		AluExt nuevo = new AluExt(hobbit.getApellido(),hobbit.getNombre(), hobbit.getCedula(), 
				nacimiento, "Curso aleatorio", nivel, notas);
		
		extension.add(nuevo);
		extension = AluExt.OrdenarPorApellido(extension);
	}
	
	public static void CuadroDeHonor_AluPre(){
		ArrayList<AluPre> estudiantes = new ArrayList<AluPre>();
		estudiantes = pregrado;
		estudiantes = AluPre.OrdenarPorPromedio(estudiantes);
		
		Print.outCenln("MEJORES NOTAS DE PREGRADO");
		for (AluPre alu : estudiantes) {
			if(alu.promedio == estudiantes.get(0).promedio){
				Print.outCenln("--->   " + alu.apellido + ", " + alu.nombre + ": " + alu.promedio);
			}
			else{
				Print.outCenln(alu.apellido + ", " + alu.nombre + ": " + alu.promedio);
			}
			
		}
		
	}
	
	
	
	

	
	public static final void acerca_de(){
	for(int i = 0;i<15;i++){
		System.out.println("\n\n");
		}
	System.out.print("          ");
	System.out.println("Segundo Taller de Programacion 2");
	System.out.println("\n\n");
	System.out.print("          ");
	System.out.println("Programa realizado por: Nestor Luis Tobon Arrieta");
	System.out.print("          ");
	System.out.println("Cedula de Identidad: 23.863.118");
	System.out.print("          ");
	System.out.println("Programa realizado por: Jos� Delgado");
	System.out.print("          ");
	System.out.println("Cedula de Identidad: ");
	System.out.print("          ");
	System.out.println("Seccion N-511");
	System.out.println("\n\n");
	System.out.print("          ");
	System.out.println("Repositorio del programa disponibles en:\nURL: https://github.com/Nestyko/Taller_Universidad_del_SOL.git");
	System.out.print("\n");
	
	}//acerca_de
	

}
