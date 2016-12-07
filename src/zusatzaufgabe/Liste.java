package zusatzaufgabe;

/**
 * Listen "Typ"
 *
 * @author Eike Hoffmann <eike.s.hoffmann@student.fh-kiel.de>
 * @author Silas Röber <silas.roeber@student.fh-kiel.de>
 */
public class Liste<T> {

    private Element<T> head = null;

    public Liste() {
    }

    public Liste(Liste<T> liste) {
        // deep-copy der gesammten liste erzeugen
        this.head = (liste.head() != null ? new Element<T>(liste.head()) : null);
    }

    public Liste(final Element head) {
        this.head = head;
    }

    public static Liste concat(final Liste l1, final Liste l2) {
        return null;
    }

    public static Liste concat(final Element e, final Liste l) {
        e.next(l.head());
        return new Liste(e);
    }

    public static void print(final Liste l) {
        for(Element e = l.head(); e != null; e = e.next()) {
            System.out.println(e);
        }
    }

    public static Liste invert(final Liste l) {
        return null;
    }

    public static Liste zip(final Liste l1, final Liste l2) {
        return null;
    }

    public boolean isEmpty() {
        return (this.head == null);
    }

    public Element head() {
        return this.head;
    }

    public Element tail() {
        if(this.head != null) {
            return this.head.next();
        }

        return null;
    }

    public void append(T v) {
        append(new Element<T>(v, null));
    }

    private void append(Element<T> e) {
        if(this.isEmpty()) {
            this.head = e;
        } else {
            this.head().append(e);
        }
    }

}
