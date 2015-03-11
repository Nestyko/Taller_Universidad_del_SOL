public class AluPre extends Estudiante
{	String Car;
	byte Sem;
	byte Mat;
	float Not[];
	float Prom;

	//CONSTRUCTOR
	public AluPre(String apellido, String nombre, int Ce, Fecha Na, String Ca, byte S, byte M, float[] Nt)
	{	super(apellido,nombre,Ce,Na);
		Car = Ca;
		this.Sem = S;
		Mat = M;
		Not = new float [Mat];
		Not = Nt;
		Prom = PromNot();
	}//AluPre

	//METODO PARA CALCULAR EL PROMEDIO
	public float PromNot()
	{	int Tot = 0;
		for(int i=0; i<Mat; i++)	Tot += Not[i];
		return Tot/Mat;
	}//PromNot

	//METODO PARA MOSTRAR LOS DATOS
	public void MostDat()
	{	MCursor.BLinea(30);
		MCursor.TCen(10,"------------------------------------------------------------");
		super.MostDat();
		MCursor.TCen(20,"CARRERA = "+Car);
		MCursor.TCen(20,"SEMESTRE = "+Sem);
		MCursor.TCen(20,"MATERIAS INSCRITAS = "+Mat);
		MCursor.TCen(20,"NOTA DE LAS MATERIAS");
		for(int i=0; i<Mat; i++) MCursor.TCen(25,"MATERIA ["+(i+1)+"] = "+Not[i]);
		MCursor.TCen(10,"------------------------------------------------------------");
		MCursor.TCen(20,"PROMEDIO = "+Prom);
		MCursor.TCen(10,"------------------------------------------------------------");
	}//MostDat

}//class