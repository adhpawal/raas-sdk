package com.lftechnology.raas.sdk.dto;

import java.util.List;

public class StatusChangeHistory {
    private String changedAt;
    private String status;
    private String comment;
    private List<StatusChangeReason> holdReasons;

    public String getChangedAt() {
        return changedAt;
    }

    public void setChangedAt(String changedAt) {
        this.changedAt = changedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<StatusChangeReason> getHoldReasons() {
        return holdReasons;
    }

    public void setHoldReasons(List<StatusChangeReason> holdReasons) {
        this.holdReasons = holdReasons;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
