package JavaTech;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o salário bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("Entre com o valor do adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		System.out.println("Entre com o valor das horas extras: ");
		horasExtras = leia.nextFloat();
		System.out.println("Entre com o total de descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto+adicionalNoturno+(horasExtras*5)-descontos;
		
		System.out.printf("\nO Salário Liquido é: %.2f",salarioLiquido);

	}

}
