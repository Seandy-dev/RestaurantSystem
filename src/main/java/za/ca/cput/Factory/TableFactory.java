package za.ca.cput.Factory;

/* TableFactory.java
 Entity for TableFactory
 Author: Sindiswa Nomusa Mbhele (219279616)
 Date: 07 June 2021
*/
import za.ca.cput.Entity.Order.Table;

public class TableFactory {

    public  static Table createTable(int tableNumber, boolean occupied) {

        Table tb = new Table.Builder()
                .setTableNumber(tableNumber)
                .setOccupied(occupied)
                .build();
        return tb;
    }
}

