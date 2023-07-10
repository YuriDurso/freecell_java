package freecell;

public class Carta {

    Carta prox, ant;
    String carta, naipe, cor;
    int num;

    Carta(String carta, String naipe, int num, String cor) {
        this.carta = carta;
        this.naipe = naipe;
        this.num = num;
        this.cor=cor;
    }

    public Carta() {
    }
    
}
