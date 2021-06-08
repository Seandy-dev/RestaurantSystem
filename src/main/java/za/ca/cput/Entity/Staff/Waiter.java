package za.ca.cput.Entity.Staff;

/* Waiter.java
 Entity for the Waiter
 Author: Sindiswa Nomusa Mbhele (219279616)
 Date: 07 June 2021
*/
public class Waiter {


    private double HourlyWage, Tip;
    private int Hours;

    public double getHourlyWage(){ return HourlyWage;}

    public double getTip(){return Tip;}

    public int getHours(){return Hours;}

    public Waiter(Builder builder){
        this.HourlyWage = builder.HourlyWage;
        this.Tip = builder.Tip;
        this.Hours = builder.Hours;
    }

    @Override
    public String toString() {
        return "Waiter{" +
                "HourlyWage=" + HourlyWage +
                ", Tip=" + Tip +
                ", Hours=" + Hours +
                '}';
    }

    public static class Builder{
        private double HourlyWage, Tip;
        private int Hours;

        public Builder setHourlyWage(double hourlyWage) {
            this.HourlyWage = hourlyWage;
            return this;
        }

        public Builder setHours(int Hours){
            this.Hours = Hours;
            return this;
        }

        public Builder setTip(double Tip){
            this.Tip = Tip;
            return this;
        }

        public Builder copy( Waiter waiter){
            this.HourlyWage = waiter.HourlyWage;
            this.Hours = waiter.Hours;
            this.Tip = waiter.Tip;
            return this;
        }

        public Waiter build(){
            return new Waiter (this);
        }
    }
}
