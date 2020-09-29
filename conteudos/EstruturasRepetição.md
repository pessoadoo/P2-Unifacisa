# Estruturas de Repetição

## Do - While
  Essa função é utilizada quando se é necessário que o código seja executado apenas uma vez, e só continue executando novamente apenas se uma condição
for verdadeira.

  O código abaixo é um programa que recebe notas de um aluno, quando um número negativo é recebido ele para a repetiçao e em seguida calcula a média e
exibe o resultado.
```java
Scanner nota = new Scanner(System.in);
int notaAluno = 0;
double media = 0;
int contador = 0;
do{
  notaAluno = nota.nextInt();         //input da nota do aluno;
  if(notaAluno >= 0) {
          media += notaAluno;
          contador++
  }
} while(notaAluno >= 0);              // stop na repetição quando a nota for negativa;
if(contador !=0)
        media /= contador;
System.out.println("Media: "+media);
```
## While
   A diferença entre essa estrutura e o *do-while* é que o *while* não executa o primeiro comando sem antes ler a condição do mesmo, enquanto  o
*do-while* realiza essa leitura.

   Nesse código abaixo, o programa tem como variável inicial nota com o valor de -1, pois assim conseguirá entrar no laço do *while*. Após isso,
ele recebe várias notas de um aluno até que seja escaneado um valor negativo, assim dando fim ao laço de repetição, calculando a média do aluno e
exibindo o resultado.
```java
Scanner nota = new Scanner(System.in);
int notaAluno = 0;
double media = 0;
int contador = 0;
while(notaAluno >= 0){
  notaAluno = nota.nextInt();
  if(notaAluno >= 0) {
          media += notaAluno;
          contador++;
  }
}
if (contador != 0)
         media /= contador;
System.out.println("Média: " +media);
```
## For
  Essa estrutura de repetição é utilizada quando se sabe o valor da quantidade de repetições que o laço irá realizar.
  
  Por exemplo, o código abaixo exibe todos os números pares no intervalo de 0 a 50.
```java
System.out.println("Números pares entre 0 e 50");
for(int i = 0; i <= 50; i++){
          if(i % 2 == 0)
            System.out.print(i+", ");
}
```
