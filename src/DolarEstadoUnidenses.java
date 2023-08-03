/**
 * 
 * @author Francisco
 *
 */
public class DolarEstadoUnidenses extends Moneda {
		
	private double valorConvertido;

	
	public DolarEstadoUnidenses() {
		super("DolarEstadoUnidenses", EnumMoneda.DOLAR_AMERICANO.getValorEnDolarMoneda());		
	}

	@Override
	public void convertirA(double cantidadAConvertir, Moneda conversionMonedaDestino) {
		
		 setValorConvertido(cantidadAConvertir*conversionMonedaDestino.getTipoCambioMoneda()/getTipoCambioMoneda());
				
	}

	public double getValorConvertido() {
		return valorConvertido;
	}
	
/**
 * este metodo ejecuta la logica del padre y lo setea al parametro del hijo y luego se llama con el getter del hijo
 * @param valorConvertido
 */
	private void setValorConvertido(double valorConvertido) {
		this.valorConvertido = valorConvertido;
	}
	

	

	
	

	
}