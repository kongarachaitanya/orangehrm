package java1;
import java.io.*;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Binomial
{
   public static void main(String[] args) throws IOException
   {

	   {

           System.out.println("  F   C");

           for (int tFahrenheit = 175; tFahrenheit<=525; tFahrenheit=tFahrenheit+25)
           {
               

               int tCelcius = ((tFahrenheit - 32)*5/9); 

               
                       if (tCelcius%10>=5)
                        {
                        tCelcius=tCelcius+(10-tCelcius%10);
                        }
                       else
                        {
                        tCelcius=(tCelcius - tCelcius%10);
                        }
               
               
               System.out.print(tFahrenheit + "  ");
               
               System.out.println(tCelcius);
               
               
           }
           
           
       }}}


           