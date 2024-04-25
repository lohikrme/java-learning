// Observer.java
// 25th april 2024

// GUIDE to user: 
// This observer class is an abstract class.
// Therefore, it has only basic functionality.
// It offers an interface "update", which
// child-classes will override.

abstract public class Observer {
    private String id; 

    // constructor
    public Observer(String id) {
        this.id = id;
    }

    public String getID() {
        return this.id;
    }

    public void setID(String id) {
        this.id = id;
    }

    abstract public void update(String event);
}
