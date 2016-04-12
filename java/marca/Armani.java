package marca;


public class Armani extends Marca{
		
	protected double coeficiente;
	
	protected static Armani crearArmani(){
		
		Armani marca = new Armani();
		
		marca.coeficiente = 1.65;
		
		return marca;
	}
	
	
}
