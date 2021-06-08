package za.ca.cput.Entity.StaffDetails;
/* Demographic.java
   Entity for Demographic
   Author : Nikitha Mbokotwana (218337906)
   Date : 08 June
 */

import java.util.Date;

public class Demographic {
    private String gender;
    private Date birthDate;


    private Demographic(Builder builder) {
        this.gender= builder.gender;
        this.birthDate= builder.birthDate;
    }
    @Override
    public String toString() {
        return "Demographic{" +
                "gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
//Inner class
    public static class Builder{
        private String gender;
        private Date birthDate;

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder copy(Demographic demographic) {
            this.gender = demographic.gender;
            this.birthDate = demographic.birthDate;

            return this;
        }

    public Demographic build()
    {
        return new Demographic(this);
    }

    }















}
