class Kaczor{
	public static void main(String[] args){

	Trapez t1= new Trapez();
	System.out.println("Metoda trapezow lin: "+t1.met_trapezow(1));
	System.out.println("Metoda trapezow kwa: "+t1.met_trapezow(2));
	System.out.println("Metoda trapezow sin: "+t1.met_trapezow(3));

	System.out.println();
	Trapez t2= new Trapez(1, 10);
	System.out.println("Metoda trapezow lin: "+t2.met_trapezow(1));
	System.out.println("Metoda trapezow kwa: "+t2.met_trapezow(2));
	System.out.println("Metoda trapezow sin: "+t2.met_trapezow(3));

	System.out.println();
	Trapez t3= new Trapez(1, 10, 100);
	System.out.println("Metoda trapezow lin: "+t3.met_trapezow(1));
	System.out.println("Metoda trapezow kwa: "+t3.met_trapezow(2));
	System.out.println("Metoda trapezow sin: "+t3.met_trapezow(3));

	System.out.println();
	Simpson s=new Simpson();
	System.out.println("Metoda Simpsona lin: "+s.met_simpson(1));
	System.out.println("Metoda Simpsona kwa: "+s.met_simpson(2));
	System.out.println("Metoda Simpsona sin: "+s.met_simpson(3));

	System.out.println();
	MonteCarlo mc=new MonteCarlo();
	System.out.println("Metoda MC lin: "+mc.met_mc(1));
	System.out.println("Metoda MC kwa: "+mc.met_mc(2));
	System.out.println("Metoda MC sin: "+mc.met_mc(3));




	}

}
