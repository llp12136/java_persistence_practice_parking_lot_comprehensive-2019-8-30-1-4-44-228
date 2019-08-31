package tws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.entity.Employee;
import tws.entity.EmployeeDto;
import tws.entity.ParkingLot;
import tws.repository.EmployeeMapper;
import tws.repository.ParkingLotMapper;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private ParkingLotMapper parkingLotMapper;

    //获取停车男孩列表
    public List<Employee> getEmployees(){
        List list = employeeMapper.selectAll();
        return list;
    }
    //添加停车男孩
    public void addEmployee(Employee employee){
        employeeMapper.insert(employee);
    }

    //获取停车场列表
    public List<ParkingLot> getParkingLot(){
        List list = parkingLotMapper.selectAll();
        return list;
    }
    //添加停车场
    public void addParkingLot(ParkingLot parkingLot){
        parkingLotMapper.insert(parkingLot);
    }
    //获取停车男孩管理的停车场
    public List<ParkingLot> getParkingLotByenployeeID(int id) {
        List list = parkingLotMapper.selectByemployeeID(id);
        return list;
    }
//    //返回停车男孩和他管理的停车场
//    public EmployeeDto getEmpAndLot(String id){
//        Employee employee = employeeMapper.selectById(id);
//        List list =  parkingLotMapper.selectByEmployeeId(id);
//        EmployeeDto employeeDto = new EmployeeDto(employee.getId(),employee.getName(),employee.getAge(),list);
//        return employeeDto;
//    }

}
