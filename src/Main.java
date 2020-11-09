import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int it;
		int n;
		int nBeneficios;
		int iniClientes = 1;
		int numLista1;
        int numLista2;
        int totalBeneficios1 ;
        int totalBeneficios2 ;
		int nClientes;
		double mayorBeneficio = 0;
		BeneficiosCovi19 beneficios = new BeneficiosCovi19();
		
		ArrayList<Double> lista1 = new ArrayList<Double>();
		ArrayList<Double> lista2 = new ArrayList<Double>();
		
        ArrayList<BeneficiosCovi19> listaBeneficios = null;
        
        /* Solo lo voy a hacer para 2 clientes y tener solo 2 listas	
         * lo dejo como un ciclo para n clientes
         * 
         * nClientes = Integer.parseInt(JOptionPane.showInputDialog("Cuántos clientes va a digiar :" + nClientes));
         */
        	
        	iniClientes = 1;
        	nClientes =2;
        	
        while (iniClientes <= nClientes) {
		 
        n = 1;
    	 nBeneficios = Integer.parseInt(JOptionPane.showInputDialog("Cuántos beneficios tiene el cliente " + iniClientes));
 
		  while (n <= nBeneficios){
			
			  listaBeneficios = new ArrayList<>();
			  
              beneficios.setId(getIdBeneficio());
              beneficios.setNombre(JOptionPane.showInputDialog("Digite Nombre beneficio " + n + " del cliente " + iniClientes));
              beneficios.setValorSubsidio(Double.parseDouble(JOptionPane.showInputDialog("Digite Valor beneficio " + n + " del cliente " + iniClientes)));
		      
              if (iniClientes == 1) {
            	  lista1.add(beneficios.getValorSubsidio());
              }
              else {
            	  lista2.add(beneficios.getValorSubsidio());
              }
              
              listaBeneficios.add(beneficios);
           
              n = n + 1;
		  }
		  iniClientes++;
        }
		  /* Lista los beneficiarios (no funciona bien
		   * solo muestra el último aunque muestra el size correcto
		   */
			for (BeneficiosCovi19 benef:listaBeneficios) {
		
			/* 
			 * Con JOption	
			 */
			JOptionPane.showMessageDialog( null, 
					    "Id beneficio " + benef.getId() + "\n" +
					    "Nombre beneficio " + benef.getNombre()+ "\n" + 
                        "Valor beneficio " + benef.getValorSubsidio());	
			/* 
			 * Con System.out	
			 */	
			System.out.println("Id beneficio " + benef.getId());
			System.out.println("Nombre beneficio " + benef.getNombre());
			System.out.println("Valor beneficio " + benef.getValorSubsidio());
			
			/* con iterator da error
			 * Iterator  = listaBeneficios.iterator();
			 */
			}
		    
			
			/* Reporte de las 2 listas de beneficios
			 * 
			 */

			
			/*
			 * Listar con for each
			 */
			for (Double num:lista1 ) {
				System.out.println(num);
			}
			
			for (Double num:lista2 ) {
				System.out.println(num);
			}
			
			/*
			 * Listar for normal
			 */
			totalBeneficios1 = lista1.size(); 
			System.out.println("La lista 1 tiene  " + totalBeneficios1 + " beneficios, estos son:");
			n= 0;
			while (n <= totalBeneficios1-1) {
				System.out.println(lista1.get(n));
				n++;
			}
			
			totalBeneficios2 = lista2.size(); 
			System.out.println("La lista 2 tiene  " + totalBeneficios2 + " beneficios, estos son:");
			n= 0;
			while (n <= totalBeneficios2-1) {
				System.out.println(lista2.get(n));
				n++;
			}
			
			/* 
			 * Obtener el mayor beneficio de las 2 listas
			 * método 1 : ordenando
			 */
			Collections.sort(lista1, Collections.reverseOrder());
			Double mayorBeneficio1 = lista1.get(0);
			Collections.sort(lista2, Collections.reverseOrder());
			Double mayorBeneficio2 = lista2.get(0);
			
			System.out.println("El mayor beneficio de la lista 1 es: " + mayorBeneficio1);
			System.out.println("El mayor beneficio de la lista 2 es: " + mayorBeneficio2);
			
			/* 
			 * Obtener el mayor beneficio de las 2 listas
			 * método 2 : metodo max de collections
			 */
			mayorBeneficio1 = Collections.max(lista1);
			System.out.println("El mayor beneficio con max lista 1 : " + mayorBeneficio1);
			mayorBeneficio2 = Collections.max(lista2);
			System.out.println("El mayor beneficio con max lista 2 : " + mayorBeneficio2);
			
			/*
			 * Usando operador ternario
			 */
			mayorBeneficio = mayorBeneficio1 > mayorBeneficio2 ? mayorBeneficio1 : mayorBeneficio2;
			System.out.println("El mayor beneficio es : " + mayorBeneficio);
	}
	
    public static Double getIdBeneficio(){
    	
        Double valorRandom = Math.floor(Math.random()*100);
        return valorRandom;
    }

}
