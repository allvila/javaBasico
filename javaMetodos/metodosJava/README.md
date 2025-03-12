#metodós
Apresentar critérios para criação de métodos, parâmetros e visibilidade. 
Qual a prosposta principal do métdoo?
Você debe se perguntar constantemente até compreender a real finalidade do mesmo. 
Qual tipo de retorno esperado após executar o método?
você deve analisar se o método será resposavel por retornar algum valor ou não. 
Quais os parâmetros serão necessários para execução do método?
Os métodos as vezes precisão de argumentos como críterios para a execução. 
O método possui o risco de apresentar alguma exceção ?
Execeções são comuns na execução de métodos, as vezes é necessário prever a tratar a possível existência de uma exceção. 
Qual a visibilidade do método?
Será necessário que o método seja vísivel a toda aplicação, somente em mesmo pacotes através de herança somente a nível a própria classe. 


#a funções ou sub-rotinas dentro das classes.

é recomendado seguir para forma colaborativa;

-deve ser nomeado como verbo 
- usar camelCase

>caso método não retorne n
enhum valor, ele será representado pela palavra-chave -void-. 

Vamos criar um exmplo de uma classe para representar uma SmartTV onde:

1. Ela tenha características : ligada (boolean), canal (int) e volume (int)
2.Nossa tv poderá ligar e desligar e assim mudar o estado ligada
3.Nossa tv aumentará e diminuirá volume sempre em +1 ou -1;
4.Nossa tv poderá mudar de canal de 1 em 1 ou definido o número correspondente. 