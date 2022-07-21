package com.in.modelclass;

public class CallHistory_Model {

    String datetime,sessionid,calllogid,astrologerName,minCharges,calldurations,amount,reviews;

    public CallHistory_Model(String datetime, String sessionid, String calllogid, String astrologerName,
                             String minCharges, String calldurations, String amount, String reviews) {
        this.datetime = datetime;
        this.sessionid = sessionid;
        this.calllogid = calllogid;
        this.astrologerName = astrologerName;
        this.minCharges = minCharges;
        this.calldurations = calldurations;
        this.amount = amount;
        this.reviews = reviews;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public String getCalllogid() {
        return calllogid;
    }

    public void setCalllogid(String calllogid) {
        this.calllogid = calllogid;
    }

    public String getAstrologerName() {
        return astrologerName;
    }

    public void setAstrologerName(String astrologerName) {
        this.astrologerName = astrologerName;
    }

    public String getMinCharges() {
        return minCharges;
    }

    public void setMinCharges(String minCharges) {
        this.minCharges = minCharges;
    }

    public String getCalldurations() {
        return calldurations;
    }

    public void setCalldurations(String calldurations) {
        this.calldurations = calldurations;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }
}
