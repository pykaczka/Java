import java.util.*;
class Kaczor_04{
	public static void main(String args[]){
	System.out.println("---------WEKTORY----------");
	Wektor_Kaczor v1=new Wektor_Kaczor(1,2,3);
	System.out.println("v1: "+v1);
	Wektor_Kaczor v2=new Wektor_Kaczor(v1);
	System.out.println("v2: "+v2);
	System.out.println("dlugosc v1: "+v1.dlugosc());
	System.out.println("suma v1+v2: "+v1.suma(v2));
	System.out.println("v1*2: "+v1.pomnoz(2));
	System.out.println("skalarnie v1 i v2: "+v1.skalarny(v2));
	System.out.println("wektorowy v1 i v2: "+v1.wektorowy(v2));
	Wektor_Kaczor v3=new Wektor_Kaczor(7, 8, 3);
	System.out.println("v3: "+v3);
	Wektor_Kaczor v4=new Wektor_Kaczor(10, 3, 7);
	System.out.println("v4: "+v4);
	System.out.println("mieszany v1, v3 i v4: "+v1.mieszany(v3, v4));
	System.out.println();
	
	System.out.println("----------STOPNIE----------");
	Scanner sc=new Scanner(System.in);
	System.out.println("Podaj stopnie Celsjusza, zamienimy na Kelwiny");
	double c=sc.nextDouble();
	System.out.println("Celsjusze na Kelwiny: "+c+" => "+Fizyka_Kaczor.celsiusToKelvin(c));
	System.out.println("Podaj Kelwiny, zamienimy na Celsjusze");
	double k=sc.nextDouble();
	System.out.println("Kelwiny na Celsjusze: "+k+" => "+Fizyka_Kaczor.celsiusToKelvin(k));
	System.out.println();

	System.out.println("----------FIZYKA----------");
	System.out.println("Energia potencjalna dla m=10, h=5: "+Fizyka_Kaczor.enPot(10, 5));
	System.out.println("Energia kinetyczna dla m=10, v=5: "+Fizyka_Kaczor.enKin(10, 5));
	System.out.println("Indukcja v3 i v4: "+Fizyka_Kaczor.strInd(v3, v4));
	Wektor_Kaczor v5 = new Wektor_Kaczor(1,5,9);
	Wektor_Kaczor v6 = new Wektor_Kaczor(1,2,3);
	Wektor_Kaczor v7 = new Wektor_Kaczor(2,3,2);
	System.out.println("Sila Lorentza: "+Fizyka_Kaczor.silaLorentza(10, v5, v6));
	System.out.println("Praca Lorentza: "+Fizyka_Kaczor.pracaLorentza(v5, v6));
	System.out.println("Praca Lorentza2: "+Fizyka_Kaczor.pracaLorentza(10, v5, v6, v7));
	}
}
