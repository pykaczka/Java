import java.util.Random;
import java.util.Arrays;
class Macierz{
	static int[][] met(int x){
		int[][] tab = new int[x][x];
		for(int i=0; i<x; i++){
			tab[i][i]=1;
		}
		return tab;
	}
	static int[][] met(int x, int y){
		int[][] tab = new int[x][x];
		Random r = new Random();
		for(int i=0; i<x; i++){
			for(int j=0; j<x; j++){
				tab[i][j]=r.nextInt(y);
			}
		}
		return tab;
	}

	static int[][] met(int x, int y, boolean flag){
		if(flag){
			int[][] tab = new int[x][x];
			Random r = new Random();
			for(int i=0; i<x; i++){
				for(int j=0; j<x; j++){
					tab[i][j]=tab[j][i]=r.nextInt(y);
				}
			}
			return tab;
		}
		return met(x, y);
	}


	static int[][] suma(int[][] a, int[][] b){
		int[][] tab=new int[a.length][a[0].length];
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				tab[i][j]=a[i][j]+b[i][j];
			}
		}
		return tab;
	}


	static void trans(int[][] a){
		int tmp;
		for(int i=0; i<a.length; i++){
			for(int j=i; j<a[i].length; j++){
				tmp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=tmp;
			}
		}
	}


	static int[][] iloczyn(int[][] a, int[][] b){
		int[][] tab=new int[a.length][a[0].length];

		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[0].length-1; j++){
				for(int n=0; n<a.length-1; n++){
					tab[i][j]+=a[i][n]*b[n][i];
				}
			}
		}
		return tab;
		
	}

	static boolean ifort(int[][] a){
		int[][] tab=new int[a.length][a[0].length];
		for(int i=0; i<a.length; i++){
			tab[i]=Arrays.copyOf(a[i], a[i].length);
		}
		trans(tab);

		int[][] tab2=new int[a.length][a[0].length];
		tab2=met(a.length);
		boolean flag=true;

		for(int i[]:iloczyn(a,tab)){
			System.out.println(Arrays.toString(i));
		}
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[0].length; j++){
				if(iloczyn(a,tab)[i][j]!=tab2[i][j]){
					flag=false;
					break;
				}
			}
		}
		return flag;
	}






}
