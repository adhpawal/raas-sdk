package com.lftechnology.raas.sdk.dto;

import com.google.gson.annotations.SerializedName;

public class Invoice {

    @SerializedName("id")
    private String referenceId;

    private String fileName;

    @SerializedName("frontImageLink")
    private String link;

    private String type;

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
