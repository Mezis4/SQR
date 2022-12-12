package ru.netology.sqr;

public class SQRService {
    public int counter(int lowerBound, int upperBound) {
        int amount = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerBound && i * i <= upperBound) {
                amount += 1;
            }
        }
        return amount;
    }
}
