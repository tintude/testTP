/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monpackage;

import commevouslesouhaitez.FFdebugCalc;
import java.util.Scanner;

/**
 *
 * @author Tristan
 */    
public class FFdebugTest {

    private int[] myArray;
    private int myInt;
    private boolean myBoolean;
    private String myString;

    public FFdebugTest(int[] myArray) {
        this.myArray = myArray;
    }

    public static void main(String[] args) {
        FFdebugTest debug = new FFdebugTest(new int[3]);
        FFdebugTest.getValue(debug.myArray);
        System.out.println("La plus grande valeur est : "
                + FFdebugCalc.findMax(debug.myArray));
        System.out.println("la plus petite valeur est : " 
                + FFdebugCalc.findMin(debug.myArray));
    }
/**
 * 
 * @param array 
 */
    public static void getValue(int[] array) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Entrer un nombre : ");
            array[i] = scan.nextInt();
        }
    }

    public int[] getMyArray() {
        return myArray;
    }

    public void setMyArray(int[] myArray) {
        this.myArray = myArray;
    }

    public int getMyInt() {
        return myInt;
    }
    
/**
 * 
 * @param myInt 
 */
    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }
    
    
    
}
