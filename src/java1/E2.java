package java1;

import java.util.Scanner;

/**
 * Program to convert distance Miles to KM and KM to Miles
 * @author includehelp
 */
public class E2 {
    
    /**
     * Method to get distance in miles and convert into Kilometers
     * @param miles
     * @return 
     */
    static double convertIntoKms(double miles){
        double km=1.609*miles;
        return km;
    }
    
    /**
     * Method to get distance into km and convert into miles
     * @param km
     * @return 
     */
    static double convertIntoMiles(double km){
        double miles=km/1.609;
        return miles;
    }
    
    public static void main(String[] args) {
        try{
            Scanner sc  =   new Scanner(System.in);
            System.out.print("Enter Distance in Miles  : ");
            double miles   =   sc.nextDouble();
            System.out.println(miles+" Miles equal to : "+convertIntoKms(miles)+" KMs");
            
            System.out.print("Enter Distance in Km  : ");
            double kms   =   sc.nextDouble();
            System.out.println(kms+" KMs equal to : "+convertIntoMiles(kms)+" Miles");
            
            
        }
        catch(Exception E){
            System.err.println("Exception : "+E.getMessage());
        }
    }
}