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
public class Product {
    
    int id;
    String name;
    double unit_price;
    String detail;

    public Product() {
        System.out.println("Bu sınıf oluşturuldu");
    }
    
    public Product(int id, String name, double unit_price, String detail) {
        //this();
        this.id = id;
        this.name = name;
        this.unit_price = unit_price;
        this.detail = detail;
    }
}
