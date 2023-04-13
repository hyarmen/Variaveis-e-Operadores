package JavaTech;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		float n1, n2, n3, n4, calculo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		n1 = leia.nextFloat();
		System.out.println("Entre com o segundo número: ");
		n2 = leia.nextFloat();
		System.out.println("Entre com o terceiro número: ");
		n3 = leia.nextFloat();
		System.out.println("Entre com o quarto número: ");
		n4 = leia.nextFloat();
		
		calculo = (n1*n2)-(n3*n4);
		
		System.out.printf("\nA diferença entre os produtos é: %.2f",calculo);


	}

}
