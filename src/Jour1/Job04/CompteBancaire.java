package Jour1.Job04;

public class CompteBancaire {

    private float BankBalance = 100;

    public void ShowBalance(){
        System.out.println("Votre solde est de " + this.BankBalance + "$.");
    }
    public void AddBalance(float sum){
        this.BankBalance += sum;
        System.out.println("Vous avez ajoutez " + sum + "$ a votre compte.");
        System.out.println("Nouveaux solde de " + this.BankBalance + "$.");
    }
    public void Withdraw(float sum){
        float buffer = this.BankBalance;

        if ((buffer -= sum) >= 0){
            this.BankBalance -= sum;
            System.out.println("Retrait de " + sum + "$ a votre compte.");
            System.out.println("Nouveaux solde de " + this.BankBalance + "$.");
        }
        else {
            System.out.println("Tentative de retrait de " + sum + "$, Solde insuffisant");
        }
    }

}
