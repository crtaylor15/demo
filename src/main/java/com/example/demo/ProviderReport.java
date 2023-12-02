package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import com.example.demo.Provider;
@Entity
public class ProviderReport extends Report{

    @Autowired
    private ProviderRepository providerRepository;
    
    @Column(length = 25)
    private String providerName;
    @Column(length = 9)
    private String providerNumber;
    @Column(length = 25)
    private String providerStreetAddress;
    @Column(length = 14)
    private String providerCity;
    @Column(length = 2)
    private String providerState;
    @Column(length = 5)
    private String providerZipCode;

    private Provider provider;
    private ServiceRecord serviceRecord;
    private ServiceRecord[] serviceRecords;

    public ProviderReport(String providerName, String providerNumber, String providerStreetAddress, String providerCity,
            String providerState, String providerZipCode, ServiceRecord serviceRecord) {
        this.providerName = providerName;
        this.providerNumber = providerNumber;
        this.providerStreetAddress = providerStreetAddress;
        this.providerCity = providerCity;
        this.providerState = providerState;
        this.providerZipCode = providerZipCode;
        this.serviceRecord = serviceRecord;
    }

    public ProviderReport(String providerNumber, ServiceRecord[] serviceRecords) {
        provider = providerRepository.findByProviderNumber(providerNumber);
        this.providerName = provider.providerName;
        this.providerNumber = providerNumber;
        this.providerStreetAddress = provider.providerStreetAddress;
        this.providerCity = provider.providerCity;
        this.providerState = provider.providerState;
        this.providerZipCode = provider.providerZipCode;
        this.serviceRecords = serviceRecords;
    }
}
