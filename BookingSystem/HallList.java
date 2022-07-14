/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookingSystem;

/**
 *
 * @author User
 */
public class HallList {

    private Hall[] hallslist;
    private int count;

    public HallList(int n) {
        hallslist = new Hall[n];
        count = 0;
    }

    public void add(String college, String venue, int level, int capacity, double price) {
        hallslist[count] = new Hall(college, venue, level, capacity, price);
        count++;
    }

    public void delete(int row) {
        for (int i = 0, k = 0; i < count; i++) {// Copy the elements except the index
            // from original array to the other array
            if (i == row) {// if the index is the removal element index    
                continue;
            }
            hallslist[k++] = hallslist[i];// if the index is not the removal element index
            
        }
        count--;
       
    }

    public void update(int row, String college, String venue, int level, int capacity, double price) {
        hallslist[row].setCapacity(capacity);
        hallslist[row].setVenue(venue);
        hallslist[row].setLevel(level);
        hallslist[row].setCapacity(capacity);
        hallslist[row].setPrice(price);
    }
    
    public void registeredHall(String[] hall) {
        for (int i = 0; i < count; i++) {
            hall[i] = hallslist[i].getVenue();
        }
    }

    public double search(String venue) {

        double price = 0;
        for (int i = 0; i < count; i++) {
            if (hallslist[i].getVenue().equalsIgnoreCase(venue)) {
                price = hallslist[i].getPrice();
            }
        }

        return price;
    }

    public int check(String venue) {
        int j = 0;

        for (int i = 0; i < count; i++) {
            if (hallslist[i].getVenue().equalsIgnoreCase(venue)) {
                j = 1;
            }
        }
        return j;
    }

}
