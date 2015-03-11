package com.hotmail.brock_stuart.builder;

public class BuilderTest {
	
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegieMeal = mealBuilder.prepareVegieMeal();
		
		System.out.println("vegie meal:");
		vegieMeal.showItems();
		System.out.println("Total cost: " + vegieMeal.getCost());
		
		Meal chickenMeal = mealBuilder.prepareChickenMeal();
		
		System.out.println("\nchicken meal:");
		chickenMeal.showItems();
		System.out.println("Total cost: " + chickenMeal.getCost());
	}

}
