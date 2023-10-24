package com.trybe.java.regraprogressao;

import java.util.Scanner;

public class App {

  /**
   * Método main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int quantidadeAtividades = Integer.parseInt(scanner.nextLine());
    String[] nomesAtividades = new String[quantidadeAtividades];
    double[] notasAtividades = new double[quantidadeAtividades];
    double[] pesosAtividades = new double[quantidadeAtividades];
    double somaPessos = 0;
    double notaFinal = 0;

    for (int i = 0; i < quantidadeAtividades; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ":");
      nomesAtividades[i] = scanner.nextLine();
      System.out.println("Digite a nota obtida para " + (nomesAtividades[i]) + ":");
      notasAtividades[i] = scanner.nextDouble();
      System.out.println("Digite o peso da atividade " + (i + 1) + ":");
      pesosAtividades[i] = scanner.nextDouble();
      somaPessos += pesosAtividades[i];
      notaFinal += (notasAtividades[i] * pesosAtividades[i]) / 100;
      scanner.nextLine();
    }

    if (somaPessos != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
      System.exit(0);
    }

    System.out.println("A nota final é: " + notaFinal);

    scanner.close(); 

  }
}