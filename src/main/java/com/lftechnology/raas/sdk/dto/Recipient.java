package com.lftechnology.raas.sdk.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class Recipient {

    @SerializedName("id")
    private String referenceId;
    private String senderId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String country;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String postalCode;
    private String province;
    private String email;
    private String homePhone;
    private String mobilePhone;
    private String workPhone;
    private String dateOfBirth;
    private String occupation;
    private String senderRelationship;
    private boolean enableCashPickup;
    private List<String> availablePayoutMethods;


    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getSenderRelationship() {
        return senderRelationship;
    }

    public void setSenderRelationship(String senderRelationship) {
        this.senderRelationship = senderRelationship;
    }

    public boolean isEnableCashPickup() {
        return enableCashPickup;
    }

    public void setEnableCashPickup(boolean enableCashPickup) {
        this.enableCashPickup = enableCashPickup;
    }

    public List<String> getAvailablePayoutMethods() {
        return availablePayoutMethods;
    }

    public void setAvailablePayoutMethods(List<String> availablePayoutMethods) {
        this.availablePayoutMethods = availablePayoutMethods;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Recipient{");
        sb.append("referenceId='").append(referenceId).append('\'');
        sb.append(", senderId='").append(senderId).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", middleName='").append(middleName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", addressLine1='").append(addressLine1).append('\'');
        sb.append(", addressLine2='").append(addressLine2).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", postalCode='").append(postalCode).append('\'');
        sb.append(", province='").append(province).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", homePhone='").append(homePhone).append('\'');
        sb.append(", mobilePhone='").append(mobilePhone).append('\'');
        sb.append(", workPhone='").append(workPhone).append('\'');
        sb.append(", dateOfBirth='").append(dateOfBirth).append('\'');
        sb.append(", occupation='").append(occupation).append('\'');
        sb.append(", senderRelationship='").append(senderRelationship).append('\'');
        sb.append(", enableCashPickup=").append(enableCashPickup);
        sb.append(", availablePayoutMethods=").append(availablePayoutMethods);
        sb.append('}');
        return sb.toString();
    }
}
