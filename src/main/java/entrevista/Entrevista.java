//  *Desafio
//      A nutricionista Juliana Alcantra é uma excelente profissional de sua área.
//      Em determinado dia, ela foi entrevistada ao vivo para um jornal da cidade.
//      No entanto, ficou um pouco nervosa na hora, e diante da situação, sua fala
//      ficou um pouco distorcida, repetindo o final de cada palavra após dizer a
//      mesma. Para que isso não aconteça novamente, ela precisa da sua ajuda para
//      escrever um programa que omita a parte repetida, de modo que as palavras sejam
//      pronunciadas como deveriam ser.
//
//      Escreva um programa que, dada uma palavra errada, a mesma seja corrigida.
//
//  *Entrada
//      Haverá diversos casos de teste. Cada caso de teste é formado por uma palavra,
//      de, no máximo, 30 caracteres, dita da forma errada. A entrada termina com fim
//      de arquivo.
//
//  *Saída
//      Para cada caso de teste, escreva a palavra devidamente corrigida. Analise os
//      exemplos para verificar o padrão, de modo a consertar todos os casos.

package entrevista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Entrevista {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string;

        while ((string = br.readLine()) != null) {
            String palavra = null;

            if(string.equals("")) {
                continue;
            }

            int i = string.length() / 2;
            int inicioString = string.length() - i;
            int finalString = string.length();
            int inicio = string.length() - (i * 2);
            int fim = inicioString;

            if(string.length() == 1) {
                System.out.println(string);
            }

            for (int j = 0; j < i; j++) {
                if(string.substring(inicioString , finalString).equals(string.substring(inicio, fim))) {
                    palavra = string.substring(0, fim);
                    System.out.println(palavra);
                } else if(palavra == null && j == i - 1) {
                    System.out.println(string);
                }
                inicioString++;
                inicio += 2;
                fim++;
            }

        }
    }
}
