/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zusatzaufgabe;

/**
 *
 * @author silasroeber
 */
public class Zusatzaufgabe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Liste<Integer> liste1 = new Liste<Integer>();

        liste1.append(1);
        liste1.append(3);
        liste1.append(3);
        liste1.append(7);

        Liste.print(liste1);
    }
    
}
