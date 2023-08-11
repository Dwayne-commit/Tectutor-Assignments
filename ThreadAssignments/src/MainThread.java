public class MainThread {
    public static void main(String[] args) throws InterruptedException{
        ListLoader lj = new ListLoader();
        //lj.loadList(0,100000);
        /*
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                lj.loadList(0,50000);
            }
        });

        Thread t2 = new Thread(new Runnable(){
            public void run(){
                lj.loadList(50000,100000);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

         */

        LoaderThread ldth = new LoaderThread(0,50000);
        LoaderThread ldth1 = new LoaderThread(50000,100000);
        Thread th1 = new Thread(ldth);
        Thread th2 = new Thread(ldth1);
        th1.start();
        th1.join();
        th2.start();

        //th1.join();
        //th2.join();
    }
}