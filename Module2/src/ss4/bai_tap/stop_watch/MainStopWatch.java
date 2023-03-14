package ss4.bai_tap.stop_watch;

public class MainStopWatch {
    public static void main(String[] args) {
        double[] arr = new double[50000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }

        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        System.out.println("Start time: " + stopWatch.getStartTime());

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    double tempt = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempt;
                }
            }
        }

        stopWatch.stop();
        System.out.println("End time: " + stopWatch.getEndTime());
        System.out.println("Sum time: " + stopWatch.getElapsedTime());
    }
}
