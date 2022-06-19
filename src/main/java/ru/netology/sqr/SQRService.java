package ru.netology.sqr;

public class SQRService {
    public int squares(double rangeStartUser, double rangeEndUser) {
        long rangeStart = (long) rangeStartUser;
        long rangeEnd = (long) rangeEndUser;
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= rangeStart) {
                if (i * i <= rangeEnd) {
                    count++;
                }

            }
        }
        return count;
    }


}
