package zusatzaufgabe;

public class Main {

    public static void main(String[] args) {
        Liste liste1 = new Liste(new Element(1, new Element(2)));
        Liste liste2 = new Liste(liste1);

        Liste.print(liste1);
        Liste.print(liste2);
    }

}
