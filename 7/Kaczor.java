class Kaczor{
	public static void main(String[] args){
		Integer[][] tab1 = new Integer[4][4];
		for(int i=0; i<tab1.length;i++){
			for(int j=0; j<tab1[i].length;j++){
				tab1[i][j]=j;
			}
		}

		Analiza egz = new Analiza();
		System.out.println(egz.met1(tab1));
		System.out.println(egz.met2(tab1));

	}
}
