

/**
 * @see  Valor en la Moneda de Origen" es el valor que deseas convertir,
 *
 *  expresado en la moneda de origen. , es decir 1 peso es = 1 peso
 * "Tipo de Cambio" es la relación entre la moneda de origen y la moneda de destino.
 *  Por ejemplo, si quieres convertir de  peso (ARS) a USD (Dolar), 
 *  el tipo de cambio sería la cantidad de Dolares que obtienes por cada peso. 
 *  o lo que vale tu moneda de origen por cada unidad de ella misma con respecto a la otra
 *  en mi caso 1 peso vale 0.0026 dolar
 * Moneda: clase abstracta que contiene los atributos de cada moneda  que se utilizaran
 * y un metodo 
 * @author Francisco
 *
 */
public abstract class Moneda {
	
	private String nombreMoneda;
	private double tipoCambioMoneda ;
	
	

	/**
	 * Contructor 
	 * @param nombreMoneda
	 * @param tipoCambioMoneda
	 */
	public Moneda (String nombreMoneda, double tipoCambioMoneda) {
		this.setNombreMoneda(nombreMoneda);
		this.setTipoCambioMoneda(tipoCambioMoneda);
	}


	public void setNombreMoneda(String nombreMoneda) {
		this.nombreMoneda = nombreMoneda;
	}


	public void setTipoCambioMoneda(double tipoCambioMoneda) {
		this.tipoCambioMoneda = tipoCambioMoneda;
	}
	
	public String getNombreMoneda() {
		return nombreMoneda;
	}


	public double getTipoCambioMoneda() {
		return tipoCambioMoneda;
	}
	
/**
 * Metodo abstracto que implementara cada clase hija  con dos parametros 
 * el valor de la cantidad a convertir y el factor  de conversion entre 
 * cada moneda	
 * @param cantidadAConvertir
 * @param conversionMonedaDestino
 */
	public abstract void convertirA(double cantidadAConvertir , Moneda conversionMonedaDestino);


	
	
}
