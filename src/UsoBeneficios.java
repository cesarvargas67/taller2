import java.util.ArrayList;

public class UsoBeneficios {
	
ArrayList<BeneficiosCovi19> listaBeneficios = new ArrayList<>();
	
	public void agregarBeneficio(BeneficiosCovi19 objBeneficio) {
		listaBeneficios.add(objBeneficio);
	}

	public String listarBeneficios() {
		for (BeneficiosCovi19 beneficios:listaBeneficios) {
			return "Nombre beneficio " + beneficios.getNombre();
		}
		return null;
		
	}

}
