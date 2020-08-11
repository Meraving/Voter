package Model;

import java.time.LocalDate;

public class Dish extends AbstractNamedEntity{
    private LocalDate date;
    private Restaurant restaurant;
    private float price;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Dish() {
    }

    public Dish(int id, String name, LocalDate date, Restaurant restaurant, float price) {
        super(id, name);
        this.date = date;
        this.restaurant = restaurant;
        this.price = price;
    }

}
