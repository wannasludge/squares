package ru.netology.sqr;

public class SQRService {
    public int calculate(int lowBound, int topBound) {
        int j = 0;
        for (int i = 10; i <= 99; i++) {
                if (i * i >= lowBound) {
                    if (i * i <= topBound) {
                        j = j + 1;
                    }
                }
        }
        return j;
    }
}
