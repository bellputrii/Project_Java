//public class Zombie extends Entity{
//    enum ZombieType{
//        MEELE,
//        RANGED
//    }
//    private ZombieType type;
//
//    public Zombie(int HP, int level, ZombieType type) {
//        super(HP, level);
//        this.type = type;
//    }
//
//    @Override
//    public void displayInfo(){
//        System.out.println(" ZOMBIE DENGAN TIPE : " + type + ", DAN LEVEL: " + getLevel());
//    }
//
//    public void attack(Player player) {
//        if (getHP() > 0) {
//            if (type == ZombieType.MEELE) {
//                    System.out.println("player: UGHH");
//                player.setHP(player.getHP() - 20);
//            } else {
//                System.out.println("player: UGHH");
//                player.setHP(player.getHP() - 15);
//            }
//        } else {
//            System.out.println("# ZOMBIE MATI");
//            System.out.println("# ZOMBIE SUDAH MATI");
//
//        }
//    }
//}
