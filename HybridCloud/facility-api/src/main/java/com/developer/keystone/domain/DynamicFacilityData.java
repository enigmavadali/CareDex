package com.developer.keystone.domain;

import java.util.Date;

public class DynamicFacilityData {

    private int fid;
    private int temperature;
    private int humidity;
    private int so2level;
    private int o2level;
    private int trafficJam;
    private Date inspectTime;

    public DynamicFacilityData(int fid, int temperature, int humidity, int so2level, int o2level, int trafficJam, Date inspectTime) {
        this.fid = fid;
        this.temperature = temperature;
        this.humidity = humidity;
        this.so2level = so2level;
        this.o2level = o2level;
        this.trafficJam = trafficJam;
        this.inspectTime = inspectTime;
    }

    public DynamicFacilityData(){

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

    public int getSo2level() {
        return so2level;
    }

    public void setSo2level(int so2level) {
        this.so2level = so2level;
    }

    public int getO2level() {
        return o2level;
    }

    public void setO2level(int o2level) {
        this.o2level = o2level;
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
