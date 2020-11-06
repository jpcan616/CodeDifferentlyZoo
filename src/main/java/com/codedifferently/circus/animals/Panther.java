package com.codedifferently.circus.animals;

import com.codedifferently.circus.animals.actions.AnimalTricks;

public class Panther extends AbstractAnimal {
    public Panther(String name) {
        super(name);
    }
        @Override
        public void doTrick() {
            AnimalTricks tricks = AnimalTricks.JUMP;
            String msg = String.format("My name is %s and I am happy to %s", name, tricks.toString());
            logger.info(msg);


    }
}
