package fi.utu.tech.exercise1.calculator;

import java.util.ArrayList;

public class Calculator {
    public float avg(int[] nums) throws EmptyArrayException {
        int sum = 0;
        if (nums == null || nums.length == 0)
            throw new EmptyArrayException();
        for (int n : nums) sum += n;
        return sum / nums.length;
    }

    public float avgPos(int[] nums) throws EmptyArrayException, NegativeNumberException {
        int sum = 0;
        ArrayList<String> negativeNumbers = new ArrayList<>();
        int [] indexes = new int [nums.length];
        if (nums == null || nums.length == 0)
            throw new EmptyArrayException();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                // palauttaa listan kohdista jotenkin... testaa calculator userilla
                negativeNumbers.add("Antamasi taulukon " + (i+1) + ". luku " + nums[i] + " on virheellinen" + "\n");
            }
        };
        if (!negativeNumbers.isEmpty()) {
            throw new NegativeNumberException(negativeNumbers);
        }

        for (int n : nums) sum += n;
        return sum / nums.length;
    }
}
