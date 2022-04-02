package com.careerdevs;

import java.util.List;

public class PetShop {
    private String petShopName;
    private List<PetShop> availableAnimals;
    private List<PetShop>soldAnimals;

    // We are essentially using constructors to make up the parameters of the petshop object; objects mimic real world thingsm3
    public PetShop(String petShopName, List<PetShop> availableAnimals, List<PetShop> soldAnimals) {
        this.petShopName = petShopName;
        this.availableAnimals = availableAnimals;
        this.soldAnimals = soldAnimals;


    }

    public String getPetShopName () {
        return getPetShopName();
    }
    public void setPetsShopName (String petShopName) {
        this.petShopName = petShopName;
    }

    public List<PetShop> getAvailableAnimals () {
        return getAvailableAnimals();
    }
    public void setAvailableAnimals (List<PetShop> availableAnimals) {
        this.availableAnimals = availableAnimals;
    }

    public List<PetShop> getSoldAnimals(){
        return soldAnimals;
    }

    public void setSoldAnimals (List<PetShop> soldAnimals) {
        this.soldAnimals = soldAnimals;
    }


}
