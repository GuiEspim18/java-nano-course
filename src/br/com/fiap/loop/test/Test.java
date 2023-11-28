package br.com.fiap.loop.test;

public class Test {

    public static void main (String[] args) {
        int quantity = 5;
        int registered = 0;

        //while (registered < quantity) {
        //    registered++;
        //    System.out.println("O produto " + registered + " foi registrado!");
        //}

        //do {
        //    registered++;
        //    System.out.println("O produto " + registered + " foi registrado!");
        //} while (registered < quantity);

        // o i vai ser primeiramente iniciado como 0 pois ele foi iniciado junto com for
        // para deixar o i ser iniciado como nos outros loops a gente usa o <= ao invés de <
        for (int i = 0; i < quantity; i++) {
            System.out.println("O produto " + i + " foi registrado!");
        }
    }

}
