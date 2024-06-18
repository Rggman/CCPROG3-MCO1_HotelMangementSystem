/**
 * This class represents a CustomerReservation object that has attributes such as:
 * customerName, checkinDate, checkOutDate, and roomInfo. 
 */
public class CustomerReservation {

    private String customerName;
    private int checkInDate;
    private int checkOutDate;
    private Room roomInfo;

/**
 * This is a constructor method that creats a "CustomerReservation" instance.
 * @param customerName name of the customer.
 * @param checkInDate date of check-in of customer.
 * @param checkOutDate date of check-out of customer.
 * @param roomInfo information of the room.
 */
    public CustomerReservation(String customerName, int checkInDate, int checkOutDate, Room roomInfo) {
        this.customerName = customerName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomInfo = roomInfo;
    }

/**
 * This is a getter method that gets the name of the customer.
 * @return the name of the customer.
 */
    public String getCustomerName() {
        return customerName;
    }

/**
 * This is a getter method that gets the check-in date of the customer.
 * @return the check-in of the customer.
 */
    public int getCheckInDate() {
        return checkInDate;
    }

/**
 * This is a getter method that gets the check-out date of the customer.
 * @return the check-out of the customer.
 */
    public int getCheckOutDate() {
        return checkOutDate;
    }

/**
 * This is a getter method that gets the information of the booked room of the customer.
 * @return the room booked by the customer.
 */
    public Room getRoomInfo(Room roomInfo) {
        return roomInfo;
    }

/**
 * This is a setter method that sets the name of the customer in the "CustomerReservation" instance.
 * @param the name of this customer in the "CustomerReservation" instance.
 */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

/**
 * This is a setter method that sets the check-in date of this "CustomerReservation" instance.
 * @param checkInDate the date of check-in.
 */
    public void setCheckInDate(int checkInDate) {
        this.checkInDate = checkInDate;
    }

/**
 * This is a setter method that sets the check-out date of this "CustomerReservation" instance.
 * @param checkInDate the date of check-out.
 */
    public void setCheckOutDate(int checkOutDate) {
        this.checkOutDate = checkOutDate;
    }
}