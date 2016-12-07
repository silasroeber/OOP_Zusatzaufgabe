package zusatzaufgabe;

/**
 * Element "Typ".
 *
 * @author Eike Hoffmann <eike.s.hoffmann@student.fh-kiel.de>
 * @author Silas Röber <silas.roeber@student.fh-kiel.de>
 */
public class Element {

    private Element next = null;
    private int value;

    public Element(Element element) {
        this.value = element.value;
        // deep-copy von allen verketteten elementen erzeugen
        this.next = (element.next != null ? new Element(element.next) : null);
    }

    public Element(int value) {
        this(value, null);
    }

    public Element(int value, Element next) {
        this.value = value;
        this.next = next;
    }

    public Element getNext() {
        return this.next;
    }

    public Element setNext(Element next) {
        this.next = next;
        return this.next;
    }
    
    public int getValue () {
        return this.value;
    }

    /*@Override
    public String toString() {
        return this.value;
    }*/
}
