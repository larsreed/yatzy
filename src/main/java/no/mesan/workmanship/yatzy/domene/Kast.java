package no.mesan.workmanship.yatzy.domene;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Kast implements Iterable<Terning> {
    public static final int ANTALL_TERNINGER= 5;
    protected final Terning terninger[]= new Terning[ANTALL_TERNINGER];
    private final boolean hold[]= new boolean[ANTALL_TERNINGER];

    public Kast() { kast(); }

    public Kast(final Terning... terningArray) { // Laget pga presentasjonsmodellen...
        if ( terningArray.length != ANTALL_TERNINGER ) throw new IllegalArgumentException("Må ha 5 terninger...");
        int i= 0;
        for (final Terning terning : terningArray) {
            this.terninger[i++]= terning;
        }
    }

    public void kast() {
        for (int i= 0; i < this.terninger.length; i++) {
            if (!this.hold[i]) this.terninger[i]= new Terning();
        }
    }

    public void hold(final boolean holdTerning, final Posisjon posisjon) {
        this.hold[posisjon.ordinal()]= holdTerning;
    }

    @Override
    public Iterator<Terning> iterator() {
        final List<Terning> list= Arrays.asList(this.terninger);
        return list.iterator();
    }

    @Override
    public String toString() {
        final StringBuilder builder= new StringBuilder();
        builder.append("Terninger [terninger=")
               .append(Arrays.toString(this.terninger))
               .append("]");
        return builder.toString();
    }
}
