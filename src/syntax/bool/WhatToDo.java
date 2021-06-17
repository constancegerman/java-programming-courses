package syntax.bool;

public class WhatToDo {
    public static void main(String[] args) {
        int time = 12;
        boolean isGoodWeather = false;
        boolean late = time >= 23 || time <= 5;
        if (late) {
            System.out.println("Sleep!");
        }
        if (!late && isGoodWeather) {
            System.out.println("Walc!");
        }
        if (!late && !isGoodWeather) {
            System.out.println("Read.");
        }
    }
}
