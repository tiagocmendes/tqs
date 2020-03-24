package ua.tqs;

import java.util.Objects;

public class Address {

    // Properties
    private String road;
    private String city;
    private String state;
    private String zip;
    private String houseNUmber;

    public Address(String road, String city, String state, String zip, String houseNumber) {
        this.road = road;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.houseNUmber = houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "road='" + road + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", houseNUmber='" + houseNUmber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(road, address.road) &&
                Objects.equals(city, address.city) &&
                Objects.equals(state, address.state) &&
                Objects.equals(zip, address.zip) &&
                Objects.equals(houseNUmber, address.houseNUmber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(road, city, state, zip, houseNUmber);
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getHouseNUmber() {
        return houseNUmber;
    }

    public void setHouseNUmber(String houseNUmber) {
        this.houseNUmber = houseNUmber;
    }

}
