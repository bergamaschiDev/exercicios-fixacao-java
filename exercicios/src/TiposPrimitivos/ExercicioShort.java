package TiposPrimitivos;

public class ExercicioShort {
    public static void main(String[] args) {

        // 1 - Declaração e Inicialização: Declare uma variável do tipo short, inicialize-a com o valor 30000 e exiba o valor na tela.
        short salario = 30000;
        System.out.println(salario);

        // 2 - Operação Aritmética: Crie duas variáveis short, uma com o valor 1000 e outra com o valor 500. Some os valores e exiba o resultado.
        short adiantamento = 1000;
        short pagamentoExtra = 500;
        System.out.println(adiantamento + pagamentoExtra);

        // 3 - Overflow: Declare uma variável short com o valor 35000. Observe o resultado ao tentar somar 3000 a essa variável.
        // short valorCarro = 35000;
        // System.out.println(valorCarro + 3000);

        // 4 - Multiplicação: Declare duas variáveis short, uma com o valor 200 e outra com o valor 100. Multiplique os valores e exiba o resultado.
        short valorSapato = 200;
        short valorCamisa = 100;
        System.out.println(valorSapato * valorCamisa);

        // 5 - Tipo de Valor: Declare uma variável short com o valor -500. Verifique e exiba se a variável pode armazenar valores positivos e negativos.
        short saldoDevedor = -500;
        if (saldoDevedor > -32768){
            System.out.println("Pode armazenar valores positivos!");
        }else{
            System.out.println("Não pode armazenar valores negativos...");
        }
        
    }
    
}
