package br.com.fiap.collections;

import java.util.ArrayList;
import java.util.List;

public class Collections {
    public static void main (String[] args) {
        List<String> shoppingCart = new ArrayList<String>();
        System.out.println(shoppingCart.isEmpty()); // true

        shoppingCart.add("Maçã");
        shoppingCart.add("Pera");
        shoppingCart.add("Uva");
        shoppingCart.set(1, "Abacaxi");

        System.out.println(shoppingCart.isEmpty()); // false
        System.out.println(shoppingCart.size()); // 3

        String value = shoppingCart.get(2);
        System.out.println(value);

        System.out.println(shoppingCart.contains("Maçã"));
        System.out.println(shoppingCart.indexOf("Maçã"));
        System.out.println(shoppingCart.indexOf("Jaca"));
    }
}
