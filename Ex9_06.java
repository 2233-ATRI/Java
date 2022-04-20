package demo;
public class Ex9_06 {
    public static void main(String[] args) {
        StopWatch time = new StopWatch();
        int[] array = new int[100000];
        for (int i = 0; i < 100000; i++) {
            array[i] = (int) (Math.random() * 1000000);
        }
        time.start();
        for (int i = 0; i < array.length - 1; i++) {
            int currentMin = array[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (currentMin > array[j]) {
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                array[currentMinIndex] = array[i];
                array[i] = currentMin;
            }
        }
        time.Stop();
        System.out.println(time.getElapsedTime()); //这里生成的是毫秒。
    }
}
class StopWatch{
    private long startTimre;
    private long endTime;
    public void Stop(){
        this.startTimre=System.currentTimeMillis();
    }
    public void start(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime-this.startTimre;
    }
}

