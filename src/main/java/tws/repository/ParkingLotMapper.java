package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import tws.entity.ParkingLot;

import java.util.List;

@Mapper
public interface ParkingLotMapper {

    List<ParkingLot> selectAll();


    void insert(@Param("parkingLot") ParkingLot parkingLot);

    List<ParkingLot> selectByemployeeID(@Param("employeeID") int employeeID);
}
