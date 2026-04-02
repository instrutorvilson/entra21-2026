import java.util.Scanner;

public class AulaDesvioCondicional {

	public static void main(String[] args) {
		verificarNumeroPar();
	}
	
	static void verificarNumeroPar() {
	   Scanner sc = new Scanner(System.in);	
	   System.out.println("Informe numero: ");
	   int numero = sc.nextInt();
	   
	   if(numero % 2 == 0) {
		   System.out.println("Numero par");
	   }
	  
	}

}
