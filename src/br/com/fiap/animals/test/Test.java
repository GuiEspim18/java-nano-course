package br.com.fiap.animals.test;

import br.com.fiap.animals.Animal;
import br.com.fiap.animals.dog.Dog;

public class Test {

    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.setFood("Todo animal se alimenta");
        animal.setLocomotion("Todo animal se locomove");

        System.out.println(animal.getFood());
        System.out.println(animal.getLocomotion());


        Dog dog = new Dog();

        dog.setFood("Ração");
        dog.setLocomotion("4 patas");
        dog.setBark("AU AU AU");

        System.out.println(dog.getFood());
        System.out.println(dog.getLocomotion());
        System.out.println(dog.getBark());
    }

}
