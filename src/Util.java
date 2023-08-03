import javax.swing.JOptionPane;
/**
 * 
 * @author Francisco
 *
 */
public class Util {

	/**
	 * metodo que comunica al usuario la lista de moneda que puede seleccionar
	 * utilizando las ventanas de dialogo del JOptionPane
	 * @param valor
	 * @return
	 */
	public static Object seleccionadorMonedasPaises(String valor) {
		EnumMoneda[] possibleValues  = EnumMoneda.values();
		return JOptionPane.showInputDialog(null,
	             "Seleccione la moneda que desea convertir", "Moneda "+valor,
	             JOptionPane.INFORMATION_MESSAGE, null,
	             possibleValues, possibleValues[0]);
	}

	/**
	 */
	public static Moneda instanciadorPorSeleccion (Object monedaSeleccionada) {
		if(monedaSeleccionada.equals(EnumMoneda.DOLAR_AMERICANO)) {
			  return new DolarEstadoUnidenses();	 
		}
		if(monedaSeleccionada.equals(EnumMoneda.PESOS_ARGENTINOS)) {
			 return new PesosArgentinos();
		}
		
		if(monedaSeleccionada.equals(EnumMoneda.EURO)) {
			 return new Euro();
		}
		if(monedaSeleccionada.equals(EnumMoneda.LIBRAS_ESTERLINAS)) {
			 return new LibrasEsterlinas();
		}
		if(monedaSeleccionada.equals(EnumMoneda.SOLES_PERUANOS)) {
			 return new SolesPeruanos();
		}
		if(monedaSeleccionada.equals(EnumMoneda.WON_SUR_COREANO)) {
			 return new WonSurCoreano();
		}
		if(monedaSeleccionada.equals(EnumMoneda.YEN_JAPONES)) {
			 return new YenJapones();
		} 
		 return null;	 
	}
	
	//se ejecuta el convertidos tomando toda la info obtenida y hace todo
	//estoy repitiendo mucho codigo aun
	public static void ejecutorConversion(double cantidad,Moneda monedaOrigen,Moneda monedaDestino, String pais) {
		
		if(pais.equals("DolarEstadoUnidenses")) {
			 DolarEstadoUnidenses monedaOrigen2 = (DolarEstadoUnidenses) monedaOrigen;
			 monedaOrigen2.convertirA(cantidad, monedaDestino);
				JOptionPane.showMessageDialog(null, "El resultado de la conversion es : \n"
												+monedaOrigen2.getValorConvertido());
		}
		if(pais.equals("PesosArgentinos")) {
			 PesosArgentinos monedaOrigen2 = (PesosArgentinos)monedaOrigen;
			 monedaOrigen2.convertirA(cantidad, monedaDestino);
			 JOptionPane.showMessageDialog(null, "El resultado de la conversion es : \n"
						+monedaOrigen2.getValorConvertido());
		}
		
		if(pais.equals("Euro")) {
			Euro monedaOrigen2 = (Euro)monedaOrigen;
			monedaOrigen2.convertirA(cantidad, monedaDestino);
			JOptionPane.showMessageDialog(null, "El resultado de la conversion es : \n"
					+monedaOrigen2.getValorConvertido());
		}
		if(pais.equals("LibrasEsterlinas")) {
			LibrasEsterlinas monedaOrigen2 = (LibrasEsterlinas)monedaOrigen;
			monedaOrigen2.convertirA(cantidad, monedaDestino);
			JOptionPane.showMessageDialog(null, "El resultado de la conversion es : \n"
					+monedaOrigen2.getValorConvertido());
		}
		if(pais.equals("SolesPeruanos")) {
			SolesPeruanos monedaOrigen2 = (SolesPeruanos)monedaOrigen;
			monedaOrigen2.convertirA(cantidad, monedaDestino);
			JOptionPane.showMessageDialog(null, "El resultado de la conversion es : \n"
					+monedaOrigen2.getValorConvertido());
		}
		if(pais.equals("WonSurCoreano")) {
			WonSurCoreano monedaOrigen2 = (WonSurCoreano)monedaOrigen;
			monedaOrigen2.convertirA(cantidad, monedaDestino);
			JOptionPane.showMessageDialog(null, "El resultado de la conversion es : \n"
					+monedaOrigen2.getValorConvertido());
		}
		if(pais.equals("YenJapones")) {
			YenJapones monedaOrigen2 = (YenJapones)monedaOrigen;
			monedaOrigen2.convertirA(cantidad, monedaDestino);
			JOptionPane.showMessageDialog(null, "El resultado de la conversion es : \n"
					+monedaOrigen2.getValorConvertido());
		}
		
	}
	
	public static boolean deseaContinuar () {
		int codigo=JOptionPane.showConfirmDialog(null, "Desea Realizar Otra Conversion de Moneda?", "Desicion", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (codigo==JOptionPane.YES_OPTION){
            return true;
        }
        return false;
		/*
		 * Object[] options = { "CONTINUAR", "CANCELAR" };
		 
		 JOptionPane.showOptionDialog(null, "¿Desea Realizar Otra Conversion de Moneda?", "Warning",
		             JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
		             null, options, options[0]);
		*/
	}
	
}
