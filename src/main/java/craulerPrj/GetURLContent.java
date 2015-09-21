package craulerPrj;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by sourceit on 17.09.15.
   + Logger
 */
public class GetURLContent {
    public static void writeToFileByURL(String urlAddress, String fileAddres) {
        //String urlAddress = "http://www.mkyoung.com";
        //String fileAddres = "test.html";
        URL url;
        BufferedReader  br = null;
        BufferedWriter bw = null;
        try{
            url = new URL(urlAddress);
            URLConnection conn = url.openConnection();
            br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            File file = new File(fileAddres);

            String inputLine;
            bw = new BufferedWriter(new FileWriter(file));
            while((inputLine = br.readLine()) != null){
                bw.write(inputLine);
            }

            System.out.println("Done");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                bw.flush();
                bw.close();
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
