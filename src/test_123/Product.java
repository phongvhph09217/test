/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_123;

/**
 *
 * @author av
 */
public class Product {
    private String name;
    private String categoryTag;
    private double price;

    public Product(String name, String categoryTag, double price) {
       
        this.name = name;
        this.categoryTag = categoryTag;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoryTag() {
        return categoryTag;
    }

    public void setCategoryTag(String categoryTag) {
        this.categoryTag = categoryTag;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", categoryTag=" + categoryTag + ", price=" + price + '}';
    }

   
}
