public class Calka{
	double a, b;
	int n;
	Calka(){
		a=0;
		b=1;
		n=1000;
	}
	double met(int p, double x){
		double q, r;
		q=1;
		r=0;
		switch(p){
			case 1:
				return q*x+r;
			case 2 :
				return q*x*x+r;
			case 3 :
				return Math.sin(x);
		}
		return 0;
	}










}
