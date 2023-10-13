package org.example;

public class Apple {
    float weightInOuences;
    String variety;
    String color;
    String season;

    // constructor - initializes the Apple class
    Apple() {
        weightInOuences = 25;
        variety = "Honeycrisp";
        color = "OrangeGold with red stripes";
        season = "Fall";
    }
    Apple (float weightInOuences, String variety, String color, String season) {
        this.weightInOuences = weightInOuences;
        this.variety = variety;
        this.color = color;
        this.season = season;
    }
}
