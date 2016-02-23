import java.util.*;
import java.io.*;
class QuantumWell{
	public static void main(String args[]){
		int nz=25; 	//komórki siatki obliczeniowej
		int nx=50;
		int ny=50;
		double[][][] tab = new double[nz][ny][nx];	//siatka obliczeniowa

		int nz_1=10;	//położenie studni kwantowej
		int n_zew=50; 	//liczba iteracji zew
		int n_wew=100; //liczba iteracji wew

		L4f qw1=new L4f();
		qw1.zeruj(tab);
		qw1.dod_elektrody(tab);

		for(int i=0; i<n_zew; i++){
			for(int j=0; j<n_wew; j++){
				qw1.fi_tot(tab);
			}
			//pozwala na obserwację zmian potencjału w studni kwantowej w zależności od ilości iteracji
			System.out.println(i+": "+tab[nz_1][ny/2][nx/2]); 
		}

		//tworzenie stringa do zapisu do pliku
		String s;
		s="";
		for(int i=0; i<ny; i++){
			for(int j=0; j<nx; j++){
				s+=tab[nz_1][i][j]+"	";
			}
			s+="\n";
		}

		//zapis do pliku wartości potencjału znajdującego się na poziomie studni kwantowej
		try{
    		FileWriter fw=new FileWriter("test.txt");
    		fw.write(s);
    		fw.close();
		}catch(IOException e){
		}

	}
}
