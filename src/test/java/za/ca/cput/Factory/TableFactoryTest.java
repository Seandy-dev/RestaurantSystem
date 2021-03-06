package za.ca.cput.Factory;

/* TableFactoryTest.java
 Entity for TableFactoryTest
 Author: Sindiswa Nomusa Mbhele (219279616)
 Date: 11 June 2021
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ca.cput.Entity.Order.Table;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;


class TableFactoryTest {

    Table tableNumber1, tableNumber2;

    @BeforeEach
    public void setUp() {
        tableNumber1 = new Table();
        tableNumber2 = new Table();
        tableNumber1 = tableNumber2;
    }

        @Test
    public void createTable() {
        Table tbl = TableFactory.createTable(2, true);
        System.out.println(tbl);
    }
    @Test
    public void testEquality(){

        Assertions.assertEquals(tableNumber1, tableNumber2);
    }


    @Test
    public void testIdentity() {
        assertSame(tableNumber1, tableNumber2);
    }

    @Test
    void timeoutExceeded(){
        assertTimeout(ofMillis(10), () -> {
            Thread.sleep(100);
        });
    }

    @Test
    @Disabled
    public  void testDisable(){
        fail("The test should be ignored because it is being developed. ");
    }
}