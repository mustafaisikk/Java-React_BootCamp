/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopintro;

/**
 *
 * @author Mustafa IŞIK
 */
public class Main {
    public static void main(String[] args) {
        
        Product product1 = new Product(1,"Lenovo V14",15000,"16 GB Ram"); 
        Product product2 = new Product(2,"Lenovo V15",20000,"32 GB Ram"); 
        Product product3 = new Product(3,"Hp 5",10000,"8 GB Ram"); 

        Category category1 = new Category(1,"Bilgisayar");
        Category category2 = new Category(2,"Ev/Bahçe");

        Product[] products = {
          product1,  
          product2,  
          product3  
        };
        
        for(Product product : products){
            System.out.println(product.id + " -- " + product.name + " -- "+ product.unit_price + " -- "+ product.detail);
        }
        
        
        
        System.out.println("");
        
        
        Category[] categorys = {category1,category2};
        
        for(Category category : categorys){
            System.out.println(category.id + " -- " + category.name);
        }
        System.out.println("");

        ProductManager manager = new ProductManager();
        manager.addToCart(product1);
        manager.addToCart(product2);
        manager.addToCart(product3);
        
    /*
        
        Product product1 = new Product(); // Referans oluşturma / instance
        product1.id = 1;
        product1.name = "Lenovo V14";
        product1.unit_price = 15000;
        product1.detail = "16 GB Ram";
        
        Product product2 = new Product();
        product2.id = 2;
        product2.name = "Lenovo V15";
        product2.unit_price = 20000;
        product2.detail = "32 GB Ram";
           
        Product product3 = new Product();
        product3.id = 3;
        product3.name = "Hp 5";
        product3.unit_price = 10000;
        product3.detail = "8 GB Ram";
    
        Category category1 = new Category();
        category1.id = 1;
        category1.name = "Bilgisayar";
        
        Category category2 = new Category();
        category2.id = 1;
        category2.name = "Ev/Bahçe";
        
    */
        
    
    }
}
