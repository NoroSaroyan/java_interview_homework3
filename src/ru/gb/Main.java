package ru.gb;

public class Main {

    public static void main(String[] args) {
        PingPong.main(args);
        try {
            SafeThreadCounter.main(args);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
