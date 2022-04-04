package com.careerdevs;

import java.util.List;

public class PetShop {
    private String petShopName;
    private List<PetShop> availableAnimals;
    private List<PetShop> soldAnimals;

    // We are essentially using constructors to make up the parameters of the pet shop object; objects mimic real world things
    public PetShop(String petShopName, List<PetShop> availableAnimals, List<PetShop> soldAnimals) {
        this.petShopName = petShopName;
        this.availableAnimals = availableAnimals;
        this.soldAnimals = soldAnimals;

    }

    public String getPetShopName() {
        return petShopName;
    }

    public void setPetsShopName(String petShopName) {
        this.petShopName = petShopName;
    }

    public List<PetShop> getAvailableAnimals() {
        return availableAnimals;
    }

    public void setAvailableAnimals(List<PetShop> availableAnimals) {
        this.availableAnimals = availableAnimals;
    }

    public List<PetShop> getSoldAnimals() {
        return soldAnimals;
    }

    public void setSoldAnimals(List<PetShop> soldAnimals) {
        this.soldAnimals = soldAnimals;
    }

    @Override
    public String toString() {
        return "petShopName='" + petShopName + '\'' + "availableAnimals='" + availableAnimals + '\'' +
                "soldAnimals='" + soldAnimals;
    }

    public void buyAnimal (String petName) {
        for (int i = 0; i < availableAnimals.size(); i++) {
            if (petName.equals(availableAnimals.size(i).getPetName())) {
                availableAnimals.add((PetShop) soldAnimals);
            }


        }
    }
}


