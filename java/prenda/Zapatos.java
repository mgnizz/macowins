package prenda;

public class Zapatos extends Prenda {

	private double talle;
	
	public void setPrecioBasePrenda () {
		
		this.setPrecioBasePrenda(400);
		
	}
	
	@Override
	public double getPrecioBasePrenda(){
		
		return super.getPrecioBasePrenda()+(5*talle);
		
	}
	
}
