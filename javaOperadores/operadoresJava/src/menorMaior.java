public class menorMaior {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){

            System.out.println("a nossa condição é verdadeira");
        }
        System.out.println("numero1 é igual ao numero2" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numero1 é diferente do numero2" + simNao);

        simNao = numero1 > numero2;

        System.out.println("numero1 é maior do numero2" + simNao);

        simNao = numero1 >= numero2;

        System.out.println("numero1 é maior ou igual  do numero2" + simNao);

    }
    
}
