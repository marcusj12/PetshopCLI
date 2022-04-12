package com.careerdevs;

import java.util.List;

public class PetShop {
    private String petShopName;
    private List<PetShop> availablePets;
    private List<PetShop> soldPets;

    // We are essentially using constructors to make up the parameters of the pet shop object; objects mimic real world things
    public PetShop(String petShopName) {
        this.petShopName = petShopName;
        this.availablePets = availablePets;
        this.soldPets = soldPets;

    }

    public String getPetShopName() {
        return petShopName;
    }

    public void setPetsShopName(String petShopName) {
        this.petShopName = petShopName;
    }

    public List<PetShop> getAvailablePets() {
        return availablePets;
    }

    public void setAvailablePets(List<PetShop> availablePets) {
        this.availablePets = availablePets;
    }

    public List<PetShop> getSoldPets() {
        return soldPets;
    }

    public void setSoldPets(List<PetShop> soldAnimals) {
        this.soldPets = soldPets;
    }

    @Override
    public String toString() {
        return "petShopName='" + petShopName + '\'' +
                "availablePets='" + availablePets + '\'' +
                "soldPets='" + soldPets;
    }

    public void buyPet (String petName) {
        for (int i = 0; i < availablePets.size(); i++) {
            if (petName.equals(availablePets.get(i).getAvailablePets())){
                System.out.println("This pet is ready to be purchased");
                soldPets.add(availablePets.get(i));
                availablePets.remove(i);

            }


        }
    }

    public void returnPet(String petName) {
        for (int i = 0; i < soldPets.size(); i++){
            if (petName.equals(soldPets.get(i).getSoldPets())){
                System.out.println("This pet has already been sold");
                availablePets.add(soldPets.get(i));
                soldPets.remove(i);
            }
        }
    }
}


