package br.com.fiap.fileManeger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManeger {
    public static void main(String[] args) {
        String fileName = "storage.csv";
        String dir = System.getProperty("user.home");
        String path = dir + "/documents/" + fileName;

        List<String> content = new ArrayList<>();
        content.add("Product; Quantity; Price;");
        content.add("Maçã; 10; 10.00;");
        content.add("Limão; 20; 10.00;");
        content.add("Cereja; 30; 15.0;");
        content.add("Abacaxi; 30; 15.0;");

        save(fileName, path, content);
        read(path);

        File file = new File(path);

        // verificando se o arquivo existe
        if (file.exists()) {
            System.out.println("O arquivo existe" +
                    "\nPode ser lido: " + file.canRead() +
                    "\nPode ser gravado: " + file.canWrite() +
                    "\nTamanho: " + file.length() +
                    "\nCaminho: " + file.getPath());
        } else {
            // cria um arquivo no caso de não existir
            try {
                if (file.createNewFile()) {
                    System.out.println("Arquivo criado!");
                } else {
                    System.out.println("Arquivo não criado!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private static void save(String fileName, String path, List<String> content) {
        FileWriter stream;
        PrintWriter print;

        try {
            stream = new FileWriter(path);
            print = new PrintWriter(stream);
            for (String line : content) {
                print.println(line);
            }
            print.close();
            stream.close();
            // System.out.println("Arquivo salvo em: " + path);
        } catch (IOException e) {
            System.out.println("Erro");
            e.fillInStackTrace();
        }
    }

    private static void read(String path) {
        try {
            FileReader stream = new FileReader(path);
            BufferedReader reader = new BufferedReader(stream);
            // imprime uma linha
            String line = reader.readLine();
            // System.out.println(line);
            // imprime todas as linhas enquanto elas não forem null
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
