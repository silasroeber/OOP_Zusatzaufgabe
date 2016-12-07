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

        //Liste liste1 = new Liste(new Element(1, new Element(2, new Element(3, new Element(4)))));
        //Liste liste2 = new Liste(new Element(11, new Element(12, new Element(13, new Element(14)))));

        Liste<Integer> liste1 = new Liste<>();

        liste1.append(1);
        liste1.append(2);
        liste1.append(3);
        liste1.append(4);
        
        Liste<Integer> liste2 = new Liste<>();

        liste2.append(11);
        liste2.append(12);
        liste2.append(13);
        liste2.append(14);
        
        Liste.print(liste1);
        System.out.println("-----------------------------");
        Liste.print(liste2);
        System.out.println("-----------------------------");
        Liste.print(Liste.concat(liste1, liste2));
        System.out.println("-----------------------------");
        Liste.print(Liste.invert(Liste.concat(liste1, liste2)));
        System.out.println("-----------------------------");
        Liste.print(Liste.zip(liste1, liste2));
        System.out.println("-----------------------------");
        Liste.print(liste1);
        System.out.println("-----------------------------");
        Liste.print(liste2);


    }
    
}
