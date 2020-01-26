public class Exercice2{

    public static void main(String[] args){
        String NumeroSecu ="";
        NumeroSecu+=InputNumber("Entrer votre sexe ( 1 = Masculin, 2 = féminin ) :",1,[1,2]);
        String[] ListAnneeDeNaissance = AnneeDeNaissance();
        NumeroSecu+=InputNumber("Entrer votre année de naissance à 2 chiffres ( Exemple pour 1978, j'entre 78 ) :",2,ListAnneeDeNaissance);
        NumeroSecu+=InputNumber("Entrer votre mois de naissance à 2 chiffres ( Exemple pour décembre, j'entre 12 ) :",2,[1,2,3,4,5,6,7,8,9,10,11,12]);
        String[] DepartFr = DepartementFr();
        NumeroSecu+=InputNumber("Entrer votre département de naissance à 2 chiffres ( Exemple pour l'Ardèche, j'entre 08 ) :",2,DepartFr);
        NumeroSecu+=InputNumber("Entrer votre code commune de naissance à 3 chiffres ( Exemple Dijon 231 ): ",3,null);
        NumeroSecu+=InputNumber("Entrer votre numéro de dossier à 3 chiffres: ",3,null)

    }

    public String InputNumber(PrintString,ExpectedLength,ExceptedOutpout){
        String input ="";
        boolean Error = false;
        do{
            System.out.println(PrintString);
            input = Lire.S();
            
            if(CheckNumber(Number)==false){
                Error=true;
                System.out.println(input+" n'est pas un chiffre");
                if(ExceptedOutpout!==null){
                    if(CheckExceptedOutpout(input,ExceptedOutpout)==false{
                    Error=true;
                    System.out.println("Ce / ces chiffres ne sont pas ceux attendus");
                    }
                }
                if(CheckLengthInputNumber(input, ExpectedLength)==false){
                    Error=true;
                    System.out.println("Vous avez entrer "+input.length+" caractère(s) tandis que "+ExpectedLength+" sont attendus");
                }
            } 
        }while(Error=true);

        return input;
    }

    public boolean CheckNumber(input){
        boolean IsNumber = false;
        if(input==Integer.parseInt(input)){
            IsNumber==true;
        }
        return IsNumber;
    }

    public boolean CheckLength(input,ExpectedLength){
        boolean LengthOk = false;
        if(input.length()==ExpectedLength){
            LengthOk==true;
        }
        return LengthOk;
    }

    public boolean CheckExceptedOutpout(input,ExceptedOutpout){
        boolean ExceptedOutpout = false;
        for(int x = 0; x<ExceptedOutpout.length;x++){
            if(ExceptedOutpout[x]==Integer.parseInt(input)){
                ExceptedOutpout==true;
            }
        }
        return ExceptedOutpout;
    }

    public String[] AnneeDeNaissance(){
        String[] AnneeNaissance=new int(100);
        for(int x =0; x<99;x++){
            if(x>=0||x<10){
                switch(x){
                    case 0:{int[0]="00";break}
                    case 1:{int[1]="01";break}
                    case 2:{int[2]="02";break}
                    case 3:{int[3]="03";break}
                    case 4:{int[4]="04";break}
                    case 5:{int[5]="05";break}
                    case 6:{int[6]="06";break}
                    case 7:{int[7]="07";break}
                    case 8:{int[8]="08";break}
                    case 9:{int[9]="09";}

                }
            }else{
                String[x]=Integer.parseInt(x);
            }
        }
        return AnneeNaissance;
    }

    public String[] DepartementFr(Annee){
        String[] Departement=new int(100);
        Annee.remove(0);
        Departement=Annee;
        Departement(99)=100;
        Departement(100)=101;
        return Departement;
        System.out.println(String.valueOf(Departement));
    }

}



