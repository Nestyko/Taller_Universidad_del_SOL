public class AluExt extends Estudiante
{	String Cur;
	byte Niv;
	byte Not[];
	float Prom;

	//CONSTRUCTOR
	public AluExt(String A, String No, int Ce, Fecha Na, String C, byte N, byte[]Nt)
	{	super(A,No,Ce,Na);
		Cur = C;
		Niv = N;
		Not = new byte [Niv];
		Not = Nt;
		Prom = PromNot();
	}//AluExt

	//METODO PARA CALCULAR EL PROMEDIO
	public float PromNot()
	{	int Tot = 0;
		for(int i=0; i<Niv; i++) Tot += Not[i];
		return Tot/Niv;
	}//PromNot

	//METODO PARA MOSTRAR LOS DATOS
	public void MostDat()
	{	MCursor.BLinea(30);
		MCursor.TCen(10,"------------------------------------------------------------");
		super.MostDat();
		MCursor.TCen(20,"CURSO = "+Cur);
		MCursor.TCen(20,"NIVELES INSCRITOS = "+Niv);
		MCursor.TCen(20,"NOTA DE LOS NIVELES");
		for(int i=0; i<Niv; i++) MCursor.TCen(25,"NIVEL ["+(i+1)+"] = "+Not[i]);
		MCursor.TCen(10,"------------------------------------------------------------");
		MCursor.TCen(20,"PROMEDIO = "+Prom);
		MCursor.TCen(10,"------------------------------------------------------------");
	}
}//class