import java.util.*;

public class Hotel {

    private final int MAX_ROOMS = 50;
    private String hotelName;
    private ArrayList<Room> rooms;
    private int numOfRooms;
    private ArrayList<CustomerReservation> reservations;

    public Hotel() {
        this.rooms = new ArrayList<Room>();
        this.reservations = new ArrayList<CustomerReservation>();

        for (int i = 0; i < numOfRooms; i++) {
            rooms.add().setNumber(i + 1);
        }
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getHotelNumOfRooms() {
        return numOfRooms;
    }

    public ArrayList<CustomerReservation> getHotelReservations() {
        return reservations;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int addRooms(int roomsToAdd) {
        numOfRooms += roomsToAdd;
        return numOfRooms;
    }

    public int removeRooms(int roomsToRemove) {
        numOfRooms -= roomsToRemove;
        return numOfRooms;
    }

}