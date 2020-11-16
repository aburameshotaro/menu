package com.company;

public class Dish {
    private double price;
    private int weight;
    private String name;
    private String ingredient;
    private String type;

    public Dish(String type, String name, double price, int weight, String ingredient) {
        this.name = name;
        this.price = price;
        this.ingredient = ingredient;
        this.weight = weight;
        this.type = type;
        }
    public double getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }

    public int getWeight(){
        return this.weight;
    }

    public String getIngredient(){
        return this.ingredient;
    }
}

class Tomato_soup extends Dish{

    public Tomato_soup() {
        super("Tomato_soup", "Tomato soup", 7, 500, "Tomatoes, carrots and potatoes");
        }
}

class Chicken_soup extends Dish{

    public Chicken_soup() {
        super("Chicken_soup", "Chicken soup", 10, 500, "Chicken, carrots and pasta");
    }
}

class Carbonara extends Dish{

    public Carbonara() {
        super("Carbonara", "Carbonara", 15, 350, "Pasta, egg, bacon");
    }
}

class Fruit_salad extends Dish{

    public Fruit_salad() {
        super("Fruit_salad", "Fruit salad", 12, 400, "Tomatoes, bananas, apples and ice cream");
    }
}

class Pizza_margherita extends Dish{

    public Pizza_margherita() {
        super("Pizza_margherita", "Pizza margherita", 20, 450, "Tomatoes, cheese and pizza cake");
    }
}
