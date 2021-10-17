package autoreader;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		int i =0;
		Auto[] autok;
		Double avg;
		int db;
		int max;
		
		autok=CSVreader();
		try {
			for (i=0;i < autok.length; i++) {
			System.out.println(i+" "+autok[i].getMarka()+" "+autok[i].getSzin()+" "+autok[i].getAr());
		}
		} catch (Exception e) {
			
		}
		
		avg=Atlag(autok, i);
		System.out.println("atlag: "+avg);
		db=Colordb(autok, i);
		System.out.println("piros db: "+db);
		max=Maxar(autok, i);
		System.out.println("max ar: "+max);
	}

	
	public static Auto[] CSVreader() {
		Auto[] autok = new Auto[100];
		int i=0;
		
		try {
			
			BufferedReader in = new BufferedReader(new FileReader("auto.csv"));
			String s = in.readLine();
			s=in.readLine();
			while (s!=null) {
				String[] st = s.split(";");
				String marka=st[0];
				String color=st[1];
				int pay=Integer.parseInt(st[2]);
				autok[i]= new Auto(marka, color, pay);			
				s=in.readLine();				
				i++;
				
			}
			in.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		return autok;
	}
	
	public static double Atlag(Auto[] autok,int i) {
		double atlag;
		int sum=0;
		for (int j = 0; j < i; j++) {
			sum=sum+autok[j].getAr();
		}
		atlag=sum/i;
		return atlag;
	}
	
	public static int Colordb(Auto[] autok,int i) {
		int db=0;
		String color ="piros";
		for (int j = 0; j < i; j++) {
			if (autok[j].getSzin().equals(color)) {
				db++;
			}
		}
		
		return db;
	}
	
	public static int Maxar(Auto[] autok,int i) {
		int max=autok[0].getAr();
		for (int j = 1; j < i; j++) {
			if (max<autok[j].getAr()) {
				max=autok[j].getAr();
			}
		}
		return max;
	}
}
