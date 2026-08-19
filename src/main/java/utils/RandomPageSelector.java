package utils;

import java.util.Random;

public class RandomPageSelector {

    public static int randompage(int min, int max){

        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
