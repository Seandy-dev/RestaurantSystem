package za.ca.cput.Entity.StaffDetails;

public class EmployeeAddress {

    public static class Builder{
        private String employeeAddress, addressID;

        public Builder setEmployeeAddress(String employeeAddress) {
            this.employeeAddress = employeeAddress;

            return this;
        }

        public Builder setAddressID(String addressID) {
            this.addressID = addressID;

            return this;
        }
    }

}
