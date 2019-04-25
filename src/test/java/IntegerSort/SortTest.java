/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package IntegerSort;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortTest {

    private List<Integer> intList(Integer... ints) {
        return Arrays.asList(ints);
    }

    private void assertSorted(List<Integer> unsorted, List<Integer> sorted) {
        assertThat(sort(unsorted), is(sorted));
    }

    @Test
    public void sortings() throws Exception {
        assertSorted(intList(), intList());
        assertSorted(intList(1), intList(1));
        assertSorted(intList(2, 1), intList(1, 2));
        assertSorted(intList(2, 1, 3), intList(1, 2, 3));
        assertSorted(intList(2, 3, 1), intList(1, 2, 3));
        assertSorted(intList(2, 3, 1), intList(1, 2, 3));
        assertSorted(intList(3, 2, 1), intList(1, 2, 3));
        assertSorted(intList(1, 3, 2), intList(1, 2, 3));
        assertSorted(intList(3, 2, 2, 1), intList(1, 2, 2, 3));
    }

    private List<Integer> sort(List<Integer> list) {
        List<Integer> sorted = new ArrayList<Integer>();

        if (list.size() == 0) {
            return list;
        } else {
            List<Integer> l = new ArrayList<Integer>();
            Integer m = list.get(0);
            List<Integer> h = new ArrayList<Integer>();

            for(int i : list.subList(1, list.size())){
                if(i > m)
                    h.add(i);
                else
                    l.add(i);
            }

            sorted.addAll(sort(l));
            sorted.add(m);
            sorted.addAll(sort(h));
        }
            return sorted;
    }
}
