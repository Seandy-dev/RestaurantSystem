package za.ca.cput.Entity.StaffDetails;

public class Address {

    private String addressId, streetName,
            suburb, city, country;
    private int streetNumber, postalCode;


    private Address(Builder builder) {
        this.addressId = builder.addressId;
        this.city = builder.city;
        this.country = builder.country;
        this.streetName = builder.streetName;
        this.suburb = builder.suburb;
        this.streetNumber = builder.streetNumber;
        this.postalCode = builder.postalCode;

    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId='" + addressId + '\'' +
                ", streetName='" + streetName + '\'' +
                ", suburb='" + suburb + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", streetNumber=" + streetNumber +
                ", postalCode=" + postalCode +
                '}';
    }

    public static class Builder {

        private String addressId, streetName,
                suburb, city, country;
        private int streetNumber, postalCode;

        public Builder setAddressId(String addressId) {
            this.addressId = addressId;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setSuburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setStreetNumber(int streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder setPostalCode(int postalCode) {
            this.postalCode = postalCode;
            return this;
        }


        public Builder copy(Address address) {
            this.addressId = address.addressId;
            this.city = address.city;
            this.country = address.country;
            this.streetName = address.streetName;
            this.suburb = address.suburb;
            this.streetNumber = address.streetNumber;
            this.postalCode = address.postalCode;
            return this;
        }
    }

}
