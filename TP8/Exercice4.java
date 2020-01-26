public class Exercice4{

    public static void main(String[] args){
        boolean PlayerWishToPlay = false;
        do{
            int[][] Damier = Initialisation();

            for(int CurrentPawn =0;CurrentPawn<30;CurrentPawn++){

                
                int Currentrandom = (int)(Math.random()*9+1);
                boolean PawnHaveBeenPut=false;
                do{
                    Affichage(Damier);
                    System.out.println("Vous avez tiré le : "+Currentrandom+" !");
                    System.out.println("Dans quel ligne souhaitez-vous placer votre "+Currentrandom+" ?");
                    int Line = Lire.i()-1;
                    System.out.println("Dans quel colonne souhaitez-vous placer votre "+Currentrandom+" ?");
                    int Colums = Lire.i()-1;
                    if(PawnCanBePut(Damier,Colums,Line)==true){
                        if(LigneCorrecte(Damier,Line,random)==true){
                            if(ColonneCorrecte(Damier,Colums,random)==true){
                                Damier[Line][Colums]=Currentrandom;
                                PawnHaveBeenPut=true;
                            }else{
                                Affichage(Damier);
                                System.out.println("Si vous placer ce pion ici la colonne est incorrecte !");
                            }
                        }else{
                            Affichage(Damier);
                            System.out.println("Si vous placer ce pion ici la ligne est incorrecte !");
                        }
                    }else{
                        Affichage(Damier);
                        System.out.println("Vous ne pouvez pas placer ce pion ici !");
                    }
                }while(PawnHaveBeenPut==false);

            }

            System.out.println("Souhaitez-vous rejouer ? (0 = oui, 1 = non");

            if(Lire.i()==0){
                PlayerWishToPlay=true;
            }else{
                PlayerWishToPlay=false;
            }

        }while(PlayerWishToPlay==true);
    }

    public static int[][] Initialisation(){
        int[][] Damier = new int[7][7];

        for(int y=0;y<Damier.length;y++){
            for(int x=0;x<Damier[y].length;x++){
                Damier[y][x]=0;
            }
        }
        return Damier;
    }

    public static void Affichage(int[][] Damier){
        System.out.println("Damier :");

        for(int y = 0;y<Damier.length;y++){
            for(int x=0;x<Damier[y].length;x++){
                System.out.print(Damier[y][x]+" ");
            }
            System.out.println("");
        }
    }

    public static boolean LigneCorrecte(int[][] Damier,int CheckHere,int random){

        int ResultLigne = random;
        for(int x=0;x<Damier[CheckHere].length;x++){
            ResultLigne+=Damier[CheckHere][x];
        }

        return ResultLigne<=11;
    }

    public static boolean ColonneCorrecte(int[][] Damier,int CheckHere,int random){
        
        int ResultColonne = random;
        for(int y=0;y<7;y++){
            ResultColonne+=Damier[y][CheckHere];
        }

        return ResultColonne<=11;
    }

    public static boolean PawnCanBePut(int[][] Damier,int x,int y){
        return Damier[x][y]==0;
    }
}