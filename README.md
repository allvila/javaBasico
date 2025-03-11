

Java Básico - class, tipos, variaveis, operadores, métodos, escopo, palavras reservadas, java doc, terminal e argumentos. 
# java-basico
Repositório do curso de Java básico
Alterando o arquivo de forma local 
IDE – INTEGRATED DEVELOPMENT ENVIRONMENT OU AMBIENTE DE DESENVOLVIMENTO INTEGRADO. É UM SOFTWARE QUE DISPÕE DE RECURSOS QUE AUXILIAR MUITO NOSSO DESENVOLVIMENTO COMO: 

AUTO0COMPLETE OU INTELLISENSE 

FORMATAÇÃO DE PAVARAS E BLOCOS DE CÓDIGOS  

ANÁLISE DE ERRO DE SINTAXE 

COMPILAÇÃO DE PROGRAMA 

DEPURAÇÃO (ACOMPANHAMENTO) DE EXECUÇÃO DO PROGRAMA.  

IDES: VISUAL STUDIO – NETBEANS – ECLIPESE – INTELLIJS 

> java creat  

JDK INSTALADO  

IDE ESCOLHIDA VISUAL STUDIO  

DIRETÓRIO DO PROJETO DEFINIDO 

Anatomia das Classes  

.java  

O nome do arquivo deve ser coerrente com o que vou escrever 

Public class MinhaClass {   //   } 

MinhaClass por padrão 

Arquivo.java  deve se inciar com letra maiuscula mesmo sendo compósta  

A classe deve deve ter o mesmo nome no public class exemplo  

// arquivo Calculadora Cientifica.Java 

Toda variavel deve ser minuscula, mas caso seja composta deve ser usar o metódo “camelCase” ano ou anoFabrica 

Para não mudar o nome do valor da variavel usamos o métdo  

String BR = Brasil 

Double PI = 3.14 

int ESTADOS_BRASILEIRO = 27 

Int ANO_2000 =  2000 

Para declarar uma variavel nós podemos utilizar caracteres, números e símbolos, pórem devemos seguir algusmas regras da liguagem  

 

Deve conter apenas letras, _, $ ou os numeros de 0 a 9;  

Variavel é refente ao um valor que está na memória  

Obrigatoriamente não deve jamais começa com números  

Declarar uma variavel em java segue sempre a seguinte estrutura: 

// estrutura  

Tipo NomeBemDefindo = atribuição (opcional em alguns casos) 

// exemplo 

Int idade = 23; 

Double altura = 1,62 

Declarando métodos em java segue uma estrutura bem simples: 

// estrutura  

TipoRetorno NomeObjetivoNoInfinitivo Parametro(S) 

// EXEMPLO 

 

Int somar (int numeroUm, int numero2) 

public class MinhaClass { 

    public static void main(String[] args) { 

 

    String primeiroNome = " Rayanne"; 

    String segundoNome = " Alvila"; 

     

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); 

    System.out.println(nomeCompleto); 

        

    } 

    public static String nomeCompleto( String primeiroNome, String segundoNome){ 

        return " Resultado do método" + primeiroNome.concat("").concat(segundoNome); 

    } 

    } 

 

 

Identação  

É um termo utilizado para escrever o código do programa de forma hirárquica, facilitando assim visualização e o entendimento do programa.  

public class BoletimEstudantil { 

   public static void main(String[] args) { 

    int mediaFinal = 7; 

    if(mediaFinal<6) 

    System.out.println("reprovado"); 

    else if (mediaFinal==6) 

    System.out.println("prova minerva"); 

    else 

    System.out.println("aprovado"); 

 

   } 

} 

 O codigo está complexo, mas vamos usar o principio da indentação. 

public class BoletimEstudantil { 

   public static void main(String[] args) { 

    int mediaFinal = 7; 

    if (mediaFinal < 6) 

        System.out.println("reprovado"); 

    else if (mediaFinal  == 6) 

        System.out.println("prova minerva"); 

    else 

        System.out.println("aprovado"); 

 

   } 

} 

Deixou o código mais legível. 

 

Organizando Arquivos 

Comercial - com 

Orgazacional - org 

Opnesource 

 

HyperTech com.hypertech.notification.app (ou model, service, entre outros) 

Lucas   

 Edu.lucas.tema.logicabasico 

 

Java Beans   

Umas da maior dificuldade na programação é escrever algoritmos legíveis a níveis que sejam compreendidos por todo seu tome ou por você mesmo no futuro. Para isso a linguagem Java sugere, através de convecções, formas de escrita universal para nossas classes, atributos, métodos de pacotes.  

Uma variável deve se clara, sem abreviações ou definições sem sentido.  

Uma variavável é sempre no singular, exceto quando se referir a um array ou coleção.  

Defina um idioma único para suas variáveis. Se voce for declarar variiaveis em ingles defina todas em ingles.  

 

Não recomendado  

Double salMedio // variavel abreviada 

String emails = “ aluno@escola.com” // confuso pois é somente um valor e não varios; 

String myName = “JOSEH” // SE IDIOMA PT-BR, O VALOR TEM QUE SER EM PT-BR 

RECOMENDADO  

Double SalarioMedio = 1500; 

String email = aluno@escola.com; 

String [] emails ={“...., ....” 

String meuNome = “JOseph” 

Métodos  

Os métodos deverão ser nomeados com verbos, atráves de uma mistura de letras minúsculas e maiúsculas. Em principio todas as letras que compoem o nome devem ser mantidas em minusculo, com exceção da primeira letra de cada palavra composta a apartir da segunda palavra.  

somar (int n1, int n2) 

abrirConexao 

concluirProcessamento () 

FindById (int id)  

calcularImprimir () está errado, pois deveria ser um ou outro.  

# javaBasico
Java Básico - class, tipos, variaveis, operadores, métodos, escopo, palavras reservadas, java doc, terminal e argumentos. 

