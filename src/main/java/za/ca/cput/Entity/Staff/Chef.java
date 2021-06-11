/*Chef.java
Entity for the chef
Author: Emihle Menzo 218337035
Date: 7 June 2021
 */
package za.ca.cput.Entity.Staff;

public class Chef {
        private double salary;
        private int yearsOfExperience;

        public Chef(Builder builder) {
            this.salary = builder.salary;
            this.yearsOfExperience = builder.yearsOfExperience;

        }

    public Chef() {
        //Constructor for the chefFactoryTest class
    }

    @Override
        public String toString() {
            return "Chef{" +
                    "salary='" + salary + '\'' +
                    ", yearsOfExperience='" + yearsOfExperience + '\'' +
                    '}';
        }

        public static class Builder {
            private double salary;
            private int yearsOfExperience;

            public Builder setSalary(double salary) {
                this.salary = salary;
                return this;
            }

            public Builder setYearsOfExperience(int yearsOfExperience) {
                this.yearsOfExperience = yearsOfExperience;
                return this;
            }



            public Builder copy(Chef chef) {
                this.salary = chef.salary;
                this.yearsOfExperience = chef.yearsOfExperience;
                return this;
            }

            public Chef build() {

                return new Chef(this);
            }
        }
    }
    

