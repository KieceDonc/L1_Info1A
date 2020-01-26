public class Exercice2{

    public static void main(String args[]){
        int n = Lire.i("Entrer le nième nombre de Fibonacci");

        System.out.println(Fibonacci(n));

    }

    public static int Fibonacci(int n){
        if(n==0){
            return 0;
        }if(n==1){
            return 1;
        }else{
            return (Fibonacci(n-1)+Fibonacci(n-2));
        }
    }
}