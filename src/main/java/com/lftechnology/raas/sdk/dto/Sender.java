package com.lftechnology.raas.sdk.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Kiran Pariyar <kiranpariyar@lftechnology.com>
 */
public class Sender {

    @SerializedName("id")
    private String referenceId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String mobilePhone;
    private String state;
    private String status;
    private String currentTier;
    private List<String> requestedFields;
    private List<String> cipFailureReasons;

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrentTier() {
        return currentTier;
    }

    public void setCurrentTier(String currentTier) {
        this.currentTier = currentTier;
    }

    public List<String> getRequestedFields() {
        return requestedFields;
    }

    public void setRequestedFields(List<String> requestedFields) {
        this.requestedFields = requestedFields;
    }

    public List<String> getCipFailureReasons() {
        return cipFailureReasons;
    }

    public void setCipFailureReasons(List<String> cipFailureReasons) {
        this.cipFailureReasons = cipFailureReasons;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @Override
    public String toString() {
        return "Sender{" + "referenceId='" + referenceId + '\'' + ", firstName='" + firstName + '\'' + ", middleName='" + middleName + '\''
                + ", lastName='" + lastName + '\'' + ", email='" + email + '\'' + ", state='" + state + '\'' + ", status='" + status + '\''
                + ", currentTier='" + currentTier + '\'' + '}';
    }
}
