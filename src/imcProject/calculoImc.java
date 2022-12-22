package imcProject;

import java.util.Scanner;

public class calculoImc {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o seu peso: ");
		int peso = sc.nextInt();

		System.out.print("Digite a sua altura: ");
		double altura = sc.nextDouble();

		double imc = peso / (altura * altura);
		System.out.println("Seu IMC é: " + imc);

		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc >= 18.6 && imc <= 24.9) {
			System.out.println("Peso ideal (Parabéns!)");
		} else if (imc >= 25.0 && imc <= 29.9) {
			System.out.println("Levemente acima do peso");
		} else if (imc >= 30.0 && imc <= 34.9) {
			System.out.println("Obesidade grau 1");
		} else if (imc >= 35.0 && imc <= 39.9) {
			System.out.println("Obesidade grau 2 (Severa)");
		} else {
			System.out.println("Obesidade grau 3 (Mórbida)");
		}
	}
};
