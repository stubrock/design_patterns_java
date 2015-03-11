package com.hotmail.brock_stuart.builder;

public class MealBuilder {
    public Meal prepareVegieMeal() {
    	Meal meal = new Meal();
    	meal.addItem(new VegieBurger());
    	meal.addItem(new Coke());
    	return meal;
    }
    
    public Meal prepareChickenMeal() {
    	Meal meal = new Meal();
    	meal.addItem(new ChickenBurger());
    	meal.addItem(new Pepsi());
    	return meal;
    }
}
