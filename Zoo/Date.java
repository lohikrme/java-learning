// Date.java
// 15th april 2024

public class Date 
implements Comparable<Date>{
    private int d;
    private int m;
    private int y;

    // default constructor
    public Date() {
        this.d = 1;
        this.m = 1;
        this.y = 1900;
    }

    // constructor with parameters
    public Date(int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;
    }

    public int getD() {
        return this.d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getM() {
        return this.m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return Integer.toString(this.d) + "." + Integer.toString(this.m) + "." + Integer.toString(this.y);
    }

    public boolean setValues(int d, int m, int y) {
        if (isCorrectDate(d, m, y)) {
            this.d = d;
            this.m = m;
            this.y = y;
            return true;
        } 
        return false;
    }


    private boolean isLeapYear(int year) {
        // 1200, 1600, 2000, 2400...
        if (year % 400 == 0) {
            return true;
        }
        // 1996, 2004, 2008, 2012...
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return false;
    }

    private boolean isCorrectDate(int day, int month, int year) {
        
        // determines allowed days for each month of each year
        int maxDaysPerMonth = 0;
        switch(month) {
            // January
            case 1:
                maxDaysPerMonth = 31;
                break;
            // February
            case 2:
                if (isLeapYear(year)) {
                    maxDaysPerMonth = 29;
                }
                else {
                    maxDaysPerMonth = 28;
                }
                break;
            // March
            case 3:
                maxDaysPerMonth = 31;
                break;
            case 4:
                maxDaysPerMonth = 30;
                break;
            case 5:
                maxDaysPerMonth = 31;
                break;
            case 6:
                maxDaysPerMonth = 30;
                break;
            case 7:
                maxDaysPerMonth = 31;
                break;
            case 8:
                maxDaysPerMonth = 31;
                break;
            case 9:
                maxDaysPerMonth = 30;
                break;
            case 10:
                maxDaysPerMonth = 31;
                break;
            case 11:
                maxDaysPerMonth = 30;
                break;
            case 12:
                maxDaysPerMonth = 31;
            // if month is less than 1 or more than 12, date is incorrect
            default:
                return false;
        }

        // if day is not in range of maxDaysPerMonth return false
        if (day < 1 ||day > maxDaysPerMonth) {
            return false;
        }

        // now we know month and day is allowed range, so date is correct
        return true;
    }

    // allows comparing dates, order is year > month > day
    @Override
    public int compareTo(Date other) {
        int yearComparison = Integer.compare(this.y, other.y);
        if (yearComparison != 0) {
            return yearComparison;
        }

        int monthComparison = Integer.compare(this.m, other.m);
        if (monthComparison != 0) {
            return monthComparison;
        }
        return Integer.compare(this.d, other.d);
    }

}
