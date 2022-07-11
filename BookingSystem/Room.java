/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookingSystem;

/**
 *
 * @author User
 */
public class Room {

    private String college, venue;
    private int level, capacity;
    private double price;

    public Room(String college, String venue, int level, int capacity, double price) {
        this.college = college;
        this.venue = venue;
        this.level = level;
        this.capacity = capacity;
        this.price = price;
    }

    public String getCollege() {
        return college;
    }

    public String getVenue() {
        return venue;
    }

    public int getLevel() {
        return level;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
