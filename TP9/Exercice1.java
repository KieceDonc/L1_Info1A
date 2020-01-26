public class Exercice1{

    public static void main(String args[]){
        int a,b;
        a = Lire.i("Entrer a");
        b = Lire.i("Entrer b");

        System.out.println(PGCD(a,b));
    }

    public static int PGCD(int a, int b){
        if(a%b==0){
            return b;
        }else{
            return PGCD(b,a%b);
        }
    }
}