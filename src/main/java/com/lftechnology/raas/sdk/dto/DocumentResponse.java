package com.lftechnology.raas.sdk.dto;

import com.google.gson.annotations.SerializedName;

public class DocumentResponse {

    @SerializedName("id")
    private String referenceId;
    private String documentType;
    private String documentIdNumber;
    private String documentExpiryDate;
    private String idIssuingAuthority;

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentIdNumber() {
        return documentIdNumber;
    }

    public void setDocumentIdNumber(String documentIdNumber) {
        this.documentIdNumber = documentIdNumber;
    }

    public String getDocumentExpiryDate() {
        return documentExpiryDate;
    }

    public void setDocumentExpiryDate(String documentExpiryDate) {
        this.documentExpiryDate = documentExpiryDate;
    }

    public String getIdIssuingAuthority() {
        return idIssuingAuthority;
    }

    public void setIdIssuingAuthority(String idIssuingAuthority) {
        this.idIssuingAuthority = idIssuingAuthority;
    }
}
