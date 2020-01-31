package Eddpractica;

import java.util.Scanner;

public class ordenacion{
	
	public ordenacion() {
	
	}

	public static String ordenar3(int n1, int n2, int n3) {
			
			int mayor;
			int mitad;
			int menor;
			
			if (n1 > n2 && n1 > n3) { 
			mayor = n1;
			} else if (n2 > n1 && n2 > n3) { 
			mayor = n2;
			}else {
			mayor = n3; 
			} 
			if (n1 < n2 && n1 < n3) { 
			menor = n1; 
			} else if (n2 < n1 && n2 < n3) { 
			menor = n2; 
			} else { 
			menor = n3; 
			} 
			mitad = (n1 + n2 + n3) - (mayor + menor); 

			String resultado = menor + "," + mitad + "," + mayor;
			return resultado;
	}
	
}
