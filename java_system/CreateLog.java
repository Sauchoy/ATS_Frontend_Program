package java_system;


import java.awt.List;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * This utility class contains one function that creates a txt log file at the 
 * at the specified file location.
 */
public final class CreateLog {
        //takes the fileLocation and the string array of the content that should be in
        //in the log 
        public static void writeLog(String fileLoc, String[] logContents){
         try {
            FileWriter writer = new FileWriter(fileLoc, true);
            
            String date = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
            
            writer.write(date);
            
            for(int i = 0; i < logContents.length; i++){
                writer.write(" " + logContents[i]);
            }
            writer.write("\r\n");   // write new line
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
