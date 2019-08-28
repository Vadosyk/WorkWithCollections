package ua.kiev.prog.MonitorFiles;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Monitor implements Runnable {
    private Map<String,File> prev;
    private Map<String,File> curr;
    private String path;
   
    		
    public Monitor(String path) {
        this.path = path;
        prev = getFileMap(null);
       
    }	

	private Map<String,File> getFileMap(File dir) {
		dir = new File(path);
		File[] children = dir.listFiles();		                 
		Map<String,File> fileMap = new HashMap<String, File>();
        for (File files : children){
        	if (files.isDirectory()) {
        		
        		getFileMap(files);
        		 	
        	}else {
        				
        		fileMap.put(files.getName(), files);
        	}
        }
    	
        return fileMap ;
    }
    
	
   

	private void swapMaps() {
        prev = curr;
    }

     
	private void compareMaps() throws IOException {
        for (String name : prev.keySet()) {
		    if (!curr.containsKey(name)) {
		        System.out.println("File removed: " + name);
		    }
		}

		for (String name : curr.keySet()) {
		    if (!prev.containsKey(name)) {
		        System.out.println("File added: " + name);
		    } /*else {
		    		for (File sizecurr : curr.values()) {
		    			for (File sizeprev : prev.values()) {
		            if (sizecurr.length() != sizeprev.length()) {
		               
		            System.out.println("File modified: " + name);
		            }
		            }
		        }
		    }*/
		}
    }

    @Override
    public void run() {
        while ( ! Thread.currentThread().isInterrupted()) {       	
            curr = getFileMap(null);
           
            try {
				compareMaps();
			} catch (IOException e) {				
				e.printStackTrace();
			}
            
            swapMaps();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
