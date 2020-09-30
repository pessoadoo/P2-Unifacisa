package basics;
import java.util.Scanner;

public class EstruturasCondicionais {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite sua altura: ");
		double altura = entrada.nextDouble();
		System.out.print("digite seu peso: ");
		double peso = entrada.nextDouble();
		double imc = peso / (altura*altura);
		
		if (imc < 16)
			System.out.println("Magreza Grave");
		else if (imc < 17)
			System.out.println("Magreza Moderada");
		else if (imc < 18.5)
			System.out.println("Magreza Leve");
		else if ( imc < 25)
			System.out.println("Saudável");
		else if (imc < 30)
			System.out.println("Sobrepeso");
		else if (imc < 35)
			System.out.println("Obesidade I");
		else if (imc < 40)
			System.out.println("Obesidade II");
		else
			System.out.println("Obesidade III");
		
	} 
	
}
	
	
		
		