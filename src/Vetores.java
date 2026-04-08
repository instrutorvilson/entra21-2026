import java.util.Scanner;

import javax.swing.JOptionPane;

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
		//desafioDobro();
		/*int[] numeros = {1,2,3,4,5};
		listarArray(numeros);
		
		System.out.println("");
		
		int[] notas = {7,8,9,10,3};
		listarArray(notas);*/
	/*	int retorno = somar(10, 20);
		System.out.println(retorno);
		
		retorno = somar(1000, 300);
		System.out.println(retorno);*/
		
		double precoPizza = 150.00;
		int numeroPessoas = 0;
		System.out.println(dividir(precoPizza, numeroPessoas));
	}
	
	static double dividir(double numero, int divisor) {
		if(divisor == 0) {
			JOptionPane.showMessageDialog(null, "Não pode dividir por zero");
			return 0.0;
		}
		return numero / divisor;
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

	static void listarArray(int[] dados) {
		for(int n : dados) {
			System.out.println(n);
		}
	}
	
	static int somar(int n1, int n2) {
		int x = n1 + n2;
		return x;
	}
	
	
	
}
