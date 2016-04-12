package prenda;

public class Sombrero extends Prenda {
	
private double coeficienteMetrosexual;
	
	public void setPrecioBasePrenda () {
		
		this.setPrecioBasePrenda(150);
		
	}
	
	@Override
	public double getPrecioBasePrenda(){
		
		return super.getPrecioBasePrenda()*(1*coeficienteMetrosexual);
		
	}

}
