package bianchini.nathalia.learningjava.javacore.initializationBlocks.test;

import bianchini.nathalia.learningjava.javacore.initializationBlocks.domain.series;

public class seriesTest {
    public static void main(String[] args) {
        series Series = new series();

        for (int episode : Series.getEpisodes()) {
            System.out.print(episode + " ");
        }

    }
}
