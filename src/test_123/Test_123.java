/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_123;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author av
 */
public class Test_123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        List<Product> listProduct = new ArrayList<>();
        listProduct.add(new Product("may tinh xach tay A", "mt", 12));
        listProduct.add(new Product("laptop X", "mt", 17));
        listProduct.add(new Product("pc 2", "mt", 16));
        listProduct.add(new Product("tu lanh e", "dl", 11));
        listProduct.add(new Product("dieu hoa nhiet do b", "dl", 13));
         List<Category> listCategory = new ArrayList<>();
         listCategory.add(new Category("may tinh ", "mt"));
         listCategory.add(new Category("dien lanh ", "dl"));
        System.out.println("Nhap vao ma category: ");
        String categoryTag=sc.nextLine();
        listProduct.stream()
                .filter(product -> product.getCategoryTag().equals(categoryTag))
                .sorted(Comparator.comparingDouble(Product::getPrice).reversed())
                .forEach(prod-> 
                        System.out.println(prod.getPrice()+" " + prod.getName()));

    }     
}
