/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commevouslesouhaitez;

/**
 * coucou coucou coucou :))) bezufbzief
 * @author  :))))ffefef
 */

public class FFdebugCalc {

    public FFdebugCalc() {
    }

    
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * 
     * @param array
     * @return the max value
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}

