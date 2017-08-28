package java1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 * Program to get CPU Serial number for windows machine
 * @author includehelp
 */
public class E4 {
    /**
     * Method for get Windows Machine CPU Serial Number
     * @return 
     */
    private static String getWindowsCPU_SerialNumber() {
        String result = "";
        try {
            File file = File.createTempFile("realhowto",".vbs");
            file.deleteOnExit();
            FileWriter fw = new java.io.FileWriter(file);
            
            String vbs1=
              "Set objWMIService = GetObject(\"winmgmts:\\\\.\\root\\cimv2\")\n"
                + "Set colItems = objWMIService.ExecQuery _ \n"
                + "   (\"Select * from Win32_Processor\") \n"
                + "For Each objItem in colItems \n"
                + "    Wscript.Echo objItem.ProcessorId \n"
                + "    exit for  ' do the first cpu only! \n"
                + "Next \n";
              

            fw.write(vbs1);
            fw.close();

            Process p = Runtime.getRuntime().exec("cscript //NoLogo " + file.getPath());
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = input.readLine()) != null) {
               result += line;
            }
            input.close();
        }
        catch(Exception E){
             System.err.println("Windows CPU Exp : "+E.getMessage());
        }
        return result.trim();
    }
    
    public static void main(String[] args) {
        String cpuSerialNumber = getWindowsCPU_SerialNumber();
        System.out.println("Windows Machine CPU Serial Number : "+cpuSerialNumber);
    }
}