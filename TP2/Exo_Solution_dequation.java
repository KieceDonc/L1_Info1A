public class Exo_Solution_dequation{

		public static void main(String[] args){
			
			double a,b,x;
			System.out.println("entrer a:");a=Lire.i();
			System.out.println("entrer b:");b=Lire.i();
			if(a!=0){
				x=(-b/a);
				System.out.println("La solution de l'équation est:"+x);
			}else {if(b==0){System.out.println("L'équation est indéterminée:");}
				else{System.out.println("L'équation n'a pas de solution");}}
				
			
		}
}
