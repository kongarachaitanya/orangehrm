package java1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E8
{
    public static void main(String args[]) throws IOException
    {
    	 final InputStreamReader tInputStreamReader = new InputStreamReader(System.in);
         final BufferedReader tKeyboard = new BufferedReader(tInputStreamReader);

         System.out.print("Type in an email address ");

         final String tEmail = tKeyboard.readLine();
         final int tPositionOfAt = tEmail.indexOf("@");
         final int tLastDot = tEmail.lastIndexOf(".",tPositionOfAt);
         final String tSurname = tEmail.substring(tLastDot+1,tPositionOfAt);
         
         System.out.println("The surname is  " + tSurname);
         System.out.println();
    }
}