package models;

import java.util.Date;
import java.util.Random;

public class Utils {
    private static final String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final String NU = "1234567890";

    private static Random rand = new Random();;
    private static long ms;

    public static Date getRandomBirthDate() {
        ms = -946771200000L + (Math.abs(rand.nextLong()) % (70L * 365 * 24 * 60 * 60 * 1000));
        return new Date(ms);
    }

    public static String getRandomName() {
        return randomString(AB, rand.nextInt(5) + 5);
    }

    public static String getRandomPhone() {
        return randomString(NU, 11);
    }

    public static String getRandomPassword() {
        return randomString(AB + NU, rand.nextInt(5) + 8);
    }

    public static String randomString(String from, int len) {
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(from.charAt(rand.nextInt(from.length())));
        return sb.toString();
    }

    public static int randIntBetween(int min, int max) {
        return min + (int) Math.round(Math.random() * (max - min));
    }

    public static float randomFloat() {
        return rand.nextFloat();
    }
}
