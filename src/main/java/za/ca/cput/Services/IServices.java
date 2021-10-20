package za.ca.cput.Services;

import za.ca.cput.Entity.StaffDetails.Address;

public interface IServices <T , ID>{
    public T create(T t);
    public T read(ID id);
    public T update(T t);
    public boolean delete(ID id);

}
