public class Room {
    
    private int number;
    private double price = 1299.00;
    private boolean isBooked;

    public Room(int number) {
        this.number = number;
        this.price = 1299.00;
    }

    public Room(int number, int price) {
        this.number = number;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public int getNumber() {
        return this.number;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
