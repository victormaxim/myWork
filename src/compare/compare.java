package compare;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import javafx.stage.FileChooser;

import javax.swing.*;
import java.io.*;
import java.util.HashMap;
import java.util.Set;

public class compare {



    public static void main(String[] args) throws IOException {
        // Create a hash map
        HashMap psd = new HashMap();
        // Put elements to the map
        psd.put("primul text", "10");
        psd.put("al 2-lea text", "11");

        //HashSet txt = new hashset();


        FileInputStream fstream = new FileInputStream("abc.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;

//Read File Line By Line

        do {

            // Print the content on the console
            System.out.println ("a " + br.readLine());
            System.out.println ("b " + br.readLine());
        } while (br.readLine() != null);
        System.out.println(psd);
        System.out.println(psd.get("primul text"));



//        while ((strLine = br.readLine()) != null)   {
//
//            // Print the content on the console
//            System.out.println ("a " + strLine);
//            System.out.println ("b " + strLine);
//        }

//Close the input stream
        br.close();
        // Get a set of the entries
        // Set set = hm.entrySet();
        // Get an iterator
//        Iterator i = set.iterator();
//        // Display elements
//        while(i.hasNext()) {
//            Map.Entry me = (Map.Entry)i.next();
//            System.out.print(me.getKey() + ": ");
//            System.out.println(me.getValue());
//        }
//        System.out.println();
//        // Deposit 1000 into Zara's account
//        double balance = ((Double)hm.get("Zara")).doubleValue();
//        hm.put("Zara", new Double(balance + 1000));
//        System.out.println("Zara's new balance: " +
//                hm.get("Zara"));
    }

}
