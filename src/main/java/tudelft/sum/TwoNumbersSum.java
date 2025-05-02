package tudelft.sum;

import java.util.ArrayList;
import java.util.Collections;

class TwoNumbersSum {

    public ArrayList<Integer> addTwoNumbers(ArrayList<Integer> first, ArrayList<Integer> second) {
        Collections.reverse(first);
        Collections.reverse(second);

        int complement = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < Math.max(first.size(), second.size()); i++) {
            int firstVal = i < first.size() ? first.get(i) : 0;
            int secondVal = i < second.size() ? second.get(i) : 0;
            int total = firstVal + secondVal + complement;
            if (total >= 10) {
                complement = 1;
                total -= 10;
            } else {
                complement = 0;
            }
            result.add(total);
        }
        if (complement > 0) {
            result.add(complement);
        }
        return result;
    }
}
