
class BeneficiosCovidExt extends BeneficiosCovi19 {
      
	Double numEstrato;
    Double porcentaje;  
	
    public Object nuevoValor(Double numEstrato, Double valorSubsidio) {
    	if (numEstrato <=2) {
    		double nuevovalor = this.valorSubsidio * (1 + this.porcentaje);
			return nuevovalor; 
    	}			
    	else {
    		return null;
    	}
    }
    
}
