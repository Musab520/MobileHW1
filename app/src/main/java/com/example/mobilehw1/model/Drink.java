package com.example.mobilehw1.model;

public class Drink {
    private String Category;
    private String name;
    private int unitPrice;

    public Drink(String category, String name, int unitPrice) {
        this.Category = category;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "Category='" + Category + "\n" +
                ", name='" + name + ""+
                ", unitPrice=" + unitPrice +
                '}';
    }
}
