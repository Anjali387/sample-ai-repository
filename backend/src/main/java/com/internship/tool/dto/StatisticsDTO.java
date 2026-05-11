package com.internship.tool.dto;

public class StatisticsDTO {

    private int totalAudits;

    private int pendingAudits;

    private int completedAudits;

    public int getTotalAudits() {
        return totalAudits;
    }

    public void setTotalAudits(int totalAudits) {
        this.totalAudits = totalAudits;
    }

    public int getPendingAudits() {
        return pendingAudits;
    }

    public void setPendingAudits(int pendingAudits) {
        this.pendingAudits = pendingAudits;
    }

    public int getCompletedAudits() {
        return completedAudits;
    }

    public void setCompletedAudits(int completedAudits) {
        this.completedAudits = completedAudits;
    }
}