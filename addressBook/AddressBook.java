import java.util.*;
import java.io.*;

class AddressBook{
	public static void main(String[] args){
		System.out.println("Hello!\nYou have entered my simple address book. Enjoy using it!\n");
		System.out.println("This is your address book:");

		Map<String, Osoba> kontakty = new HashMap<String, Osoba>();
		FileReader fr=null;
		String l="";
		try{
			 fr=new FileReader("address_book.txt");
		}catch(Exception e){
			System.out.println("Error. You may not have address_book.txt file.");
		}
		BufferedReader bfr=new BufferedReader(fr);
		try{
			while((l=bfr.readLine())!=null){
				String a[]=new String[4];
				System.out.println(l);
				int i=0;
				String k="";
				for(int j=0; j<l.length(); j++){
					if(l.charAt(j)!=" ".charAt(0)){
						k+=l.charAt(j);
					}
					else{
						a[i]="";
						a[i]=k;
						k="";
						i++;
					}
					a[a.length-1]=k;
				}
				if(a[2]==null) kontakty.put(a[0], new Osoba(a[1], a[3]));
				else kontakty.put(a[0], new Osoba(a[1], a[2], a[3]));
			}
		}catch(Exception e){
			System.out.println("Error.");
		}
		try{
			fr.close();
		}catch(Exception e){
			System.out.println("Error.");
		}

		System.out.println("\nWhat do you want to do now?");
		Scanner in=new Scanner(System.in);
		boolean flag=true;
		while(flag){
			System.out.println("\ns - see all contacts,\na - add new contact,\nn - search contact by number,\nm - search contact by name,\nr - remove contact,\ne - edit contact names,\nf - edit contact number,\nx - exit");
			System.out.println("Press key to choose an action and press enter:");
			String tmp=in.next();
			switch(tmp){
				case "s":
					for(Map.Entry<String,Osoba> entry: kontakty.entrySet()){
						System.out.println(entry.getKey()+"	"+entry.getValue());
					}
					System.out.println("");
					break;
				case "a":
					System.out.println("-----Adding new contact.-----");
					boolean flag2=true;
					while(flag2){
						System.out.println("Enter phone number (no spaces).");
						tmp=in.next();
						if(tmp.length()==9) flag2=false;
						else System.out.println("You must have 9 numbers.");
						try{
							if(Double.parseDouble(tmp)<100000000) throw new Exception();
						}catch(Exception e){
							flag=true;
							System.out.println("Only numbers! Phone number can't start with '0'.Try again");
						}
					}
					System.out.println("Enter name.");
					String imie=in.next();
					System.out.println("Enter second name or 0.");
					String imie2=in.next();
					System.out.println("Enter surname.");
					String nazwisko=in.next();
					if(imie2.equals("0"))
						kontakty.put(tmp, new Osoba(imie, nazwisko));
					else
						kontakty.put(tmp, new Osoba(imie, imie2, nazwisko));
					System.out.println("New contact added!");
					break;

				case "n":
					System.out.println("-----Searching for the owner of the number.-----");
					System.out.println("Enter number.");
					tmp=in.next();
					if(kontakty.containsKey(tmp)) System.out.println(kontakty.get(tmp));
					else System.out.println("It looks like you do not have this number in your address book\n");
					break;

				case "m":
					System.out.println("-----Searching for the number.-----");
					System.out.println("Enter name/surname.");
					tmp=in.next();
					System.out.println("Matching results:");
					for(Map.Entry<String,Osoba> entry: kontakty.entrySet()){
						if(entry.getValue().getImie().equals(tmp)) System.out.println(entry.getValue());
						else if(entry.getValue().getImie2().equals(tmp)) System.out.println(entry.getValue());
						else if(entry.getValue().getNazwisko().equals(tmp)) System.out.println(entry.getValue());
					}
					break;

				case "r":
					System.out.println("-----Removing number.-----");
					System.out.println("Enter number.");
					tmp=in.next();
					if(kontakty.containsKey(tmp)) System.out.println(kontakty.remove(tmp));
					else System.out.println("It looks like you do not have this number in your address book");
					break;

				case "e":
					System.out.println("-----Editing names.-----");
					System.out.println("Enter number.");
					tmp=in.next();
					if(kontakty.containsKey(tmp)){
						System.out.println("Enter name.");
						String i=in.next();
						System.out.println("Enter second name or 0.");
						String i2=in.next();
						System.out.println("Enter surname.");
						String n=in.next();
						if(i2.equals("0"))
							kontakty.put(tmp, new Osoba(i, n));
						else
							kontakty.put(tmp, new Osoba(i, i2, n));
					}
					else System.out.println("It looks like you do not have this number in your address book");
					break;

				case "f":
					System.out.println("-----Editing numbers.-----");
					System.out.println("Enter number you want to change.");
					tmp=in.next();
					System.out.println("Enter new number.");
					String tmp2=in.next();
					kontakty.put(tmp2,kontakty.get(tmp));
					kontakty.remove(tmp);
					break;

				case "x":
					System.out.println("Goodbye!");
					flag=false;
					break;

				default:
					System.out.println("No matching instruction. Try again.");
			}
		}	
		
		String str="";
		for(Map.Entry<String,Osoba> entry: kontakty.entrySet()){
			str+=entry.getKey()+" "+entry.getValue()+"\n";
		}

		try{
    		FileWriter fw=new FileWriter("address_book.txt");
    		fw.write(str);
    		fw.close();
		}catch(IOException e){
		}

	}
}
