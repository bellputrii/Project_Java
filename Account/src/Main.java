import package2.*;  // .* untuk copas semua class yang berada pada package, biar ngga manual satu2
import package1.*;

public class Main {
    public static void main(String[] args){
//        package2.Account account1 = new package2.Account();
        Account account1 = new Account();
        account1.username = "bell1";
        account1.setPassword("zzzz");
        System.out.println(account1.getPassword());
        account1.printName();

//        package1.Account account2 = new package1.Account();
//        account2.email = "aaaa@aaa.com";
//        Deparment hrd = new Deparment("HRD");
//        System.out.println(hrd.numberOfWorker);
//
//        Deparment finance = new Deparment("Finance");
//        System.out.println(finance.numberOfWorker);
//
//        Deparment Operation = new Deparment("Operation");
//        System.out.println(Operation.numberOfWorker);
//

    }
}
