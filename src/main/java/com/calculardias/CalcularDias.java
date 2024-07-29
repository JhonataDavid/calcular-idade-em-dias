package com.calculardias;

/**
 * Classe que contém um método para calcular a idade em dias com base na data de nascimento.
 */
public class CalcularDias {

    /**
     * Calcula o total de dias vividos a partir da data de nascimento fornecida.
     * Assume que cada ano tem 365 dias e cada mês tem 30 dias.
     *
     * @param anoNascimento O ano de nascimento da pessoa.
     * @param mesNascimento O mês de nascimento da pessoa (1 a 12).
     * @param diasNascimento O número de dias no mês de nascimento.
     */
    public void calcularTotalDeDias(int anoNascimento, int mesNascimento, int diasNascimento) {
        // Instancia a classe Ano (não está claro no código fornecido o propósito desta classe)
        Ano ano = new Ano();

        // Calcula a diferença entre o ano atual e o ano de nascimento
        int calcularIdade = ano.getAnoAtual() - anoNascimento;

        // Calcula o total de dias pelos anos completos
        int calcularDiasDoAno = calcularIdade * ano.getDiasDoAno();

        // Calcula o total de dias pelos meses
        int calcularDiasDoMes = mesNascimento * ano.getDiasDoMes();

        // Calcula o total de dias somando os dias dos anos, meses e dias adicionais
        int calcularTotalDeDias = calcularDiasDoAno + calcularDiasDoMes + diasNascimento;

        // Exibe o resultado no formato "X Anos Y meses e Z dias são equivalentes a N dias."
        System.out.println(calcularIdade + " Anos " + mesNascimento + " mês " + "e " + diasNascimento + " dias são equivalente a " + calcularTotalDeDias + " dias");
    }

}
