package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {

    private List<Animal> farm;

    public Farm(List<Animal> animals) {
        this.farm = animals;
    }

    public void feedAnimals() {
        for (Animal animal : this.farm) {
            animal.feed();
        }
    }

    public void butcher(Butcher butcher) {
        this.farm.removeIf(butcher::canButcher);
    }

    public boolean isEmpty() {
        return this.farm.isEmpty();
    }

    public List<String> getStatus() {
        List<String> statusList = new ArrayList<>();
        for (Animal animal : this.farm) {
            statusList.add("There is a " + animal.getSize() + " sized "
                    + animal.getLowercaseClassSimpleName() + " in the farm.");
        }
        return statusList;
    }

    public List<Animal> getAnimals() {
        return farm;
    }
}
