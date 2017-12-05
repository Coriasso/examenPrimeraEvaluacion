public class Numero{

	public static void main (String[] args){
		
		int numeroS = args[0].length();
		int numero = Integer.parseInt(args[0]);
		
	
		
		if(numero < 4){
			System.out.printf("El número %d es menor que 4%n", numero);
			System.out.printf("Fin del programa%n");
			return;
		}
		if(numero > 1000){ 
			System.out.printf("El número %d es mayor que 1000%n", numero);
			System.out.printf("Fin del programa%n");
			return;
		}
		
		if(numero % 2 == 0)
			System.out.printf("El número %d es par %n", numero);
		else
			System.out.printf("El número %d es impar %n", numero);

		if(numero % 15 == 0)
			System.out.printf("El número %d es multiplo tanto de 3 como de 5 %n", numero);
				
		System.out.printf("El número %d tiene %d caracteres %n", numero,numeroS);
	
	}//fin main
	




}
