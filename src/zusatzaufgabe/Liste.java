package zusatzaufgabe;

/**
 * Listen "Typ"
 *
 * @author Eike Hoffmann <eike.s.hoffmann@student.fh-kiel.de>
 * @author Silas Röber <silas.roeber@student.fh-kiel.de>
 * @param <T>
 */
public class Liste<T extends Comparable> {

    private Element<T> head = null;

    public Liste() {
    }
    
    public Liste(final Element<T> head) {
        this.head = head;
    }

    public Liste(Liste<T> liste) {
        // deep-copy der gesammten liste erzeugen
        this.head = (liste.head() != null ? new Element<>(liste.head()) : null);
    }

    public static Liste concat(final Liste l1, final Liste l2) {
        if (l1.tail() != null) { 
            return concat(new Element(l1.head().getValue()), concat(l1.tail(), l2)); 
        }
        else {
            return new Liste(concat(new Element(l1.head().getValue()), l2));
        }
    }

    public static Liste concat(final Element e, final Liste l) {
        e.setNext(l.head());
        return new Liste(e);
    }

    public static void print(final Liste l) {
        for(Element e = l.head(); e != null; e = e.getNext()) {
            System.out.print(e.getValue());
            if(e.getNext() != null) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static Liste invert(final Liste l) {
        if (l.tail() != null) { 
            return concat(invert(l.tail()), new Liste(new Element(l.head().getValue()))); 
        }
        else {
            return new Liste(new Element(l.head().getValue()));
        }
    }

    public static Liste zip(final Liste l1, final Liste l2) {
        if(l1 == null && l2 == null){
            return new Liste();
        }
        else if(l1 == null) {
            return new Liste(l2);
        }
        else if(l2 == null) {
            return new Liste(l1);
        }

        if ((l1.head().getValue().compareTo(l2.head().getValue())) < 0){
                //l1.head < l2.head
            return concat(new Element(l1.head().getValue()), zip(l1.tail(), l2));
        }
        else if((l1.head().getValue().compareTo(l2.head().getValue())) > 0) {
                //l1.head > l2.head
            return concat(new Element(l2.head().getValue()), zip(l1, l2.tail()));
        }
        else if((l1.head().getValue().compareTo(l2.head().getValue())) == 0) {
                //l1.head == l2.head
            return concat(new Element(l1.head().getValue()), zip(l1.tail(), l2.tail()));
        }
        return new Liste(); //wird nie erreicht        
    }

    public boolean isEmpty() {
        return (this.head == null);
    }

    public Element<T> head() {
        return this.head;
    }

    public Liste<T> tail() {
        if(this.head.getNext() != null) {
            return new Liste(this.head.getNext());
        }
        return null;
    }

    public void append(T v) {
        append(new Element<>(v, null));
    }

    private void append(Element<T> e) {
        if(this.isEmpty()) {
            this.head = e;
        } else {
            this.head().append(e);
        }
    }

}
