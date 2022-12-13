package day49;

public class Customer implements Accountable{
    private int id;
    private String name;
    private Contact owner;
    private String address;
    private String phoneNumber;
    private static int ID_GENERATOR;
    private double balance;




    public Customer() {
    }


    public Customer( String name) {
        this.id = ++ID_GENERATOR;
        this.name = name;
        this.owner = owner;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getOwner() {
        return owner;
    }

    public void setOwner(Contact owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                '}';
    }

    @Override
    public void deposit(double amount) {
        balance+=amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException{
        if (amount>balance) throw new InsufficientBalanceException();
        balance-=amount;
    }
}
