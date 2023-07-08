package cwiczenia.pylek.cwiczenia.labo;

import cwiczenia.pylek.cwiczenia.labo.konkretneprzedmioty.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FabrykaPrzedmiotow {
    private static final Map<String, ItemType> itemTypes = new HashMap<>();

    public static ItemType getItem(String type, String distributor){
        if (itemTypes.get(type) == null){
            itemTypes.put(type, new ItemType(type, distributor));
        }
        return itemTypes.get(type);
    }
}
