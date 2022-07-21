package com.in.modelclass;

public class ChatHistory_Model {

    String datetime,chatId,astrologerName,amountCharged,reviews;

    public ChatHistory_Model(String datetime, String chatId, String astrologerName, String amountCharged, String reviews) {
        this.datetime = datetime;
        this.chatId = chatId;
        this.astrologerName = astrologerName;
        this.amountCharged = amountCharged;
        this.reviews = reviews;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getAstrologerName() {
        return astrologerName;
    }

    public void setAstrologerName(String astrologerName) {
        this.astrologerName = astrologerName;
    }

    public String getAmountCharged() {
        return amountCharged;
    }

    public void setAmountCharged(String amountCharged) {
        this.amountCharged = amountCharged;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }
}
