package com.example.task02;

public class TimeSpan {
    private int hour;
    private int min;
    private int sec;

    public TimeSpan(int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    private int getHour(){
        return this.hour;
    }
    private int getMin(){
        return this.min;
    }
    private int getSec(){
        return this.sec;
    }
    private void setHour(int hour){
        this.hour = hour;
    }
    private void setMin(int min){
        this.min = min;
    }
    private void setSec(int sec){
        this.sec = sec;
    }
    private void setToNull(){
        this.hour = 0;
        this.min = 0;
        this.sec = 0;
    }

    void add(TimeSpan time){
        setSec(getSec() + time.getSec());
        while (getSec() >= 60){
            setMin(getMin() + 1);
            setSec(getSec() - 60);
        }
        setMin(getMin() + time.getMin());
        while (getMin() >= 60){
            setHour(getHour() + 1);
            setMin(getMin() - 60);
        }
        setHour(getHour() + time.getHour());
    }

    void subtract(TimeSpan time){
        if (time.getHour() > getHour()){
            setToNull();
            return;
        }
        if (time.getHour() == getHour()){
            if (time.getMin() > getMin()){
                setToNull();
                return;
            }
            if (time.getMin() == getMin()){
                if(time.getSec() >= getSec()){
                    setToNull();
                    return;
                }
            }
        }
        setSec(getSec() - time.getSec());
        while (getSec() < 0){
            setSec(getSec() + 60);
            setMin(getMin() - 1);
        }
        setMin(getMin() - time.getMin());
        while (getMin() < 0){
            setMin(getMin() + 60);
            setHour(getHour() - 1);
        }
        setHour(getHour() - time.getHour());
    }

    public String toString(){
        return getHour() + ":" + getMin() + ":" + getSec();
    }
}
