package com.checkup.checkupmicroservice;

import java.util.Date;

public class Checkup {

    private String priority;
    private String recommendation;
    private Date date;
    private String environment;

    public Checkup() {
    }

    public Checkup(String priority, String recommendation, Date date, String environment) {
        this.priority = priority;
        this.recommendation = recommendation;
        this.date = date;
        this.environment = environment;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
