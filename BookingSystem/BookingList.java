/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookingSystem;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class BookingList {

    private Booking[] bookinglist;
    private int count;

    public BookingList(int n) {
        bookinglist = new Booking[n];
        count = 0;
    }

    public void add(String room, String venue, String user, String category, String date, String start, String end, int duration, double cost) {
        bookinglist[count] = new Booking(room, venue, user, category, date, start, end, duration, cost);
        count++;
    }

    public void delete(int row) {
        for (int k = row; k < count; k++) {
            bookinglist[k] = bookinglist[k + 1]; // Index -1 out of bounds for length 50 
        }       
        bookinglist[count] = null; //since the last element will be printed twice 
        count--;
    }

    public void update(int row, String room, String venue, String user, String category,String date, String start, String end, int duration, double cost) {
        bookinglist[row].setRoom(room);
        bookinglist[row].setVenue(venue);
        bookinglist[row].setUser(user);
        bookinglist[row].setCategory(category);
        bookinglist[row].setDate(date);
        bookinglist[row].setStart(start);
        bookinglist[row].setEnd(end);
        bookinglist[row].setDuration(duration);
        bookinglist[row].setDuration(duration);
    }

    public int search(String user) {

        int loc = -1;

        for (int i = 0; i < count; i++) {
            if (bookinglist[i].getUser().equals(user)) {
                loc = i;
                break;
            }
        }

        return loc;
    }

}
