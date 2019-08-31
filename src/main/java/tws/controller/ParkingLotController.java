package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.Employee;
import tws.entity.ParkingLot;
import tws.repository.EmployeeMapper;

import java.net.URI;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.ResponseEntity;
import tws.entity.Employee;
        import tws.repository.EmployeeMapper;
import tws.repository.ParkingLotMapper;
import tws.service.EmployeeService;

import java.net.URI;
        import java.util.List;

@RestController
@RequestMapping("/parkingLot")
public class ParkingLotController {

    @Autowired
    private EmployeeService parkingLotservice;

    @GetMapping("")
    public ResponseEntity<List<ParkingLot>> getAll() {
        return ResponseEntity.ok(parkingLotservice.getParkingLot());
    }

    @PostMapping("")
    public ResponseEntity<ParkingLot> insert(@RequestBody ParkingLot parkingLot) {
        parkingLotservice.addParkingLot(parkingLot);
        return ResponseEntity.created(URI.create("/parkingLot/" + parkingLot.getParkingLotID())).body(parkingLot);
    }
    @GetMapping("/{id}")
    public ResponseEntity<List<ParkingLot>> getByEmployeeID(@PathVariable int id) {
        return ResponseEntity.ok(parkingLotservice.getParkingLotByenployeeID(id));
    }
}
