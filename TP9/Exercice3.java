public class Exercice3{

    public static void main(String args[]){
        System.out.println("Entrer la chaîne que vous souhaitez vérifier ");
        String s = Lire.S();
        boolean palindrome = palindrome(s);
        if(palindrome==false){
            System.out.println("Non");
        }else{
            System.out.println("Oui");
        }

    }

    public static boolean palindrome(String s){
        if(s.charAt(0)!=s.charAt(s.length()-1)){
            return false;
        }else if(s.length()==1){
            return true;
        }else if(s.length()==2){
            if(s.charAt(0)!=s.charAt(s.length()-1)){
                return false;
            }else{
                return true;
            }
        }else{
            String ToReturn = "";
            for(int x= 1;x<s.length()-1;x++){
                ToReturn+=s.charAt(x);
            }
            return palindrome(ToReturn);
        }
    }
}