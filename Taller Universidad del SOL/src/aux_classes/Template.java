package aux_classes;
import aux_classes.input_output.*;





public class Template{
	
	public static void main(String[] args){

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

					
					opc = 0;
					continue;
				}//case 1
				
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


public static byte menu(){

   byte opc;
			Print.separador();
				//C.outCenln("Empresa X");
				Print.endl(1);
				Print.separador();
				Print.espacio(40);
				Print.outln("Numero de Vendedores registrados: ");// + variable que cuenta el numero de vendedores
				Print.endl(1);
				Print.outSln("0.- Salir del Programa");
				Print.outSln("1.- Ingresar datos de un Vendedor");
				Print.outSln("2.- Mostrar datos de los Vendedores");
				Print.outSln("3.- Mostrar las ganancias obtenidas por la empresa");
				Print.outSln("4.- Modificar datos de algun vendedor");
				Print.outSln("5.- Borrar a algun vendedor");
				Print.endl(2);
				Print.outSln("9.- Generar datos aleatorios");
				Print.outSln("10.- Acerca del Programa");
				Print.endl(1);
				opc = C.in_byte("Seleccione una opcion: [  ]\b\b\b");
		return opc;
							

	}//menu
	
	public static final void acerca_de(){
	for(int i = 0;i<15;i++){
		System.out.println("\n\n");
		}
	System.out.print("          ");
//	System.out.println("Primer Taller de Programacion 2");
	System.out.println("\n\n");
	System.out.print("          ");
	System.out.println("Programa realizado por: Nestor Luis Tobon Arrieta");
	System.out.print("          ");
	System.out.println("Cedula de Identidad: 23.863.118");
	System.out.print("          ");
	System.out.println("Seccion N-511");
	System.out.println("\n\n");
	System.out.print("          ");
	System.out.println("Repositorios de mis otros programas disponibles en:\nURL: https://github.com/Nestyko");
	System.out.print("\n");
	
	}//acerca_de

}