package com.spring.Dao;

import com.spring.model.Gas;
import java.util.List;

public interface GasBookingDao {

    public Integer insert(Gas gas);
    
    public Gas showBooking(Integer Id);
    
    public void DeleteBooking(Integer Id);
    
    public void UpdateBooking(Gas gas);
    
    public List<Gas> ShowAllBooking(Integer Id);
    
    
    
    
    
}
