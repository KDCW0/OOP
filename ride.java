/*
aID: your_id_here
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

class ride {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    BufferedReader f = new BufferedReader(new FileReader("ride.in"));
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster
    String line1 = f.readLine();
    String line2 = f.readLine();
    
    int mem = 1;
    int mem2 = 1; 
    for (int i = 0; i < line1.length(); i++) {
    	int z = line1.charAt(i) - 'A' + 1;    
    	mem = z *mem;
    }
    
    for (int i = 0; i < line2.length(); i++) {
    	int z = line2.charAt(i) - 'A' + 1;    
    	mem2 = z *mem2;
    }
    if (mem % 47 == mem2 % 47) {
    	out.println("GO");
    }
    else {
    	out.println("STAY");
    }
    out.close(); 
  }
}
