/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookingSystem;

/**
 *
 * @author User
 */
public class TutorialRoomList {

    private static TutorialRoom[] tutorialroomlist;
    private static int count;

    public TutorialRoomList(int n) {
        tutorialroomlist = new TutorialRoom[n];
        count = 0;
    }

    public void add(String college, String venue, int level, int capacity, double price) {
        tutorialroomlist[count] = new TutorialRoom(college, venue, level, capacity, price);
        count++;
    }

    public void delete(int row) {
        for (int i = 0, k = 0; i < count; i++) {// Copy the elements except the index
            // from original array to the other array
            if (i == row) {// if the index is the removal element index    
                continue;
            }
            tutorialroomlist[k++] = tutorialroomlist[i];// if the index is not the removal element index
           
        }
        count--;
    }

    public void update(int row, String college, String venue, int level, int capacity, double price) {
        tutorialroomlist[row].setCapacity(capacity);
        tutorialroomlist[row].setVenue(venue);
        tutorialroomlist[row].setLevel(level);
        tutorialroomlist[row].setCapacity(capacity);
        tutorialroomlist[row].setPrice(price);
    }

    public void registeredRoom(String[] room) {
        for (int i = 0; i < count; i++) {
            room[i] = tutorialroomlist[i].getVenue();
        }
    }

    public double search(String venue) {

        double price = 0;
        for (int i = 0; i < count; i++) {
            if (tutorialroomlist[i].getVenue().equalsIgnoreCase(venue)) {
                price = tutorialroomlist[i].getPrice();
            }
        }

        return price;
    }

    public int check(String venue) {
        int j = 0;

        for (int i = 0; i < count; i++) {
            if (tutorialroomlist[i].getVenue().equalsIgnoreCase(venue)) {
                j = 1;
            }
        }
        return j;
    }
}
