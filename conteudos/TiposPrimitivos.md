# Tipos Primitivos
Conteúdo sobre tipos primitivos.

## Tipos de dados primitivos

## Tipo Booleano
- **bolean**: é armazenado em apenas 1 bit, podendo assumir os valores **true** ou **false**.

## Tipos Númericos
**Decimais** é possível se perceber que o bit que está mais a esquerda sempre é usado para determinar se o número é
positivo(0) ou negativo(1).
- 1 bit
- 1 byte ==> 8 bits
- 1 kilobyte ==> 1000 bytes
- 1 megabyte ==> 1000000 bytes
- 1 gigabyte ==> 1000000000 bytes
- 1 terabyte ==> 1000000000000 bytes

## Para converter um número binário para decimal...
 43210
 
 01010
 
-> 0*(2^0) + 1*(2^1) + 0*(2^2) + 1*(2^3) + 0*(2^4)

-> 0 + 2 + 0 + 8 + 0

-> 10

## Tipos Númericos Inteiros
- **byte**:
  - A unidade do byte possui 8 bits; ademais , o bit que está mais a esquerda determina o sinal (0 para positivo e 1 para negativo); logo
    o seu intervalo é de -128 até 127.
  - Utilizando todos os bits para representar o valor de um número, teríamos um intervalo de 0 a 255.
    - 00000000 -> 0
    - 11111111 -> 1 + 2 + 4 + 8 + 16 + 32 + 64 + 128 = 255
  - O bit mais significativo está na máxima esquerda, ele é usado para representar se o número é positivo ou negativo:
    - 11111111 -> (1+2+4+8+16+32+64) * (-1) = -127
    - 01111111 -> (1+2+4+8+16+32+64) * (1) = 127
  - Lembrando que não faria sentido existir 00000000 e 10000000, pois não existe zero positivo e zero negativo; Portanto, um desses valores é usado para 0, e o outro é usado         como um valor negativo (que estende o intervalo de -127 para -128).
 
- **short**:
  - A unidade do short possui 16 bits; obedecendo a ordem, o bit que está mais a esquerda determina o sinal (0 para positivo e 1 para negativo); porém
  seu intervalo é de -32768 até 32767.
    - 1111111111111111 -> (1+2+4+8+16+32+64+128+256+512+1024+2048+4096+8192+16384) * (-1) = -32767
    - 0111111111111111 -> (1+2+4+8+16+32+64+128+256+512+1024+2048+4096+8192+16384) * (1) = 32767
    - 0000000000000000 -> 0
    - 1000000000000000 -> -32767
  - Lembrando que não faria sentido existir 0000000000000000 e 1000000000000000, pois não existe zero positivo e zero negativo; Portanto, um desses valores é usado para 0, e o       outro é usado como um valor negativo (que estende o intervalo de -32767 para -32768).
  
- **int**:
  - A sua unidade possui 32 bits (ou 4 bytes); O bit que está mais a esquerda determina o sinal (0 para positivo e 1 para negativo); porém
    seu intervalo é de -8.589.934.592 até 8.589.934.591.
  
- **long**:
  - Sua unidade possui 64 bits (ou 8 bytes); O bit mais à esquerda é usado para determinar o sinal (0positivo/1negativo); Logo, o intervalo é de -9.223.372.036.854.775.808 até       9.223.372.036.854.775.807.
  
## Tipos Númericos de Ponto Flutuante
- **float**:
  - Ele cabe em 4 bytes (ou 32 bits); tendo seu intervalo de 1.40129846432481707e-45 até 3.40282346638528860e+38.
- **double**:
  - Ele cabe em 8 bytes (ou 64 bits); tendo seu intervalo de 4.94065645841246544e-324d até 1.79769313486231570e+308d.
  
## Sobre a Performance
- Tipos menores não causam um aumento na performance, porém é necessário ter um espiríto crítico e um pouco econômico para saber escolher adequadamente os tipos.

## Tipos Textuais
- **char**:
  - É utilizado para armazenar um caractere, como: 'a','b',...,'z'; Ele é armazenado em 2 bytes.
-**String**:
  - Não é um Tipo Primitivo (é um OBJETO), mas pode ser utilizado como o mesmo.
  - Ele armazena textos entre aspas duplas, como: "Gabriel", "P2".
  
  
  


  
