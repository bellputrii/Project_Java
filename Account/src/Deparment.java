public class Deparment {
//    public int numberOfWorker = 0; // without static, numberOfWorker nya == 0
    public static int numberOfWorker = 0; // kalau make static, numberOfWorker nya == 1, karena numberOfWorker++

    public String name;

    public Deparment(String name){
        this.name = name;
        numberOfWorker++;
    }
}
