/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevenslabjl;

import java.util.Random;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

    /**
     * The number of consecutive shuffle steps to be performed in each call to
     * each sorting procedure.
     */
    private static final int SHUFFLE_COUNT = 1;

    /**
     * Tests shuffling methods.
     *
     * @param args is not used.
     */
    public static void main(String[] args) {
        System.out.println("Results of " + SHUFFLE_COUNT + " consecutive perfect shuffles:");
        int[] values1 = {0, 1, 2, 3};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            perfectShuffle(values1);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values1.length; k++) {
                System.out.print(" " + values1[k]);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Results of " + SHUFFLE_COUNT + " consecutive efficient selection shuffles:");
        int[] values2 = {0, 1, 2, 3};
        for (int j = 1; j <= SHUFFLE_COUNT; j++) {
            selectionShuffle(values2);
            System.out.print("  " + j + ":");
            for (int k = 0; k < values2.length; k++) {
                System.out.print(" " + values2[k]);
            }
            System.out.println();
        }
        System.out.println();

    }

    public static void perfectShuffle(int[] cards) {
        int[] shuffled = new int[52];
        int k = 0;
        for (int j = 0; j < (cards.length+1) / 2; j++) {
            shuffled[k] = cards[j];
            k += 2;
        }
        k = 1;
        for (int j = (cards.length+1) / 2; j < cards.length; j++) {
            /*if (k == shuffled.length) {
                break;
            }*/
            shuffled[k] = cards[j];
            k += 2;
        }

        for (int j = 0; j < cards.length; j++) {
            cards[j] = shuffled[j];
        }
        //return shuffled;
    }

    public static void selectionShuffle(int[] cards) {
        int[] shuffled = new int[52];
        for (int k = cards.length - 1; k > 0; k--) {
            int r = (int) (Math.random() * (k + 1));
            int temp = cards[r];
            cards[r] = cards[k];
            cards[k] = temp;
        }
    }

}
