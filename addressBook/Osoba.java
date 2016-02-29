class Osoba{
	private String imie;
	private String imie2="";
	private String nazwisko;

	Osoba(String a, String b){
		imie=a;
		nazwisko=b;
	}

	Osoba(String a, String a2, String b){
		imie=a;
		imie2=a2;
		nazwisko=b;
	}

	public String toString(){
		return this.imie + " " + this.imie2 + " " + this.nazwisko;
	}







}
