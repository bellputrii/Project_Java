import java.util.ArrayList;

class Entity {
    private int HP;
    private int level;

    public Entity(int HP, int level) {
        this.HP = HP;
        this.level = level;
    }

    public void displayInfo(){
        System.out.println("# ENTITY dengan HP: " + HP + " dan Level: " + level);
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

class Player extends Entity {
    private String name;

    public Player(int HP, int level, String name) {
        super(HP, level);
        this.name = name;
    }

    @Override
    public void displayInfo(){
        System.out.println("# PLAYER dengan NAMA: " + name + ", DAN Level: " + getLevel());
    }

    public void attack(Entity entity){
        if (getHP() > 0) {
            System.out.println("zombie: GRAAA!");
            entity.setHP(entity.getHP() - 10);
        } else {
            System.out.println("# YOU DIE, GAME OVER");
            System.out.println("# PLAYER SUDAH MATI ");
            System.out.println("# PLAYER SUDAH MATI ");
        }
    }

    public void attack(Merchant merchant){
        if (merchant.getHP() > 0) {
            System.out.println("Merchant: hey heyy, ngapain nyerang gwe");
            merchant.setHP(merchant.getHP() - 10);
        } else {
            System.out.println("Merchant: Dahlah gamau jualan aku -_-");
            System.out.println("# TIDAK BISA BELI MERCHANT NGAMBEK ");
        }
    }


    public void interact(Merchant merchant){
        if (getHP() > 0){
            merchant.interact();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Merchant extends Entity {
    private ArrayList<String> listItem;

    public Merchant(int HP, int level, ArrayList<String> listItem) {
        super(HP, level);
        this.listItem = listItem;
    }

    @Override
    public void displayInfo(){
        System.out.println("# MERCHANT DENGAN LEVEL " + getLevel());
    }

    public void showItems() {
        System.out.println("Merchant:");
        System.out.println("Barang yang tersedia hari ini");
        for (String item : listItem) {
            System.out.println("# " + item);
        }
    }

    public void interact() {
        showItems();
    }
}

class Zombie extends Entity {
    enum ZombieType {
        MEELE,
        RANGED
    }
    private ZombieType type;

    public Zombie(int HP, int level, ZombieType type) {
        super(HP, level);
        this.type = type;
    }

    @Override
    public void displayInfo(){
        System.out.println("# ZOMBIE DENGAN TIPE : " + type + ", DAN LEVEL: " + getLevel());
    }

    public void attack(Player player) {
        if (getHP() > 0) {
            if (type == ZombieType.MEELE) {
                System.out.println("player: UGHH");
                player.setHP(player.getHP() - 20);
            } else {
                System.out.println("player: UGHH");
                player.setHP(player.getHP() - 15);
            }
        } else {
            System.out.println("# ZOMBIE MATI");
            System.out.println("# ZOMBIE SUDAH MATI");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listItem = new ArrayList<String>() {
            {
                add("SWORD");
                add("SHIELD");
                add("POTION");
            }
        };

        Player P1 = new Player(50, 10, "Belda Cumil");
        Merchant merchant1 = new Merchant(20, 20, listItem);
        Zombie zombie1 = new Zombie(15, 5, Zombie.ZombieType.MEELE);
        Zombie zombie2 = new Zombie(30, 5, Zombie.ZombieType.RANGED);

        System.out.println("TES INFO OBJEK");
        P1.displayInfo();
        merchant1.displayInfo();
        zombie1.displayInfo();
        zombie2.displayInfo();
        System.out.println("=======================================\n");

        System.out.println("TES INTERAKSI MERCHANT");
        P1.interact(merchant1);

        System.out.println("\n");
        P1.attack(merchant1);
        P1.attack(merchant1);
        P1.attack(merchant1);
        System.out.println("====================================\n");

        System.out.println("TES SERANG ZOMBIE");
        P1.attack(zombie1);
        P1.attack(zombie1);
        P1.attack(zombie1);
        zombie1.attack(P1);
        System.out.println("=====================================\n");

        System.out.println("TES SERANG PLAYER");
        zombie2.attack(P1);
        zombie2.attack(P1);
        zombie2.attack(P1);
        zombie2.attack(P1);
        P1.interact(merchant1);
        P1.attack(zombie1);
    }
}
