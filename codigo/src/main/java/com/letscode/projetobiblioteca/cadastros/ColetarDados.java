package com.letscode.projetobiblioteca.cadastros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ColetarDados {

    public static Integer coletaInteger(String texto, Integer limiteMinimo, Integer limiteMaximo) {
        Integer num = -1;
        Scanner input = new Scanner(System.in);
        boolean erro;
        do {
            erro = false;
            try {
                System.out.print(texto);
                num = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Erro! Insira um número inteiro dentro do intervalo para prosseguir.");
                erro = !erro;
                input.nextLine();
            }
        } while (erro || num < limiteMinimo || num > limiteMaximo);
        return num;
    }

    public static String coletaString(String texto/* , Pattern regex */) {
        String str;
        Scanner input = new Scanner(System.in);
        System.out.print(texto);
        str = input.nextLine();
        return str;
    }
}
