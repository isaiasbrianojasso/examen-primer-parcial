package uaslp.enginering.exam.model;

public class Reservation {
    private int roomNumber;
    private String arrivalDate;
    private Guest guest;
    private int nights;
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public int getNights() {
        return nights;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Guest getGuest() {
        return guest;
    }
}
