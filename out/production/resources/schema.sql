CREATE TABLE employee (
  id INTEGER PRIMARY KEY,
  name VARCHAR(64) NOT NULL,
  age   int(4) NOT NULL
);
CREATE TABLE parkingLot (
  parkingLotID INTEGER PRIMARY KEY,
  /*availablePositionCount VARCHAR(64) NOT NULL,*/
  capacity   VARCHAR(64) NOT NULL,
   employeeID INTEGER
);