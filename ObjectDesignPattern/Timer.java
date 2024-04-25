// Timer.java
// 25th april 2024

// timer acts as 'Subject' in 
// 'Event Observer Design Pattern'

// GUIDE to user:
// Give Timer parameters: interval time (milliseconds), total running time (minutes).
// Timer will notify Observer class objects after every interval.
// Remember to add observers into Timer using addObserver() function.
// And also remember to turn on the Timer using turnOn() function.

import java.util.LinkedList;
import java.util.Iterator;


public class Timer {
    private long msCount;
    private long maxTimeMS;
    private int intervalMS;
    private LinkedList<Observer> observers = new LinkedList<>();

    private static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("second has been elapsed");
        }
    }

    // constructor
    public Timer(int intervalMilliSeconds, int maxTimeMinutes) {
            this.msCount = 0;
            this.maxTimeMS = maxTimeMinutes * 60 * 100;
            this.intervalMS = intervalMilliSeconds;
    }

    public void turnOn() {
        System.out.println("Timer has been turned on...");
        while (msCount <= maxTimeMS) {
            wait(this.intervalMS);
            msCount += intervalMS;
            notifyObservers();
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public Observer removeObserver(String observerID) {
        Observer obsForReturn;
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = iterator.next();
            if (observer.getID().equals(observerID)) {
                obsForReturn = observer;
                iterator.remove();
                return obsForReturn;
            }
        }
        return null;
    }
}
