# Classes e Objetos
  As classes servem para especificar as entidades, nelas estão presentes vários atributos e funções. Os objetos existem a partir das classes, e quando são criados
assumem diversos valores diferentes para atributos e também podem executar funções.
  
  Para entender melhor esse assunto é possível se fazer uma analogia de classes com a planta baixa de uma casa, e a casa como o objeto. Ou seja, várias casas (Objetos) podem ser construídas apartir de uma planta baixa (Classe), e cada uma dessas casas tem seus detalhes (valores e atributos).
  No código abaixo é possível se notar a representação de classes e objetos na criação de uma refeição (que seria a classe), e o almoço/janta seriam os objetos (cada um contendo
seus devidos atributos).
```java
class Refeicao{
        String nome;
        String carboidrato;
        int gramasCarboidrato;
        String proteina;
        int gramasProteina;
        int tempoCozimento;
        double preco;
}

class MainRefeicao {
        public static void main(String [] args) {
                Refeicao almoco = new Refeicao();
                almoco.nome = "cuzcuz com ovo";
                almoco.carboidrato = "cuzcuz";
                almoco.gramasCarboidrato = 120;
                almoco.proteina = "ovo";
                almoco.gramasProteina = 60;
                almoco.tempoCozimento = 20;
                almoco.preco = 10;
        }
}
```
  Ao se adicionar a palavra chave **new** você irá permitir a criação de novos objetos. No main do código, é criado um objeto da classe Refeição, que basicamente é o almoço.
  É possível se criar vários objetos de almoço, sendo eles iguais ou diferentes (no sentido de refeições), assim como também seria possível se criar outras refeições como
  jantar ou lanche da tarde, por exemplo.
  
  Ao se acionar a palavra chave mais a classe (**new Refeicao()**) é chamado o construtor dessa classe. Esses construtores são quem permitem a criação de novos objetos, para acionar o construtor se utiliza a palavra chave **new**. Caso a classe não apresente um construtor de forma explícita, a JVM interpreta e adiciona o construtor padrão do sistema, construtores padrões não possuem argumento. Abaixo está um exemplo de como a classe Refeição aparece para a JVM:
```java
class Refeicao{
        String nome;
        String carboidrato;
        int gramasCarboidrato;
        String proteina;
        int gramasProteina;
        int tempoCozimento;
        double preco;
        
        public Refeicao(){}
}
```
  Também é possível se criar construtores com argumentos, como será mostrado a seguir:
```java
class Refeicao{
        String nome;
        String carboidrato;
        int gramasCarboidrato;
        String proteina;
        int gramasProteina;
        int tempoCozimento;
        double preco;
        
        public Refeicao(String nome, String carboidrato, int gramasCarboidrato, String proteina, int gramasProteina, int tempoCozimento, double preco) {
                this.nome = nome;
                this.carboidrato = carboidrato;
                this.gramasCarboidrato = gramasCarboidrato;
                this.proteina = proteina;
                this.gramasProteina = gramasProteina;
                this.tempoCozimento = tempoCozimento;
                this.preco = preco;
        }
}       

class MainRefeicao{
        public static void main(String [] args){
                Refeicao almoco = new Refeicao("cuzcuz com ovo", "cuzcuz", 120, "ovo", 60, 20, 10);
                Refeicao jantar = new Refeicao("arroz com carne", "arroz", 80, "carne", 100, 30, 15);
        }
}
```
  Construtores que utilizam argumentos podem utilizar diversas quantidades diferentes de argumentos. Quando o nome do argumento é igual ao nome da variável da instância, se é 
utilizado a palavra chave **this** que serve para remover a ambiguidade. No caso, o termo this refere-se a variável de instância. Entretanto se o nome do argumento não é igual 
ao nome da variável de instância, o uso do this não se torna obrigatório, porém o uso do mesmo é uma ótima prática de programação.

**OBS:** Ao se utilizar um construtor com argumentos, o construtor default não irá mais existir.

  Quando são criados diversos construtores em um código é chamado de **sobrecarga**. Como por exemplo se for preciso criar um construtor que apresenta apenas alguns atributos
da refeição, é possível cria-lo. Pois o que diferencia qual é o construtor que será chamado é a ordem, quantidade e tipo de parâmetros que são desejados no momento da 
instânciação do objeto.
```java
class Refeicao{
	String nome;
	String carboidrato;
	int gramasCarboidrato;
	String proteina;
	int gramasProteina;
	int tempoCozimento; 
	double preco; 
	
  	public Refeicao(){ }
  
  	public Refeicao(String nome, String carboidrato, int gramasCarboidrato, String proteina, int gramasProteina, int tempoCozimento, double preco){
		this.nome = nome;
    		this.carboidrato = carboidrato;
		this.gramasCarboidrato = gramasCarboidrato;
		this.proteina = proteina;
		this.gramasProteina = gramasProteina;
		this.tempoCozimento = tempoCozimento;
		this.preco = preco;
        }
  
        public Refeicao(String carboidrato, String proteina){
                this.carboidrato = carboidrato;
                this.proteina = proteina;
                this.nome = carboidrato + " com " + proteina;
        }
}

class MainRefeicao{
	public static void main(String [] args){
		Refeicao almoco1 = new Refeicao();
		almoco1.nome = "cuzcuz com ovo";
		almoco1.carboidrato = "cuzcuz";
		almoco1.gramasCarboidrato = 120;
		almoco1.proteina = "ovo";
		almoco1.gramasProteina = 60;
		almoco1.tempoCozimento = 20;
		almoco1.preco = 10;

		Refeicao almoco2 = new Refeicao("cuzcuz com ovo", "cuzcuz", 120, "ovo", 60, 20, 10);
		Refeicao jantar = new Refeicao("arroz com carne", "arroz", 80, "carne", 100, 30, 15);
		Refeicao cafeDaManha = new Refeicao("pao", "ovo");
        }
}
```
  Vale ressaltar que é possível que um construtor utilize o mesmo código de outro construtor existente, assim ele estará evitando uma duplicação do código. Um exemplo prático
  disso é um construtor que recebe dois argumentos (como nos exemplos mostrados, carboidrato e proteína), para que ele inicializasse com as demais variáveis de forma padrão
  seria necessário o uso de outro construtor já existente, no exemplo abaixo é possível se verificar isso:
```java
class Refeicao{
        String nome;
        String carboidrato;
        int gramasCarboidrato;
        String proteina;
        int gramasProteina;
        int tempoCozimento; 
        double preco; 
  
  	public Refeicao(){ }
  
  	public Refeicao(String nome, String carboidrato, int gramasCarboidrato, String proteina, int gramasProteina, int tempoCozimento, double preco){
                this.nome = nome;
                this.carboidrato = carboidrato;
                this.gramasCarboidrato = gramasCarboidrato;
                this.proteina = proteina;
                this.gramasProteina = gramasProteina;
                this.tempoCozimento = tempoCozimento;
                this.preco = preco;
	}
  
  	public Refeicao(String carboidrato, String proteina){
		this(carboidrato+" com "+proteina, carboidrato, 120, proteina, 60, 20, 10);
	}
}
class MainRefeicao{
	public static void main(String [] args){
		Refeicao almoco1 = new Refeicao();
                almoco1.nome = "cuzcuz com ovo";
                almoco1.carboidrato = "cuzcuz";
                almoco1.gramasCarboidrato = 120;
                almoco1.proteina = "ovo";
                almoco1.gramasProteina = 60;
                almoco1.tempoCozimento = 20;
                almoco1.preco = 10;

    		Refeicao almoco2 = new Refeicao("cuzcuz com ovo", "cuzcuz", 120, "ovo", 60, 20, 10);
		Refeicao jantar = new Refeicao("arroz com carne", "arroz", 80, "carne", 100, 30, 15);
		Refeicao cafeDaManha = new Refeicao("pao", "ovo");     
                       
  	}
}
```
  Para que seja possível retornar a representação textutal do objeto, é utilizado uma função chamada de **toString**. Ou seja, com essa função será possível visualizar o valor
das variáveis no terminal, por exemplo. Pois quando se chama a função **System.out.println()** tendo sua variável de referência a um objeto qualquer, a JVM irá executar o **toString()** referente aquele objeto chamado na funçao de print. O exemplo abaixo irá demonstrar isso de forma prática:
```java
class Refeicao{

        // variáveis de instância (objetos)
        String nome;    
        String carboidrato;
        int gramasCarboidrato;
        String proteina;
        int gramasProteina;
        int tempoCozimento; 
        double preco; 
	
	// construtor padrão (default)
  	public Refeicao(){ }                                                
  
  	// construtor com argumentos                                                                    
        public Refeicao(String nome, String carboidrato, int gramasCarboidrato, String proteina, int gramasProteina, int tempoCozimento, double preco){
                this.nome = nome;
                this.carboidrato = carboidrato;                         
                this.gramasCarboidrato = gramasCarboidrato;
                this.proteina = proteina;
                this.gramasProteina = gramasProteina;
                this.tempoCozimento = tempoCozimento;
                this.preco = preco;
	}
	
	// construtor possuindo 2 strings como argumentos
  	public Refeicao(String carboidrato, String proteina){                
		this(carboidrato + " com " + proteina, carboidrato, 120, proteina, 60, 20, 10);
	}
       
        // função que irá retornar os valores dos atributos em forma de string
        public String toString() {                                           
                String output = "";
                output += "Nome: " + this.nome + "\n";
                output += "Carboidrato: " + this.carboidrato + "\n";
		output += "Gramas carboidrato: " + this.gramasCarboidrato + "\n";
                output += "Proteina: " + this.proteina + "\n";
                output += "Gramas proteina: " + this.gramasProteina + "\n";
                output += "Tempo de cozimento: " + this.tempoCozimento + "\n";
                output += "Preço: " + this.preco + "\n";
                return output;                              
        }
}
class MainRefeicao{
	public static void main(String [] args){
                Refeicao almoco1 = new Refeicao();
                almoco1.nome = "cuzcuz com ovo";
                almoco1.carboidrato = "cuzcuz";
                almoco1.gramasCarboidrato = 120;
                almoco1.proteina = "ovo";
                almoco1.gramasProteina = 60;
                almoco1.tempoCozimento = 20;
                almoco1.preco = 10;

    		Refeicao almoco2 = new Refeicao("cuzcuz com ovo", "cuzcuz", 120, "ovo", 60, 20, 10);
		Refeicao jantar = new Refeicao("arroz com carne", "arroz", 80, "carne", 100, 30, 15);
		Refeicao cafeDaManha = new Refeicao("pao", "ovo");
                
                System.out.println(almoco1);
		System.out.println(almoco2);
		System.out.println(jantar);
		System.out.println(cafeDaManha);      
        }
}
```
  Dessa forma, utilizando classes e objetos com seus respectivos atributos, construtores e funções é possível construir programas que possam representar de alguma forma
usualidades do mundo real e talvez até ajudar no mesmo. Tal organização de entidades em classes com seus objetos é o que a programação orientada a objetos utiliza, e com
eles é possível se construir um mundo de algorítmos que utilizam desse tipo de programação.
