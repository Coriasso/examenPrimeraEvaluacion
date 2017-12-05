import java.util.Scanner;

/**
 * Segundo ejercicio de la opción A del examen de programación de la primera evaluación
 * 
 * @author Jorge Sánchez Coriasso
 * 
 * @version 1.0
 * 
 * */
public class Cadena{

	public static void main (String[] args){
		
		
		Scanner sc = new Scanner(System.in);
		
		String cadena = sc.next();
		
		//Todo el programa busca caracteres en minúscula y sin acetuar
		
		sc.close();
		
		
		
		
		System.out.printf("Empieza o termina la cadena %s por vocal? %b%n",cadena, empiezaOTerminaVocal(cadena));
		
		
		System.out.printf("La cadena %s tiene %d vocales no acentuadas y minusculas%n",cadena, contarVocales(cadena));

	
		System.out.printf("La cadena %s contiene una m, una n o una p? %b%n",cadena, contieneMNoP(cadena));
		
		
		System.out.printf("La cadena %s empieza por vocal? %b%n",cadena, empiezaONoPorVocal(cadena));
	 
		System.out.println("=================================");
		
		
	}//fin main
	
	/**
	 * Método que determina si la cadena empieza o termina en vocal
	 * 
	 * @param cadena Cadena sobre la que se va a trabajar
	 */
	public static boolean empiezaOTerminaVocal(String cadena){
		
		if(cadena.charAt(0) == 'a' ||cadena.charAt(0) == 'e' ||cadena.charAt(0) == 'i' ||cadena.charAt(0) == 'o'||cadena.charAt(0) == 'u' || cadena.charAt((cadena.length()-1)) == 'a' || cadena.charAt((cadena.length()-1)) == 'e' || cadena.charAt((cadena.length()-1)) == 'i' || cadena.charAt((cadena.length()-1)) == 'o')
			return true;
			
		else
			return false;
			
			
		
	}
	
	/**
	 * Método que cuenta el número de vocales no acentuadas y minúsculas de la cadena
	 * 
	 * @param cadena Cadena sobre la que se va a trabajar
	 */
	
	public static int contarVocales(String cadena){
	
		int contador = 0;
		  
		  for (int i = 0; i < cadena.length(); i++) {
			
			
            if (cadena.charAt(i) == 'a' ||cadena.charAt(i) == 'e' ||cadena.charAt(i) == 'i' ||cadena.charAt(i) == 'o'||cadena.charAt(i) == 'u')
				contador+=1;
	
			}//fin if 
		
		return contador;
		
		
	}
	
	
	
	/**
	 * Método para comprobar si contiene una m, una n o una p. Todo en minúscula
	 * 
	 * @param cadena Cadena sobre la que se va a trabajar
	 */
	
	public static boolean contieneMNoP(String cadena){
		
		for (int i = 0; i < cadena.length(); i++){
			if (cadena.charAt(i) == 'm' ||cadena.charAt(i) == 'n' ||cadena.charAt(i) == 'p'){
				System.out.println("La cadena sí contiene la letra m, n o p");
				return true;
			 }
			 			
			
			}//fin for
		
			return false;
	}


	/**
	 * Método que determina si la cadena empieza por vocal, y además la muestra
	 * 
	 * @param cadena Cadena sobre la que se va a trabajar
	 */

	public static boolean empiezaONoPorVocal(String cadena){
		
		if (cadena.charAt(0) == 'a' ||cadena.charAt(0) == 'e' ||cadena.charAt(0) == 'i' ||cadena.charAt(0) == 'o'||cadena.charAt(0) == 'u')
			return true;
		return false;

		
		
	}

}
