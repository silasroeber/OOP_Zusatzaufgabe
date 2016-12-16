
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
        liste1.append(3);
        liste1.append(5);
        liste1.append(22);
        //liste1.append(9);
        
        Liste<Integer> liste2 = new Liste<>();
        //Warum müssen die Listen vom selben Typ sein? (Aufgabenstellung)

        liste2.append(2);
        liste2.append(4);
        liste2.append(6);
        liste2.append(8);
        liste2.append(12);
        
        //Reihenfolge an aufgabenstellung anpassen
        Liste.print(liste1);
        System.out.println("-----------------------------");
        Liste.print(liste2);
        System.out.println("-----------------------------");
        //Liste.print(Liste.concat(liste1, liste2));
        System.out.println("-----------------------------");
        //Liste.print(Liste.invert(Liste.concat(liste1, liste2)));
        System.out.println("-----------------------------");
        Liste.print(Liste.zip(liste1, liste2));
        System.out.println("-----------------------------");
        Liste.print(liste1);
        System.out.println("-----------------------------");
        Liste.print(liste2);


    }
    
}
