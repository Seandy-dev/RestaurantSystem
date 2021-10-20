package za.ca.cput.Entity.Order;

/* Table.java
 Entity for Table
 Author: Sindiswa Nomusa Mbhele (219279616)
 Date: 07 June 2021
*/
public class Table {


    private int tableNumber;
    private boolean occupied;

    public Table() {

    }

    public int getTableNumber(){return tableNumber; }

    public boolean getOccupied(){
        return occupied;
    }

    public Table(Builder builder){
        this.tableNumber = builder.tableNumber;
        this.occupied = builder.occupied;
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableNumber=" + tableNumber +
                ", occupied=" + occupied +
                '}';
    }

    public static class Builder {
        private int tableNumber;
        private boolean occupied;

        public Builder setTableNumber(int tableNumber) {
            this.tableNumber = tableNumber;
            return this;
        }

        public Builder setOccupied(boolean occupied) {
            this.occupied = occupied;
            return this;
        }

        public Builder copy(Table table) {
            this.tableNumber = table.tableNumber;
            this.occupied = table.occupied;
            return this;
        }

        public Table build() {
            return new Table(this);
        }

    }
}
