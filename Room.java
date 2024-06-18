/**
 * This class is a representation of a Room object that has attributes such as: 
 * the room "number", and the room "price". It also has getters and setters for
 * each of its attributes.
 */
public class Room {
    
    private int number;
    private double price = 1299.00;

/**
 * This is a constructor method that is used to create a "Room" instance.
 */
    public Room() {

    }

/**
 * This is a getter method to get the bumber of this "Room" instance.
 * @return the number of this "Room" instance.
 */
public int getNumber() {
    return this.number;
}

/**
 * This is a getter method to get the price of this "Room" instance.
 * @return the price of this "Room" instance.
 */
    public double getPrice() {
        return this.price;
    }

/**
 * This is a setter method to set the number os this "Room" instance.
 * @param the number of this "Room" instance.
 */
    public void setNumber(int number) {
        this.number = number;
    }

/**
 * This is a setter method to set the price os this "Room" instance.
 * @param the price of this "Room" instance.
 */
    public void setPrice(double price) {
        this.price = price;
    }
}
