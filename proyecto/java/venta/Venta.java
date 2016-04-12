package venta;

import prenda.Prenda;

public class Venta {
	
	protected Integer cantidad;
	
	protected Prenda prenda;
	
	protected java.util.Date fecha;
	
	public Integer getCantidad(){
		
		return cantidad;
	}
	
	
	public void registrarVenta(Prenda prenda, Integer cantidad) {
		
		this.fecha = new java.util.Date();
				
		this.cantidad = cantidad;
		
		this.prenda = prenda;
		
	}
	
	public Prenda getPrenda(){
		
		return this.prenda;
	}
	
	public boolean enFecha(java.util.Date fechaVenta) {
		
		return this.fecha.equals(fechaVenta);
		
	}


	
}
