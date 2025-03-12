Objetivo do curso 
 *Operadores aritméticos
 *Operadores unários
 *Operadores relacionais
 *Operadires lógicos
 *Operadores ternário

 são simbolos especiais 
 //classe Operadores.Java
  String nome =" Rayanne"
idade= 22
peso =68.5;
char sexo = 'M';
boolean = false ou true;
 o simbolo "=" usando para demostrar o valor da variavel; 

 ++ operador unário de incremento de valor - incrementa o valor em 1 unidade;
-- Operador unário de decremento de valor - decrementa o valor em 1 unidade;
! operador unário lógico de negação

 Os operadores aritméticos são: + , -, * , /
 porcetagem %
  OBS "CONCATENAÇÃO DE TEXTOS" 
        string nomeCompleto = "liguagem" + "java";

Ternário

é uma forma resumida para definir uma condição e escolher por um dentre dois valores. 
Você deve pensar numa condição ternária como se fosse uma condição IF normal. 

O operador ternário é representado pelos símbolos
 ?:

 <expressão condicional> ?
 <caso condição seja true> :
 <caso condição seja false>
 exemplo:
   if (a==b)
         resultado = "verdadeiro";

         else 
         resultado = "falso";

ex:
         int a, b;
         a = 5;
         b = 6;

         String resultado = a==b ?"verdadeiro" : "falso";

          System.out.println(resultado);

#operadores relacionais 

Os operadores relacionais avaliam a relação entre duas variáveis ou expressões. Neste caso, mais precisamente, definem se o operando à esquerdsa é igual,  diferente, menor, menor ou igual, maior ou maior ou igual ao da direita,retornando um valor booleano como resultado. 

== IGUAL A
!= DIFERENTE
> MAIOR QUE
>= MAIOR OU IGUAL
< MENOR 
<= MENOR OU IGUAL 
&& operador lógico E
|| opperador lógico "ou"