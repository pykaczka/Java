import java.util.Arrays;
class A2D extends Automat{
	int n;
	A2D(int a, int b, int c){
		super(a, b);
		for(int i=0; i<b; i++){
			for(int j=0; j<b; j++){
				tab[a/2-b/2+i][a/2-b/2+j]=1;
			}
		}
		n=c;
	}
	
	void metEw(){
		for(int k=0; k<n; k++){
			int[][] licznik=new int[tab[0].length][tab[0].length];
			for(int i=0; i<tab[0].length-1; i++){
				for(int j=0; j<tab[0].length-1; j++){
					if(i==0 && j==0) licznik[i][j]+=tab[i][j+1]+tab[i+1][j]+tab[i+1][j+1];
					else if(i==0) licznik[i][j]+=tab[i][j+1]+tab[i][j-1]+tab[i+1][j]+tab[i+1][j+1]+tab[i+1][j-1];	
					else if(j==0) licznik[i][j]+=tab[i][j+1]+tab[i+1][j+1]+tab[i-1][j+1]+tab[i+1][j]+tab[i-1][j];
					else licznik[i][j]+=tab[i-1][j-1]+tab[i-1][j]+tab[i-1][j+1]+tab[i][j-1]+tab[i][j+1]+tab[i+1][j-1]+tab[i+1][j]+tab[i+1][j+1];
				}
			}
			for(int i=0; i<tab[0].length-1; i++){
				for(int j=0; j<tab[0].length-1; j++){
					if(licznik[i][j]>4) tab[i][j]=0;
					else if(licznik[i][j]<4 && licznik[i][j]>0) tab[i][j]=1;
				}
			}
			System.out.println("");	
			wypisz();
			System.out.println("");	
		}
	}
}
