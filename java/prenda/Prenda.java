package prenda;

import marca.Marca;

public abstract class Prenda {

	
	private double precioBasePrenda;
	
	private OrigenPrenda origenPrenda;
	
	private Marca marca;
	
	public void setPrecioBasePrenda(double precio){
		
		this.precioBasePrenda = precio;
		
	}
	
	public void setOrigenPrenda(OrigenPrenda origen){
		
		this.origenPrenda = origen;
		
	}
		
	public double getPrecioBasePrenda() {
		return precioBasePrenda;
	}

	public double getOrigenPrendaConTasaImportacion() {
		return origenPrenda.getTasaImportacion();
	}
	
	public double getPrecio(double valorNegocio){
		
		return(valorNegocio+this.getPrecioBasePrenda())*this.getOrigenPrendaConTasaImportacion();
	}
	
	public double getPrecioFinal(double valorNegocio){
		
		return getPrecio(valorNegocio)*marca.getCoeficiente(getPrecio(valorNegocio));
	}
	
}