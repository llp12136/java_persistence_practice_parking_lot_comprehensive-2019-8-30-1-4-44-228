package tws.entity;

public class ParkingLot {
    private int parkingLotID;
   // private String availablePositionCount;
    private String capacity;

    public ParkingLot() {
    }

    public ParkingLot(int parkingLotID,  String capacity) {
        this.parkingLotID = parkingLotID;
       // this.availablePositionCount = availablePositionCount;
        this.capacity = capacity;
    }

    public int getParkingLotID() {
        return parkingLotID;
    }

    public void setParkingLotID(int parkingLotID) {
        this.parkingLotID = parkingLotID;
    }


    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
