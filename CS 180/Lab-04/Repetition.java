/**
 * CS 180 - Lab 04 - Repetition
 * 
 * Explains uses of loops
 * 
 * @author Shreyaansh Bassi sbassi@purdue.edu
 * 
 * Lab Section 804
 * 
 * 24th September 2014
 */

import java.util.*;

public class Repetition{
    
    public static void even() {
        int i = 0;
        while ( i <= 100 ) {
            System.out.print(i + " ");
            i = i + 2;
        }
        System.out.println("");
        System.out.println("");
    }
    
    public static void powers() {
        int exp = 0;
        while ( Math.pow(2, exp) < 1000 ) {
            System.out.print( Math.pow( 2, exp ) + " " );
            exp++;
        }
        System.out.println("");
        System.out.println("");
    }
    
    public static void alphabet() {
        char x = 'a';
        while ( x <= 'z' ) {
            System.out.print(x);
            x++;
        }
        System.out.println("");
        System.out.println("");
    }
    
    public static void vertical ( String s ) {
        Scanner out = new Scanner(System.in);
        for ( int z = 0; z <= s.length() - 1; z++ ){
            System.out.println(s.charAt(z));
        }
        System.out.println("");
        System.out.println("");
    }
    
    public static void testResults() {
        Scanner in = new Scanner(System.in);
        int x = 0;
        int highest = -2147483647;
        int lowest = 2147483647;
        int sum = 0;
        int average = 0;
        for ( int i = 1 ; in.hasNextInt(); i++ ) {
            x = in.nextInt();
            if ( highest < x )
                highest = x;
            if ( lowest > x )
                lowest = x;
            sum = sum + x;
            average = sum/i;
        }
        System.out.println("");
        System.out.println("         Test Results");
        System.out.printf( "%-15s %15d %n","Highest:" , highest);
        System.out.printf( "%-15s %15d %n","Lowest:" , lowest);
        System.out.printf( "%-15s %15d %n","Average:" , average);
    }
    
    public static void main(String[] args){
        Repetition r = new Repetition();
        r.even();
        r.powers();
        r.alphabet();
        r.vertical("Hello");
        System.out.println("Enter numbers now:");
        r.testResults(); 
    }
}
