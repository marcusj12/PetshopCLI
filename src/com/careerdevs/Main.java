package com.careerdevs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pets pet1 = new Pets("Baxter", "Canine",1, 50 );
        Pets pet2 = new Pets("Daisy","Feline", 2, 30 );
        Pets pet3 = new Pets ("Rocky", "Reptile", 1,45);


        PetShop petShop1 = new PetShop("4 Paws");

        System.out.println("Hello Welcome to the" + petShop1.getPetShopName() + "petshop.");
    }
}
