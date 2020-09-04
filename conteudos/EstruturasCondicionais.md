# Estruturas Condicionais

## if - else - else if

Essas estruturas são utilizadas quando se é necessário fazer várias comparações. Porém, dependendo da situação é necessário utilizar tais estruturas com cautela, pois
o mal uso irá acarretar em uma má programação. No exemplo abaixo, será possível observar o uso dessas estruturas em um programa que identifica qual a sua condição física
apartir do cálculo do IMC com dados (peso e altura) fornecidos.

**OBS:** Não é necessário o uso das chaves ('{ }') caso a condição tenha apenas uma linha de comando, se o comando tiver múltiplas linhas será obrigatório o uso da mesma.

```java
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
```

## Switch - case

Essa estrutura tem seu uso um pouco mais restrito levando em consideração os comandos if else. Porém para comandos que prezam comparar varíaveis que podem assumir valores
bem definidos, tal estrutura é usada com mais frequência, até porque seu uso é mais simples e prático. Ela serve apenas para comparar (==) valores primitivos ou String (lembrando que não pode ser utilizado com float ou double). Não é possível se utilizar também para comparações elaboradas, que envolvem por exemplo >=, <=, e comparações
mais complexas que usam operadores lógicos (||, &&). Abaixo será possível a visualização do uso dessa estrutura, pode se perceber que a palavra "default" tem um funcionamento
parecido com o "else", tendo os dois o mesmo sentido lógico.

```java
public static void main(String[] args) {
		short dia = 17, mes = 4, ano = 2001;
		String mesTxt = convertMesNumPraTexto(mes);
		System.out.println(dia+" de "+mesTxt+" do ano de "+ano);			
	}
	
	public static String convertMesNumPraTexto(short mes) {
		switch(mes) {
		case 1: return "Janeiro";
		case 2: return "Feveireiro";
		case 3: return "Março";
		case 4: return "Abril";
		case 5: return "Maio";
		case 6: return "Junho";
		case 7: return "Julho";
		case 8: return "Agosto";
		case 9: return "Setembro";
		case 10: return "Outubro";
		case 11: return "Novembro";
		case 12: return "Dezembro";
		default: return "Mês inexistente";
		
		}
	}
