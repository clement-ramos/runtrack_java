package Jour2.Job04;

public class DivisionExercice {
    //Créez une méthode qui divise deux nombres. Si le dénominateur est zéro, lancez une
    //exception personnalisée DivisionParZeroException.

    private int numerator;

    private int denominator;

    public DivisionExercice(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void Divide(){

        try{
            if (this.denominator == 0){
                throw new DivisionParZeroException();
            }
            else{
                System.out.println(this.numerator / this.denominator);
            }
        }
        catch(DivisionParZeroException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        DivisionExercice divisionExercice = new DivisionExercice(10, 0);
        divisionExercice.Divide();
    }
}


