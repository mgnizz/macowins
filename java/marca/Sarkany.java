package marca;


public class Sarkany extends Marca{
		
		protected double coeficiente;
		
		protected static Sarkany crearSarkany(){
			
			Sarkany marca = new Sarkany();
			
			marca.coeficiente = 1.65;
			
			return marca;
		}
		
		public double getCoeficiente(double precio){
			
			  if (precio > 500) 
			  	  return 1.35 ;
			  else return 1.10;
			  
		}
}
