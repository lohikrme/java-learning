// Main.java
// 25th april 2024

public class Main {
    public static void main(String[] args) {
        int intervalLength = 100;
        Timer timer = new Timer(intervalLength, 5);
        Observer observer = new TikTak("1");
        Observer observer2 = new TikTak("2");
        timer.addObserver(observer);
        timer.addObserver(observer2);
        timer.turnOn();
    }
}
