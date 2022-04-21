import java.util.Scanner;
public class Ex10_01 {
    public static void main(String[] args) {
        Time time1 = new Time();
        System.out.println("Hour: " + time1.getHour() + " Minute: " +
                time1.getMinute() + " Second: " + time1.getSecond());

        Time time2 = new Time(555550000);
        System.out.println("Hour: " + time2.getHour() + " Minute: " +
                time2.getMinute() + " Second: " + time2.getSecond());
    }
}
class Time{
    private int hour;
    private int minute;
    private int second;
    public Time(){
        this(System.currentTimeMillis());
    }
    public Time(long elapsadTime){
        setTime(elapsadTime);
    }
    public Time(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    public long setTime(long elapseTime){
        long totalSeconds=elapseTime/1000;
        second=(int)(totalSeconds%60);
        long totalminutes=totalSeconds/60;
        minute=(int)(totalminutes%60);
        long totalhours = totalminutes;
        hour = (int)(totalminutes%24);
        return (int)(totalhours / 60);
    }
}
