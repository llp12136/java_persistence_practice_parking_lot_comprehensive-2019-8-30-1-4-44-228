package tws.repository;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.jdbc.JdbcTestUtils;
import tws.entity.ParkingLot;


import javax.sql.DataSource;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@MybatisTest
public class ParkingLotMapperTest {

    @Autowired
    private ParkingLotMapper parkingLotMapper;

    JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @After
    public void tearDown() throws Exception {
        JdbcTestUtils.deleteFromTables(jdbcTemplate, "employee");
    }

    @Test
    public void shouldFetchAllEmployees() {
        // given
        jdbcTemplate.execute("INSERT INTO parkingLot VALUES(1, 21);");
        // when
        List<ParkingLot> parkingLotList = parkingLotMapper.selectAll();
        // then
        assertEquals(1, parkingLotList.size());
    }
    @Test
    public void should_insert_Employees() {
        // given
        ParkingLot parkingLot = new ParkingLot(1,"20");

        // when
        parkingLotMapper.insert(parkingLot);
        // then
        assertEquals(1, parkingLotMapper.selectAll().size());
    }

}
