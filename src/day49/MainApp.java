package day49;

public class MainApp {
    public static void main(String[] args) {

        Contact c1=new Contact("Burcu","burcuturan737@gmail.com","565465452");
        Customer c2=new Customer("Uğur LTD.ŞTİ");
        c2.setOwner(c1);

        System.out.println(c1);
        System.out.println(c2);

        c2.deposit(733);
        try {
            c2.withdraw(1000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }


    }
}
