package com.kodz.actuatorgo;

public class ModelDto {
    String jedna;
    String druga;

    public ModelDto(String jedna, String druga) {
        this.jedna = jedna;
        this.druga = druga;
    }

    public String getJedna() {
        return jedna;
    }

    public void setJedna(String jedna) {
        this.jedna = jedna;
    }

    public String getDruga() {
        return druga;
    }

    public void setDruga(String druga) {
        this.druga = druga;
    }
}
