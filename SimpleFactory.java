package com.company;

public class SimpleFactory {

    public Dish createDish(String type) {

        if (type.equals("Tomato soup"))
            return new Tomato_soup();
        else if (type.equals("Chicken soup"))
            return new Chicken_soup();
        else if (type.equals("Carbonara"))
            return new Carbonara();
        else if (type.equals("Fruit salad"))
            return new Fruit_salad();
        else if (type.equals("Pizza margherita"))
            return new Pizza_margherita();
        else
            return new Dish(type, "Danie", 0, 0, "Brak");

    }

}
