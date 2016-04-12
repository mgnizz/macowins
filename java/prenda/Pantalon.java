package prenda;

public class Pantalon extends Prenda {
	
	private double telaUsada;
	
	public void setPrecioBasePrenda () {
		
		this.setPrecioBasePrenda(250);
	}
	
	@Override
	public double getPrecioBasePrenda(){
		
		return super.getPrecioBasePrenda()+telaUsada;
	}
}
