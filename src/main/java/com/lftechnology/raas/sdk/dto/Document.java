package com.lftechnology.raas.sdk.dto;


import com.google.gson.annotations.SerializedName;

public class Document {

    private String id;

    @SerializedName("frontImageLink")
    private String frontImageLink;

    @SerializedName("backImageFileName")
    private String backImageFileName;

    @SerializedName("documentType")
    private String documentType;

    @SerializedName("documentIdNumber")
    private String documentIdNumber;

    @SerializedName("fileName")
    private String fileName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFrontImageLink() {
        return frontImageLink;
    }

    public void setFrontImageLink(String frontImageLink) {
        this.frontImageLink = frontImageLink;
    }

    public String getBackImageFileName() {
        return backImageFileName;
    }

    public void setBackImageFileName(String backImageFileName) {
        this.backImageFileName = backImageFileName;
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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Document{");
        sb.append("id='").append(id).append('\'');
        sb.append(", frontImageLink='").append(frontImageLink).append('\'');
        sb.append(", backImageFileName='").append(backImageFileName).append('\'');
        sb.append(", documentType='").append(documentType).append('\'');
        sb.append(", documentIdNumber='").append(documentIdNumber).append('\'');
        sb.append(", fileName='").append(fileName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
