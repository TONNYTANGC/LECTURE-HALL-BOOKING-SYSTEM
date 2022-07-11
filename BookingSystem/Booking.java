/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookingSystem;

/**
 *
 * @author User
 */
public class Booking {

    private String room, venue, user, category, date, start, end;
    private int duration;
    private double cost;

    public Booking(String room, String venue, String user, String category, String date, String start, String end, int duration, double cost) {
        this.room = room;
        this.venue = venue;
        this.user = user;
        this.category = category;
        this.date = date;
        this.start = start;
        this.end = end;
        this.duration = duration;
        this.cost = cost;
    }

    public String getRoom() {
        return room;
    }

    public String getVenue() {
        return venue;
    }

    public String getUser() {
        return user;
    }

    public String getCategory() {
        return category;
    }

    public String getDate() {
        return date;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public int getDuration() {
        return duration;
    }

    public double getCost() {
        return cost;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    

}
