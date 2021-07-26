package za.ca.cput.Repository;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import za.ca.cput.Entity.Order.Table;
import za.ca.cput.Factory.TableFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

@FixMethodOrder(MethodSorters.JVM)
class TableRepositoryTest {
    private static TableRepository repository = new TableRepository();
    private static Table table = TableFactory.createTable(101, true);

    @Test
    void create() {
        Table created = repository.create(table);
        assertEquals(table.getTableNumber(), created.getTableNumber());
        System.out.println("Created" + created);
    }

    @Test
    void read() {
        Table read = repository.read(table.getTableNumber());
        System.out.println("Read " + read);
    }

    @Test
    void update() {
        Table updated = new Table.Builder().copy(table).setTableNumber(101).build();
        System.out.println("Updated " + updated);
    }

    @Test
    void delete() {
        repository.delete(table.getTableNumber());
        System.out.println("Deleted " + table.getTableNumber() + " ");
    }
}
