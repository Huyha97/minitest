package baitap.TITV.bai33;

public class vd {
    private int day;
    private int month;
    private int year;

    public vd(int day, int month, int year) {
       if (day >=1 && day <= 31) {
           this.day = day;
       } else {
           this.day =1;
       }
       if (month >= 1 && month <= 12) {
           this.month = month;
       } else {
           this.month = month;
       }
       if (year >=1) {
           this.year = year;
       }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day >=1 && day <= 31) {
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >=1) {
            this.year = year;
        }
    }

    @Override
    public String toString() {
        return "vd{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
