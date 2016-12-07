package zusatzaufgabe;

/**
 * Element "Typ".
 *
 * @author Eike Hoffmann <eike.s.hoffmann@student.fh-kiel.de>
 * @author Silas Röber <silas.roeber@student.fh-kiel.de>
 */
public class Element<T> {

    private Element next = null;
    private T value;

    public Element(Element<T> element) {
        this.value = element.value;
        // deep-copy von allen verketteten elementen erzeugen
        this.next = (element.next != null ? new Element(element.next) : null);
    }

    public Element(T value) {
        this(value, null);
    }

    public Element(T value, Element next) {
        this.value = value;
        this.next = next;
    }

    public Element next() {
        return this.next;
    }

    public Element next(Element next) {
        this.next = next;
        return this.next;
    }

    public void append(Element<T> e) {
        if(this.next() == null) {
            this.next(e);
        } else {
            this.next().append(e);
        }
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}
