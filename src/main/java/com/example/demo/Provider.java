package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Provider {
    // Define fields for providerName, providerAddress, etc.
    private String providerName;
    private String providerAddress;
    private String providerCity;
    private String providerStateCode;
    private String providerZipCode;
    private String providerEmail;

    // Constructor to initialize the fields
    public Provider(String providerName, String providerAddress, String providerCity, String providerStateCode, String providerZipCode, String providerEmail, int providerID, String providerUserName, String providerPassword) {
        super(providerUserName, providerPassword, EmployeeType.PROVIDER);
        this.providerName = providerName;
        this.providerAddress = providerAddress;
        this.providerCity = providerCity;
        this.providerStateCode = providerStateCode;
        this.providerZipCode = providerZipCode;
        this.providerEmail = providerEmail;
    }

    public String getProviderName() {
        return providerName;
    }
    public String getProviderAddress() {
        return providerAddress;
    }
    public String getProviderCity() {
        return providerCity;
    }
    public String getProviderStateCode() {
        return providerStateCode;
    }
    public String getProviderZipCode() {
        return providerZipCode;
    }
    public String getProviderEmail() {
        return providerEmail;
    }

    // Setters for the fields
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
    public void setProviderAddress(String providerAddress) {
        this.providerAddress = providerAddress;
    }
    public void setProviderCity(String providerCity) {
        this.providerCity = providerCity;
    }
    public void setProviderStateCode(String providerStateCode) {
        this.providerStateCode = providerStateCode;
    }
    public void setProviderZipCode(String providerZipCode) {
        this.providerZipCode = providerZipCode;
    }
    public void setProviderEmail(String providerEmail) {
        this.providerEmail = providerEmail;
    }

    
}
