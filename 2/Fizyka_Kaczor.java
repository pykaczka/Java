class Fizyka_Kaczor{
	static double celsiusToKelvin(double x){
		return x+273;
	}
	static double kelvinToCelsius(double x){
		return x-273;
	}
	static double enPot(double m, double h){
		double g=9.81;
		return m*g*h;
	}
	static double enKin(double m, double v){
		return m*v*v/2;
	}
	static double strInd(Wektor_Kaczor b, Wektor_Kaczor s){
		return b.skalarny(s);
	}
	static Wektor_Kaczor silaLorentza(double q, Wektor_Kaczor v, Wektor_Kaczor b){
		return (v.pomnoz((int)q)).wektorowy(b);
	}
	static double pracaLorentza(Wektor_Kaczor s, Wektor_Kaczor x){
		return s.skalarny(x);
	}
	static double pracaLorentza(double q, Wektor_Kaczor v, Wektor_Kaczor b, Wektor_Kaczor x){
		return ((v.pomnoz((int)q)).wektorowy(b)).skalarny(x);
	}






}
