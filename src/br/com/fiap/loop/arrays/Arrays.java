package br.com.fiap.loop.arrays;

import br.com.fiap.loop.arrays.products.Products;

public class Arrays {

    public static void main (String[] args) {

        // o 5 é quantos índices nosso array vai ter
        // array vai guardar números float
        // podemos salvar o array assim -> float values[] = new float[5];
        // float[] values = new float[5];

        // values[0] = 10;
        // values[1] = 20;
        // values[2] = 30;
        // values[3] = 40;
        // values[4] = 50;

        // System.out.println(values[4]);

        // float[] values2 = { 10, 20, 30, 40, 50 };
        // float[] values3 = new float[] { 10, 20, 30, 40, 50 };

        // System.out.println(values2[2]);
        // System.out.println(values3[3]);


        // Products[] products = new Products[2];

         Products product1 = new Products();
         product1.setType("Fruta");
         product1.setDescription("Limão");
         product1.setValue(2);

         Products product2 = new Products();
         product2.setType("Fruta");
         product2.setDescription("Maçã");
         product2.setValue(2);

        // products[0] = product1;
        // products[1] = product2;

        // for (Products product : products) para cada variável product do tipo Products dentro de products
        // for (int i = 0; i < products.length ; i++)
        // for (Products product : products) {
        //     System.out.println(product.toString());
        // }

        // 10 linhas com 3 colunas cada
        Products[][] locPorducts = new Products[10][3];

        locPorducts[0][1] = product1;
        locPorducts[1][1] = product2;

        System.out.println(locPorducts[0][1].getDescription());

    }

}
