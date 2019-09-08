package ua.kiev.prog.MailDuplicate;

import java.util.HashSet;
import java.util.Scanner;

public class FilterMails extends Thread {
	
	int countMails;
		
	public FilterMails(int countMails) {
		super();
		this.countMails = countMails;
	}

	
	@Override
	public void run() {
		super.run();
		Scanner sc = new Scanner (System.in);
		HashSet<String> listMails = new HashSet<String>();				
		System.out.println("Enter list mails - \n");						
			for (int i = 0; i < countMails; i++) {
				if (sc.hasNextLine()) {					
					String count;
					count = sc.nextLine();
					int sym = count.indexOf("@");
						if (!(sym == -1)) {
							listMails.add(count);
						}else {
							System.out.println("That not a mail!");
						}
					
				}else {
					System.out.println("Eror");
				}
			}sc.close();
			System.out.println("Number of mails - \n" + listMails.size());
			System.out.println("List without duplicates mails - \n");
			for (String s : listMails) {				
				System.out.println(s);
			}
	}

	@Override
	public boolean equals(Object obj) {		
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	

}
