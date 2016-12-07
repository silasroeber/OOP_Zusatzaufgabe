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
        Liste liste1 = new Liste(new Element(1, new Element(2)));
        Liste liste2 = new Liste(liste1);

        Liste.print(liste1);
        Liste.print(liste2);
    }
    
}
