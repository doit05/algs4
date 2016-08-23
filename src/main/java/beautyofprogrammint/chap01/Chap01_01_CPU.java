package chap01;

/**
 * Created by yaodh on 2015/3/25.
 */
public class Chap01_01_CPU {
    public static void main(String[] args) throws InterruptedException {
    	Chap01_01_CPU test = new Chap01_01_CPU();
    	//占CPU50%
//    	test.line();
    	//sine 曲线
    	DrawSine();
    }
    public void line() {
        int busyTime = 10;
        int idleTime = busyTime;
        busyTime = 12;
        long startTime = 0;
        while(true) {
            startTime = System.currentTimeMillis();
            while(System.currentTimeMillis() - startTime <= busyTime) {

            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //正弦曲线
    public static final double TIME = 1000;

    /**
     * @param args the command line arguments
     */
    public static void DrawSine() throws InterruptedException {
        double x = 0;
        double y = 0;

        while (true) {
            y = (Math.sin(x) + 1) * TIME / 2;
            doSomeSimpleWork(y);
            x += 0.1;
            Thread.sleep((long) (TIME - y));
        }
    }

    private static void doSomeSimpleWork(double y) {
        long startTime = System.currentTimeMillis();
        while ((System.currentTimeMillis() - startTime) < y) {
        }
    }
}




