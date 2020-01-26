public class ExerciceI{
    
    public static void main(String[] args){
        int n; 
        System.out.println("Enter le nombre d'itération que vous souhaitez :");
        n = Lire.i();
        for(int y=0;y<n;y++){
            if(!(y%2==0)){
                System.out.print(" ");
            }
            for(int x=0;x<(n*2);x++){
                if(!(x%2==0)){
                    System.out.print("*");
                } else{ System.out.print(" ");}
            }
            System.out.println(" ");
        }
    }
}