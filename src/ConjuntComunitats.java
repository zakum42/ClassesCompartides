import java.util.ArrayList;

/**
 * Aquesta classe representa un conjunt de Comunitats, amb un seguit d'operacions bàsiques
 * @param <T>
 */

public class ConjuntComunitats<T> {
    private ArrayList<Comunitat<T>> cjtComunitats;

    /**
     * Constructor per defecte, inicialitza les estructures internes de la classe
     */
    public ConjuntComunitats() {
        cjtComunitats = new ArrayList<Comunitat<T>>();
    }

    /**
     * Afegeix una comunitat al conjunt
     * @param c
     */
    public void afegirComunitat(Comunitat<T> c) {
        this.cjtComunitats.add(c);
    }

    /**
     * Retorna el nombre de comunitats que pertanyen al conjunt
     * @return el nombre de comunitats que pertanyen al conjunt
     */
    public int getNumComunitats() {
        return cjtComunitats.size();
    }

    /**
     * Retorna una comunitat localitzada a la posició i
     * @param i
     * @return una comunitat localitzada a la posició i
     */
    public Comunitat<T> getComunitat(int i) {
        return cjtComunitats.get(i);
    }


}