package za.ca.cput.Entity.StaffDetails;
/* AddressEntity.java
   Author : Hlombekazi Mbelu (209024666)
   Date : 20 October 2021
 */
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "address")
public class Address implements Serializable {


    @Id
    private String addressId;

    private String streetName, suburb, city, country;
    private int streetNumber, postalCode;

    private Address(){}

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
    @JsonIgnore
    public String getAddressId()
    {

        return addressId;
    }

    public String getStreetName(){

        return streetName;
    }

    public String getSuburb(){
        return suburb;
    }

    public String getDescription()
    {
        return addressId;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public static class Builder {

        private String addressId, streetName,
                suburb, city, country;
        private int streetNumber, postalCode;

        @JsonIgnore
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

        public Address build() {
            return new Address(this);
        }

        public Builder setDescription(String description)
        {
            return this;
        }
    }

}
