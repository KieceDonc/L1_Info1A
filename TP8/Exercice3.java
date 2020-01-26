public class Exercice3{

    public static void main(String[] args){
        String UserChoose ="";


        System.out.println("Entrer x : ");
        int x = Lire.i(); // Première opérande
        
        do{
            System.out.println("Entrer y : ");
            int y = Lire.i(); // Deuxième opérande

            System.out.println("Choississez votre opération : ");
            UserChoose = Lire.S();
            switch(UserChoose){
                case "+":{x=Addition(x,y);break;}
                case "-":{x=Soustraction(x,y);break;}
                case "*":{x=Multiplication(x,y);break;}
                case "/":{x=Division(x,y);break;}
                case "^":{x=Puissance(x,y);break;}
                case "=":{Affichage(x,y);break;}
            }
        }while(UserChoose!="q");
    }

    public static int Addition(int x,int y){
        int Result = x+y;
        System.out.println("Résultat = "+Result);
        return Result;
    }

    public static int Soustraction(int x,int y){
        int Result = x-y;
        System.out.println("Résultat = "+Result);
        return Result;
    }

    public static int Multiplication(int x, int y){
        int Result = x*y;
        System.out.println("Résultat = "+Result);
        return Result;
    }

    public static int Division(int x, int y){
        int Result=x/y;
        System.out.println("Résultat = "+Result);
        return Result;
    }

    public static int Puissance(int x, int y){
        int Result = (int) Math.pow(x,y);
        System.out.println("Résultat = "+Result);
        return Result;
    }

    public static void Affichage(int x, int y){
        System.out.println("x = "+x+" y = "+y);
    }
}