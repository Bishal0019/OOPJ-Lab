package Day2;

class objectCount {
    static int i = 0;

    objectCount(){
        i++;
    }

    void getCount(){
        System.out.println("Objects Created = "+i);
    }
}

public class CountObj {
    public static void main(String[] args){
        objectCount o1 = new objectCount();
        objectCount o2 = new objectCount();
        objectCount o3 = new objectCount();

        o3.getCount();
    }
}
