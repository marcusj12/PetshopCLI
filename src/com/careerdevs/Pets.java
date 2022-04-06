package com.careerdevs;

public class Pets {
    private String petName;
    private String petSpecies;
    private int petAge;
    private int petPrice;


    public Pets(String petName, String petSpecies,int petAge, int petPrice) {
        this.petName = petName;
        this.petSpecies = petSpecies;
        this.petAge = petAge;
        this.petPrice = petPrice;

    }

    public String getPetName (){
        return petName;
    }

    public void setPetName(){
        this.petName = petName;
    }

    public String getPetSpecies(){
        return petSpecies;
    }

    public void setPetSpecies(){
        this.petSpecies = petSpecies;
    }

    public int getPetAge(){
        return petAge;
    }

    public void setPetAge(){
        this.petAge = petAge;
    }

    public int getPetPrice(){
        return petPrice;
    }

    public void setPetPrice(){
        this.petPrice = petPrice;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "petName='" + petName + '\'' +
                ", petSpecies='" + petSpecies + '\'' +
                ", petAge=" + petAge +
                ", petPrice=" + petPrice +
                '}';
    }
}
