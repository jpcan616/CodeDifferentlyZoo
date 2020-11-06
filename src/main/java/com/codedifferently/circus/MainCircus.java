package com.codedifferently.circus;

import com.codedifferently.circus.animals.AbstractAnimal;
import com.codedifferently.circus.animals.Bear;
import com.codedifferently.circus.animals.Elephant;
import com.codedifferently.circus.animals.Panther;
import org.apache.log4j.Logger;


import java.util.ArrayList;

public class MainCircus {
    private final static Logger logger = Logger.getLogger(MainCircus.class);

    private ArrayList<AbstractAnimal> animals;

    public MainCircus(){
        this.animals = new ArrayList<>();
    }

    public void startTheShow(){
        Bear bearReference = new Bear("Smokey Da Bear");
        animals.add(bearReference);

        Elephant elephantReference = new Elephant("Dumbo");
        animals.add(elephantReference);

        Panther pantherReference = new Panther("Chad");
        animals.add(pantherReference);

        for(int i = 0; i < animals.size(); i++) {
            AbstractAnimal tempReference = animals.get(i);
            tempReference.doTrick();
        }
    }

    public static void main(String[] args) {
        MainCircus mainCircus = new MainCircus();
        mainCircus.startTheShow();
    }
}
