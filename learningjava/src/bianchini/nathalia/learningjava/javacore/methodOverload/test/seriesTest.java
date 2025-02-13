package bianchini.nathalia.learningjava.javacore.methodOverload.test;

import bianchini.nathalia.learningjava.javacore.methodOverload.domain.series;

public class seriesTest {
    public static void main(String[] args) {
        series Series = new series();

        Series.init(5, 2011);
        Series.print();
    }
}
