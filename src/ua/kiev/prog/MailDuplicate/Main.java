package ua.kiev.prog.MailDuplicate;

public class Main {

	public static void main(String[] args) {
		FilterMails mails = new FilterMails(2);
		Thread thread = new Thread(mails);
		thread.start();
		
	}

}
