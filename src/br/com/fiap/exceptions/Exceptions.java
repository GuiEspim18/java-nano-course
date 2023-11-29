package br.com.fiap.exceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exceptions {
    public static void main(String[] args) throws IOException, TestException {
//        try {
//            int value = 10 / 0; // vai dar erro
//            System.out.println(value);
//        } catch (Exception error) {
//            // Tratando a exception
//            error.printStackTrace();
//        }

//        try {
//            // int value = 10 / 0;
//            // int[] values = new int[3];
//            // System.out.println(values[4]);
//            // tring name = null;
//            // System.out.println(name.length());
//            int num = Integer.parseInt("zero");
//        } catch (ArithmeticException error) {
//            System.out.println("Não é possível realizar uma divisão por zero!");
//            System.out.println(error.getMessage());
//            error.printStackTrace();
//        } catch (ArrayIndexOutOfBoundsException error) {
//            System.out.println("Não é possível acessar a posição 4 do array!");
//        } catch (NullPointerException error) {
//            System.out.println("Não foi possível retornar o length variável nome não instanciada!");
//        } catch (NumberFormatException error) {
//            System.out.println("Não foi possível realizar a conversão!");
//        } catch (Exception error) { // Exception é genérico então se ocorrer um erro fora dos parâmetros irá executar aqui
//            System.out.println("Erro na execução do programa!");
//        } finally {
//            System.out.println("Fim de programa"); // finally sempre será executado
//        }

        // Erro do tipo checked que obriga o programador a tratar
        // pode ser resolvido add try catch ou throws
        // throws IOException
//        FileWriter fw = new FileWriter("nota.txt");
//        PrintWriter print = new PrintWriter(fw);
//        print.println("Heloísa a mulher mais linda do mundo!");
//        print.println("Quero me casar com ela");
//        print.println("Ela é o amor da minha vida!");
//        fw.close();

        // se o TestException dar o extends do Exception a gente precisa dar o throws na classe
        // caso contrário precisamos dar extends RuntimeException
        try {
            int value = 10 / 0;
            System.out.println(value);
        } catch (Exception e) {
            throw new TestException();
        }
    }
}
