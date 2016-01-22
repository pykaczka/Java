import java.util.Arrays;
class Lab_05{
	public static void main(String[] args){
		System.out.println("Tworzenie macierzy jednostkowej");
		for(int i[]:Macierz.met(5)){
			System.out.println(Arrays.toString(i));
		}
		
		System.out.println("");
		System.out.println("Tworzenie macierzy z losowanymi wartościami");
		for(int i[]:Macierz.met(5, 100)){
			System.out.println(Arrays.toString(i));
		}

		System.out.println("");
		System.out.println("Tworzenie macierzy w zależności od wartości flagi");
		for(int i[]:Macierz.met(5, 100, false)){
			System.out.println(Arrays.toString(i));
		}
		System.out.println("------------");
		for(int i[]:Macierz.met(5, 100, true)){
			System.out.println(Arrays.toString(i));
		}

		System.out.println("");
		System.out.println("Sumowanie macierzy");
		int[][] tab1=Macierz.met(5, 10);
		int[][] tab2=Macierz.met(5, 10);
		for(int i[]:tab1){
			System.out.println(Arrays.toString(i));
		}
		System.out.println("");
		for(int i[]:tab2){
			System.out.println(Arrays.toString(i));
		}
		System.out.println("----------");
		for(int i[]:Macierz.suma(tab1, tab2)){
			System.out.println(Arrays.toString(i));
		}

		
		System.out.println("");
		System.out.println("Transponowanie macierzy");
		for(int i[]:tab1){
			System.out.println(Arrays.toString(i));
		}
		Macierz.trans(tab1);
		System.out.println("");
		for(int i[]:tab1){
			System.out.println(Arrays.toString(i));
		}
		
		System.out.println("");
		System.out.println("Iloczyn macierzy");
		for(int i[]:tab1){
			System.out.println(Arrays.toString(i));
		}
		System.out.println("");
		for(int i[]:tab2){
			System.out.println(Arrays.toString(i));
		}

		System.out.println("---------");
		for(int i[]:Macierz.iloczyn(tab1, tab2)){
			System.out.println(Arrays.toString(i));
		}

		System.out.println("");
		System.out.println("Sprawdzanie czy macierz jest ortogonalna");
		if(Macierz.ifort(tab1)) System.out.println("Ta macierz jest ortogonalna");
		else System.out.println("Ta macierz nie jest ortogonalna");







	}
}
