package ua.kiev.prog.MonitorFiles;


public class Main {
	private static String str = new String ("D:\\Test1");
	 public static void main(String[] args) {
	        Monitor monitor = new Monitor(str);
	        Thread thread = new Thread(monitor);
	        thread.start();
	    }
	}
