package za.ca.cput.Factory;

/* TableFactoryTest.java
 Entity for TableFactoryTest
 Author: Sindiswa Nomusa Mbhele (219279616)
 Date: 07 June 2021
*/

import org.junit.jupiter.api.Test;
import za.ca.cput.Entity.Order.Table;


class TableFactoryTest {

    @Test
    public void createTable() {
        Table tbl = TableFactory.createTable(12, true);
        System.out.println(tbl);
    }
}