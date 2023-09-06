package Jour1.Job04;

public class BanqueTest {
    public static void main(String[] args) {
        CompteBancaire myBank = new CompteBancaire();

        myBank.ShowBalance();
        myBank.AddBalance(20);
        myBank.Withdraw(200);
        myBank.Withdraw(90);
    }
}
