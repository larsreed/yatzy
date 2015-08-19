package no.mesan.workmanship.yatzy.beregning;

import no.mesan.workmanship.yatzy.annotations.Unntak;
import no.mesan.workmanship.yatzy.domene.Kast;
import no.mesan.workmanship.yatzy.domene.Yatzykombinasjon;

/**
 * Klasse som er i stand til � sette poeng � alle typer kast.
 */
public interface YatzyBeregner {
    /**
     * Beregn poeng for dette kastet gitt valgt beregning.
     *
     * @param yatzykombinasjon �nsket beregning
     * @param terninger Terningen er kastet!
     * @return Poengsum
     */
    @Unntak("Returnerer Integer -- gjort av hensyn til GUI -- FIXME !!!!!")
    Integer beregnPoengsum(Yatzykombinasjon yatzykombinasjon, Kast terninger);
}
