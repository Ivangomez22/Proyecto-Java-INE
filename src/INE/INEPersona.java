package INE;

public class INEPersona {
	private String NPersona;
	private String APPersona;
	private String AMPersona;
	private String Domicilio;                                                                      
	private String CElector;                                                                       
	private String CURP;                                                                           
	private String Sexo;                                                                           
	private int Estado;                                                                            
	private int Localidad;                                                                         
	private int Municipio;                                                                         
	private int Emision;                                                                           
	private int Seccion;
	private int Vigencia;
	private int ARegistro;
	private int FNacimiento;

	public String getNPersona() {
		return NPersona;
	}

	public void setNPersona(String nPersona) {
		NPersona = nPersona;
	}

	public String getAPPersona() {
		return APPersona;
	}

	public void setAPPersona(String aPPersona) {
		APPersona = aPPersona;
	}

	public String getAMPersona() {
		return AMPersona;
	}

	public void setAMPersona(String aMPersona) {
		AMPersona = aMPersona;
	}

	public String getDomicilio() {
		return Domicilio;
	}

	public void setDomicilio(String domicilio) {
		Domicilio = domicilio;
	}

	public String getCElector() {
		return CElector;
	}

	public void setCElector(String cElector) {
		CElector = cElector;
	}

	public String getCURP() {
		return CURP;
	}

	public void setCURP(String cURP) {
		CURP = cURP;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public int getEstado() {
		return Estado;
	}

	public void setEstado(int estado) {
		Estado = estado;
	}

	public int getLocalidad() {
		return Localidad;
	}

	public void setLocalidad(int localidad) {
		Localidad = localidad;
	}

	public int getMunicipio() {
		return Municipio;
	}

	public void setMunicipio(int municipio) {
		Municipio = municipio;
	}

	public int getEmision() {
		return Emision;
	}

	public void setEmision(int emision) {
		Emision = emision;
	}

	public int getSeccion() {
		return Seccion;
	}

	public void setSeccion(int seccion) {
		Seccion = seccion;
	}

	public int getVigencia() {
		return Vigencia;
	}

	public void setVigencia(int vigencia) {
		Vigencia = vigencia;
	}

	public int getARegistro() {
		return ARegistro;
	}

	public void setARegistro(int aRegistro) {
		ARegistro = aRegistro;
	}

	public int getFNacimiento() {
		return FNacimiento;
	}

	public void setFNacimiento(int fNacimiento) {
		FNacimiento = fNacimiento;
	}

	public String toString() {
		return "NOMBRE\n" + NPersona + "\n" + APPersona + "\n" + AMPersona + "\nDOMICILIO\n" + Domicilio + "\nCLAVE DE ELECTOR\n" + CElector + "\nCURP\n"
				+ CURP + "\nSEXO\n" + Sexo + "\nESTADO\n" + Estado + "\nLOCALIDAD\n" + Localidad + "\nMUNICIPIO\n" + Municipio + "\nEMISION\n" + Emision + "\nSECCION\n" + Seccion
				+ "\nVIGENCIA\n" + Vigencia + "\nAÑO DE REGISTRO\n" + ARegistro + "\nFECHA DE NACIMIENTO\n" + FNacimiento;

	}

}
