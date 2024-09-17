package TiposPrimitivos;


public class ExercicioByte {
    public static void main(String[] args) {

        // 1 - Declaração e Inicialização: Declare uma variável do tipo byte, inicialize-a com o valor 100 e exiba o valor na tela.
        byte idade = 100;
        System.out.println(idade);

        // 2 - Operação Aritmética: Crie duas variáveis byte, uma com o valor 10 e outra com o valor 20. Some os valores e exiba o resultado.
        byte num1 = 10;
        byte num2 = 20;
        System.out.println(num1 + num2);

        // 3 - Cast e Overflow: Declare uma variável byte e atribua o valor 130. Observe o comportamento quando você imprime o valor na tela.
        // byte primeiroValor = 150;
        // System.out.println(primeiroValor);

        // 4 - Subtração: Declare duas variáveis byte, uma com o valor 50 e outra com o valor 25. Subtraia a segunda da primeira e exiba o resultado.
        byte numero1 = 50;
        byte numero2 = 25;
        System.out.println(numero2 - numero1);

        // 5 - Tipo de Valor: Declare uma variável byte com o valor 0. Verifique e exiba se a variável pode armazenar valores negativos.
        byte valorByte = 0;
        if (valorByte > -128){
            System.out.println("Variável pode armazenar valores negativos!");
        }else {
            System.out.println("Esta variável não pode armazenar valores negativos...");
        }

    }
    
}
