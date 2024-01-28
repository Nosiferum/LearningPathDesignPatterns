package Builder;

import java.util.ArrayList;
import java.util.List;

public class ItemBuilder {
    int id;
    String name;
    double price;
    List<Float> scores;

    public ItemBuilder() {
        scores = new ArrayList<>();
    }

    public ItemBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public ItemBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ItemBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public ItemBuilder addScore(Float score) {
       this.scores.add(score);
        return this;
    }

    public Item build() {
        Item item = new Item();
        item.setId(this.id);
        item.setName(this.name);
        item.setPrice(this.price);
        item.setScores(this.scores);
        return item;
    }
}
