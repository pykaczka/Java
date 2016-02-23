import java.util.*;
//klasa zawierająca funkcje
class L4f{
		int nx1, nx2, ny1, ny2; //LT		//współrzędne końców elektrod
		int nx3, nx4, ny3, ny4;	//RT
		int nx5, nx6, ny5, ny6; //LC
		int nx7, nx8, ny7, ny8; //RC
		int nx9, nx10, ny9, ny10; //LB
		int nx11, nx12, ny11, ny12; //RB

		int nz_0=0; 	//podłoże
		int nz_2=15;	//polozenie elektrod

		double v0; //napięcie na podstawie
		double v1, v2, v3, v4, v5, v6; // napięcie na elektrodach

		int dx, dy, dz;
		
	L4f(){
		nx1=nx5=nx9=0;
		nx2=nx10=20;
		nx6=10;
		nx3=nx11=30;
		nx4=nx8=nx12=50;
		nx7=40;
	
		ny1=ny3=50;
		ny2=ny4=40;
		ny5=ny7=30;
		ny6=ny8=20;
		ny9=ny11=10;
		ny10=ny12=0;

		v0=-350; 	//napięcie na podstawie
		v1=v2=v5=v6=450; 	//elektrody narożne
		v3=v4=300; 		//elektrody środkowe

		dx=dy=dz=10;
	}
		
	void zeruj(double[][][] t){
	//zeruje całą siatkę obliczeniową
		for(double[][] z:t){
			for(double[] y:z){
				for(double x:y){
					x=0;
				}
			}
		}
	}


	void dod_elektrody(double[][][] tab){
	//dodaje napięcie w komórkach odpowiadających elektrodom
		for(int y=0; y<tab[nz_2].length; y++){
			for(int x=0; x<tab[nz_2][y].length; x++){
				if(nx1<=x && x<nx2){
					if(ny1>y && y>=ny2) tab[nz_2][y][x]=v1;
				 	if(ny9>y && y>=ny10) tab[nz_2][y][x]=v5;
					if(x<nx6 && ny5>y && y>=ny6) tab[nz_2][y][x]=v3;
				}else if(nx3<=x && x<nx4){
					if(ny3>y && y>=ny4) tab[nz_2][y][x]=v2;
					if(ny11>y && y>=ny12) tab[nz_2][y][x]=v6;
					if(nx7<=x && ny7>y && y>=ny8) tab[nz_2][y][x]=v4;
				}
			}
		}

		for(int j=0; j<tab[nz_0].length;j++){
			for(int k=0; k<tab[nz_0][j].length;k++){
				tab[nz_0][j][k]=v0;
			}
		}
		
	}

	void fi_tot(double[][][] tab){
	//wylicza potencjał w komórkach siatki obliczeniowej
		double[][][] t= new double[tab.length][tab[0].length][tab[0][0].length];
			for(int i=1; i<t.length-1; i++){
				for(int j=1; j<t[i].length-1; j++){
					for(int k=1; k<t[i][j].length-1; k++){
						double tmp1=1./(2./Math.pow(dx,2)+2./Math.pow(dy,2)+2./Math.pow(dz,2));
						double tmp2=(tab[i+1][j][k]+tab[i-1][j][k])/Math.pow(dz,2);
						double tmp3=(tab[i][j+1][k]+tab[i][j-1][k])/Math.pow(dy,2);
						double tmp4=(tab[i][j][k+1]+tab[i][j][k-1])/Math.pow(dz,2);
						t[i][j][k]=tmp1*(tmp2+tmp3+tmp4);
					}
				}
			}
	//dodaje wartości potencjału na brzegach siatki
		for(int j=0; j<t[0].length; j++){
			for(int k=0; k<t[0][j].length; k++){
				t[t.length-1][j][k]=t[t.length-2][j][k];
			}
		}
		for(int i=0; i<t.length; i++){
			for(int k=0; k<t[i][0].length; k++){
				t[i][0][k]=t[i][1][k];
				t[i][t[i].length-1][k]=t[i][t[i].length-2][k];
			}
		}
		for(int i=0; i<t.length; i++){
			for(int j=0; j<t[i].length; j++){
				t[i][j][0]=t[i][j][1];
				t[i][j][t[i][j].length-1]=t[i][j][t[i][j].length-2];
			}
		}
		
		for( int i=0; i<t.length; i++){
			for(int j=0; j<t[i].length; j++){
				for(int k=0; k<t[i][j].length; k++){
					tab[i][j][k]=t[i][j][k];
				}
			}
		}
		dod_elektrody(tab);
	}
}
