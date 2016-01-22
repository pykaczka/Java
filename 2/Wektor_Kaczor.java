import java.util.*;
class Wektor_Kaczor{
	private	int a;
	private int b;
	private int c;
	Wektor_Kaczor(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	Wektor_Kaczor(Wektor_Kaczor wek){
		this.a=wek.a;
		this.b=wek.b;
		this.c=wek.c;
	}

	double dlugosc(){
		return Math.sqrt(Math.pow(this.a,2)+Math.pow(this.b,2)+Math.pow(this.c,2));
	}
	Wektor_Kaczor suma(Wektor_Kaczor wek){
		return new Wektor_Kaczor(this.a+wek.a, this.b+wek.b, this.c+wek.c);
	}
	Wektor_Kaczor pomnoz(int x){
		return new Wektor_Kaczor(this.a*x, this.b*x, this.c*x);
	}
	double skalarny(Wektor_Kaczor wek){
		return this.a*wek.a+this.b*wek.b+this.c*wek.c;
	}
	Wektor_Kaczor wektorowy(Wektor_Kaczor wek){
		return new Wektor_Kaczor(this.b*wek.c-this.c*wek.b, this.c*wek.a-this.a*wek.c, this.a*wek.b-this.b*wek.a);
	}
	double mieszany(Wektor_Kaczor wek1, Wektor_Kaczor wek2){
		return (this.wektorowy(wek1)).skalarny(wek2);
	}
	public String toString(){
		return "a="+this.a+"; b="+this.b+"; c="+this.c;
	}
}
