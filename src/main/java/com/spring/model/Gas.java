
package com.spring.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "gas")
public class Gas implements Serializable{
    
    @Id
    @Column(name = "GasBookId", nullable = false, length = 200, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer BookingId;
    @Column(name = "Email", nullable = false, length = 200)
    private String Email;
    @Column(name = "MobileNumber", nullable = false, length = 10)
    private String MobileNumber;
    @Column(name = "CosumerName", nullable = false, length = 200)
    private String CosumerName;
    @Column(name = "DistributorName", nullable = false, length = 200)
    private String DistributorName;
    @Column(name = "ConsumerNo", nullable = false, length = 8)
    private String ConsumerNo;
    @Column(name = "BookingDate", nullable = false, length = 200)
    private String BookingDate;
    @Column(name = "CylinderType", nullable = false, length = 200)
    private String CylinderType;
    @Column(name = "CylinderCount", nullable = false, length = 200)
    private String CylinderCount;
    @Column(name = "Address1", nullable = true, length = 800)
    private String Address1;
    @Column(name = "Address2", nullable = true, length = 800)
    private String Address2;
    @Column(name = "City", nullable = true, length = 200)
    private String City;
    @Column(name = "Customerstate", nullable = true, length = 200)
    private String Customerstate;
    @Column(name = "Zipcode", nullable = true, length = 6)
    private String Zipcode;

    public Gas() {
    }

    public Gas(int BookingId, String Email, String MobileNumber, String CosumerName, String DistributorName, String ConsumerNo, String BookingDate, String CylinderType, String CylinderCount, String Address1, String Address2, String City, String Customerstate, String Zipcode) {
        this.BookingId = BookingId;
        this.Email = Email;
        this.MobileNumber = MobileNumber;
        this.CosumerName = CosumerName;
        this.DistributorName = DistributorName;
        this.ConsumerNo = ConsumerNo;
        this.BookingDate = BookingDate;
        this.CylinderType = CylinderType;
        this.CylinderCount = CylinderCount;
        this.Address1 = Address1;
        this.Address2 = Address2;
        this.City = City;
        this.Customerstate = Customerstate;
        this.Zipcode = Zipcode;
    }

    public Gas(String Email, String MobileNumber, String CosumerName, String DistributorName, String ConsumerNo, String BookingDate, String CylinderType, String CylinderCount, String Address1, String Address2, String City, String Customerstate, String Zipcode) {
        this.Email = Email;
        this.MobileNumber = MobileNumber;
        this.CosumerName = CosumerName;
        this.DistributorName = DistributorName;
        this.ConsumerNo = ConsumerNo;
        this.BookingDate = BookingDate;
        this.CylinderType = CylinderType;
        this.CylinderCount = CylinderCount;
        this.Address1 = Address1;
        this.Address2 = Address2;
        this.City = City;
        this.Customerstate = Customerstate;
        this.Zipcode = Zipcode;
    }

    
    public int getBookingId() {
        return BookingId;
    }

    public void setBookingId(int BookingId) {
        this.BookingId = BookingId;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String MobileNumber) {
        this.MobileNumber = MobileNumber;
    }

    public String getCosumerName() {
        return CosumerName;
    }

    public void setCosumerName(String CosumerName) {
        this.CosumerName = CosumerName;
    }

    public String getDistributorName() {
        return DistributorName;
    }

    public void setDistributorName(String DistributorName) {
        this.DistributorName = DistributorName;
    }

    public String getConsumerNo() {
        return ConsumerNo;
    }

    public void setConsumerNo(String ConsumerNo) {
        this.ConsumerNo = ConsumerNo;
    }

    public String getBookingDate() {
        return BookingDate;
    }

    public void setBookingDate(String BookingDate) {
        this.BookingDate = BookingDate;
    }

    public String getCylinderType() {
        return CylinderType;
    }

    public void setCylinderType(String CylinderType) {
        this.CylinderType = CylinderType;
    }

    public String getCylinderCount() {
        return CylinderCount;
    }

    public void setCylinderCount(String CylinderCount) {
        this.CylinderCount = CylinderCount;
    }

    public String getAddress1() {
        return Address1;
    }

    public void setAddress1(String Address1) {
        this.Address1 = Address1;
    }

    public String getAddress2() {
        return Address2;
    }

    public void setAddress2(String Address2) {
        this.Address2 = Address2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getCustomerstate() {
        return Customerstate;
    }

    public void setCustomerstate(String Customerstate) {
        this.Customerstate = Customerstate;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String Zipcode) {
        this.Zipcode = Zipcode;
    }

    @Override
    public String toString() {
        return "Gas{" + "BookingId=" + BookingId + ", Email=" + Email + ", MobileNumber=" + MobileNumber + ", CosumerName=" + CosumerName + ", DistributorName=" + DistributorName + ", ConsumerNo=" + ConsumerNo + ", BookingDate=" + BookingDate + ", CylinderType=" + CylinderType + ", CylinderCount=" + CylinderCount + ", Address1=" + Address1 + ", Address2=" + Address2 + ", City=" + City + ", Customerstate=" + Customerstate + ", Zipcode=" + Zipcode + '}';
    }
    
    
    
    
}
