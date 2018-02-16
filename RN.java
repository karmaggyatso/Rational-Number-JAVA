
public class RN {
    private int numerator;
    private int denominator;

    public RN() {
        numerator  = 0;
        denominator = 1;
    }

    public RN(int newNumertor, int newDenominator) {
        setNumerator(newNumertor);
        setDenominator(newDenominator);
    }
    public void setNumerator(int newNumerator) {
        numerator = newNumerator;
    }

    public void setDenominator(int newDenominator) {
        denominator = newDenominator;
    }

    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }

    public int simplify() {
        int check, initial1, initial2;

        if (numerator < denominator) {
            check = numerator;
        }
        else
            check = denominator;

        for (int i = 1; i <= check; i++) {
            if (i>1) {
                if (numerator % i == 0 && denominator % i == 0) {
                    initial1 = numerator / i;
                    initial2 = denominator / i;
                    System.out.println("The simplified form is: " + initial1 + "/" + initial2);
                }
            }
        }
        return 0;
    }

    public int GCD(){
        int check, ans = 0;

        if (numerator < denominator) {
            check = numerator;
        }
        else
            check = denominator;

        for (int i = 1; i <= check; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                ans = i;
            }
        }
        return ans;
    }

}
