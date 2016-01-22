import java.util.*;
class Lab3{
	public static void main(String args[]){
//----------------------------ZAD1------------------
/*		int n=11;
		double[] tab =  new double[n];
		for(int i=0; i<n; i++){
			tab[i]=i;
		}
		System.out.println("Tablica: ");
		for(double d:tab) System.out.print(d+" ");
		
		double tmp;
		for(int i=0; i<n/2; i++){
			tmp=tab[i];
			tab[i]=tab[tab.length-1-i];
			tab[tab.length-1-i]=tmp;
		}
		System.out.println();
		System.out.println("Tablica odwrotna: ");
		for(double d:tab) System.out.print(d+" ");
		System.out.println("");
*/

//-------------------------ZAD2----------------------
/*		int n=8;
		int[] tab = new int[n];
		int x=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Podaj wartosc calkowita różną od zera mniejszą od 256: ");
		while(x<=0){
			x=sc.nextInt();
			if(x>0)	break;
			else System.out.println("Podaj wartosc calkowita różną od zera: ");
		}

		int tmp=0;
		int i=0;
		boolean b = true;
		while(x>0){
			if(i>n-1){
				System.out.println("Za duza liczba.");
				b=false;			
				break;
			}
			tmp=x%2;
			x/=2;
			tab[n-1-i]=tmp;
			i++;	
		}
		if(b){
			tmp=0;
			System.out.println(Arrays.toString(tab));	
			for(int j=0; j<n; j++) tmp+=tab[j]*Math.pow(2,n-j-1);
			System.out.println("Liczba podana to: "+tmp);
		}
*/
//------------------------ZAD3---------------------------
		int n=100;
		double A=5;
		double B=2.5;
		Random r=new Random();	

		double tab[][] = new double[n][2];
		for(int i=0; i<n; i++){
			tab[i][0]=i;
		}
		for(int i=0; i<n; i++){
			tab[i][1]=tab[i][0]*A+B+r.nextDouble();
		}
		System.out.println(Arrays.deepToString(tab));
		
		double s=0;
		double xsr=0;
		double ysr=0;
		for(int i=0; i<n; i++){
			xsr+=tab[i][0];
			ysr+=tab[i][1];
		}
		xsr/=n;
		ysr/=n;


		double D=0;
		for(int i=0; i<n; i++) D+=Math.pow((tab[i][0]-xsr),2);
		
		double a=0;
		for(int i=0; i<n; i++) a+=(tab[i][0]-xsr)*tab[i][1];
		a/=D;

		double b= ysr-a*xsr;
		
		System.out.println("a= "+a+" ; b= "+b);

		double dy=0;
		s=0;
		for(int i=0; i<n; i++) s+=Math.pow((tab[i][1]-a*tab[i][0]-b),2);
		dy=Math.sqrt(s/(n-2));

		double da=dy/Math.sqrt(D);
		double db=dy*Math.sqrt(1./n+Math.pow(xsr,2)/D);

		System.out.println("delta a= "+da+" ; delta b= "+db);

	}
}
