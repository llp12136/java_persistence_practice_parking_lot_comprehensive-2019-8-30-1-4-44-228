package tws.entity;

public class ParkingLot {
    private int parkingLotID;
   // private String availablePositionCount;
    private String capacity;
    private  int employeeID;

    public ParkingLot() {
    }

    public ParkingLot(int parkingLotID,  String capacity,int employeeID) {
        this.parkingLotID = parkingLotID;
       // this.availablePositionCount = availablePositionCount;
        this.capacity = capacity;
        this.employeeID = employeeID;

    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
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
