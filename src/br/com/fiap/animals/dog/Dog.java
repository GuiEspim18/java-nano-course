package br.com.fiap.animals.dog;

import br.com.fiap.animals.Animal;

public class Dog extends Animal {

    private String bark;

    public void setBark(String bark) {
        this.bark = bark;
    }

    public String getBark() {
        return bark;
    }
}
