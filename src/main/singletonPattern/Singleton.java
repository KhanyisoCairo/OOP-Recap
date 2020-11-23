import sun.management.counter.Counter;

class UniqueCounter {

  static   UniqueCounter instance = null;
    private int counter = 0;
    private UniqueCounter(){

    }
    public static  UniqueCounter getInstance(){
        if (instance == null){
            instance= new UniqueCounter();
        }
        return instance;
    }

    public int next() {
        return ++counter;
    }
}
public class Singleton {
    public static void anotherMethod() {
        UniqueCounter counter =  UniqueCounter.getInstance();
        System.out.println("My id =" + counter.next());
        System.out.println("My id =" + counter.next());
        System.out.println("My id =" + counter.next());
    }

    public static void main(String[] args) {
        UniqueCounter counter = UniqueCounter.getInstance();
        System.out.println("My id :" + counter.next());

        anotherMethod();
        UniqueCounter theCounter = UniqueCounter.getInstance();
        System.out.println("My id :" + theCounter.next());
    }
}
