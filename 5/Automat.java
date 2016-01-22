import java.util.Arrays;
abstract class Automat{
	int[][] tab;
	int b;
	Automat(int a, int b){
		tab=new int[a][a];
		this.b=b;
	}
	abstract void metEw();
	void wypisz(){
		for(int[] i:tab){
			for(int j: i){
				if(j==0) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println("");
			
		}
	}

		


}
