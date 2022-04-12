package com.careerdevs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pets pet1 = new Pets("Baxter", "Canine",1, 50 );
        Pets pet2 = new Pets("Daisy","Feline", 2, 30 );
        Pets pet3 = new Pets ("Rocky", "Reptile", 1,45);


        PetShop petShop1 = new PetShop("4 Paws");
        petShop1.getAvailablePets().add(pet1);
        petShop1.getAvailablePets().add(pet2);
        petShop1.getAvailablePets().add(pet3);

        System.out.println("Hello Welcome to the" + petShop1.getPetShopName() + "petshop.");

        while (true){
            System.out.println("Would you like to: \n(1) Buy a Animal \n(2) Return Animal");
            int res = 0;

            try{
                res = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception ex){

            }
            if (res == 2) {
                System.out.println("You're now returning a pet");
                for (int i =0; i <petShop1.getSoldPets().size(); i++){
                    System.out.println(petShop1.getSoldPets().get(i));
                }
                break;
            } else if (res ==1){
                System.out.println("Which pet would you like to adopt? Input pet name");
                for (int i = 0; i < petShop1.getAvailablePets().size(); i++){
                    System.out.println(petShop1.getAvailablePets().size(); i++);
                }

            }
        }

        scanner.nextLine();
    }
}
