class Display {
    synchronized void showNumbers() {
        for (int i =1;i<= 5;i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
    synchronized void showAlphabets() {
        for (char c ='A';c<= 'E';c++) {
            System.out.println(c);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
class NumberThread extends Thread {
    Display d;
    NumberThread(Display d) {
        this.d=d;
    }
    public void run() {
        d.showNumbers();
    }
}
class AlphabetThread extends Thread {
    Display d;
    AlphabetThread(Display d) {
        this.d=d;
    }
    public void run() {
        d.showAlphabets();
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) {
        Display d =new Display();
        NumberThread t1= new NumberThread(d);
        AlphabetThread t2 =new AlphabetThread(d);
        t1.start();
        t2.start();
    }
}
