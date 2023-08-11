package zadania.wizytor.ex2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ConcreteIterator implements Iterator {

    List<Element> elementList;
    private int currentPos;

    public ConcreteIterator(List<Element> elementList) {
        this.elementList = elementList;
        this.currentPos = 0;
        elementList.sort(Comparator.comparingInt(Element::getValue));
    }

    public ConcreteIterator() {
    }

    public List<Element> getElementList() {
        return elementList;
    }

    public void setElementList(List<Element> elementList) {
        this.elementList = elementList;
    }

    @Override
    public Element getNext() {
        if (hasNext()) {
            return elementList.get(currentPos++);
        } else throw new IndexOutOfBoundsException("No more elements!");
    }

    @Override
    public Element getPrevious() {
        if (hasPrevious()) {
            return elementList.get(--currentPos);
        } else throw new IndexOutOfBoundsException("No more elements!");
    }

    @Override
    public boolean hasNext() {
        return currentPos < elementList.size();
    }

    @Override
    public boolean hasPrevious() {
        return currentPos > 0;
    }
}
