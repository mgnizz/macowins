package prenda;

public class Saco extends Prenda {

	private int cantidadBotones;
	
	public void setPrecioBasePrenda () {
		
		this.setPrecioBasePrenda(300);
		
	}
	
	@Override
	public double getPrecioBasePrenda(){
		
		return super.getPrecioBasePrenda()+(10*cantidadBotones);
	}
	
}
