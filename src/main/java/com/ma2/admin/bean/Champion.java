package com.ma2.admin.bean;

import java.util.Objects;

/**
 * @author Administrator
 */
public class Champion {
    private int jie;
    //年份
    private int year;
    //比赛地点
    private String address;
    //获得冠军国家
    private String country;

    public Champion() {
    }

    public Champion(int jie, int year, String address, String country) {
        this.jie = jie;
        this.year = year;
        this.address = address;
        this.country = country;
    }

    public int getJie() {
        return jie;
    }

    public void setJie(int jie) {
        this.jie = jie;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Champion{" +
                "jie=" + jie +
                ", year=" + year +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Champion champion = (Champion) o;
        return jie == champion.jie && year == champion.year && address.equals(champion.address) && country.equals(champion.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jie, year, address, country);
    }
}
