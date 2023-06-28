package com.developer.keystone.domain;

import java.util.Date;

public class ResidentDynamicData {
    private int fid;
    private int temperature;
    private int humidity;
    private int co2Level;
    private int trafficJam;
    private Date inspectTime;

    // Constructor
    public ResidentDynamicData(int fid, int temperature, int humidity, int co2Level, int trafficJam, Date inspectTime) {
        this.fid = fid;
        this.temperature = temperature;
        this.humidity = humidity;
        this.co2Level = co2Level;
        this.trafficJam = trafficJam;
        this.inspectTime = inspectTime;
    }

    public ResidentDynamicData() {

    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getCo2Level() {
        return co2Level;
    }

    public void setCo2Level(int co2Level) {
        this.co2Level = co2Level;
    }

    public int getTrafficJam() {
        return trafficJam;
    }

    public void setTrafficJam(int trafficJam) {
        this.trafficJam = trafficJam;
    }

    public Date getInspectTime() {
        return inspectTime;
    }

    public void setInspectTime(Date inspectTime) {
        this.inspectTime = inspectTime;
    }
}
