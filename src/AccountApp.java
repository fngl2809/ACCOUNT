public class AccountApp {
    public static void main(String[] args) throws Exception {
    Account myAccount = new Account("12345", 0, "Fiona Anggilia",
    "anggiliafiona@gmail.com", "08126108410");
    myAccount.deposit(1000000);
    System.out.println("jumlah balance : "+myAccount.getBalance());
    myAccount.withdraw(1000000);
    myAccount.withdraw(1000000);
    myAccount.deposit(1000000);
    myAccount.withdraw(500000);
    System.out.println("jumlah balance : "+myAccount.getBalance());
    }
}