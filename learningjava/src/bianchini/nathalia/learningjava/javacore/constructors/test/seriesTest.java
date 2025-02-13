package bianchini.nathalia.learningjava.javacore.constructors.test;

import bianchini.nathalia.learningjava.javacore.constructors.domain.series;

public class seriesTest {
    public static void main(String[] args) {
        series Series = new series("Amanda", "Drama", 5, 2011, "ABC");
        Series.print();
    }
}
