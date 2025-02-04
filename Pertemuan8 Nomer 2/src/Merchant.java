//import java.util.ArrayList;
//
//public class Merchant extends Entity {
//    private ArrayList<String> listItem;
//
//    public Merchant(int HP, int level, ArrayList<String> listItem) {
//        super(HP, level);
//        this.listItem = listItem;
//    }
//
//    @Override
//    public void displayInfo(){
//        System.out.println("# MERCHANT DENGAN LEVEL " + getLevel());
//    }
//
//    public void showItems() {
//        System.out.println("Merchant:");
//        System.out.println("Barang yang tersedia hari ini");
//        for (String item : listItem) {
//            System.out.println("# " + item);
//        }
//    }
//
//    public void interact() {
//        if (getHP() > 0) {
//            showItems();
//            System.out.println("Merchant: Hey heyy, ngapain nyerang");
//        } else {
//            System.out.println("# TIDAK BISA BELI, MERCHANT NGAMBEK");
//        }
//    }
//
////    public void attackedByPlayer(Player player) {
////        if (getHP() > 0) {
////            System.out.println("Merchant: Hey heyy, ngapain nyerang");
////            setHP(getHP() - 10);
////            System.out.println("HP Merchant saat ini: " + getHP());
////            if (getHP() <= 0) {
////                System.out.println("Merchant: Dah lah males jualan.");
////                System.out.println("# TIDAK BISA BELI, MERCHANT NGAMBEK");
////            }
////        } else {
////            System.out.println("Merchant: Aduh, saya tidak bisa berinteraksi, HP saya sudah habis.");
////            System.out.println("# TIDAK BISA BELI, MERCHANT NGAMBEK");
////        }
////    }
//}
//
//
//
//
//
//
//
//
