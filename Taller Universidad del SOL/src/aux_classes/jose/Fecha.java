package aux_classes.jose;

public class Fecha
{	byte Dia;
	byte Mes;
	int Year;

	//CONSTRUCTOR
	public Fecha(byte D, byte M, int Y)
	{	Dia = D;
		Mes = M;
		Year = Y;
	}//Fecha

	//FUNCION PARA COMPROBAR QUE LA FECHA ES VALIDAD
	public boolean ComFec()
	{	byte Lim = 0, C = 0;
		boolean bis;

		if(Year>=0) C++;
		if((Mes>=1)||(Mes<=12)) C++;
		if((Mes==1)||(Mes==3)||(Mes==5)||(Mes==7)||(Mes==8)||(Mes==10)||(Mes==12))Lim=31;
		if((Mes==4)||(Mes==6)||(Mes==9)||(Mes==11)) Lim=30;
		if(Mes==2)
		{	if(Year % 4==0) Lim=29;
			else	Lim=28;
	    }//if
	    if(Dia<=Lim)C++;
	    if(C==3) return true;
	    else return false;
	}//ComFec

	//FUNCION PARA MOSTRAR LA FECHA
	public void Mostrar(int Pos, String Men)
	{	MCursor.TCen(Pos,Men+Dia+"/"+Mes+"/"+Year);
	}//Mostrar
}//class