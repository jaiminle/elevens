/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevenslabjl;

/**
 *
 * @author mslee
 */
public class DeckTester {
    
    public static void main(String[] args) {
        String[] ranks = {"A", "B", "C"};
        String[] suits = {"Giraffes", "Lions"};
        int[] values = {2, 1, 6};
        
        Deck d = new Deck(ranks, suits, values);
        d.deal();
        System.out.println(d);
        System.out.println(d.deal());
        System.out.println(d);    
    }
    
}
