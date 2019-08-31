package tws.entity;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDto extends Employee{

    private  List<ParkingLot> parkingLotList;
    public EmployeeDto(List parkingLotList) {
        super();
        this.parkingLotList = parkingLotList;

    }

    public List<ParkingLot> getParkingLotList() {
        return parkingLotList;
    }

    public void setParkingLotList(int id, String name, String age ,List<ParkingLot> parkingLotList) {
        this.parkingLotList = parkingLotList;
    }
}
