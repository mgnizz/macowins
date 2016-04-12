package negocio;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import prenda.Prenda;
import venta.Venta;

public class Negocio {
	
	private double valorFijo;
	
	private ArrayList<Venta> ventas = new ArrayList<>();	
	
	public void setValorFijo(double num) {
		
		this.valorFijo = num;
		
	}

	public double getValorFijo(){
		
		return this.valorFijo;
	}
	
	public double calcularPrecioFinal(Prenda prenda){
		
		return prenda.getPrecioFinal(this.getValorFijo());
					
	}
	
	public void precioFinal(Prenda prenda) {
	
	System.out.println(this.calcularPrecioFinal(prenda));

}
	
	public void venderUnaPrendaPorCantidad(Prenda prenda, Integer cantidad) {
		
		Venta venta;
		venta = new Venta();
		
		venta.registrarVenta(prenda, cantidad);
		
		this.ventas.add(venta);				
		
	}
	
	public void gananciasDeDia(java.util.Date fecha) {
		
		  double gananciaTotal = ventas.stream()
				  				.filter(venta -> venta.enFecha(fecha))
				  				.mapToDouble(venta -> this.calcularPrecioFinal(venta.getPrenda())*venta.getCantidad())
				  				.sum(); 

	
		System.out.println("La ganancia total de" + fecha + "es:" + gananciaTotal);
	}
}
