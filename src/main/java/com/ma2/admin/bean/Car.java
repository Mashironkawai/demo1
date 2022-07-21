package com.ma2.admin.bean;


public class Car {
    public String Car;
    public int price;

    public Car() {
    }

    public Car(String car, int price) {
        Car = car;
        this.price = price;
    }

    public String getCar() {
        return Car;
    }

    public void setCar(String car) {
        Car = car;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Csr{" +
                "Car='" + Car + '\'' +
                ", price=" + price +
                '}';
    }
}
