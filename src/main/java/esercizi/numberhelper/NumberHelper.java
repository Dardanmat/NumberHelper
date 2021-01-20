package esercizi.numberhelper;

public class NumberHelper {
    
    private int number;

    public NumberHelper(int n) {
        number = n;
    }

    public boolean isEven() {
        return number%2 == 0;// ritorna true se number numero pari, altrimenti ritorna false
    }

    public boolean isOdd() {
        return number%2 != 0;// ritorna true se number è un numero dispari, altrimenti ritorna false
    }
    
    public int sum(int n){
        return number+n;// ritorna la somma tra number e n
    }

    public boolean isPrime() { // ritorna true se number è un numero primo, altrimenti ritorna false
        for(int i = 2; i < number/2; i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;    
    }

    public boolean isDivisibleBy(int n) {
       return n != 0;// ritorna true se number è divisibile per il parametro n, altrimenti ritorna false
    }
    
}
