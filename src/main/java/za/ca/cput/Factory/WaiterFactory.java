package za.ca.cput.Factory;

/* WaiterFactoryTest.java
 Entity for WaiterFactoryTest
 Author: Sindiswa Nomusa Mbhele (219279616)
 Date: 10 June 2021
*/
import za.ca.cput.Entity.Staff.Waiter;

public class WaiterFactory {

    public  static Waiter createWaiter(double hourlyWage, int hours, double tip) {

        Waiter tb = new Waiter.Builder()
                .setHourlyWage(hourlyWage)
                .setHours(hours)
                .setTip(tip)
                .build();
        return tb;
    }
}
