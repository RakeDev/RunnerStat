package org.example;

public class Runner {
    private String nameSurname;
    private String sex;
    private String distance;
    private String time;
    public Runner(){
    }

    public Runner(String nameSurname, String sex, String distance, String time) {
        this.nameSurname = nameSurname;
        this.sex = sex;
        this.distance = distance;
        this.time = time;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Runner{" +
                "nameSurname='" + nameSurname + '\'' +
                ", sex='" + sex + '\'' +
                ", distance='" + distance + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
