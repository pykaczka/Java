import java.util.*;
class Kaczor{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=0;
		while(x<=0 || x>3){
			System.out.println("Podaj opcję 1, 2 lub 3: ");	
			try{
				x=sc.nextInt();
			}catch(Exception e){
				System.out.println("Podałeś jakąś błędną wartość. Wybraliśmy za Ciebie wartość 1.");
				x=1;
			}
		}
		System.out.println("Poczekaj, program generuje wyniki.");
		System.out.println(x);
		switch(x){
			case 1:
			ArrayList<ArrayList<Double>> a1 = new ArrayList<ArrayList<Double>>();
			a1.add(new ArrayList<Double>( Arrays.asList(0.0, 0.0, 0.0, 0.2, 0.16, -0.04)));
			a1.add(new ArrayList<Double>( Arrays.asList(0.2, -0.26, 0.0, 0.23, 0.22, 0.10)));
			a1.add(new ArrayList<Double>( Arrays.asList(-0.15, 0.28, 0.0, 0.26, 0.24, 0.1)));
			a1.add(new ArrayList<Double>( Arrays.asList(0.85, 0.04, 0.0, -0.04, 0.84, 0.1)));
			IFS ifs1 = new IFS(a1);
			ifs1.met();
			ifs1.zapisz("data1.txt");
			
			case 2:
			ArrayList<ArrayList<Double>> a2 = new ArrayList<ArrayList<Double>>();
			a2.add(new ArrayList<Double>( Arrays.asList(0.7, 0.109682, 0.05, -0.109504, 0.893292, 0.1)));
			a2.add(new ArrayList<Double>( Arrays.asList(0.058474, -0.573783, -0.18, 0.191261, 0.175423, -0.21)));
			a2.add(new ArrayList<Double>( Arrays.asList(0.011, 0.0, 0.0, 0.0, 0.3, -0.35)));
			a2.add(new ArrayList<Double>( Arrays.asList(-0.067485, 0.579556, 0.21, 0.292311, 0.155291, -0.21)));
			IFS ifs2 = new IFS(a2);
			ifs2.met();
			ifs2.zapisz("data2.txt");
		
			case 3:
			ArrayList<ArrayList<Double>> a3 = new ArrayList<ArrayList<Double>>();
			a3.add(new ArrayList<Double>( Arrays.asList(0.255, 0.0, 0.3726, 0.0, 0.255, 0.6714)));
			a3.add(new ArrayList<Double>( Arrays.asList(0.255, 0.0, 0.1146, 0.0, 0.255, 0.2232)));
			a3.add(new ArrayList<Double>( Arrays.asList(0.255, 0.0, 0.6306, 0.0, 0.255, 0.2232)));
			a3.add(new ArrayList<Double>( Arrays.asList(0.37, -0.642, 0.6356, 0.642, 0.37, -0.00061)));
			IFS ifs3 = new IFS(a3);
			ifs3.met();
			ifs3.zapisz("data3.txt");
		}
		System.out.println("Zakończono. Wyniki znajdziesz w pliku data.txt.");
	}
}
