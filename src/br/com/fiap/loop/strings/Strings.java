package br.com.fiap.loop.strings;

import java.util.Arrays;

public class Strings {

    public static void main(String[] args) {
        // String name;
        // name = ""; // new String()
        // name = "Heloísa";
        // System.out.println(name);

        // String name2 = new String("Guilherme");
        // System.out.println(name2);

        // String description = "A Heloísa \né linda";
        // System.out.println(description);

        // description = "A Heloísa \té linda";
        // System.out.println(description);

        // description = "Heloísa: \"a mulher mais linda do mundo\"";
        // System.out.println(description);

        // name = "Heloísa";
        // description = "A mulher mais linda do mundo";
        // String statement = "";

        // statement = name + " " + description;
        // System.out.println(statement);

        // concatenando
        // statement = name.concat(" ").concat(description);
        // System.out.println(statement);

        // statement += "!";
        // System.out.println(statement);

        // String name = new String("Heloísa");
        // String name2 = new String("heloísa");
        // String name3 = new String("heloísa");

        // System.out.println(name.equals(name2)); // false

        // System.out.println(name.equalsIgnoreCase(name3)); // true

        // System.out.println(name2.equals(name3)); // true

        // Boolean test = name == name3;
        // System.out.println(test); // false


        // String name4 = "Heloisa";
        // String name5 = "Heloisa";

        // test = name4 == name5;
        // System.out.println(test); // true pois não usamos new String() para declarar os nomes pois ambar estão no mesmo endereço de memória
        // caso usarmos o new String() para dar true precisamos usar .equals()

        String description = new String("Heloísa a mulher mais linda do mundo!");
        System.out.println(description.length()); // pega o número de caracteres no caso os espaços contam como caractere
        System.out.println(description.startsWith("Heloísa")); // true
        System.out.println(description.endsWith("!")); // true
        System.out.println(description.charAt(1)); // e
        System.out.println(description.indexOf("H")); // 0
        System.out.println(description.indexOf("Heloísa")); // 0
        System.out.println(description.lastIndexOf("e")); // pega o ultimo e que está na frase
        System.out.println(description.replace("í", "i")); // substitui í por i
        System.out.println(description.replace("mundo", "universo")); // substitui mundo por universo
        System.out.println(description.replace("l", "L")); // substitui l por L
        System.out.println(description.replace("L", "l")); // substitui L por l
        System.out.println(description.split(" ").length); // quantas strings foram resultantes por essa quebra
        System.out.println(Arrays.toString(description.split(" "))); // mostra um array com todas as palavras
        System.out.println(description.toUpperCase()); // tudo em maiúsculo
        System.out.println(description.toLowerCase()); // tudo em minúsculo
        System.out.println(description.substring(0, 4)); // do 0 ao quatro
        System.out.println(description.substring(5)); // a poartir do 5
        System.out.println(description.substring(
                description.indexOf("Heloísa"),
                description.indexOf(" ")
        )); // do index de Heloísa até o espaço representado " "

    }

}
