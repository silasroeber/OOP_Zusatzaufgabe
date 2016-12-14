
package zusatzaufgabe;

/**
 * Zusatzaufgabe
 *
 * @author Eike Hoffmann <eike.s.hoffmann@student.fh-kiel.de>
 * @author Silas Röber <silas.roeber@student.fh-kiel.de>
 */
public class Zusatzaufgabe {

    public static void main(String[] args) {

        Liste<Integer> liste1 = new Liste<>();

        liste1.append(1);
        liste1.append(2);
        liste1.append(3);
        liste1.append(4);
        
        Liste<Double> liste2 = new Liste<>();
        //Warum müssen die Listen vom selben Typ sein? (Aufgabenstellung)

        liste2.append(11.0);
        liste2.append(12.2);
        liste2.append(13.4);
        liste2.append(14.6);
        //liste2.append(15.8);
        
        //Reihenfolge an aufgabenstellung anpassen
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
