
public class SolesPeruanos extends Moneda {

	private double valorConvertido;

	public SolesPeruanos() {
		super("SolesPeruanos", EnumMoneda.SOLES_PERUANOS.getValorEnDolarMoneda());
	}


	@Override
	public void convertirA(double cantidadAConvertir, Moneda conversionMonedaDestino) {
		
		 setValorConvertido(cantidadAConvertir*conversionMonedaDestino.getTipoCambioMoneda()/getTipoCambioMoneda());
				
	}

	public double getValorConvertido() {
		return valorConvertido;
	}
	
//este metodo ejecuta la logica del pafre y lo setea al parametro del hijo y luego se llama con el getter del hijo
	private void setValorConvertido(double valorConvertido) {
		this.valorConvertido = valorConvertido;
	}
	

}
