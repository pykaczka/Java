class Simpson extends Trapez{
	Simpson(){}
	double met_simpson(int p){
		double s=0;
		double st=0;
		double dx=(b-a)/n;
		double tmp=0;
		for(int i=1; i<=n; i++){
			tmp=a+i*dx;
			st+=met(p,tmp-dx/2);
			if(i<n) s+=met(p,tmp);
		}
		return (dx/6)*(met(p,a)+met(p,b)+2*s+4*st);
	}


}
