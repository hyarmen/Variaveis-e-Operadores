package JavaTech;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		float salario, abono, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor do salário: ");
		salario = leia.nextFloat();
		System.out.println("Entre com o valor do abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario+abono;
		
		System.out.printf("\nO novo salário é: %.2f",novoSalario);

	}

}
