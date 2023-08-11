import java.util.ArrayList;
import java.util.Random;

public class ListLoader {

    ArrayList arrayList;

    public ListLoader(){

    }

    public void setArrayList(ArrayList<Integer> arrayList){
        this.arrayList = arrayList;
    }

    public ArrayList<Integer> getArrayList(){
        return this.arrayList;
    }

    public synchronized void loadList(int startNumber, int lastNumber){
        System.out.println(System.currentTimeMillis());
        ArrayList<Integer> al = new ArrayList<>();
        int count = 100000;
        int div = 3;
        Random random = new Random();
        int rnd = random.nextInt(lastNumber);
        for(int i = startNumber; i < lastNumber; i++){
            Integer l = rnd;
            int value1 = l / div;
            int value2 = (l % div != 0) ? 1 : 0;
            l = value1 + value2;
            if(al.contains(l)){
                l = random.nextInt(rnd);
            }
            al.add(l);
            setArrayList(al);
        }
        System.out.println(al);
        System.out.println(System.currentTimeMillis());
    }
}
