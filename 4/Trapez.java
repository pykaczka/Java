class Trapez extends Calka{
	Trapez(){}
	Trapez(double a, double b){
		super.a=a;
		super.b=b;
	}
	Trapez(double a, double b, int n){
		super.a=a;
		super.b=b;
		super.n=n;
	}
	double met_trapezow(int p){
		double s=0;
		double dx=(b-a)/n;
		for(int i=1; i<n; i++) s+=met(p,a+i*dx);
		s+=(met(p,a)+met(p,b))/2;
		s=s*dx;
		return s;			
	}











}
