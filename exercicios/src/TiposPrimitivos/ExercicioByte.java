package TiposPrimitivos;
import java.util.Scanner;


public class ExercicioByte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // 1 - Declaração e Inicialização: Declare uma variável do tipo byte, inicialize-a com o valor 100 e exiba o valor na tela.
        byte idade = 100;
        // System.out.println(idade);

        // 2 - Operação Aritmética: Crie duas variáveis byte, uma com o valor 10 e outra com o valor 20. Some os valores e exiba o resultado.
        byte num1 = 10;
        byte num2 = 20;
        // System.out.println(num1 + num2);

        // 3 - Cast e Overflow: Declare uma variável byte e atribua o valor 130. Observe o comportamento quando você imprime o valor na tela.
        // byte primeiroValor = 150;
        // System.out.println(primeiroValor);

        // 4 - Subtração: Declare duas variáveis byte, uma com o valor 50 e outra com o valor 25. Subtraia a segunda da primeira e exiba o resultado.
        byte numero1 = 50;
        byte numero2 = 25;
        // System.out.println(numero2 - numero1);

        // 5 - Tipo de Valor: Declare uma variável byte com o valor 0. Verifique e exiba se a variável pode armazenar valores negativos.
        byte valorByte = 0;
        // if (valorByte > -128){
        //     System.out.println("Variável pode armazenar valores negativos!");
        // }else {
        //     System.out.println("Esta variável não pode armazenar valores negativos...");
        // }


        // - Problema 1: Um dispositivo eletrônico tem um contador que vai de -50 a 50. Declare e inicialize um valor 
        // para o contador utilizando o tipo `byte`. Exiba o valor atual e verifique se ele está dentro do intervalo permitido (-50 a 50).

        // byte contador = -60;

        // if (contador >= -50 && contador <=50) {
        //     System.out.println(String.format("Contador: %d. Está dentro do intervalo permitido (-50 a 50)", contador));
        // } else {
        //     System.out.println(String.format("Valor %d está fora do intervalor permitido", contador));
        // }


        // - Problema 2: Um elevador suporta até 100 pessoas em seu painel de controle. Use uma variável `byte` para
        // armazenar a quantidade atual de pessoas no elevador e exiba uma mensagem dizendo se o limite foi atingido ou não.

        // byte elevadorCarga = 101;

        // if(elevadorCarga <= 100){
        //     System.err.println(String.format("Carga Atual: %d. Limite não atingido." , elevadorCarga));
        // } else{
        //     System.out.println(String.format("Carga Atual: %d. Limite de carga atingido!", elevadorCarga));
        // }


        // - Problema 3: Uma máquina de café pode preparar até 127 xícaras por dia. Declare uma variável `byte` para
        // acompanhar o número de cafés feitos. Atualize o valor cada vez que um novo café for feito e exiba a quantidade atual.
        
        // System.out.print("Mais café? Digite 1 para SIM e 0 para Não");
        // byte xicaraCafe = scanner.nextInt()

        // scanner.close();


    }
    
}
