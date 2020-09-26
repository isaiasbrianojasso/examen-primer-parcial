package uaslp.enginering.exam.model;

public class Room {
    private int number;
    private String status;
    public RoomStatus roomStatus;
    public String string;

    public Room(int number,String string,RoomStatus roomStatus){
        this.number = number;
        this.roomStatus  = roomStatus;
        this.string = string;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
