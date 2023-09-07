package Jour2.Job01;

public class BanqueExercice {
    //Étendez la classe CompteBancaire du Jour 1 en introduisant la notion de compte
    //courant et compte épargne. Le compte épargne devrait avoir un taux d'intérêt et une
    //méthode pour ajouter l'intérêt.

    private float BankBalance;
    private float SavingsBalance;
    private  int Interest;

    public BanqueExercice(float BankBalance, float SavingsBalance, int Interest){
        this.BankBalance = BankBalance;
        this.SavingsBalance = SavingsBalance;
        this.Interest = Interest;
    }
    public void ShowInformations(){
        System.out.println("Votre solde est de " + this.BankBalance + "$.");
        System.out.println("Votre solde d'épargne est de " + this.SavingsBalance + "$.");
        System.out.println("Votre taux d'intérêt est de " + this.Interest + "%.");
    }
    public void AddIntererst(){
        this.SavingsBalance += this.SavingsBalance * (this.Interest / 100);
        System.out.println("Vous avez ajoutez " + (this.SavingsBalance * this.Interest) / 100 + "$ d'intérêt a votre compte.");
        System.out.println("Nouveaux solde de " + this.SavingsBalance + "$.");
    }

    public static void main(String[] args) {
        BanqueExercice Bank = new BanqueExercice(100, 200, 2);
        Bank.ShowInformations();
        Bank.AddIntererst();
    }

}


