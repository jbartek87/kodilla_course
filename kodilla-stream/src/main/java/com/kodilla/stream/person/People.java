package com.kodilla.stream.person;

import java.util.ArrayList;
import java.util.List;

public final class People {
    public static List<String> getList(){
        final List<String> theList = new ArrayList<>();
        theList.add("John Smith");
        theList.add("Dorothy Newman");
        theList.add("John Wolkowitz");
        theList.add("Lucy Riley");
        theList.add("Owen Rogers");
        theList.add("Matilda Davies");
        theList.add("Declan Booth");
        theList.add("Corine Foster");
        theList.add("Khloe fry");
        theList.add("Melaartin Valenzu");
        return new ArrayList<String>(theList);
    }
}
