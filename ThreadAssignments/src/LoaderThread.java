import java.util.Scanner;

public class LoaderThread extends ListLoader implements Runnable{

    int startNumber;

    int lastNumber;

    ListLoader listLoader;

    public LoaderThread(int startNumber, int lastNumber){
        this.startNumber = startNumber;
        this.lastNumber = lastNumber;
    }



    public void setStartNumber(int startNumber){
        this.startNumber = startNumber;
    }

    public int getStartNumber(){
        return this.startNumber;
    }

    public void setLastNumber(int lastNumber){
        this.lastNumber = lastNumber;
    }

    public int getLastNumber(){
        return this.lastNumber;
    }


    @Override
    public synchronized void run(){
        ListLoader th = new ListLoader();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER START NUMBER");
        int num = sc.nextInt();
        System.out.println("ENTER LAST NUMBER");
        int numm = sc.nextInt();
        setStartNumber(num);
        setLastNumber(numm);
        th.loadList(getStartNumber(), getLastNumber());
    }
}