package com.spring.Service;

import com.spring.Dao.GasBookingDao;
import com.spring.model.Gas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("gasBookingService")
public class GasBookingServiceImpl implements GasBookingService {

    @Autowired
    private GasBookingDao gasBookingDao;

    @Override
    public Integer insert(Gas gas) {

        return this.gasBookingDao.insert(gas);
    }

    @Override
    public Gas showBooking(Integer id) {
        
        return this.gasBookingDao.showBooking(id);
    }

    @Override
    public void DeleteBooking(Integer id) {
    this.gasBookingDao.DeleteBooking(id);
    }

    @Override
    public List<Gas> ShowAllBooking(Integer UserID) {
        return this.gasBookingDao.ShowAllBooking(UserID);
    }

    @Override
    public void UpdateBooking(Gas gas) {
        this.gasBookingDao.UpdateBooking(gas);
    }
    
    public GasBookingDao getGasBookingDao() {
        return gasBookingDao;
    }

    public void setGasBookingDao(GasBookingDao gasBookingDao) {
        this.gasBookingDao = gasBookingDao;
    }

    
}
