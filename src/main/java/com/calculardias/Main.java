package com.calculardias;

public class Main {
    /**
     * Método principal que inicializa a classe e executa o cálculo com uma data de nascimento exemplo.
     *
     * @param args Argumentos da linha de comando (não utilizados neste exemplo).
     */
    public static void main(String[] args) {
        // Cria uma instância da classe CalcularDias
        CalcularDias calcularDias = new CalcularDias();

        // Chama o método calcularTotalDeDias com um exemplo de data de nascimento
        calcularDias.calcularTotalDeDias(2003, 07, 27);
    }
}
 