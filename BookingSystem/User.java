/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookingSystem;
/**
 *
 * @author User
 */
public class User {

    private String name, category;
    private double discount;

    public User(String name, String category, double discount) {
        this.name = name;
        this.category = category;
        this.discount = discount;
    }

    public double getDiscount(String category) {
        if (category.equalsIgnoreCase("UUM Staff")) {
            discount = 5.0;
        } else if (category.equalsIgnoreCase("Non UUM Staff")) {
            discount = 0.0;
        }

        return discount;
    }

}
