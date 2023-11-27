package dazanonr;

import java.time.LocalDate;

public class Stock {
    String details, color;
    LocalDate fabricationDate, expirationDate;
    Double weight, price;
    int sell;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getFabricationDate() {
        return fabricationDate;
    }

    public void setFabricationDate(LocalDate fabricationDate) {
        this.fabricationDate = fabricationDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getSell() {
        return sell;
    }

    public void setSell(int sell) {
        this.sell = sell;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "details='" + details + '\'' +
                ", color='" + color + '\'' +
                ", fabricationDate='" + fabricationDate + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", sell=" + sell +
                '}';
    }
}
