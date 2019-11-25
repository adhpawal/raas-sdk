package com.lftechnology.raas.sdk.dto;


public class Document {

    private String id;

    private String frontImageLink;

    private String backImageFileName;

    private String documentType;

    private String documentIdNumber;

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
}
