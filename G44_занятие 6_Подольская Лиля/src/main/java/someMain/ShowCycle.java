package someMain;

import java.util.Collections;
import java.util.List;

public class ShowCycle {
    public void showCycle(List<String> list){
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
