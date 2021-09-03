package com.example.tu_dien_koho;

public class Topic {
    private String topicName;

    // Image name (Without extension)
    private String flagName;
    private int mota;

    public Topic(String topicName, String flagName, int mota) {
        this.topicName= topicName;
        this.flagName= flagName;
        this.mota= mota;
    }

    public int getMota() {
        return mota;
    }

    public void setMota(int mota) {
        this.mota = mota;
    }

    public String gettopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getFlagName() {
        return flagName;
    }

    public void setFlagName(String flagName) {
        this.flagName = flagName;
    }


}
