package za.ca.cput.Entity.Staff;

/* Employee.java
 * Entity for Employee.
 * Thina Mbiza - 217217095
 * Date: 08 June 2021
 */

public class Employee {
    private String employeeID;
    private String positionID;
    private String firstName;
    private String lastName;

    private Employee(Builder builder) {
        this.employeeID = builder.employeeID;
        this.positionID = builder.positionID;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", positionID='" + positionID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static class Builder{
        private String employeeID;
        private String positionID;
        private String firstName;
        private String lastName;

        public Builder setEmployeeID(String employeeID) {
            this.employeeID = employeeID;
            return this;
        }

        public Builder setPositionID(String positionID) {
            this.positionID = positionID;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }

       public Builder copy(Employee employee){
            this.employeeID = employee.employeeID;
            this.positionID = employee.positionID;
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;

            return this;
       }

    }
}
