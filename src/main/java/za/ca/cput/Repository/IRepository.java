package za.ca.cput.Repository;

import za.ca.cput.Entity.StaffDetails.Address;
@Deprecated
public interface IRepository <T , ID>{
    public T create(T t);
    public T read(T t);
    public T update(T t);
    public boolean delete(Address id);

}
