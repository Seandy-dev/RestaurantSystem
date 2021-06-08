package za.ca.cput.Entity.StaffDetails;
/* EmployeeAddress.java
   Entity for Employee Adress
   Author : Nikitha Mbokotwana (218337906)
   Date : 08 June
 */
public class EmployeeAddress {
    private String employeeAddress, addressId;

    private EmployeeAddress(Builder builder) {
        this.employeeAddress= builder.employeeAddress;
        this.addressId= builder.addressId;
    }
    @Override
    public String toString() {
        return "EmployeeAddress{" +
                "employeeAddress='" + employeeAddress + '\'' +
                ", addressId='" + addressId + '\'' +
                '}';
    }
//Inner class
    public static class Builder {
        private String employeeAddress, addressId;

        public Builder setEmployeeAddress1(String employeeAddress1) {
            this.employeeAddress = employeeAddress1;
            return this;
        }

        public Builder setAddressId(String addressId) {
            this.addressId = addressId;
            return this;
        }
        public EmployeeAddress.Builder copy(EmployeeAddress employeeAddress) {
            this.employeeAddress = employeeAddress.employeeAddress;
            this.addressId = employeeAddress.addressId;

            return this;
        }

    public EmployeeAddress build(){
            return new EmployeeAddress(this);
    }

    }

}
