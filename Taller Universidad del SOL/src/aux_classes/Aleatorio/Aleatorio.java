package aux_classes.Aleatorio;
import java.util.ArrayList;
import java.util.Random;
import aux_classes.input_output.*;


/**
 * @author Nestor
 * Aleatorio contiene funciones para generar Personas Aleatorias con: 
 * @param Nombre
 * @param Apellido
 * @param Cedula
 * @param Genero el genero coincide con los nombres
 * 
 * tambien contine una funcion para generar frutas al azar
 * 
 * Esta clase funciona debido a que tiene pre-establecidos una cantidad
 * de nombres, apellidos, frutas , etc  los cuales son seleccionados al azar.
 */
public class Aleatorio {

		
		private ArrayList<String> Nombres_Aleatorios = new ArrayList<String>();
		private ArrayList<String> Apellidos_Aleatorios = new ArrayList<String>();
		private ArrayList<String> Frutas_Aleatorias = new ArrayList<String>();
		private String nombre;
		private String apellido;
		private char genero;
		private int cedula;
		private byte edad;
		private static ArrayList<Integer> Cedulas = new ArrayList<Integer>();
		
		private void generarApellidosAleatorios(){
			Apellidos_Aleatorios.add("Tobon");
			Apellidos_Aleatorios.add("Arrieta");
			Apellidos_Aleatorios.add("Gonzalez");
			Apellidos_Aleatorios.add("Fossi");
			Apellidos_Aleatorios.add("Arteaga");
			Apellidos_Aleatorios.add("Fonsi");
			Apellidos_Aleatorios.add("Messi");
			Apellidos_Aleatorios.add("Rodriguez");
			Apellidos_Aleatorios.add("Zambrano");
			Apellidos_Aleatorios.add("Ortega");
			Apellidos_Aleatorios.add("O'Neal");
			Apellidos_Aleatorios.add("Fernandez");
			Apellidos_Aleatorios.add("Sanchez");
			Apellidos_Aleatorios.add("Yanez");
			Apellidos_Aleatorios.add("Delgado");
			Apellidos_Aleatorios.add("Gutierrez");
			Apellidos_Aleatorios.add("Pirela");

		}
		
		/**
		 * 
		 */
		private void generarFrutasAleatorias(){
			Frutas_Aleatorias.add("Kiwi");
			Frutas_Aleatorias.add("Manzana");
			Frutas_Aleatorias.add("Piña");
			Frutas_Aleatorias.add("Ananá");
			Frutas_Aleatorias.add("Pera");
			Frutas_Aleatorias.add("Sandía");
			Frutas_Aleatorias.add("Patilla");
			Frutas_Aleatorias.add("Nispero");
			Frutas_Aleatorias.add("Naranja");
			Frutas_Aleatorias.add("Melón");
			Frutas_Aleatorias.add("Coco");
			Frutas_Aleatorias.add("Mango");
			Frutas_Aleatorias.add("Papaya");
			Frutas_Aleatorias.add("Limón");
			
		}
		
		/**
		 * 
		 */
		private void generarNombresAleatorios(){
			Nombres_Aleatorios.add("Nestor");
			Nombres_Aleatorios.add("Luis");
			Nombres_Aleatorios.add("Jose");
			Nombres_Aleatorios.add("Moises");
			Nombres_Aleatorios.add("Julio");
			Nombres_Aleatorios.add("Alexander");
			Nombres_Aleatorios.add("Andres");
			Nombres_Aleatorios.add("Oscar");
			Nombres_Aleatorios.add("Gerardo");
			Nombres_Aleatorios.add("Mariana");
			Nombres_Aleatorios.add("Virginia");
			Nombres_Aleatorios.add("Lorena");
			Nombres_Aleatorios.add("Mia");
			Nombres_Aleatorios.add("Fabiana");
			Nombres_Aleatorios.add("Catalina");
			Nombres_Aleatorios.add("Maria");
			Nombres_Aleatorios.add("Gabriela");
		}
		
									//Constructor
		
		public Aleatorio(){
			this.nombre = getNombreAleatorio();
			this.apellido = getApellidoAleatorio();
			this.genero = getGeneroApropiado(this.nombre);
			do{
			this.cedula = getCedulaAleatoria();
			}while(!ValidarCedula(this.cedula));
			this.edad = getEdadAleatoria();
		}
		
		public byte getEdadAleatoria(){
			Random rand = new Random();
			return (byte)rand.nextInt(100);
		}
		

		public static boolean ValidarCedula(int cedula){
			while (cedula < 0){
				Print.errorCen("Cedula debe ser positiva");
				cedula = C.in_int("Ingrese Cedula: ");
			}
			for (int i = 0; i < Cedulas.size(); i++) {
				if(cedula == Cedulas.get(i)){
					return false;
				}
			}
			
			return true;
		}
		
		public boolean ValidarCedula(int cedula, int[] cedulas){
			while (cedula < 0){
				Print.errorCen("Cedula debe ser positiva");
				cedula = C.in_int("Ingrese Cedula: ");
			}
			for (int i = 0; i < cedulas.length; i++) {
				if(cedula == cedulas[i]){
					return false;
				}
			}
			
			return true;
		}

		public int getCedulaAleatoria(){
			Random ced = new Random();
			int cedula = 0;
			int rand = ced.nextInt(10);
			
			if (( rand == 0) || (rand == 1) || (rand == 2)
			|| (rand == 3) || (rand == 4) || (rand == 5)
			|| (rand == 6) || (rand == 7)){
				while(cedula < 1000000){
					cedula = ced.nextInt(30000000);
				}
			}
			if ((rand == 8) || (rand == 9)){
				while(cedula < 30000000){
					cedula = ced.nextInt(90000000);
				}
			}
			
			return cedula;
		}
		
		public char getGeneroApropiado(String name){
			char sex = '0';
			for (int i = 0; i < Nombres_Aleatorios.size(); i++) {
				if(name.equals(Nombres_Aleatorios.get(i))){
					if(i <= 8){
						sex = 'M';
					}
					else{
						sex = 'F';
					}
				}
			}
			return sex;
		}
		
		public String getNombreAleatorio(){
			if(Nombres_Aleatorios.size() == 0){
				generarNombresAleatorios();
			}
			Random rand = new Random();
			return Nombres_Aleatorios.get(rand.nextInt(Nombres_Aleatorios.size()));
		}
		
		public String getApellidoAleatorio(){
			if(Apellidos_Aleatorios.size() == 0){
				generarApellidosAleatorios();
			}
			Random rand = new Random();
			return Apellidos_Aleatorios.get(rand.nextInt(Nombres_Aleatorios.size()));
		}
		
		public String getFrutaAleatoria(){
			if(Frutas_Aleatorias.size() == 0){
				generarFrutasAleatorias();
			}
			Random rand = new Random();
			return Frutas_Aleatorias.get(rand.nextInt(Frutas_Aleatorias.size()));
		}
		
		
		public String getNombreAleatoio(){
			if(Nombres_Aleatorios.size() == 0){
				generarNombresAleatorios();
			}
			Random rand = new Random();
			return Nombres_Aleatorios.get(rand.nextInt(Nombres_Aleatorios.size()));
		}
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public char getGenero() {
			return genero;
		}

		public void setGenero(char genero) {
			this.genero = genero;
		}

		public int getCedula() {
			return cedula;
		}

		public void setCedula(int cedula) {
			this.cedula = cedula;
		}

		public byte getEdad() {
			return edad;
		}

		public void setEdad(byte edad) {
			this.edad = edad;
		}

}
