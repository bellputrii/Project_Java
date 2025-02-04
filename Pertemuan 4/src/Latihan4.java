public class Latihan4 {
    public static <Scanner> void main(String[] args){
        enum Level{
            LOW, MEDIUM, HIGH;
        }
        Level myLevel = Level.MEDIUM;
        System.out.println(myLevel.ordinal());

//        Scanner scan = new Scanner(System.in);
//        switch (myLevel){
//            case LOW -> System.out.println("Level Rendah");
//            case MEDIUM -> System.out.println("Level Sedang");
//            case HIGH -> System.out.println("Level Tinggi");
        }
//        System.out.println(myLevel);
    }

