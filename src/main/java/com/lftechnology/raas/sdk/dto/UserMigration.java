package com.lftechnology.raas.sdk.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserMigration {

    private String firstName;
    private String lastName;
    private String middleName;
    private String dateOfBirth;
    private String mobilePhone;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String gender;

    @SerializedName("zipcode")
    private String zipCode;
    private String sourceOfIncome;
    private String fullSSN;
    private String fourDigitSSN;
    private String ipAddress;
    private String requestedTier;
    private String kycStatus;
    private String email;

    private List<DocumentInfo> documentInfoList;

    private SenderCompany senderCompany;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getSourceOfIncome() {
        return sourceOfIncome;
    }

    public void setSourceOfIncome(String sourceOfIncome) {
        this.sourceOfIncome = sourceOfIncome;
    }

    public String getFullSSN() {
        return fullSSN;
    }

    public void setFullSSN(String fullSSN) {
        this.fullSSN = fullSSN;
    }

    public String getFourDigitSSN() {
        return fourDigitSSN;
    }

    public void setFourDigitSSN(String fourDigitSSN) {
        this.fourDigitSSN = fourDigitSSN;
    }

    public String getRequestedTier() {
        return requestedTier;
    }

    public void setRequestedTier(String requestedTier) {
        this.requestedTier = requestedTier;
    }

    public String getKycStatus() {
        return kycStatus;
    }

    public void setKycStatus(String kycStatus) {
        this.kycStatus = kycStatus;
    }

    public List<DocumentInfo> getDocumentInfoList() {
        return documentInfoList;
    }

    public void setDocumentInfoList(List<DocumentInfo> documentInfoList) {
        this.documentInfoList = documentInfoList;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SenderCompany getSenderCompany() {
        return senderCompany;
    }

    public void setSenderCompany(SenderCompany senderCompany) {
        this.senderCompany = senderCompany;
    }
}
