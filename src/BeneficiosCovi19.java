
public class BeneficiosCovi19 {

	 //Debe ser el numero entero aleatorio puedes usar la funcion ramdom para esto
    Double id;
    String nombre;
    Double valorSubsidio;

    //Completar clase

    //Implementar un metodo que retorne el mejor beneficio comparando los valores de todos los beneficios
    public Float getMejorbeneficios(){
        return Float.valueOf(0);
    }

	public Double getId() {
		return id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getValorSubsidio() {
		return valorSubsidio;
	}

	public void setValorSubsidio(Double valorSubsidio) {
		this.valorSubsidio = valorSubsidio;
	}
	
	public BeneficiosCovi19(Double Id, String nombre, Double valorSubsidio) {
	       this.id = Id;
	       this.nombre = nombre;
	       this.valorSubsidio = valorSubsidio;
	}

	public BeneficiosCovi19() {
		// TODO Auto-generated constructor stub
	}
}

