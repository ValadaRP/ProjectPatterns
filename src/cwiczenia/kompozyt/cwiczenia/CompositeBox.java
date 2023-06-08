package cwiczenia.kompozyt.cwiczenia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeBox implements Box{

    private final List<Box> childern = new ArrayList<>();

    public CompositeBox(Box... boxes){
        childern.addAll(Arrays.asList(boxes));
    }

    @Override
    public double calculatePrize() {
        return childern.stream().mapToDouble(Box::calculatePrize).sum();
    }
}
