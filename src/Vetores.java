import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		/*String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		
		System.out.println(cars[0]);
		System.out.println(cars[2]);
		
		cars[2] = "Chevrolet";
		System.out.println(cars[2]);
		
		System.out.println("");
		
		//for indexado
		for(int i = 0; i < cars.length; i++) {
			System.out.println(i + " -> " + cars[i]);
		}
		
		System.out.println("");
		int x = 0;
		while(x < cars.length) {
			System.out.println(x + " -> " + cars[x]);
			x++;
		}
		
		//não indexado - iterativo
		System.out.println("");
		for(String c : cars ) {
			System.out.println(c);	
		}*/
		desafioDobro();

	}
	
	static void desafioDobro() {
		Scanner input = new Scanner(System.in);
		int[] numeros = new int[3];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Informe numero: ");
			numeros[i] = input.nextInt();			
		}
		
		for(int n : numeros) {
			System.out.println(n + n);
		}
	}

}
