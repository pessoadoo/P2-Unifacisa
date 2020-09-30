public class uri1021 {
	
	public static void main(String[] args) {
			computaNotas(576.00);
		
	}
	public static void computaNotas(double valor) {
		int notasCem = (int)(valor / 100);
		valor = valor % 100;
		int notasCinquenta = (int)(valor / 50);
		valor = valor % 50;
		int notasVinte = (int)(valor /20);
		valor = valor % 20;
		int notasDez = (int)(valor / 10);
		valor = valor % 10;
		int notasCinco = (int)(valor / 5);
		valor = valor % 5;
		int notasDois = (int)(valor / 2);
		valor = valor % 2;
		
		valor *= 100;
		int moedaUmReal = (int)(valor / 100);
		valor = valor % 100;
		int moedaCinquenta = (int)(valor / 50);
		valor = valor % 50;
		int moedaVinteCinco = (int)(valor / 25);
		valor = valor % 25;
		int moedaDez = (int)(valor / 10);
		valor = valor % 10;
		int moedaCinco = (int)(valor / 5);
		valor = valor % 5;
		int moedaUmCent = (int)(valor / 1);
		valor = valor % 1;
		
		System.out.println("NOTAS:");
		System.out.println(notasCem+" nota(s) de R$ 100.00");
		System.out.println(notasCinquenta+" nota(s) de R$ 50.00");
		System.out.println(notasVinte+" nota(s) de R$ 20.00");
		System.out.println(notasDez+" nota(s) de R$ 10.00");
		System.out.println(notasCinco+" nota(s) de R$ 5.00");
		System.out.println(notasDois+" nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(moedaUmReal+" moeda(s) de R$ 1.00");
		System.out.println(moedaCinquenta+" moeda(s) de R$ 0.50");
		System.out.println(moedaVinteCinco+" moeda(s) de R$ 0.25");
		System.out.println(moedaDez+" moeda(s) de R$ 0.10");
		System.out.println(moedaCinco+" moeda(s) de R$ 0.05");
		System.out.println(moedaUmCent+" moeda(s) de R$ 0.01");
				
		
	}	
}
