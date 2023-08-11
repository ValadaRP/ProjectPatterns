package zadania.wizytor.ex2;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();
        elements.add(new Element(512));
        elements.add(new Element(256));
        elements.add(new Element(1024));

        Iterator iterator = new ConcreteIterator(elements);
        while (iterator.hasNext()) {
            Element element = (Element) iterator.getNext();
            System.out.println("Element with memory allocation: " + element.getValue());
        }
    }
}
