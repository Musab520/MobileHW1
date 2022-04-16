package com.example.mobilehw1.model;

import java.util.ArrayList;

public class DrinkMockup {
    private ArrayList<Drink> drinks=new ArrayList<>();
    public DrinkMockup(){
        drinks.add(new Drink("Cold Drinks","Sprite",5));
        drinks.add(new Drink("Cold Drinks","Oreo Milkshake",15));
        drinks.add(new Drink("Hot Drinks","Coffee",10));
        drinks.add(new Drink("Cookies","Brownie",15));
        drinks.add(new Drink("Cold Drinks","Fanta",5));
        drinks.add(new Drink("Hot Drinks","Tea",10));
        drinks.add(new Drink("Cookies","Fudge",15));
        drinks.add(new Drink("Cold Drinks","Cola",5));
        drinks.add(new Drink("Hot Drinks","Hot Coco",10));
        drinks.add(new Drink("Cookies","Chochlate Chip",15));
        drinks.add(new Drink("Juice Fresh","Lemon Mint",15));
        drinks.add(new Drink("Juice Fresh","Peach",15));
        drinks.add(new Drink("Juice Fresh","Watermelon",15));
    }

    public ArrayList<Drink> getDrinks(String cat) {
        ArrayList<Drink> result = new ArrayList<>();
        for( Drink d : drinks) {
            if (d.getCategory().equals(cat)) {
                result.add(d);
            }
        }
        return result;
    }
    public String[] getCategories(){
        String [] cats={"Cold Drinks","Hot Drinks","Cookies","Juice Fresh"};
        return cats;
    }
}
