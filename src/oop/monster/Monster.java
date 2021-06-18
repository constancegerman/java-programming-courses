package oop.monster;

public class Monster {
    int qtyEyes;
    int qtyLegs;
    int qtyHands;

    Monster() {
        qtyEyes = 2;
        qtyLegs = 2;
        qtyHands = 2;
    }

    Monster(int eyes) {
        this.qtyEyes = eyes;
        qtyLegs = 2;
        qtyHands = 2;
    }

    Monster(int eyes, int hands) {
        this.qtyEyes = eyes;
        this.qtyHands = hands;
        qtyLegs = 2;
    }

    Monster(int eyes, int legs, int hands) {
        this.qtyEyes = eyes;
        this.qtyLegs = legs;
        this.qtyHands = hands;
    }

    void voice() {
        System.out.println("Voice");
    }

    void voice(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Voice");
        }
    }

    void voice(int n, String word) {
        for (int i = 0; i < n; i++) {
            System.out.println(word);
        }
    }
}
