import java.util.*;
class Analiza{
	static <T extends Number> boolean met1(T[][] tab){
		int tmp=0;
		for(T[] i: tab) tmp++;
		for(T[] i: tab) if(i.length!=tmp) return false;
		for(int i=0; i<tab.length;i++){
			for(int j=i; j<tab.length;j++){
				if(!(tab[i][j].equals(tab[j][i]))) return false;
			}
		}
		return true;
	}
	static <V extends Number> ArrayList<Double> met2(V[][] tab){
		if(met1(tab))throw new ArrayIndexOutOfBoundsException();
		ArrayList<Double> ar = new ArrayList<>();
		for(int i=0; i<tab.length;i++){
			for(int j=i; j<tab.length;j++){
				ar.add(((tab[i][j]).doubleValue()+(tab[j][i]).doubleValue())/2);
			}
		}
		return ar;
	}
}
