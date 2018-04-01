package com.cice;


public class Crono extends Thread {
    private CronoForm cronoGui;
    private int seconds;
    private int min;
    private int hours;
    private volatile boolean isActive;



    public Crono(CronoForm cronoGui) {
    this.cronoGui = cronoGui;

    }

    @Override
    public void run() {
        while (true) {
            while (isActive) {
                try {
                    Thread.sleep(1000L);
                    seconds++;

                    if (seconds == 60){
                        min++;
                        seconds = 0;
                    }

                    if (min == 60){
                        hours++;
                        min = 0;
                    }
                    setTime(seconds, min, hours);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void setTime(int seconds, int min, int hours){
       StringBuilder currentTime = new StringBuilder("");

       if (hours < 10){
           currentTime.append("0");
           currentTime.append(hours);
       } else {
           currentTime.append(hours);
       }
       currentTime.append(":");
        if (min < 10){
            currentTime.append("0");
            currentTime.append(min);
        } else {
            currentTime.append(min);
        }
        currentTime.append(":");
        if (seconds < 10){
            currentTime.append("0");
            currentTime.append(seconds);
        } else {
            currentTime.append(seconds);
        }

        cronoGui.getTimeLabel().setText(currentTime.toString());
    }

    public void resetTimer(){
        this.hours = 0;
        this.min = 0;
        this.seconds = 0;
        setTime(seconds, min, hours);
    }

    public void setActive(boolean status){
        this.isActive = status;
    }

}
