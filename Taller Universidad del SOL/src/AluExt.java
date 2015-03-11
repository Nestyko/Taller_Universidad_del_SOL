public class AluExt extends Estudiante
{	String curso;
	byte nivel;
	byte notas[];
	float promedio;

	//CONSTRUCTOR
	public AluExt(String A, String No, int Ce, Fecha Na, String C, byte N, byte[]Nt)
	{	super(A,No,Ce,Na);
		this.curso = C;
		nivel = N;
		notas = new byte [nivel];
		notas = Nt;
		promedio = PromNot();
	}//AluExt

	//METODO PARA CALCULAR EL PROMEDIO
	public float PromNot()
	{	int Tot = 0;
		for(int i=0; i<nivel; i++) Tot += notas[i];
		return Tot/nivel;
	}//PromNot

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