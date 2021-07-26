package za.ca.cput.Repository;

import za.ca.cput.Entity.Order.Table;

import java.util.List;

public class TableRepository implements IRepository<Table, Integer >{

    private List<Table> tableDB;

    public TableRepository(List<Table> tableDB) {
        this.tableDB = tableDB;
    }

    public TableRepository() {

    }

    @Override
    public Table create(Table table) {
        return null;
    }

    @Override
    public Table read(Integer s) {
        return null;
    }

    @Override
    public Table update(Table table) {
        return null;
    }

    @Override
    public void delete(Integer s) {

    }
}
