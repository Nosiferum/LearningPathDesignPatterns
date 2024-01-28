package Builder;

import java.util.List;

public class Item {
    int id;
    String name;
    double price;
    List<Float> scores;

    public Item() {
    }

    public Item(int id, String name, double price, List<Float> scores) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.scores = scores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Float> getScores() {
        return scores;
    }

    public void setScores(List<Float> scores) {
        this.scores = scores;
    }
}
