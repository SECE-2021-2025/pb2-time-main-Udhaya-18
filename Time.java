public class Time {
    private Integer hour;
    private Integer minute;
    private Integer seconds;

    public Time(Integer hour, Integer minute, Integer seconds) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }

        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Minute must be between 0 and 59");
        }

        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else {
            throw new IllegalArgumentException("Seconds must be between 0 and 59");
        }
    }

    public Integer getHour() {
        return this.hour;
    }
    public void setHour(Integer hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Hour must be between 0 and 23");
        }
    }

    public Integer getMinute() {
        return this.minute;
    }
    public void setMinute(Integer minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Hour must be between 0 and 59");
        }
    }

    public Integer getSeconds() {
        return this.seconds;
    }
    public void setSeconds(Integer seconds) {
        if (seconds >= 0 && seconds <= 59) {
            this.seconds = seconds;
        } else {
            throw new IllegalArgumentException("Seconds must be between 0 and 59");
        }
    }

    public void setTime(Integer hour, Integer minute, Integer seconds) {
        this.setHour(hour);
        this.setMinute(minute);
        this.setSeconds(seconds);
    }

    public Time nextSecond() {
        return new Time(this.getHour(), this.getMinute(), this.getSeconds() + 1);
    }

    public Time previousSecond() {
        return new Time(this.getHour(), this.getMinute(), this.getSeconds() - 1);
    }

    @Override
    public String toString() {
        String hh;
        String mm;
        String ss;
        if(this.getHour() < 10) {
            hh = "0" + this.getHour();
        }
        else {
            hh = "" + this.getHour();
        }
        if(this.getMinute() < 10) {
            mm = "0" + this.getMinute();
        }
        else {
            mm = "" + this.getMinute();
        }
        if(this.getSeconds() < 10) {
            ss = "0" + this.getSeconds();
        }
        else {
            ss = "" + this.getSeconds();
        }
        return hh + " : " + mm + " : " + ss;
    }
}
