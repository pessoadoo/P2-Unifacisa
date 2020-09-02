# Operadores em Java

## Operadores Básicos

**Aritméticos:** +, -, *, /, % (módulo)

```java
int a = 1 + 1;     // o valor de a será = 2
a = 1 - 1;         // o valor de a será = 1
a = a * 10;        // o valor de a será = 10
a = a / 2;         // o valor de a será = 5
a = a / 2;         // o valor de a será = 2 (pois o inteiro armazena apenas a parte inteira, deprezando a parte decimal do resultado)

int resto = 10 % 3;  // o valor do resto será = 1
```

**Unários:** ++, --, !

```java
int a = 10;

//examinando os pós-fixados
int b = a++;       // 'a' é atribuído para b (10), após isso 'a' é incrementado (11)
int c = a--;       // 'a' é atribuído para c (11), após isso 'a' é decrementado (10)

//examinando os pré-fixados
int d = ++a;       // 'a' é incrementado (11), após isso é atribuído seu valor para 'd' (11)
int e = --a;       // 'a' é decrementado (10), após isso é atribuído seu valor para 'e' (10)

//booleano
boolean f = true;
f = !f;            // o valor de f é invertido para false
f = !true;         // o valor de f é mantido como false
f = !false;        // o valor de f é alterado para true
```
**Relacionais de igualdade e comparação:** <, >, <=, >=, ==, !=

```java
int a = 10, b = 15, c = 5, d = 10;

boolean res1 = a > b;         // res1 é = false
res1 = a >= b;                // res1 é = false
res1 = a < b;                 // res1 é = true
res1 = a <= b;                // res1 é = true

boolean res2 = a > c;         // res2 é = true
res2 = a >= c;                // res2 é = true
res2 = a < c;                 // res2 é = false
res2 = a <= c;                // res2 é = false

boolean res3 = a > d;         // res3 é = false
res3 = a >= d;                // res3 é = true
res3 = a < d;                 // res3 é = false
res3 = a <= d;                // res3 é = true

boolean res4 = a == 5;        // res4 é = false
res4 = a != 5;                // res4 é = true
```

**Lógicos:** && (and), || (or)

```java
boolean v1 = true;
boolean v2 = false;

boolean v3 = v1 && v2;         // v3 é = false
v3 = v1 || v2;                 // v3 é = true
```

**Ternário:** ?, : (tem o mesmo efeito do comando if-else)

```java
int altura = 180;
String classificacao = altura > 160 ? "alto" : "baixo";         // a classificação é "alto"

// esse comando é equivalente ao mesmo abaixo, onde é utilizado o if-else
String classificacao = "";
if(altura > 160) {
  classificacao = "alto"
} else{
    classificacao = "baixo"
}
```

**Atribuição:** =, +=, *=, /=, &=, ^=, |=
```java
int idade = 18;
idade += 20;            // a idade é = 38
idade -= 8;             // a idade é = 30
idade *= 2;             // a idade é = 60
idade /= 2;             // a idade é = 30
idade &= 28;            // a idade é = 2
idade ^= 2;             // a idade é = 4
```

## Operadores Avançados

**Relacional:** instanceof

**Deslocamento (shift):** <<, >>, >>>= 

**Atribuição com deslocamento:** <<=, >>=, >>>=

**Bitwise:** &, |, ^ (and, or, xor)

**Unário:** ~

---------------
## Exemplo
```java
public class TesteOperadores{

  public static void main(String[] args){
                int a = 10;
                int b = a++;
                System.out.println(b);
                System.out.println(a);
                
    // deslocamento do bit para a esquerda
                byte valor = 8;
                System.out.println("Valor: "+(valor<<1));
                
                int c = 10;
                int d = 20;
                //if(c<5 && ++d<10){      //short-circuit: tenta terminar a execução da comparação com o mínimo de informação possível
                if(c<5 & ++d<10){         //long-circuit: avalia a expressão completamente, independente de ser necessário tal ação
                        System.out.println("entrei no if")
                }
                
                System.out.println("C: "+c);
                System.out.println("D: "+d);
  
  }


}
```
