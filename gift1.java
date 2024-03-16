/*
ID: your_id_here
LANG: JAVA
TASK: gift1
*/
import java.io.*;
import java.util.*;

class gift1 {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster
    
    String line1 = f.readLine();
    int total = Integer.parseInt(line1);
    String[] names = new String[total];     
    int[] balance = new int[total];
    
    for (int i = 0; i < names.length; i++) {
    	names[i] = f.readLine();
    	balance[i] = 0;
    }
    
    
    while(true) {
    	String giver = f.readLine();
    	if (giver == null) {
    		break;
    	}
    	
    	String[] split = f.readLine().split(" ");
    	int cash = Integer.parseInt(split[0]);
    	int givenum = Integer.parseInt(split[1]);
    	for (int i = 0; i < total; i ++) {
    		if(names[i].equals(giver)) {
    			balance[i] -= cash;
    			if(givenum == 0) {
    				balance[i] += cash;
    			}
    			else {
    				balance[i] += cash % givenum;
    			}
    			break;
    			
    		}
    	}
    	
    	for (int i = 0; i< givenum; i++) {
    		String person = f.readLine();
    		for (int j = 0; j < total; j ++) {
        		if(names[j].equals(person)) {
        			balance[j] += cash / givenum;
        			break;
        		}
        	}
    	}
    	
    }
    
    for(int i =0; i< total; i++) {
    	out.println(names[i] + " " + balance[i]);    	
    }
    		
    out.close(); 
  }
}
