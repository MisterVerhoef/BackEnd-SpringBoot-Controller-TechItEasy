package novi.backend.backendspringbootcontrollertechiteasy.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Television {

@Id
@GeneratedValue
Long id;

    private String brand;
    private String model;
    private int price;
    private int screenSize;
    private String type;

    public Television(String brand, Long id, String model, int price, int screenSize, String type) {
        this.brand = brand;
        this.id = id;
        this.model = model;
        this.price = price;
        this.screenSize = screenSize;
        this.type = type;
    }

    public Television() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
