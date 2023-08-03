
public enum EnumMoneda {

	
	DOLAR_AMERICANO("DolarEstadoUnidenses",1.00d,"EEUU"),
	EURO("Euro", 0.92d,"España"),
	LIBRAS_ESTERLINAS("LibrasEsterlinas", 0.79d,"Inglaterra"),
	YEN_JAPONES("YenJapones", 144d, "Japon"),
	WON_SUR_COREANO("WonSurcoreno",1316d, "Corea del Sur"),
	PESOS_ARGENTINOS("PesosArgentinos",498d,"Argenitna"),
	SOLES_PERUANOS("NuevoSolPeruano", 3.63d, "Peru");
	
	private String nombreMoneda;
	private double valorEnDolarMoneda;
	private String paisMoneda;
	
	
	private EnumMoneda (String nombreMoneda, double valorEnDolarMoneda, String paisMoneda) {
		this.nombreMoneda=nombreMoneda;
		this.valorEnDolarMoneda=valorEnDolarMoneda;
		this.paisMoneda= paisMoneda;
	}


	public String getNombreMoneda() {
		return nombreMoneda;
	}


	public double getValorEnDolarMoneda() {
		return valorEnDolarMoneda;
	}



	public String getPaisMoneda() {
		return paisMoneda;
	}


	
	
}
