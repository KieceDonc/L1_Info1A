public class Exercice1{

    public static void main(String[] args){

        System.out.println("Entrer une chaîne de caractère");
        String mot = Lire.S();
        String miroir="";

        for(int x =0; x<mot.length();x++){
            miroir= mot.charAt(x) + miroir;
        }

        System.out.println(miroir);

        System.out.println("Choissisez la lettre que vous souhaiter supprimer");
        char ToDelete = Lire.c();

        String WordDelete ="";
        for(int x =0; x<mot.length();x++){
            char Current = mot.charAt(x);
            if(!(Current==ToDelete)){
                WordDelete=  Current + WordDelete;
            }
        }

        System.out.println(WordDelete);
    }
}