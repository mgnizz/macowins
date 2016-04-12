package test;

import prenda.OrigenExtranjero;
import prenda.OrigenLocal;
import prenda.Pantalon;
import negocio.Negocio;


public class MainTest {
	
		public static void main(String[] args) {
			
			Pantalon pantalon;
			pantalon = new Pantalon();
			pantalon.setPrecioBasePrenda();
				
			
			pantalon.setOrigenPrenda(OrigenLocal.crear());
			
			Negocio negocio;
			negocio = new Negocio();
			negocio.setValorFijo(0);
			
			
			
			
			negocio.precioFinal(pantalon); // 1er println
			
				
			pantalon.setOrigenPrenda(OrigenExtranjero.crear());
			
			negocio.precioFinal(pantalon); // pruebo si multiplica por 1.3
			
			
		}

}

