package fileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

/**
 * Created by alexandru.dima on 10/10/2016.
 */
public class FileReaderB {

    public static void main(String[] args) throws IOException {
//        FileReaderB f = new FileReaderB();

        System.out.println(getVals());
    }


    public static String getVals() throws IOException {

        String result = "";
        InputStream inputStream = null;

        try {
            Properties prop = new Properties();
            String propFileName = "test.properties";
            FileReaderB filb = new FileReaderB();
            inputStream = filb.getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            Date time = new Date(System.currentTimeMillis());
            System.out.println(time);

            // get the property value and print it out
            String user = prop.getProperty("name");
            result = user;

            //result = "Company List = " + company1 + ", " + company2 + ", " + company3;
            //System.out.println(result + "\nProgram Ran on " + time + " by user=" + user);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
        return result;
    }



}
