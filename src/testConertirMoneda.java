import javax.swing.JOptionPane;

public class testConertirMoneda {

	
	public static void main(String[] args) {
	
	
		boolean bandera=true;
		while(bandera){
				
			//listamos en el mensaje los tipos de moneda a convertir origen
			 Object seleccionMonedaOrigen = Util.seleccionadorMonedasPaises("Origen");
		
			 System.out.println(seleccionMonedaOrigen);
			//luego le pedimos la cantidad que desea convertir
			 double cantidadAConvertirMonedaOrigen= Double.parseDouble(JOptionPane.showInputDialog("Ingrese cantidad a convertir"));
		
			//listamos en el mensaje los tipos de moneda a convertir destino	
			 Object seleccionMonedaDestino = Util.seleccionadorMonedasPaises("Destino");
			 
			 
			Moneda monedaOrigen=Util.instanciadorPorSeleccion(seleccionMonedaOrigen);
			Moneda monedaDestino=Util.instanciadorPorSeleccion(seleccionMonedaDestino);
			
			 	
			if(monedaOrigen instanceof DolarEstadoUnidenses ) {
				 Util.ejecutorConversion(cantidadAConvertirMonedaOrigen, monedaOrigen,
						 				monedaDestino, EnumMoneda.DOLAR_AMERICANO.getNombreMoneda());
				 bandera=Util.deseaContinuar();
			 }

			if(monedaOrigen instanceof PesosArgentinos ) {
				 Util.ejecutorConversion(cantidadAConvertirMonedaOrigen, monedaOrigen,
						 				monedaDestino, EnumMoneda.PESOS_ARGENTINOS.getNombreMoneda());
				 bandera=Util.deseaContinuar();
			 }
			if(monedaOrigen instanceof Euro ) {
				 Util.ejecutorConversion(cantidadAConvertirMonedaOrigen, monedaOrigen,
						 				monedaDestino, EnumMoneda.EURO.getNombreMoneda());
				 bandera=Util.deseaContinuar();
			 }
			if(monedaOrigen instanceof LibrasEsterlinas ) {
				 Util.ejecutorConversion(cantidadAConvertirMonedaOrigen, monedaOrigen,
						 				monedaDestino, EnumMoneda.LIBRAS_ESTERLINAS.getNombreMoneda());
				 bandera=Util.deseaContinuar();
			 }
			if(monedaOrigen instanceof SolesPeruanos ) {
				 Util.ejecutorConversion(cantidadAConvertirMonedaOrigen, monedaOrigen,
						 				monedaDestino, EnumMoneda.SOLES_PERUANOS.getNombreMoneda());
				 bandera=Util.deseaContinuar();
			 }
			if(monedaOrigen instanceof WonSurCoreano ) {
				 Util.ejecutorConversion(cantidadAConvertirMonedaOrigen, monedaOrigen,
						 				monedaDestino, EnumMoneda.WON_SUR_COREANO.getNombreMoneda());
				 bandera= Util.deseaContinuar();
			 }
			if(monedaOrigen instanceof YenJapones ) {
				 Util.ejecutorConversion(cantidadAConvertirMonedaOrigen, monedaOrigen,
						 				monedaDestino, EnumMoneda.YEN_JAPONES.getNombreMoneda());
				 bandera=Util.deseaContinuar();
			 }
			
			
		}//fin del while
            
		           JOptionPane.showMessageDialog(null, "Proceso de conversion de Monedas terminado"
		           									+ "\n Muchas Gracias");  
	}	//fin del main


}//fin de la clase
