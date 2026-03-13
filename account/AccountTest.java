public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(21471, "Mahmud Aliyev", 781.5);
        System.out.println(account1);
        account1.deposit(250);
        System.out.println("After deposit: " + account1);
        try {
            account1.withdraw(1000);
        } catch (IllegalArgumentException e) {
            System.out.println("Insufficient funds: " + e.getMessage());
        }
        account1.withdraw(200);
        System.out.println("After withdrawal: " + account1);
    }
    
}
