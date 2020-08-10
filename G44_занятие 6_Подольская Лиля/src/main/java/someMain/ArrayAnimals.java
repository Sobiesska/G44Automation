package someMain;

import java.util.ArrayList;
import java.util.List;

public class ArrayAnimals {
    String[] animals = new String[] {"cat", "dog", "elephant", "bear", "bobcat", "kangaroo"};

    public List<String> animalCycle(){
        List<String> animalList = new ArrayList<>();
        int i = 0;
        while (true) {
            if (i == 4){
                i = i + 1;
                continue;
            }
            if (i >= animals.length) {
                break;
            }
            animalList.add(animals[i]);
            i = i + 1;
        }
        return animalList;
    }
}


