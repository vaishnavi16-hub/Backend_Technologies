package com.tka;

public class Engine {

    private String company;
    private int cc;

    public Engine() {
        super();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "Engine [company=" + company + ", cc=" + cc + "]";
    }
}