package freecell;

import java.util.Random;
import java.util.Scanner;

public class FreeCell {

    Carta ca = new Carta("A de Copas", "copas", 1, "vermelho");
    Carta c2 = new Carta("2 de Copas", "copas", 2, "vermelho");
    Carta c3 = new Carta("3 de Copas", "copas", 3, "vermelho");
    Carta c4 = new Carta("4 de Copas", "copas", 4, "vermelho");
    Carta c5 = new Carta("5 de Copas", "copas", 5, "vermelho");
    Carta c6 = new Carta("6 de Copas", "copas", 6, "vermelho");
    Carta c7 = new Carta("7 de Copas", "copas", 7, "vermelho");
    Carta c8 = new Carta("8 de Copas", "copas", 8, "vermelho");
    Carta c9 = new Carta("9 de Copas", "copas", 9, "vermelho");
    Carta c10 = new Carta("10 de Copas", "copas", 10, "vermelho");
    Carta cj = new Carta("J de Copas", "copas", 11, "vermelho");
    Carta cq = new Carta("Q de Copas", "copas", 12, "vermelho");
    Carta ck = new Carta("K de Copas", "copas", 13, "vermelho");

    Carta pa = new Carta("A de Paus", "paus", 1, "preto");
    Carta p2 = new Carta("2 de Paus", "paus", 2, "preto");
    Carta p3 = new Carta("3 de Paus", "paus", 3, "preto");
    Carta p4 = new Carta("4 de Paus", "paus", 4, "preto");
    Carta p5 = new Carta("5 de Paus", "paus", 5, "preto");
    Carta p6 = new Carta("6 de Paus", "paus", 6, "preto");
    Carta p7 = new Carta("7 de Paus", "paus", 7, "preto");
    Carta p8 = new Carta("8 de Paus", "paus", 8, "preto");
    Carta p9 = new Carta("9 de Paus", "paus", 9, "preto");
    Carta p10 = new Carta("10 de Paus", "paus", 10, "preto");
    Carta pj = new Carta("J de Paus", "paus", 11, "preto");
    Carta pq = new Carta("Q de Paus", "paus", 12, "preto");
    Carta pk = new Carta("K de Paus", "paus", 13, "preto");

    Carta ea = new Carta("A de Espadas", "espadas", 1, "preto");
    Carta e2 = new Carta("2 de Espadas", "espadas", 2, "preto");
    Carta e3 = new Carta("3 de Espadas", "espadas", 3, "preto");
    Carta e4 = new Carta("4 de Espadas", "espadas", 4, "preto");
    Carta e5 = new Carta("5 de Espadas", "espadas", 5, "preto");
    Carta e6 = new Carta("6 de Espadas", "espadas", 6, "preto");
    Carta e7 = new Carta("7 de Espadas", "espadas", 7, "preto");
    Carta e8 = new Carta("8 de Espadas", "espadas", 8, "preto");
    Carta e9 = new Carta("9 de Espadas", "espadas", 9, "preto");
    Carta e10 = new Carta("10 de Espadas", "espadas", 10, "preto");
    Carta ej = new Carta("J de Espadas", "espadas", 11, "preto");
    Carta eq = new Carta("Q de Espadas", "espadas", 12, "preto");
    Carta ek = new Carta("K de Espadas", "espadas", 13, "preto");

    Carta oa = new Carta("A de Ouro", "ouro", 1, "vermelho");
    Carta o2 = new Carta("2 de Ouro", "ouro", 2, "vermelho");
    Carta o3 = new Carta("3 de Ouro", "ouro", 3, "vermelho");
    Carta o4 = new Carta("4 de Ouro", "ouro", 4, "vermelho");
    Carta o5 = new Carta("5 de Ouro", "ouro", 5, "vermelho");
    Carta o6 = new Carta("6 de Ouro", "ouro", 6, "vermelho");
    Carta o7 = new Carta("7 de Ouro", "ouro", 7, "vermelho");
    Carta o8 = new Carta("8 de Ouro", "ouro", 8, "vermelho");
    Carta o9 = new Carta("9 de Ouro", "ouro", 9, "vermelho");
    Carta o10 = new Carta("10 de Ouro", "ouro", 10, "vermelho");
    Carta oj = new Carta("J de Ouro", "ouro", 11, "vermelho");
    Carta oq = new Carta("Q de Ouro", "ouro", 12, "vermelho");
    Carta ok = new Carta("K de Ouro", "ouro", 13, "vermelho");

    Carta[] baralho = {
        ca, c6, e4, ck, ok, ek, pa,
        e2, e7, p9, o2, e6, c8, c3,
        c9, c10, cj, cq, c4, e3, c2,
        p5, p4, c5, p6, p7, p8, e5,
        p10, pj, pq, pk, c7, ea,
        e8, e9, e10, ej, oq, p2,
        oa, o3, o4, o5, o6, o7,
        o8, o9, o10, oj, eq, p3};
    
    Carta[] embaralhado = new Carta[baralho.length];

    Carta h1, h2, h3, h4, h5, h6, h7, h8;
    Carta t1, t2, t3, t4, t5, t6, t7, t8;

    Carta extra1, extra2, extra3, extra4;

    Carta vazia = new Carta("            ", "     ", 0, "     ");

    Carta pilhaCopas = new Carta("Pilha de Copas", "copas", 1, "vermelho");
    Carta pilhaOuro = new Carta("Pilha de Ouro", "ouro", 1, "vermelho");
    Carta pilhaPaus = new Carta("Pilha de Paus", "paus", 1, "preto");
    Carta pilhaEspadas = new Carta("Pilha de Espadas", "espadas", 1, "preto");

    Scanner sc = new Scanner(System.in);

    public void startGame() {
        Random random = new Random();

        int end = 0;
        int pos = 0;
        while (end != 1) {
            int cont = random.nextInt(52);
            if (embaralhado[cont] == null) {
                embaralhado[cont] = baralho[pos];
                baralho[pos] = null;
                pos++;
                if (pos == 52) {
                    end = 1;
                }
            }
        }

        int cont = 0;

        h1 = embaralhado[cont];

        for (int i = 0; i < 7; i++) {
            if (cont == 6) {
                embaralhado[cont + 1].ant = null;
                embaralhado[cont].prox = null;
                cont++;
            } else {
                if (cont == 0) {
                    embaralhado[cont].ant = null;
                    embaralhado[cont + 1].ant = embaralhado[cont];
                } else {
                    embaralhado[cont + 1].ant = embaralhado[cont];
                }
                embaralhado[cont].prox = embaralhado[cont + 1];
                cont++;
            }

        }

        t1 = embaralhado[cont - 1];
        h2 = embaralhado[cont];

        for (int i = 0; i < 7; i++) {
            if (cont == 13) {
                embaralhado[cont + 1].ant = null;
                embaralhado[cont].prox = null;
                cont++;
            } else {
                if (cont == 0) {
                    embaralhado[cont].ant = null;
                    embaralhado[cont + 1].ant = embaralhado[cont];
                } else {
                    embaralhado[cont + 1].ant = embaralhado[cont];
                }
                embaralhado[cont].prox = embaralhado[cont + 1];
                cont++;
            }
        }

        t2 = embaralhado[cont - 1];
        h3 = embaralhado[cont];

        for (int i = 0; i < 7; i++) {
            if (cont == 20) {
                embaralhado[cont + 1].ant = null;
                embaralhado[cont].prox = null;
                cont++;
            } else {
                embaralhado[cont + 1].ant = embaralhado[cont];
                embaralhado[cont].prox = embaralhado[cont + 1];
                cont++;
            }
        }

        t3 = embaralhado[cont - 1];
        h4 = embaralhado[cont];

        for (int i = 0; i < 7; i++) {
            if (cont == 27) {
                embaralhado[cont + 1].ant = null;
                embaralhado[cont].prox = null;
                cont++;
            } else {
                embaralhado[cont + 1].ant = embaralhado[cont];
                embaralhado[cont].prox = embaralhado[cont + 1];
                cont++;
            }
        }

        t4 = embaralhado[cont - 1];
        h5 = embaralhado[cont];

        for (int i = 0; i < 6; i++) {
            if (cont == 33) {
                embaralhado[cont + 1].ant = null;
                embaralhado[cont].prox = null;
                cont++;
            } else {
                embaralhado[cont + 1].ant = embaralhado[cont];
                embaralhado[cont].prox = embaralhado[cont + 1];
                cont++;
            }
        }

        t5 = embaralhado[cont - 1];
        h6 = embaralhado[cont];

        for (int i = 0; i < 6; i++) {
            if (cont == 39) {
                embaralhado[cont + 1].ant = null;
                embaralhado[cont].prox = null;
                cont++;
            } else {
                embaralhado[cont + 1].ant = embaralhado[cont];
                embaralhado[cont].prox = embaralhado[cont + 1];
                cont++;
            }
        }

        t6 = embaralhado[cont - 1];
        h7 = embaralhado[cont];

        for (int i = 0; i < 6; i++) {
            if (cont == 45) {
                embaralhado[cont + 1].ant = null;
                embaralhado[cont].prox = null;
                cont++;
            } else {
                embaralhado[cont + 1].ant = embaralhado[cont];
                embaralhado[cont].prox = embaralhado[cont + 1];
                cont++;
            }
        }

        t7 = embaralhado[cont - 1];
        h8 = embaralhado[cont];

        for (int i = 0; i < 6; i++) {
            if (cont == 51) {
                embaralhado[cont].prox = null;
                embaralhado[cont].ant = embaralhado[cont - 1];
            } else {
                embaralhado[cont + 1].ant = embaralhado[cont];
                embaralhado[cont].prox = embaralhado[cont + 1];
                cont++;
            }
        }

        t8 = embaralhado[cont - 1];
    }

    public void receiveCard() {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Qual carta deseja mover? ");
        String carta = sc.nextLine();
        System.out.println("Para depois de qual carta, espaco extra ou pilha final deseja mover? ");
        System.out.println(" ");
        System.out.println("1 - Se for para depois de alguma carta, digite o nome da carta");
        System.out.println("2 - Se for a primeira carta de uma pilha final, digite o nome da pilha");
        System.out.println("3 - No caso de espacos extras, digite '1, 2, 3 ou 4'");
        String futuraPilha = sc.nextLine();
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

        if ((carta.equals(t1.carta) || carta.equals(t2.carta) || carta.equals(t3.carta)
                || carta.equals(t4.carta) || carta.equals(t5.carta) || carta.equals(t6.carta) //SE FOR UMA TAIL
                || carta.equals(t7.carta) || carta.equals(t8.carta))) {

            if (futuraPilha.equals(t1.carta) || futuraPilha.equals(t2.carta) || futuraPilha.equals(t3.carta)
                    || futuraPilha.equals(t4.carta) || futuraPilha.equals(t5.carta) || futuraPilha.equals(t6.carta)
                    || futuraPilha.equals(t7.carta) || futuraPilha.equals(t8.carta)) {

                moveCard(carta, futuraPilha);

            } else if (futuraPilha.equals("1") || futuraPilha.equals("2")
                    || futuraPilha.equals("3") || futuraPilha.equals("4")) {

                moveToExtra(carta, futuraPilha);

            } else if (futuraPilha.equals(pilhaCopas.carta) || futuraPilha.equals(pilhaOuro.carta)
                    || futuraPilha.equals(pilhaEspadas.carta) || futuraPilha.equals(pilhaPaus.carta)) {
                moveToFinal(carta, futuraPilha);
            }
        } else if ((extra1 != null || extra2 != null || extra3 != null || extra4 != null) && (carta.equals(extra1.carta)
                || carta.equals(extra2.carta) || carta.equals(extra3.carta) || carta.equals(extra4.carta))) {   //CASO A CARTA ESTEJA NO ESPACO EXTRA

            if (futuraPilha.equals(t1.carta) || futuraPilha.equals(t2.carta) || futuraPilha.equals(t3.carta)
                    || futuraPilha.equals(t4.carta) || futuraPilha.equals(t5.carta) || futuraPilha.equals(t6.carta)
                    || futuraPilha.equals(t7.carta) || futuraPilha.equals(t8.carta)) {

                moveToExtra(carta, futuraPilha);

            } else {
                System.out.println("Nao se poder mover carta entre espacos extras");
            }

        } else if (carta.equals(t1.ant.ant.ant.carta) || carta.equals(t1.ant.ant.carta) || carta.equals(t1.ant.carta)
                || carta.equals(t2.ant.ant.ant.carta) || carta.equals(t2.ant.ant.carta) || carta.equals(t2.ant.carta)
                || carta.equals(t3.ant.ant.ant.carta) || carta.equals(t3.ant.ant.carta) || carta.equals(t3.ant.carta)
                || carta.equals(t4.ant.ant.ant.carta) || carta.equals(t4.ant.ant.carta) || carta.equals(t4.ant.carta)
                || carta.equals(t5.ant.ant.ant.carta) || carta.equals(t5.ant.ant.carta) || carta.equals(t5.ant.carta)
                || carta.equals(t6.ant.ant.ant.carta) || carta.equals(t6.ant.ant.carta) || carta.equals(t6.ant.carta)
                || carta.equals(t7.ant.ant.ant.carta) || carta.equals(t7.ant.ant.carta) || carta.equals(t7.ant.carta)
                || carta.equals(t8.ant.ant.ant.carta) || carta.equals(t8.ant.ant.carta) || carta.equals(t8.ant.carta)) {
            moveMore(carta, futuraPilha);
        } else {
            System.out.println("receiveCard: Movimento invalido");
        }

    }

    public void moveCard(String carta, String outraCarta) {
        if (extra1 == null || extra2 == null || extra3 == null || extra4 == null) {

            //caso seja somente 1 carta
            if (t1.carta.equals(carta)) {
                if (t2.carta.equals(outraCarta)) {
                    if (!t1.cor.equals(t2.cor) && (t1.num + 1) == t2.num && t1.num != 13) {
                        if (extra1 == null) {
                            extra1 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t2.prox = extra1;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t2.prox = extra2;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t2.prox = extra3;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t2.prox = extra4;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra4 = null;
                        }
                    } else if (h2 == null) {
                        if (extra1 == null) {
                            extra1 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t2.prox = extra1;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t2.prox = extra2;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t2.prox = extra3;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t2.prox = extra4;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra4 = null;
                        }
                    }

                } else if (t3.carta.equals(outraCarta)) {
                    if (!t1.cor.equals(t3.cor) && (t1.num + 1) == t3.num && t1.num != 13) {
                        if (extra1 == null) {
                            extra1 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t3.prox = extra1;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t3.prox = extra2;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t3.prox = extra3;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t3.prox = extra4;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra4 = null;
                        }
                    }
                } else if (t4.carta.equals(outraCarta)) {
                    if (!t1.cor.equals(t4.cor) && (t1.num + 1) == t4.num && t1.num != 13) {
                        if (extra1 == null) {
                            extra1 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t4.prox = extra1;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t4.prox = extra2;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t4.prox = extra3;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t4.prox = extra4;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra4 = null;
                        }
                    }
                } else if (t5.carta.equals(outraCarta)) {
                    if (!t1.cor.equals(t5.cor) && (t1.num + 1) == t5.num && t1.num != 13) {
                        if (extra1 == null) {
                            extra1 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t5.prox = extra1;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t5.prox = extra2;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t5.prox = extra3;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t5.prox = extra4;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra4 = null;
                        }
                    }
                } else if (t6.carta.equals(outraCarta)) {
                    if (!t1.cor.equals(t6.cor) && (t1.num + 1) == t6.num && t1.num != 13) {
                        if (extra1 == null) {
                            extra1 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t6.prox = extra1;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t6.prox = extra2;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t6.prox = extra3;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t6.prox = extra4;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra4 = null;
                        }
                    }
                } else if (t7.carta.equals(outraCarta)) {
                    if (!t1.cor.equals(t7.cor) && (t1.num + 1) == t7.num && t1.num != 13) {
                        if (extra1 == null) {
                            extra1 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t7.prox = extra1;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t7.prox = extra2;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t7.prox = extra3;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t7.prox = extra4;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra4 = null;
                        }
                    }
                } else if (t8.carta.equals(outraCarta)) {
                    if (!t1.cor.equals(t8.cor) && (t1.num + 1) == t8.num && t1.num != 13) {
                        if (extra1 == null) {
                            extra1 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t8.prox = extra1;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t8.prox = extra2;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t8.prox = extra3;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t1;
                            t1.ant.prox = null;
                            t1 = t1.ant;
                            t8.prox = extra4;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra4 = null;
                        }
                    }
                }
            } else if (t2.carta.equals(carta)) {
                if (t1.carta.equals(outraCarta)) {
                    if (!t2.cor.equals(t1.cor) && (t2.num + 1) == t1.num && t2.num != 13) {
                        if (extra1 == null) {
                            extra1 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t1.prox = extra1;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t1.prox = extra2;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t1.prox = extra3;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t1.prox = extra4;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra4 = null;
                        }
                    }
                } else if (t3.carta.equals(outraCarta)) {
                    if (!t2.cor.equals(t3.cor) && (t2.num + 1) == t3.num && t2.num != 13) {
                        if (extra1 == null) {
                            extra1 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t3.prox = extra1;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t3.prox = extra2;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t3.prox = extra3;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t3.prox = extra4;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra4 = null;
                        }
                    }
                } else if (t4.carta.equals(outraCarta)) {
                    if (!t2.cor.equals(t4.cor) && (t2.num + 1) == t4.num && t2.num != 13) {
                        if (extra1 == null) {
                            extra1 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t4.prox = extra1;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t4.prox = extra2;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t4.prox = extra3;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t4.prox = extra4;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra4 = null;
                        }
                    }
                } else if (t5.carta.equals(outraCarta)) {
                    if (!t2.cor.equals(t5.cor) && (t2.num + 1) == t5.num && t2.num != 13) {
                        if (extra1 == null) {
                            extra1 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t5.prox = extra1;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t5.prox = extra2;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t5.prox = extra3;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t5.prox = extra4;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra4 = null;
                        }
                    }
                } else if (t6.carta.equals(outraCarta)) {
                    if (!t2.cor.equals(t6.cor) && (t2.num + 1) == t6.num && t2.num != 13) {
                        if (extra1 == null) {
                            extra1 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t6.prox = extra1;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t6.prox = extra2;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t6.prox = extra3;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t6.prox = extra4;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra4 = null;
                        }
                    }
                } else if (t7.carta.equals(outraCarta)) {
                    if (!t2.cor.equals(t7.cor) && (t2.num + 1) == t7.num && t2.num != 13) {
                        if (extra1 == null) {
                            extra1 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t7.prox = extra1;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t7.prox = extra2;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t7.prox = extra3;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t7.prox = extra4;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra4 = null;
                        }
                    }
                } else if (t8.carta.equals(outraCarta)) {
                    if (!t2.cor.equals(t8.cor) && (t2.num + 1) == t8.num && t2.num != 13) {
                        if (extra1 == null) {
                            extra1 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t8.prox = extra1;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t8.prox = extra2;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t8.prox = extra3;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t2;
                            t2.ant.prox = null;
                            t2 = t2.ant;
                            t8.prox = extra4;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra4 = null;
                        }
                    }
                }
            } else if (t3.carta.equals(carta)) {
                if (t1.carta.equals(outraCarta)) {
                    if (!t3.cor.equals(t1.cor) && (t3.num + 1) == t1.num && t3.num != 13) {
                        if (extra1 == null) {
                            extra1 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t1.prox = extra1;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t1.prox = extra2;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t1.prox = extra3;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t1.prox = extra4;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra4 = null;
                        }
                    }
                } else if (t2.carta.equals(outraCarta)) {
                    if (!t3.cor.equals(t2.cor) && (t3.num + 1) == t2.num && t3.num != 13) {
                        if (extra1 == null) {
                            extra1 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t2.prox = extra1;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t2.prox = extra2;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t2.prox = extra3;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t2.prox = extra4;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra4 = null;
                        }
                    }
                } else if (t4.carta.equals(outraCarta)) {
                    if (!t3.cor.equals(t4.cor) && (t3.num + 1) == t4.num && t3.num != 13) {
                        if (extra1 == null) {
                            extra1 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t4.prox = extra1;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t4.prox = extra2;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t4.prox = extra3;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t4.prox = extra4;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra4 = null;
                        }
                    }
                } else if (t5.carta.equals(outraCarta)) {
                    if (!t3.cor.equals(t5.cor) && (t3.num + 1) == t5.num && t3.num != 13) {
                        if (extra1 == null) {
                            extra1 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t5.prox = extra1;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t5.prox = extra2;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t5.prox = extra3;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t5.prox = extra4;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra4 = null;
                        }
                    }
                } else if (t6.carta.equals(outraCarta)) {
                    if (!t3.cor.equals(t6.cor) && (t3.num + 1) == t6.num && t3.num != 13) {
                        if (extra1 == null) {
                            extra1 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t6.prox = extra1;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t6.prox = extra2;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t6.prox = extra3;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t6.prox = extra4;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra4 = null;
                        }
                    }
                } else if (t7.carta.equals(outraCarta)) {
                    if (!t3.cor.equals(t7.cor) && (t3.num + 1) == t7.num && t3.num != 13) {
                        if (extra1 == null) {
                            extra1 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t7.prox = extra1;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t7.prox = extra2;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t7.prox = extra3;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t7.prox = extra4;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra4 = null;
                        }
                    }
                } else if (t8.carta.equals(outraCarta)) {
                    if (!t3.cor.equals(t8.cor) && (t3.num + 1) == t8.num && t3.num != 13) {
                        if (extra1 == null) {
                            extra1 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t8.prox = extra1;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t8.prox = extra2;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t8.prox = extra3;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t3;
                            t3.ant.prox = null;
                            t3 = t3.ant;
                            t8.prox = extra4;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra4 = null;
                        }
                    }
                }
            } else if (t4.carta.equals(carta)) {
                if (t1.carta.equals(outraCarta)) {
                    if (!t4.cor.equals(t1.cor) && (t4.num + 1) == t1.num && t4.num != 13) {
                        if (extra1 == null) {
                            extra1 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t1.prox = extra1;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t1.prox = extra2;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t1.prox = extra3;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t1.prox = extra4;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra4 = null;
                        }
                    }
                } else if (t2.carta.equals(outraCarta)) {
                    if (!t4.cor.equals(t2.cor) && (t4.num + 1) == t2.num && t4.num != 13) {
                        if (extra1 == null) {
                            extra1 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t2.prox = extra1;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t2.prox = extra2;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t2.prox = extra3;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t2.prox = extra4;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra4 = null;
                        }
                    }
                } else if (t3.carta.equals(outraCarta)) {
                    if (!t4.cor.equals(t3.cor) && (t4.num + 1) == t3.num && t4.num != 13) {
                        if (extra1 == null) {
                            extra1 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t3.prox = extra1;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t3.prox = extra2;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t3.prox = extra3;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t3.prox = extra4;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra4 = null;
                        }
                    }
                } else if (t5.carta.equals(outraCarta)) {
                    if (!t4.cor.equals(t5.cor) && (t4.num + 1) == t5.num && t4.num != 13) {
                        if (extra1 == null) {
                            extra1 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t5.prox = extra1;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t5.prox = extra2;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t5.prox = extra3;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t5.prox = extra4;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra4 = null;
                        }
                    }
                } else if (t6.carta.equals(outraCarta)) {
                    if (!t4.cor.equals(t6.cor) && (t4.num + 1) == t6.num && t4.num != 13) {
                        if (extra1 == null) {
                            extra1 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t6.prox = extra1;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t6.prox = extra2;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t6.prox = extra3;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t6.prox = extra4;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra4 = null;
                        }
                    }
                } else if (t7.carta.equals(outraCarta)) {
                    if (!t4.cor.equals(t7.cor) && (t4.num + 1) == t7.num && t4.num != 13) {
                        if (extra1 == null) {
                            extra1 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t7.prox = extra1;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t7.prox = extra2;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t7.prox = extra3;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t7.prox = extra4;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra4 = null;
                        }
                    }
                } else if (t8.carta.equals(outraCarta)) {
                    if (!t4.cor.equals(t8.cor) && (t4.num + 1) == t8.num && t4.num != 13) {
                        if (extra1 == null) {
                            extra1 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t8.prox = extra1;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t4;
                            t4.ant.prox = null;
                            t8.prox = extra2;
                            t4 = t4.ant;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t8.prox = extra3;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t4;
                            t4.ant.prox = null;
                            t4 = t4.ant;
                            t8.prox = extra4;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra4 = null;
                        }
                    }
                }
            } else if (t5.carta.equals(carta)) {
                if (t1.carta.equals(outraCarta)) {
                    if (!t5.cor.equals(t1.cor) && (t5.num + 1) == t1.num && t5.num != 13) {
                        if (extra1 == null) {
                            extra1 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t1.prox = extra1;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t1.prox = extra2;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t1.prox = extra3;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t1.prox = extra4;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra4 = null;
                        }
                    }
                } else if (t2.carta.equals(outraCarta)) {
                    if (!t5.cor.equals(t2.cor) && (t5.num + 1) == t2.num && t5.num != 13) {
                        if (extra1 == null) {
                            extra1 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t2.prox = extra1;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t2.prox = extra2;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t2.prox = extra3;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t2.prox = extra4;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra4 = null;
                        }
                    }
                } else if (t3.carta.equals(outraCarta)) {
                    if (!t5.cor.equals(t3.cor) && (t5.num + 1) == t3.num && t5.num != 13) {
                        if (extra1 == null) {
                            extra1 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t3.prox = extra1;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t3.prox = extra2;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t3.prox = extra3;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t3.prox = extra4;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra4 = null;
                        }
                    }
                } else if (t4.carta.equals(outraCarta)) {
                    if (!t5.cor.equals(t4.cor) && (t5.num + 1) == t4.num && t5.num != 13) {
                        if (extra1 == null) {
                            extra1 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t4.prox = extra1;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t4.prox = extra2;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t4.prox = extra3;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t4.prox = extra4;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra4 = null;
                        }
                    }
                } else if (t6.carta.equals(outraCarta)) {
                    if (!t5.cor.equals(t6.cor) && (t5.num + 1) == t6.num && t5.num != 13) {
                        if (extra1 == null) {
                            extra1 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t6.prox = extra1;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t6.prox = extra2;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t6.prox = extra3;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t6.prox = extra4;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra4 = null;
                        }
                    }
                } else if (t7.carta.equals(outraCarta)) {
                    if (!t5.cor.equals(t7.cor) && (t5.num + 1) == t7.num && t5.num != 13) {
                        if (extra1 == null) {
                            extra1 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t7.prox = extra1;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t7.prox = extra2;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t7.prox = extra3;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t7.prox = extra4;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra4 = null;
                        }
                    }
                } else if (t8.carta.equals(outraCarta)) {
                    if (!t5.cor.equals(t8.cor) && (t5.num + 1) == t8.num && t5.num != 13) {
                        if (extra1 == null) {
                            extra1 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t8.prox = extra1;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t8.prox = extra2;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t8.prox = extra3;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t5;
                            t5.ant.prox = null;
                            t5 = t5.ant;
                            t8.prox = extra4;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra4 = null;
                        }
                    }
                }
            } else if (t6.carta.equals(carta)) {
                if (t1.carta.equals(outraCarta)) {
                    if (!t6.cor.equals(t1.cor) && (t6.num + 1) == t1.num && t6.num != 13) {
                        if (extra1 == null) {
                            extra1 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t1.prox = extra1;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t1.prox = extra2;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t1.prox = extra3;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t1.prox = extra4;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra4 = null;
                        }
                    }
                } else if (t2.carta.equals(outraCarta)) {
                    if (!t6.cor.equals(t2.cor) && (t6.num + 1) == t2.num && t6.num != 13) {
                        if (extra1 == null) {
                            extra1 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t2.prox = extra1;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t2.prox = extra2;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t2.prox = extra3;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t2.prox = extra4;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra4 = null;
                        }
                    }
                } else if (t3.carta.equals(outraCarta)) {
                    if (!t6.cor.equals(t3.cor) && (t6.num + 1) == t3.num && t6.num != 13) {
                        if (extra1 == null) {
                            extra1 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t3.prox = extra1;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t3.prox = extra2;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t3.prox = extra3;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t3.prox = extra4;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra4 = null;
                        }
                    }
                } else if (t4.carta.equals(outraCarta)) {
                    if (!t6.cor.equals(t4.cor) && (t6.num + 1) == t4.num && t6.num != 13) {
                        if (extra1 == null) {
                            extra1 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t4.prox = extra1;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t4.prox = extra2;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t4.prox = extra3;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t4.prox = extra4;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra4 = null;
                        }
                    }
                } else if (t5.carta.equals(outraCarta)) {
                    if (!t6.cor.equals(t5.cor) && (t6.num + 1) == t5.num && t6.num != 13) {
                        if (extra1 == null) {
                            extra1 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t5.prox = extra1;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t5.prox = extra2;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t5.prox = extra3;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t5.prox = extra4;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra4 = null;
                        }
                    }
                } else if (t7.carta.equals(outraCarta)) {
                    if (!t6.cor.equals(t7.cor) && (t6.num + 1) == t7.num && t6.num != 13) {
                        if (extra1 == null) {
                            extra1 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t7.prox = extra1;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t7.prox = extra2;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t7.prox = extra3;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t7.prox = extra4;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra4 = null;
                        }
                    }
                } else if (t8.carta.equals(outraCarta)) {
                    if (!t6.cor.equals(t8.cor) && (t6.num + 1) == t8.num && t6.num != 13) {
                        if (extra1 == null) {
                            extra1 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t8.prox = extra1;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t8.prox = extra2;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t8.prox = extra3;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t6;
                            t6.ant.prox = null;
                            t6 = t6.ant;
                            t8.prox = extra4;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra4 = null;
                        }
                    }
                }
            } else if (t7.carta.equals(carta)) {
                if (t1.carta.equals(outraCarta)) {
                    if (!t7.cor.equals(t1.cor) && (t7.num + 1) == t1.num && t7.num != 13) {
                        if (extra1 == null) {
                            extra1 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t1.prox = extra1;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t1.prox = extra2;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t1.prox = extra3;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t1.prox = extra4;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra4 = null;
                        }
                    }
                } else if (t2.carta.equals(outraCarta)) {
                    if (!t7.cor.equals(t2.cor) && (t7.num + 1) == t2.num && t7.num != 13) {
                        if (extra1 == null) {
                            extra1 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t2.prox = extra1;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t2.prox = extra2;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t2.prox = extra3;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t2.prox = extra4;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra4 = null;
                        }
                    }
                } else if (t3.carta.equals(outraCarta)) {
                    if (!t7.cor.equals(t3.cor) && (t7.num + 1) == t3.num && t7.num != 13) {
                        if (extra1 == null) {
                            extra1 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t3.prox = extra1;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t3.prox = extra2;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t3.prox = extra3;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t3.prox = extra4;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra4 = null;
                        }
                    }
                } else if (t4.carta.equals(outraCarta)) {
                    if (!t7.cor.equals(t4.cor) && (t7.num + 1) == t4.num && t7.num != 13) {
                        if (extra1 == null) {
                            extra1 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t4.prox = extra1;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t4.prox = extra2;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t4.prox = extra3;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t4.prox = extra4;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra4 = null;
                        }
                    }
                } else if (t5.carta.equals(outraCarta)) {
                    if (!t7.cor.equals(t5.cor) && (t7.num + 1) == t5.num && t7.num != 13) {
                        if (extra1 == null) {
                            extra1 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t5.prox = extra1;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t5.prox = extra2;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t5.prox = extra3;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t5.prox = extra4;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra4 = null;
                        }
                    }
                } else if (t6.carta.equals(outraCarta)) {
                    if (!t7.cor.equals(t6.cor) && (t7.num + 1) == t6.num && t7.num != 13) {
                        if (extra1 == null) {
                            extra1 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t6.prox = extra1;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t6.prox = extra2;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t6.prox = extra3;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t6.prox = extra4;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra4 = null;
                        }
                    }
                } else if (t8.carta.equals(outraCarta)) {
                    if (!t7.cor.equals(t8.cor) && (t7.num + 1) == t8.num && t7.num != 13) {
                        if (extra1 == null) {
                            extra1 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t8.prox = extra1;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t8.prox = extra2;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t8.prox = extra3;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t7;
                            t7.ant.prox = null;
                            t7 = t7.ant;
                            t8.prox = extra4;
                            t8.prox.ant = t8;
                            t8 = t8.prox;
                            extra4 = null;
                        }
                    }
                }
            } else if (t8.carta.equals(carta)) {
                if (t1.carta.equals(outraCarta)) {
                    if (!t8.cor.equals(t1.cor) && (t8.num + 1) == t1.num && t8.num != 13) {
                        if (extra1 == null) {
                            extra1 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t1.prox = extra1;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t1.prox = extra2;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t1.prox = extra3;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t1.prox = extra4;
                            t1.prox.ant = t1;
                            t1 = t1.prox;
                            extra4 = null;
                        }
                    }
                } else if (t2.carta.equals(outraCarta)) {
                    if (!t8.cor.equals(t2.cor) && (t8.num + 1) == t2.num && t8.num != 13) {
                        if (extra1 == null) {
                            extra1 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t2.prox = extra1;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t2.prox = extra2;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t2.prox = extra3;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t2.prox = extra4;
                            t2.prox.ant = t2;
                            t2 = t2.prox;
                            extra4 = null;
                        }
                    }
                } else if (t3.carta.equals(outraCarta)) {
                    if (!t8.cor.equals(t3.cor) && (t8.num + 1) == t3.num && t8.num != 13) {
                        if (extra1 == null) {
                            extra1 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t3.prox = extra1;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t3.prox = extra2;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t3.prox = extra3;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t3.prox = extra4;
                            t3.prox.ant = t3;
                            t3 = t3.prox;
                            extra4 = null;
                        }
                    }
                } else if (t4.carta.equals(outraCarta)) {
                    if (!t8.cor.equals(t4.cor) && (t8.num + 1) == t4.num && t8.num != 13) {
                        if (extra1 == null) {
                            extra1 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t4.prox = extra1;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t4.prox = extra2;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t4.prox = extra3;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t4.prox = extra4;
                            t4.prox.ant = t4;
                            t4 = t4.prox;
                            extra4 = null;
                        }
                    }
                } else if (t5.carta.equals(outraCarta)) {
                    if (!t8.cor.equals(t5.cor) && (t8.num + 1) == t5.num && t8.num != 13) {
                        if (extra1 == null) {
                            extra1 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t5.prox = extra1;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t5.prox = extra2;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t5.prox = extra3;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t5.prox = extra4;
                            t5.prox.ant = t5;
                            t5 = t5.prox;
                            extra4 = null;
                        }
                    }
                } else if (t6.carta.equals(outraCarta)) {
                    if (!t8.cor.equals(t6.cor) && (t8.num + 1) == t6.num && t8.num != 13) {
                        if (extra1 == null) {
                            extra1 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t6.prox = extra1;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t6.prox = extra2;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t6.prox = extra3;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t6.prox = extra4;
                            t6.prox.ant = t6;
                            t6 = t6.prox;
                            extra4 = null;
                        }
                    }
                } else if (t7.carta.equals(outraCarta)) {
                    if (!t8.cor.equals(t7.cor) && (t8.num + 1) == t7.num && t8.num != 13) {
                        if (extra1 == null) {
                            extra1 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t7.prox = extra1;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra1 = null;
                        } else if (extra2 == null) {
                            extra2 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t7.prox = extra2;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra2 = null;
                        } else if (extra3 == null) {
                            extra3 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t7.prox = extra3;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra3 = null;
                        } else if (extra4 == null) {
                            extra4 = t8;
                            t8.ant.prox = null;
                            t8 = t8.ant;
                            t7.prox = extra4;
                            t7.prox.ant = t7;
                            t7 = t7.prox;
                            extra4 = null;
                        }
                    }
                }
            } else {
                System.out.println("Movimento Invalido!");
            }
        } else {
            System.out.println("Espaços extras estao cheios");
        }
    }   // PRONTO

    public void moveToExtra(String carta, String futuraPilha) {

        if (carta.equals(t1.carta) || carta.equals(t2.carta) || carta.equals(t3.carta)
                || carta.equals(t4.carta) || carta.equals(t5.carta) || carta.equals(t6.carta)
                || carta.equals(t7.carta) || carta.equals(t8.carta)) {

            if (futuraPilha.equals("1") && extra1 == null) {   //PARA MOVER PRO ESPAÇO EXTRA 1
                if (carta.equals(t1.carta)) {
                    extra1 = t1;
                    t1.ant.prox = null;
                    t1 = t1.ant;
                } else if (carta.equals(t2.carta)) {
                    extra1 = t2;
                    t2.ant.prox = null;
                    t2 = t2.ant;
                } else if (carta.equals(t3.carta)) {
                    extra1 = t3;
                    t3.ant.prox = null;
                    t3 = t3.ant;
                } else if (carta.equals(t4.carta)) {
                    extra1 = t4;
                    t4.ant.prox = null;
                    t4 = t4.ant;
                } else if (carta.equals(t5.carta)) {
                    extra1 = t5;
                    t5.ant.prox = null;
                    t5 = t5.ant;
                } else if (carta.equals(t6.carta)) {
                    extra1 = t6;
                    t6.ant.prox = null;
                    t6 = t6.ant;
                } else if (carta.equals(t7.carta)) {
                    extra1 = t7;
                    t7.ant.prox = null;
                    t7 = t7.ant;
                } else if (carta.equals(t8.carta)) {
                    extra1 = t8;
                    t8.ant.prox = null;
                    t8 = t8.ant;
                } else {
                    System.out.println("Carta digitada errado");
                }

            } else if (futuraPilha.equals("2") && extra2 == null) { //PARA MOVER PRO ESPAÇO EXTRA 1
                if (carta.equals(t1.carta)) {
                    extra2 = t1;
                    t1.ant.prox = null;
                    t1 = t1.ant;
                } else if (carta.equals(t2.carta)) {
                    extra2 = t2;
                    t2.ant.prox = null;
                    t2 = t2.ant;
                } else if (carta.equals(t3.carta)) {
                    extra2 = t3;
                    t3.ant.prox = null;
                    t3 = t3.ant;
                } else if (carta.equals(t4.carta)) {
                    extra2 = t4;
                    t4.ant.prox = null;
                    t4 = t4.ant;
                } else if (carta.equals(t5.carta)) {
                    extra2 = t5;
                    t5.ant.prox = null;
                    t5 = t5.ant;
                } else if (carta.equals(t6.carta)) {
                    extra2 = t6;
                    t6.ant.prox = null;
                    t6 = t6.ant;
                } else if (carta.equals(t7.carta)) {
                    extra2 = t7;
                    t7.ant.prox = null;
                    t7 = t7.ant;
                } else if (carta.equals(t8.carta)) {
                    extra2 = t8;
                    t8.ant.prox = null;
                    t8 = t8.ant;
                } else {
                    System.out.println("Carta digitada errado");
                }
            } else if (futuraPilha.equals("3") && extra3 == null) { //PARA MOVER PRO ESPAÇO EXTRA 1
                if (carta.equals(t1.carta)) {
                    extra3 = t1;
                    t1.ant.prox = null;
                    t1 = t1.ant;
                } else if (carta.equals(t2.carta)) {
                    extra3 = t2;
                    t2.ant.prox = null;
                    t2 = t2.ant;
                } else if (carta.equals(t3.carta)) {
                    extra3 = t3;
                    t3.ant.prox = null;
                    t3 = t3.ant;
                } else if (carta.equals(t4.carta)) {
                    extra3 = t4;
                    t4.ant.prox = null;
                    t4 = t4.ant;
                } else if (carta.equals(t5.carta)) {
                    extra3 = t5;
                    t5.ant.prox = null;
                    t5 = t5.ant;
                } else if (carta.equals(t6.carta)) {
                    extra3 = t6;
                    t6.ant.prox = null;
                    t6 = t6.ant;
                } else if (carta.equals(t7.carta)) {
                    extra3 = t7;
                    t7.ant.prox = null;
                    t7 = t7.ant;
                } else if (carta.equals(t8.carta)) {
                    extra3 = t8;
                    t8.ant.prox = null;
                    t8 = t8.ant;
                } else {
                    System.out.println("Carta digitada errado");
                }
            } else if (futuraPilha.equals("4") && extra4 == null) {  //PARA MOVER PRO ESPAÇO EXTRA 1
                if (carta.equals(t1.carta)) {
                    extra4 = t1;
                    t1.ant.prox = null;
                    t1 = t1.ant;
                } else if (carta.equals(t2.carta)) {
                    extra4 = t2;
                    t2.ant.prox = null;
                    t2 = t2.ant;
                } else if (carta.equals(t3.carta)) {
                    extra4 = t3;
                    t3.ant.prox = null;
                    t3 = t3.ant;
                } else if (carta.equals(t4.carta)) {
                    extra4 = t4;
                    t4.ant.prox = null;
                    t4 = t4.ant;
                } else if (carta.equals(t5.carta)) {
                    extra4 = t5;
                    t5.ant.prox = null;
                    t5 = t5.ant;
                } else if (carta.equals(t6.carta)) {
                    extra4 = t6;
                    t6.ant.prox = null;
                    t6 = t6.ant;
                } else if (carta.equals(t7.carta)) {
                    extra4 = t7;
                    t7.ant.prox = null;
                    t7 = t7.ant;
                } else if (carta.equals(t8.carta)) {
                    extra4 = t8;
                    t8.ant.prox = null;
                    t8 = t8.ant;
                } else {
                    System.out.println("Carta digitada errado 4");
                }
            }
        } else if (extra1 != null && carta.equals(extra1.carta) || extra2 != null && carta.equals(extra2.carta)
                || extra3 != null && carta.equals(extra3.carta) || extra4 != null && carta.equals(extra4.carta)) {  //PARA TIRAR DO EXTRA

            if (carta.equals(extra1.carta)) {
                if (futuraPilha.equals(t1.carta) && !extra1.cor.equals(t1.cor) && (extra1.num + 1) == t1.num) {
                    t1.prox = extra1;
                    t1.prox.ant = t1;
                    t1 = extra1;
                    extra1 = null;
                } else if (futuraPilha.equals(t2.carta) && !extra1.cor.equals(t2.cor) && (extra1.num + 1) == t2.num) {
                    t2.prox = extra1;
                    t2.prox.ant = t2;
                    t2 = extra1;
                    extra1 = null;
                } else if (futuraPilha.equals(t3.carta) && !extra1.cor.equals(t3.cor) && (extra1.num + 1) == t3.num) {
                    t3.prox = extra1;
                    t3.prox.ant = t3;
                    t3 = extra1;
                    extra1 = null;
                } else if (futuraPilha.equals(t4.carta) && !extra1.cor.equals(t4.cor) && (extra1.num + 1) == t4.num) {
                    t4.prox = extra1;
                    t4.prox.ant = t4;
                    t4 = extra1;
                    extra1 = null;
                } else if (futuraPilha.equals(t5.carta) && !extra1.cor.equals(t5.cor) && (extra1.num + 1) == t5.num) {
                    t5.prox = extra1;
                    t5.prox.ant = t5;
                    t5 = extra1;
                    extra1 = null;
                } else if (futuraPilha.equals(t6.carta) && !extra1.cor.equals(t6.cor) && (extra1.num + 1) == t6.num) {
                    t6.prox = extra1;
                    t6.prox.ant = t6;
                    t6 = extra1;
                    extra1 = null;
                } else if (futuraPilha.equals(t7.carta) && !extra1.cor.equals(t7.cor) && (extra1.num + 1) == t7.num) {
                    t7.prox = extra1;
                    t7.prox.ant = t7;
                    t7 = extra1;
                    extra1 = null;
                } else if (futuraPilha.equals(t8.carta) && !extra1.cor.equals(t8.cor) && (extra1.num + 1) == t8.num) {
                    t8.prox = extra1;
                    t8.prox.ant = t8;
                    t8 = extra1;
                    extra1 = null;
                } else {
                    System.out.println("aqui 2");
                }

            } else if (carta.equals(extra2.carta)) {
                if (futuraPilha.equals(t1.carta) && !extra2.cor.equals(t1.cor) && (extra2.num + 1) == t1.num) {
                    t1.prox = extra2;
                    t1.prox.ant = t1;
                    t1 = extra2;
                    extra2 = null;
                } else if (futuraPilha.equals(t2.carta) && !extra2.cor.equals(t2.cor) && (extra2.num + 1) == t2.num) {
                    t2.prox = extra2;
                    t2.prox.ant = t2;
                    t2 = extra2;
                    extra2 = null;
                } else if (futuraPilha.equals(t3.carta) && !extra2.cor.equals(t3.cor) && (extra2.num + 1) == t3.num) {
                    t3.prox = extra2;
                    t3.prox.ant = t3;
                    t3 = extra2;
                    extra2 = null;
                } else if (futuraPilha.equals(t4.carta) && !extra2.cor.equals(t4.cor) && (extra2.num + 1) == t4.num) {
                    t4.prox = extra2;
                    t4.prox.ant = t4;
                    t4 = extra2;
                    extra2 = null;
                } else if (futuraPilha.equals(t5.carta) && !extra2.cor.equals(t5.cor) && (extra2.num + 1) == t5.num) {
                    t5.prox = extra2;
                    t5.prox.ant = t5;
                    t5 = extra2;
                    extra2 = null;
                } else if (futuraPilha.equals(t6.carta) && !extra2.cor.equals(t6.cor) && (extra2.num + 1) == t6.num) {
                    t6.prox = extra2;
                    t6.prox.ant = t6;
                    t6 = extra2;
                    extra2 = null;
                } else if (futuraPilha.equals(t7.carta) && !extra2.cor.equals(t7.cor) && (extra2.num + 1) == t7.num) {
                    t7.prox = extra2;
                    t7.prox.ant = t7;
                    t7 = extra2;
                    extra2 = null;
                } else if (futuraPilha.equals(t8.carta) && !extra2.cor.equals(t8.cor) && (extra2.num + 1) == t8.num) {
                    t8.prox = extra2;
                    t8.prox.ant = t8;
                    t8 = extra2;
                    extra2 = null;
                } else {
                    System.out.println("aqui 3");
                }

            } else if (carta.equals(extra3.carta)) {
                if (futuraPilha.equals(t1.carta) && !extra3.cor.equals(t1.cor) && (extra3.num + 1) == t1.num) {
                    t1.prox = extra3;
                    t1.prox.ant = t1;
                    t1 = extra3;
                    extra3 = null;
                } else if (futuraPilha.equals(t2.carta) && !extra3.cor.equals(t2.cor) && (extra3.num + 1) == t2.num) {
                    t2.prox = extra3;
                    t2.prox.ant = t2;
                    t2 = extra3;
                    extra3 = null;
                } else if (futuraPilha.equals(t3.carta) && !extra3.cor.equals(t3.cor) && (extra3.num + 1) == t3.num) {
                    t3.prox = extra3;
                    t3.prox.ant = t3;
                    t3 = extra3;
                    extra3 = null;
                } else if (futuraPilha.equals(t4.carta) && !extra3.cor.equals(t4.cor) && (extra3.num + 1) == t4.num) {
                    t4.prox = extra3;
                    t4.prox.ant = t4;
                    t4 = extra3;
                    extra3 = null;
                } else if (futuraPilha.equals(t5.carta) && !extra3.cor.equals(t5.cor) && (extra3.num + 1) == t5.num) {
                    t5.prox = extra3;
                    t5.prox.ant = t5;
                    t5 = extra3;
                    extra3 = null;
                } else if (futuraPilha.equals(t6.carta) && !extra3.cor.equals(t6.cor) && (extra3.num + 1) == t6.num) {
                    t6.prox = extra3;
                    t6.prox.ant = t6;
                    t6 = extra3;
                    extra3 = null;
                } else if (futuraPilha.equals(t7.carta) && !extra3.cor.equals(t7.cor) && (extra3.num + 1) == t7.num) {
                    t7.prox = extra3;
                    t7.prox.ant = t7;
                    t7 = extra3;
                    extra3 = null;
                } else if (futuraPilha.equals(t8.carta) && !extra3.cor.equals(t8.cor) && (extra3.num + 1) == t8.num) {
                    t8.prox = extra3;
                    t8.prox.ant = t8;
                    t8 = extra3;
                    extra3 = null;
                } else {
                    System.out.println("aqui 4");
                }

            } else if (carta.equals(extra4.carta)) {
                if (futuraPilha.equals(t1.carta) && !extra4.cor.equals(t1.cor) && (extra4.num + 1) == t1.num) {
                    t1.prox = extra4;
                    t1.prox.ant = t1;
                    t1 = extra4;
                    extra4 = null;
                } else if (futuraPilha.equals(t2.carta) && !extra4.cor.equals(t2.cor) && (extra4.num + 1) == t2.num) {
                    t2.prox = extra4;
                    t2.prox.ant = t2;
                    t2 = extra4;
                    extra4 = null;
                } else if (futuraPilha.equals(t3.carta) && !extra4.cor.equals(t3.cor) && (extra4.num + 1) == t3.num) {
                    t3.prox = extra4;
                    t3.prox.ant = t3;
                    t3 = extra4;
                    extra4 = null;
                } else if (futuraPilha.equals(t4.carta) && !extra4.cor.equals(t4.cor) && (extra4.num + 1) == t4.num) {
                    t4.prox = extra4;
                    t4.prox.ant = t4;
                    t4 = extra4;
                    extra4 = null;
                } else if (futuraPilha.equals(t5.carta) && !extra4.cor.equals(t5.cor) && (extra4.num + 1) == t5.num) {
                    t5.prox = extra4;
                    t5.prox.ant = t5;
                    t5 = extra4;
                    extra4 = null;
                } else if (futuraPilha.equals(t6.carta) && !extra4.cor.equals(t6.cor) && (extra4.num + 1) == t6.num) {
                    t6.prox = extra4;
                    t6.prox.ant = t6;
                    t6 = extra4;
                    extra4 = null;
                } else if (futuraPilha.equals(t7.carta) && !extra4.cor.equals(t7.cor) && (extra4.num + 1) == t7.num) {
                    t7.prox = extra4;
                    t7.prox.ant = t7;
                    t7 = extra4;
                    extra4 = null;
                } else if (futuraPilha.equals(t8.carta) && !extra4.cor.equals(t8.cor) && (extra4.num + 1) == t8.num) {
                    t8.prox = extra4;
                    t8.prox.ant = t8;
                    t8 = extra4;
                    extra4 = null;
                } else {
                    System.out.println("aqui 5");
                }

            }

        } else {
            System.out.println("Espaco nao vazio ou nome de espaco digitado errado");
        }
    }   // PRONTO

    public void moveMore(String carta, String futuraPilha) {

        //--------------------------------------------para mover 4--------------------------------------------
        if (carta.equals(t1.ant.ant.ant.carta)) {
            Carta aux = t1.ant.ant.ant;

            if (extra1 == null && extra2 == null && extra3 == null && extra4 == null) {

                if (!aux.cor.equals(aux.prox.cor) && !aux.prox.cor.equals(aux.prox.prox.cor)
                        && !aux.prox.prox.cor.equals(aux.prox.prox.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1) && aux.prox.num == (aux.prox.prox.num + 1)
                            && aux.prox.prox.num == (aux.prox.prox.prox.num + 1)) {

                        if (futuraPilha.equals(t2.carta)) {
                            t2.prox = aux;
                            t1 = t1.ant.ant.ant.ant;
                            t1.prox = null;
                            t2 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t3.carta)) {
                            t3.prox = aux;
                            t1 = t1.ant.ant.ant.ant;
                            t1.prox = null;
                            t3 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t4.carta)) {
                            t4.prox = aux;
                            t1 = t1.ant.ant.ant.ant;
                            t1.prox = null;
                            t4 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t5.carta)) {
                            t5.prox = aux;
                            t1 = t1.ant.ant.ant.ant;
                            t1.prox = null;
                            t5 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t6.carta)) {
                            t6.prox = aux;
                            t1 = t1.ant.ant.ant.ant;
                            t1.prox = null;
                            t6 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t7.carta)) {
                            t7.prox = aux;
                            t1 = t1.ant.ant.ant.ant;
                            t1.prox = null;
                            t7 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t8.carta)) {
                            t8.prox = aux;
                            t1 = t1.ant.ant.ant.ant;
                            t1.prox = null;
                            t8 = aux.prox.prox.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }
        } else if (carta.equals(t2.ant.ant.ant.carta)) {
            Carta aux = t2.ant.ant.ant;

            if (extra1 == null && extra2 == null && extra3 == null && extra4 == null) {

                if (!aux.cor.equals(aux.prox.cor) && !aux.prox.cor.equals(aux.prox.prox.cor)
                        && !aux.prox.prox.cor.equals(aux.prox.prox.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1) && aux.prox.num == (aux.prox.prox.num + 1)
                            && aux.prox.prox.num == (aux.prox.prox.prox.num + 1)) {

                        if (futuraPilha.equals(t1.carta)) {
                            t1.prox = aux;
                            t2 = t2.ant.ant.ant.ant;
                            t2.prox = null;
                            t1 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t3.carta)) {
                            t3.prox = aux;
                            t2 = t2.ant.ant.ant.ant;
                            t2.prox = null;
                            t3 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t4.carta)) {
                            t4.prox = aux;
                            t2 = t2.ant.ant.ant.ant;
                            t2.prox = null;
                            t4 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t5.carta)) {
                            t5.prox = aux;
                            t2 = t2.ant.ant.ant.ant;
                            t2.prox = null;
                            t5 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t6.carta)) {
                            t6.prox = aux;
                            t2 = t2.ant.ant.ant.ant;
                            t2.prox = null;
                            t6 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t7.carta)) {
                            t7.prox = aux;
                            t2 = t2.ant.ant.ant.ant;
                            t2.prox = null;
                            t7 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t8.carta)) {
                            t8.prox = aux;
                            t2 = t2.ant.ant.ant.ant;
                            t2.prox = null;
                            t8 = aux.prox.prox.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }

        } else if (carta.equals(t3.ant.ant.ant.carta)) {
            Carta aux = t3.ant.ant.ant;

            if (extra1 == null && extra2 == null && extra3 == null && extra4 == null) {

                if (!aux.cor.equals(aux.prox.cor) && !aux.prox.cor.equals(aux.prox.prox.cor)
                        && !aux.prox.prox.cor.equals(aux.prox.prox.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1) && aux.prox.num == (aux.prox.prox.num + 1)
                            && aux.prox.prox.num == (aux.prox.prox.prox.num + 1)) {

                        if (futuraPilha.equals(t1.carta)) {
                            t1.prox = aux;
                            t3 = t3.ant.ant.ant.ant;
                            t3.prox = null;
                            t1 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t2.carta)) {
                            t2.prox = aux;
                            t3 = t3.ant.ant.ant.ant;
                            t3.prox = null;
                            t2 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t4.carta)) {
                            t4.prox = aux;
                            t3 = t3.ant.ant.ant.ant;
                            t3.prox = null;
                            t4 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t5.carta)) {
                            t5.prox = aux;
                            t3 = t3.ant.ant.ant.ant;
                            t3.prox = null;
                            t5 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t6.carta)) {
                            t6.prox = aux;
                            t3 = t3.ant.ant.ant.ant;
                            t3.prox = null;
                            t6 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t7.carta)) {
                            t7.prox = aux;
                            t3 = t3.ant.ant.ant.ant;
                            t3.prox = null;
                            t7 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t8.carta)) {
                            t8.prox = aux;
                            t3 = t3.ant.ant.ant.ant;
                            t3.prox = null;
                            t8 = aux.prox.prox.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }
        } else if (carta.equals(t4.ant.ant.ant.carta)) {
            Carta aux = t4.ant.ant.ant;

            if (extra1 == null && extra2 == null && extra3 == null && extra4 == null) {

                if (!aux.cor.equals(aux.prox.cor) && !aux.prox.cor.equals(aux.prox.prox.cor)
                        && !aux.prox.prox.cor.equals(aux.prox.prox.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1) && aux.prox.num == (aux.prox.prox.num + 1)
                            && aux.prox.prox.num == (aux.prox.prox.prox.num + 1)) {

                        if (futuraPilha.equals(t1.carta)) {
                            t1.prox = aux;
                            t4 = t4.ant.ant.ant.ant;
                            t4.prox = null;
                            t1 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t2.carta)) {
                            t2.prox = aux;
                            t4 = t4.ant.ant.ant.ant;
                            t4.prox = null;
                            t2 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t3.carta)) {
                            t3.prox = aux;
                            t4 = t4.ant.ant.ant.ant;
                            t4.prox = null;
                            t3 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t5.carta)) {
                            t5.prox = aux;
                            t4 = t4.ant.ant.ant.ant;
                            t4.prox = null;
                            t5 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t6.carta)) {
                            t6.prox = aux;
                            t4 = t4.ant.ant.ant.ant;
                            t4.prox = null;
                            t6 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t7.carta)) {
                            t7.prox = aux;
                            t4 = t4.ant.ant.ant.ant;
                            t4.prox = null;
                            t7 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t8.carta)) {
                            t8.prox = aux;
                            t4 = t4.ant.ant.ant.ant;
                            t4.prox = null;
                            t8 = aux.prox.prox.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }
        } else if (carta.equals(t5.ant.ant.ant.carta)) {
            Carta aux = t5.ant.ant.ant;

            if (extra1 == null && extra2 == null && extra3 == null && extra4 == null) {

                if (!aux.cor.equals(aux.prox.cor) && !aux.prox.cor.equals(aux.prox.prox.cor)
                        && !aux.prox.prox.cor.equals(aux.prox.prox.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1) && aux.prox.num == (aux.prox.prox.num + 1)
                            && aux.prox.prox.num == (aux.prox.prox.prox.num + 1)) {

                        if (futuraPilha.equals(t1.carta)) {
                            t1.prox = aux;
                            t5 = t5.ant.ant.ant.ant;
                            t5.prox = null;
                            t1 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t2.carta)) {
                            t2.prox = aux;
                            t5 = t5.ant.ant.ant.ant;
                            t5.prox = null;
                            t2 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t3.carta)) {
                            t3.prox = aux;
                            t5 = t5.ant.ant.ant.ant;
                            t5.prox = null;
                            t3 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t4.carta)) {
                            t4.prox = aux;
                            t5 = t5.ant.ant.ant.ant;
                            t5.prox = null;
                            t4 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t6.carta)) {
                            t6.prox = aux;
                            t5 = t5.ant.ant.ant.ant;
                            t5.prox = null;
                            t6 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t7.carta)) {
                            t7.prox = aux;
                            t5 = t5.ant.ant.ant.ant;
                            t5.prox = null;
                            t7 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t8.carta)) {
                            t8.prox = aux;
                            t5 = t5.ant.ant.ant.ant;
                            t5.prox = null;
                            t8 = aux.prox.prox.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }
        } else if (carta.equals(t6.ant.ant.ant.carta)) {
            Carta aux = t6.ant.ant.ant;

            if (extra1 == null && extra2 == null && extra3 == null && extra4 == null) {

                if (!aux.cor.equals(aux.prox.cor) && !aux.prox.cor.equals(aux.prox.prox.cor)
                        && !aux.prox.prox.cor.equals(aux.prox.prox.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1) && aux.prox.num == (aux.prox.prox.num + 1)
                            && aux.prox.prox.num == (aux.prox.prox.prox.num + 1)) {

                        if (futuraPilha.equals(t1.carta)) {
                            t1.prox = aux;
                            t6 = t6.ant.ant.ant.ant;
                            t6.prox = null;
                            t1 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t2.carta)) {
                            t2.prox = aux;
                            t6 = t6.ant.ant.ant.ant;
                            t6.prox = null;
                            t2 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t3.carta)) {
                            t3.prox = aux;
                            t6 = t6.ant.ant.ant.ant;
                            t6.prox = null;
                            t3 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t4.carta)) {
                            t4.prox = aux;
                            t6 = t6.ant.ant.ant.ant;
                            t6.prox = null;
                            t4 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t5.carta)) {
                            t5.prox = aux;
                            t6 = t6.ant.ant.ant.ant;
                            t6.prox = null;
                            t5 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t7.carta)) {
                            t7.prox = aux;
                            t6 = t6.ant.ant.ant.ant;
                            t6.prox = null;
                            t7 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t8.carta)) {
                            t8.prox = aux;
                            t6 = t6.ant.ant.ant.ant;
                            t6.prox = null;
                            t8 = aux.prox.prox.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }
        } else if (carta.equals(t7.ant.ant.ant.carta)) {
            Carta aux = t7.ant.ant.ant;

            if (extra1 == null && extra2 == null && extra3 == null && extra4 == null) {

                if (!aux.cor.equals(aux.prox.cor) && !aux.prox.cor.equals(aux.prox.prox.cor)
                        && !aux.prox.prox.cor.equals(aux.prox.prox.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1) && aux.prox.num == (aux.prox.prox.num + 1)
                            && aux.prox.prox.num == (aux.prox.prox.prox.num + 1)) {

                        if (futuraPilha.equals(t1.carta)) {
                            t1.prox = aux;
                            t7 = t7.ant.ant.ant.ant;
                            t7.prox = null;
                            t1 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t2.carta)) {
                            t2.prox = aux;
                            t7 = t7.ant.ant.ant.ant;
                            t7.prox = null;
                            t2 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t3.carta)) {
                            t3.prox = aux;
                            t7 = t7.ant.ant.ant.ant;
                            t7.prox = null;
                            t3 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t4.carta)) {
                            t4.prox = aux;
                            t7 = t7.ant.ant.ant.ant;
                            t7.prox = null;
                            t4 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t5.carta)) {
                            t5.prox = aux;
                            t7 = t7.ant.ant.ant.ant;
                            t7.prox = null;
                            t5 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t6.carta)) {
                            t6.prox = aux;
                            t7 = t7.ant.ant.ant.ant;
                            t7.prox = null;
                            t6 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t8.carta)) {
                            t8.prox = aux;
                            t7 = t7.ant.ant.ant.ant;
                            t7.prox = null;
                            t8 = aux.prox.prox.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }
        } else if (carta.equals(t8.ant.ant.ant.carta)) {
            Carta aux = t8.ant.ant.ant;

            if (extra1 == null && extra2 == null && extra3 == null && extra4 == null) {

                if (!aux.cor.equals(aux.prox.cor) && !aux.prox.cor.equals(aux.prox.prox.cor)
                        && !aux.prox.prox.cor.equals(aux.prox.prox.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1) && aux.prox.num == (aux.prox.prox.num + 1)
                            && aux.prox.prox.num == (aux.prox.prox.prox.num + 1)) {

                        if (futuraPilha.equals(t1.carta)) {
                            t1.prox = aux;
                            t8 = t8.ant.ant.ant.ant;
                            t8.prox = null;
                            t1 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t2.carta)) {
                            t2.prox = aux;
                            t8 = t8.ant.ant.ant.ant;
                            t8.prox = null;
                            t2 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t3.carta)) {
                            t3.prox = aux;
                            t8 = t8.ant.ant.ant.ant;
                            t8.prox = null;
                            t3 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t4.carta)) {
                            t4.prox = aux;
                            t8 = t8.ant.ant.ant.ant;
                            t8.prox = null;
                            t4 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t5.carta)) {
                            t5.prox = aux;
                            t8 = t8.ant.ant.ant.ant;
                            t8.prox = null;
                            t5 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t6.carta)) {
                            t6.prox = aux;
                            t8 = t8.ant.ant.ant.ant;
                            t8.prox = null;
                            t6 = aux.prox.prox.prox;
                        } else if (futuraPilha.equals(t7.carta)) {
                            t7.prox = aux;
                            t8 = t8.ant.ant.ant.ant;
                            t8.prox = null;
                            t7 = aux.prox.prox.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }
        } //----------------------------------------------------------------------------------------
        //--------------------------------------------para mover 3--------------------------------------------
        else if (carta.equals(t1.ant.ant.carta)) {
            Carta aux = t1.ant.ant;

            if ((extra1 == null && extra2 == null && extra3 == null) || (extra1 == null && extra3 == null && extra4 == null)
                    || (extra1 == null && extra2 == null && extra4 == null) || (extra2 == null && extra3 == null && extra4 == null)) {

                if (!aux.cor.equals(aux.prox.cor) && !aux.prox.cor.equals(aux.prox.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1) && aux.prox.num == (aux.prox.prox.num + 1)) {

                        if (futuraPilha.equals(t2.carta)) {
                            t2.prox = aux;
                            t1 = t1.ant.ant.ant;
                            t1.prox = null;
                            t2 = aux.prox.prox;
                        } else if (futuraPilha.equals(t3.carta)) {
                            t3.prox = aux;
                            t1 = t1.ant.ant.ant;
                            t1.prox = null;
                            t3 = aux.prox.prox;
                        } else if (futuraPilha.equals(t4.carta)) {
                            t4.prox = aux;
                            t1 = t1.ant.ant.ant;
                            t1.prox = null;
                            t4 = aux.prox.prox;
                        } else if (futuraPilha.equals(t5.carta)) {
                            t5.prox = aux;
                            t1 = t1.ant.ant.ant;
                            t1.prox = null;
                            t5 = aux.prox.prox;
                        } else if (futuraPilha.equals(t6.carta)) {
                            t6.prox = aux;
                            t1 = t1.ant.ant.ant;
                            t1.prox = null;
                            t6 = aux.prox.prox;
                        } else if (futuraPilha.equals(t7.carta)) {
                            t7.prox = aux;
                            t1 = t1.ant.ant.ant;
                            t1.prox = null;
                            t7 = aux.prox.prox;
                        } else if (futuraPilha.equals(t8.carta)) {
                            t8.prox = aux;
                            t1 = t1.ant.ant.ant;
                            t1.prox = null;
                            t8 = aux.prox.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }
        } else if (carta.equals(t2.ant.ant.carta)) {
            Carta aux = t2.ant.ant;

            if ((extra1 == null && extra2 == null && extra3 == null) || (extra1 == null && extra3 == null && extra4 == null)
                    || (extra1 == null && extra2 == null && extra4 == null) || (extra2 == null && extra3 == null && extra4 == null)) {

                if (!aux.cor.equals(aux.prox.cor) && !aux.prox.cor.equals(aux.prox.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1) && aux.prox.num == (aux.prox.prox.num + 1)) {

                        if (futuraPilha.equals(t1.carta)) {
                            t1.prox = aux;
                            t2 = t2.ant.ant.ant;
                            t2.prox = null;
                            t1 = aux.prox.prox;
                        } else if (futuraPilha.equals(t3.carta)) {
                            t3.prox = aux;
                            t2 = t2.ant.ant.ant;
                            t2.prox = null;
                            t3 = aux.prox.prox;
                        } else if (futuraPilha.equals(t4.carta)) {
                            t4.prox = aux;
                            t2 = t2.ant.ant.ant;
                            t2.prox = null;
                            t4 = aux.prox.prox;
                        } else if (futuraPilha.equals(t5.carta)) {
                            t5.prox = aux;
                            t2 = t2.ant.ant.ant;
                            t2.prox = null;
                            t5 = aux.prox.prox;
                        } else if (futuraPilha.equals(t6.carta)) {
                            t6.prox = aux;
                            t2 = t2.ant.ant.ant;
                            t2.prox = null;
                            t6 = aux.prox.prox;
                        } else if (futuraPilha.equals(t7.carta)) {
                            t7.prox = aux;
                            t2 = t2.ant.ant.ant;
                            t2.prox = null;
                            t7 = aux.prox.prox;
                        } else if (futuraPilha.equals(t8.carta)) {
                            t8.prox = aux;
                            t2 = t2.ant.ant.ant;
                            t2.prox = null;
                            t8 = aux.prox.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }
        } else if (carta.equals(t3.ant.ant.carta)) {
            Carta aux = t3.ant.ant;

            if ((extra1 == null && extra2 == null && extra3 == null) || (extra1 == null && extra3 == null && extra4 == null)
                    || (extra1 == null && extra2 == null && extra4 == null) || (extra2 == null && extra3 == null && extra4 == null)) {

                if (!aux.cor.equals(aux.prox.cor) && !aux.prox.cor.equals(aux.prox.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1) && aux.prox.num == (aux.prox.prox.num + 1)) {

                        if (futuraPilha.equals(t1.carta)) {
                            t1.prox = aux;
                            t3 = t3.ant.ant.ant;
                            t3.prox = null;
                            t1 = aux.prox.prox;
                        } else if (futuraPilha.equals(t2.carta)) {
                            t2.prox = aux;
                            t3 = t3.ant.ant.ant;
                            t3.prox = null;
                            t2 = aux.prox.prox;
                        } else if (futuraPilha.equals(t4.carta)) {
                            t4.prox = aux;
                            t3 = t3.ant.ant.ant;
                            t3.prox = null;
                            t4 = aux.prox.prox;
                        } else if (futuraPilha.equals(t5.carta)) {
                            t5.prox = aux;
                            t3 = t3.ant.ant.ant;
                            t3.prox = null;
                            t5 = aux.prox.prox;
                        } else if (futuraPilha.equals(t6.carta)) {
                            t6.prox = aux;
                            t3 = t3.ant.ant.ant;
                            t3.prox = null;
                            t6 = aux.prox.prox;
                        } else if (futuraPilha.equals(t7.carta)) {
                            t7.prox = aux;
                            t3 = t3.ant.ant.ant;
                            t3.prox = null;
                            t7 = aux.prox.prox;
                        } else if (futuraPilha.equals(t8.carta)) {
                            t8.prox = aux;
                            t3 = t3.ant.ant.ant;
                            t3.prox = null;
                            t8 = aux.prox.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }
        } else if (carta.equals(t4.ant.ant.carta)) {
            Carta aux = t4.ant.ant;

            if ((extra1 == null && extra2 == null && extra3 == null) || (extra1 == null && extra3 == null && extra4 == null)
                    || (extra1 == null && extra2 == null && extra4 == null) || (extra2 == null && extra3 == null && extra4 == null)) {

                if (!aux.cor.equals(aux.prox.cor) && !aux.prox.cor.equals(aux.prox.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1) && aux.prox.num == (aux.prox.prox.num + 1)) {

                        if (futuraPilha.equals(t1.carta)) {
                            t1.prox = aux;
                            t4 = t4.ant.ant.ant;
                            t4.prox = null;
                            t1 = aux.prox.prox;
                        } else if (futuraPilha.equals(t2.carta)) {
                            t2.prox = aux;
                            t4 = t4.ant.ant.ant;
                            t4.prox = null;
                            t2 = aux.prox.prox;
                        } else if (futuraPilha.equals(t3.carta)) {
                            t3.prox = aux;
                            t4 = t4.ant.ant.ant;
                            t4.prox = null;
                            t3 = aux.prox.prox;
                        } else if (futuraPilha.equals(t5.carta)) {
                            t5.prox = aux;
                            t4 = t4.ant.ant.ant;
                            t4.prox = null;
                            t5 = aux.prox.prox;
                        } else if (futuraPilha.equals(t6.carta)) {
                            t6.prox = aux;
                            t4 = t4.ant.ant.ant;
                            t4.prox = null;
                            t6 = aux.prox.prox;
                        } else if (futuraPilha.equals(t7.carta)) {
                            t7.prox = aux;
                            t4 = t4.ant.ant.ant;
                            t4.prox = null;
                            t7 = aux.prox.prox;
                        } else if (futuraPilha.equals(t8.carta)) {
                            t8.prox = aux;
                            t4 = t4.ant.ant.ant;
                            t4.prox = null;
                            t8 = aux.prox.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }
        } else if (carta.equals(t5.ant.ant.carta)) {
            Carta aux = t5.ant.ant;

            if ((extra1 == null && extra2 == null && extra3 == null) || (extra1 == null && extra3 == null && extra4 == null)
                    || (extra1 == null && extra2 == null && extra4 == null) || (extra2 == null && extra3 == null && extra4 == null)) {

                if (!aux.cor.equals(aux.prox.cor) && !aux.prox.cor.equals(aux.prox.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1) && aux.prox.num == (aux.prox.prox.num + 1)) {

                        if (futuraPilha.equals(t1.carta)) {
                            t1.prox = aux;
                            t5 = t5.ant.ant.ant;
                            t5.prox = null;
                            t1 = aux.prox.prox;
                        } else if (futuraPilha.equals(t2.carta)) {
                            t2.prox = aux;
                            t5 = t5.ant.ant.ant;
                            t5.prox = null;
                            t2 = aux.prox.prox;
                        } else if (futuraPilha.equals(t3.carta)) {
                            t3.prox = aux;
                            t5 = t5.ant.ant.ant;
                            t5.prox = null;
                            t3 = aux.prox.prox;
                        } else if (futuraPilha.equals(t4.carta)) {
                            t4.prox = aux;
                            t5 = t5.ant.ant.ant;
                            t5.prox = null;
                            t4 = aux.prox.prox;
                        } else if (futuraPilha.equals(t6.carta)) {
                            t6.prox = aux;
                            t5 = t5.ant.ant.ant;
                            t5.prox = null;
                            t6 = aux.prox.prox;
                        } else if (futuraPilha.equals(t7.carta)) {
                            t7.prox = aux;
                            t5 = t5.ant.ant.ant;
                            t5.prox = null;
                            t7 = aux.prox.prox;
                        } else if (futuraPilha.equals(t8.carta)) {
                            t8.prox = aux;
                            t5 = t5.ant.ant.ant;
                            t5.prox = null;
                            t8 = aux.prox.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }
        } else if (carta.equals(t6.ant.ant.carta)) {
            Carta aux = t6.ant.ant;

            if ((extra1 == null && extra2 == null && extra3 == null) || (extra1 == null && extra3 == null && extra4 == null)
                    || (extra1 == null && extra2 == null && extra4 == null) || (extra2 == null && extra3 == null && extra4 == null)) {

                if (!aux.cor.equals(aux.prox.cor) && !aux.prox.cor.equals(aux.prox.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1) && aux.prox.num == (aux.prox.prox.num + 1)) {

                        if (futuraPilha.equals(t1.carta)) {
                            t1.prox = aux;
                            t6 = t6.ant.ant.ant;
                            t6.prox = null;
                            t1 = aux.prox.prox;
                        } else if (futuraPilha.equals(t2.carta)) {
                            t2.prox = aux;
                            t6 = t6.ant.ant.ant;
                            t6.prox = null;
                            t2 = aux.prox.prox;
                        } else if (futuraPilha.equals(t3.carta)) {
                            t3.prox = aux;
                            t6 = t6.ant.ant.ant;
                            t6.prox = null;
                            t3 = aux.prox.prox;
                        } else if (futuraPilha.equals(t4.carta)) {
                            t4.prox = aux;
                            t6 = t6.ant.ant.ant;
                            t6.prox = null;
                            t4 = aux.prox.prox;
                        } else if (futuraPilha.equals(t5.carta)) {
                            t5.prox = aux;
                            t6 = t6.ant.ant.ant;
                            t6.prox = null;
                            t5 = aux.prox.prox;
                        } else if (futuraPilha.equals(t7.carta)) {
                            t7.prox = aux;
                            t6 = t6.ant.ant.ant;
                            t6.prox = null;
                            t7 = aux.prox.prox;
                        } else if (futuraPilha.equals(t8.carta)) {
                            t8.prox = aux;
                            t6 = t6.ant.ant.ant;
                            t6.prox = null;
                            t8 = aux.prox.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }
        } else if (carta.equals(t7.ant.ant.carta)) {
            Carta aux = t7.ant.ant;

            if ((extra1 == null && extra2 == null && extra3 == null) || (extra1 == null && extra3 == null && extra4 == null)
                    || (extra1 == null && extra2 == null && extra4 == null) || (extra2 == null && extra3 == null && extra4 == null)) {

                if (!aux.cor.equals(aux.prox.cor) && !aux.prox.cor.equals(aux.prox.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1) && aux.prox.num == (aux.prox.prox.num + 1)) {
                        if (futuraPilha.equals(t1.carta)) {
                            t1.prox = aux;
                            t7 = t7.ant.ant.ant;
                            t7.prox = null;
                            t1 = aux.prox.prox;
                        } else if (futuraPilha.equals(t2.carta)) {
                            t2.prox = aux;
                            t7 = t7.ant.ant.ant;
                            t7.prox = null;
                            t2 = aux.prox.prox;
                        } else if (futuraPilha.equals(t3.carta)) {
                            t3.prox = aux;
                            t7 = t7.ant.ant.ant;
                            t7.prox = null;
                            t3 = aux.prox.prox;
                        } else if (futuraPilha.equals(t4.carta)) {
                            t4.prox = aux;
                            t7 = t7.ant.ant.ant;
                            t7.prox = null;
                            t4 = aux.prox.prox;
                        } else if (futuraPilha.equals(t5.carta)) {
                            t5.prox = aux;
                            t7 = t7.ant.ant.ant;
                            t7.prox = null;
                            t5 = aux.prox.prox;
                        } else if (futuraPilha.equals(t6.carta)) {
                            t6.prox = aux;
                            t7 = t7.ant.ant.ant;
                            t7.prox = null;
                            t6 = aux.prox.prox;
                        } else if (futuraPilha.equals(t8.carta)) {
                            t8.prox = aux;
                            t7 = t7.ant.ant.ant;
                            t7.prox = null;
                            t8 = aux.prox.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }
        } else if (carta.equals(t8.ant.ant.carta)) {
            Carta aux = t8.ant.ant;

            if ((extra1 == null && extra2 == null && extra3 == null) || (extra1 == null && extra3 == null && extra4 == null)
                    || (extra1 == null && extra2 == null && extra4 == null) || (extra2 == null && extra3 == null && extra4 == null)) {

                if (!aux.cor.equals(aux.prox.cor) && !aux.prox.cor.equals(aux.prox.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1) && aux.prox.num == (aux.prox.prox.num + 1)) {

                        if (futuraPilha.equals(t1.carta)) {
                            t1.prox = aux;
                            t8 = t8.ant.ant.ant;
                            t8.prox = null;
                            t1 = aux.prox.prox;
                        } else if (futuraPilha.equals(t2.carta)) {
                            t2.prox = aux;
                            t8 = t8.ant.ant.ant;
                            t8.prox = null;
                            t2 = aux.prox.prox;
                        } else if (futuraPilha.equals(t3.carta)) {
                            t3.prox = aux;
                            t8 = t8.ant.ant.ant;
                            t8.prox = null;
                            t3 = aux.prox.prox;
                        } else if (futuraPilha.equals(t4.carta)) {
                            t4.prox = aux;
                            t8 = t8.ant.ant.ant;
                            t8.prox = null;
                            t4 = aux.prox.prox;
                        } else if (futuraPilha.equals(t5.carta)) {
                            t5.prox = aux;
                            t8 = t8.ant.ant.ant;
                            t8.prox = null;
                            t5 = aux.prox.prox;
                        } else if (futuraPilha.equals(t6.carta)) {
                            t6.prox = aux;
                            t8 = t8.ant.ant.ant;
                            t8.prox = null;
                            t6 = aux.prox.prox;
                        } else if (futuraPilha.equals(t7.carta)) {
                            t7.prox = aux;
                            t8 = t8.ant.ant.ant;
                            t8.prox = null;
                            t7 = aux.prox.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }
        } //----------------------------------------------------------------------------------------
        //--------------------------------------------para mover 2--------------------------------------------
        else if (carta.equals(t1.ant.carta)) {
            Carta aux = t1.ant;

            if ((extra1 == null && extra2 == null) || (extra1 == null && extra3 == null) || (extra1 == null && extra4 == null)
                    || (extra2 == null && extra3 == null) || (extra2 == null && extra4 == null) || (extra3 == null && extra4 == null)) {

                if (!aux.cor.equals(aux.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1)) {

                        if (futuraPilha.equals(t2.carta)) {
                            t2.prox = aux;
                            t1 = t1.ant.ant;
                            t1.prox = null;
                            t2 = aux.prox;
                        } else if (futuraPilha.equals(t3.carta)) {
                            t3.prox = aux;
                            t1 = t1.ant.ant;
                            t1.prox = null;
                            t3 = aux.prox;
                        } else if (futuraPilha.equals(t4.carta)) {
                            t4.prox = aux;
                            t1 = t1.ant.ant;
                            t1.prox = null;
                            t4 = aux.prox;
                        } else if (futuraPilha.equals(t5.carta)) {
                            t5.prox = aux;
                            t1 = t1.ant.ant;
                            t1.prox = null;
                            t5 = aux.prox;
                        } else if (futuraPilha.equals(t6.carta)) {
                            t6.prox = aux;
                            t1 = t1.ant.ant;
                            t1.prox = null;
                            t6 = aux.prox;
                        } else if (futuraPilha.equals(t7.carta)) {
                            t7.prox = aux;
                            t1 = t1.ant.ant;
                            t1.prox = null;
                            t7 = aux.prox;
                        } else if (futuraPilha.equals(t8.carta)) {
                            t8.prox = aux;
                            t1 = t1.ant.ant;
                            t1.prox = null;
                            t8 = aux.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }
        } else if (carta.equals(t2.ant.carta)) {
            Carta aux = t2.ant;

            if ((extra1 == null && extra2 == null) || (extra1 == null && extra3 == null) || (extra1 == null && extra4 == null)
                    || (extra2 == null && extra3 == null) || (extra2 == null && extra4 == null) || (extra3 == null && extra4 == null)) {

                if (!aux.cor.equals(aux.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1)) {

                        if (futuraPilha.equals(t1.carta)) {
                            t1.prox = aux;
                            t2 = t2.ant.ant;
                            t2.prox = null;
                            t1 = aux.prox;
                        } else if (futuraPilha.equals(t3.carta)) {
                            t3.prox = aux;
                            t2 = t2.ant.ant;
                            t2.prox = null;
                            t3 = aux.prox;
                        } else if (futuraPilha.equals(t4.carta)) {
                            t4.prox = aux;
                            t2 = t2.ant.ant;
                            t2.prox = null;
                            t4 = aux.prox;
                        } else if (futuraPilha.equals(t5.carta)) {
                            t5.prox = aux;
                            t2 = t2.ant.ant;
                            t2.prox = null;
                            t5 = aux.prox;
                        } else if (futuraPilha.equals(t6.carta)) {
                            t6.prox = aux;
                            t2 = t2.ant.ant;
                            t2.prox = null;
                            t6 = aux.prox;
                        } else if (futuraPilha.equals(t7.carta)) {
                            t7.prox = aux;
                            t2 = t2.ant.ant;
                            t2.prox = null;
                            t7 = aux.prox;
                        } else if (futuraPilha.equals(t8.carta)) {
                            t8.prox = aux;
                            t2 = t2.ant.ant;
                            t2.prox = null;
                            t8 = aux.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }
        } else if (carta.equals(t3.ant.carta)) {
            Carta aux = t3.ant;

            if ((extra1 == null && extra2 == null) || (extra1 == null && extra3 == null) || (extra1 == null && extra4 == null)
                    || (extra2 == null && extra3 == null) || (extra2 == null && extra4 == null) || (extra3 == null && extra4 == null)) {

                if (!aux.cor.equals(aux.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1)) {
                        if (futuraPilha.equals(t1.carta)) {
                            t1.prox = aux;
                            t3 = t3.ant.ant;
                            t3.prox = null;
                            t1 = aux.prox;
                        } else if (futuraPilha.equals(t2.carta)) {
                            t2.prox = aux;
                            t3 = t3.ant.ant;
                            t3.prox = null;
                            t2 = aux.prox;
                        } else if (futuraPilha.equals(t4.carta)) {
                            t4.prox = aux;
                            t3 = t3.ant.ant;
                            t3.prox = null;
                            t4 = aux.prox;
                        } else if (futuraPilha.equals(t5.carta)) {
                            t5.prox = aux;
                            t3 = t3.ant.ant;
                            t3.prox = null;
                            t5 = aux.prox;
                        } else if (futuraPilha.equals(t6.carta)) {
                            t6.prox = aux;
                            t3 = t3.ant.ant;
                            t3.prox = null;
                            t6 = aux.prox;
                        } else if (futuraPilha.equals(t7.carta)) {
                            t7.prox = aux;
                            t3 = t3.ant.ant;
                            t3.prox = null;
                            t7 = aux.prox;
                        } else if (futuraPilha.equals(t8.carta)) {
                            t8.prox = aux;
                            t3 = t3.ant.ant;
                            t3.prox = null;
                            t8 = aux.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }
        } else if (carta.equals(t4.ant.carta)) {
            Carta aux = t4.ant;

            if ((extra1 == null && extra2 == null) || (extra1 == null && extra3 == null) || (extra1 == null && extra4 == null)
                    || (extra2 == null && extra3 == null) || (extra2 == null && extra4 == null) || (extra3 == null && extra4 == null)) {

                if (!aux.cor.equals(aux.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1)) {
                        if (futuraPilha.equals(t1.carta)) {
                            t1.prox = aux;
                            t4 = t4.ant.ant;
                            t4.prox = null;
                            t1 = aux.prox;
                        } else if (futuraPilha.equals(t2.carta)) {
                            t2.prox = aux;
                            t4 = t4.ant.ant;
                            t4.prox = null;
                            t2 = aux.prox;
                        } else if (futuraPilha.equals(t3.carta)) {
                            t3.prox = aux;
                            t4 = t4.ant.ant;
                            t4.prox = null;
                            t3 = aux.prox;
                        } else if (futuraPilha.equals(t5.carta)) {
                            t5.prox = aux;
                            t4 = t4.ant.ant;
                            t4.prox = null;
                            t5 = aux.prox;
                        } else if (futuraPilha.equals(t6.carta)) {
                            t6.prox = aux;
                            t4 = t4.ant.ant;
                            t4.prox = null;
                            t6 = aux.prox;
                        } else if (futuraPilha.equals(t7.carta)) {
                            t7.prox = aux;
                            t4 = t4.ant.ant;
                            t4.prox = null;
                            t7 = aux.prox;
                        } else if (futuraPilha.equals(t8.carta)) {
                            t8.prox = aux;
                            t4 = t4.ant.ant;
                            t4.prox = null;
                            t8 = aux.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }
        } else if (carta.equals(t5.ant.carta)) {
            Carta aux = t5.ant;

            if ((extra1 == null && extra2 == null) || (extra1 == null && extra3 == null) || (extra1 == null && extra4 == null)
                    || (extra2 == null && extra3 == null) || (extra2 == null && extra4 == null) || (extra3 == null && extra4 == null)) {

                if (!aux.cor.equals(aux.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1)) {

                        if (futuraPilha.equals(t1.carta)) {
                            t1.prox = aux;
                            t5 = t5.ant.ant;
                            t5.prox = null;
                            t1 = aux.prox;
                        } else if (futuraPilha.equals(t2.carta)) {
                            t2.prox = aux;
                            t5 = t5.ant.ant;
                            t5.prox = null;
                            t2 = aux.prox;
                        } else if (futuraPilha.equals(t3.carta)) {
                            t3.prox = aux;
                            t5 = t5.ant.ant;
                            t5.prox = null;
                            t3 = aux.prox;
                        } else if (futuraPilha.equals(t4.carta)) {
                            t4.prox = aux;
                            t5 = t5.ant.ant;
                            t5.prox = null;
                            t4 = aux.prox;
                        } else if (futuraPilha.equals(t6.carta)) {
                            t6.prox = aux;
                            t5 = t5.ant.ant;
                            t5.prox = null;
                            t6 = aux.prox;
                        } else if (futuraPilha.equals(t7.carta)) {
                            t7.prox = aux;
                            t5 = t5.ant.ant;
                            t5.prox = null;
                            t7 = aux.prox;
                        } else if (futuraPilha.equals(t8.carta)) {
                            t8.prox = aux;
                            t5 = t5.ant.ant;
                            t5.prox = null;
                            t8 = aux.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }
        } else if (carta.equals(t6.ant.carta)) {
            Carta aux = t6.ant;

            if ((extra1 == null && extra2 == null) || (extra1 == null && extra3 == null) || (extra1 == null && extra4 == null)
                    || (extra2 == null && extra3 == null) || (extra2 == null && extra4 == null) || (extra3 == null && extra4 == null)) {

                if (!aux.cor.equals(aux.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1)) {

                        if (futuraPilha.equals(t1.carta)) {
                            t1.prox = aux;
                            t6 = t6.ant.ant;
                            t6.prox = null;
                            t1 = aux.prox;
                        } else if (futuraPilha.equals(t2.carta)) {
                            t2.prox = aux;
                            t6 = t6.ant.ant;
                            t6.prox = null;
                            t2 = aux.prox;
                        } else if (futuraPilha.equals(t3.carta)) {
                            t3.prox = aux;
                            t6 = t6.ant.ant;
                            t6.prox = null;
                            t3 = aux.prox;
                        } else if (futuraPilha.equals(t4.carta)) {
                            t4.prox = aux;
                            t6 = t6.ant.ant;
                            t6.prox = null;
                            t4 = aux.prox;
                        } else if (futuraPilha.equals(t5.carta)) {
                            t5.prox = aux;
                            t6 = t6.ant.ant;
                            t6.prox = null;
                            t5 = aux.prox;
                        } else if (futuraPilha.equals(t7.carta)) {
                            t7.prox = aux;
                            t6 = t6.ant.ant;
                            t6.prox = null;
                            t7 = aux.prox;
                        } else if (futuraPilha.equals(t8.carta)) {
                            t8.prox = aux;
                            t6 = t6.ant.ant;
                            t6.prox = null;
                            t8 = aux.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }
        } else if (carta.equals(t7.ant.carta)) {
            Carta aux = t7.ant;

            if ((extra1 == null && extra2 == null) || (extra1 == null && extra3 == null) || (extra1 == null && extra4 == null)
                    || (extra2 == null && extra3 == null) || (extra2 == null && extra4 == null) || (extra3 == null && extra4 == null)) {

                if (!aux.cor.equals(aux.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1)) {

                        if (futuraPilha.equals(t1.carta)) {
                            t1.prox = aux;
                            t7 = t7.ant.ant;
                            t7.prox = null;
                            t1 = aux.prox;
                        } else if (futuraPilha.equals(t2.carta)) {
                            t2.prox = aux;
                            t7 = t7.ant.ant;
                            t7.prox = null;
                            t2 = aux.prox;
                        } else if (futuraPilha.equals(t3.carta)) {
                            t3.prox = aux;
                            t7 = t7.ant.ant;
                            t7.prox = null;
                            t3 = aux.prox;
                        } else if (futuraPilha.equals(t4.carta)) {
                            t4.prox = aux;
                            t7 = t7.ant.ant;
                            t7.prox = null;
                            t4 = aux.prox;
                        } else if (futuraPilha.equals(t5.carta)) {
                            t5.prox = aux;
                            t7 = t7.ant.ant;
                            t7.prox = null;
                            t5 = aux.prox;
                        } else if (futuraPilha.equals(t6.carta)) {
                            t6.prox = aux;
                            t7 = t7.ant.ant;
                            t7.prox = null;
                            t6 = aux.prox;
                        } else if (futuraPilha.equals(t8.carta)) {
                            t8.prox = aux;
                            t7 = t7.ant.ant;
                            t7.prox = null;
                            t8 = aux.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }
        } else if (carta.equals(t8.ant.carta)) {
            Carta aux = t8.ant;

            if ((extra1 == null && extra2 == null) || (extra1 == null && extra3 == null) || (extra1 == null && extra4 == null)
                    || (extra2 == null && extra3 == null) || (extra2 == null && extra4 == null) || (extra3 == null && extra4 == null)) {

                if (!aux.cor.equals(aux.prox.cor)) {

                    if (aux.num == (aux.prox.num + 1)) {

                        if (futuraPilha.equals(t1.carta)) {
                            t1.prox = aux;
                            t8 = t8.ant.ant;
                            t8.prox = null;
                            t1 = aux.prox;
                        } else if (futuraPilha.equals(t2.carta)) {
                            t2.prox = aux;
                            t8 = t8.ant.ant;
                            t8.prox = null;
                            t2 = aux.prox;
                        } else if (futuraPilha.equals(t3.carta)) {
                            t3.prox = aux;
                            t8 = t8.ant.ant;
                            t8.prox = null;
                            t3 = aux.prox;
                        } else if (futuraPilha.equals(t4.carta)) {
                            t4.prox = aux;
                            t8 = t8.ant.ant;
                            t8.prox = null;
                            t4 = aux.prox;
                        } else if (futuraPilha.equals(t5.carta)) {
                            t5.prox = aux;
                            t8 = t8.ant.ant;
                            t8.prox = null;
                            t5 = aux.prox;
                        } else if (futuraPilha.equals(t6.carta)) {
                            t6.prox = aux;
                            t8 = t8.ant.ant;
                            t8.prox = null;
                            t6 = aux.prox;
                        } else if (futuraPilha.equals(t7.carta)) {
                            t7.prox = aux;
                            t8 = t8.ant.ant;
                            t8.prox = null;
                            t7 = aux.prox;
                        } else {
                            System.out.println("movimento invalido");
                        }
                    } else {
                        System.out.println("os numeros nao estao em ordem");
                    }
                } else {
                    System.out.println("cartas sem sequencia correta de cores ");
                }
            } else {
                System.out.println("nao ha espacos extra suficientes");
            }
        }
    } //PRONTO

    public void moveToFinal(String carta, String outraCarta) {
        gameOver();

        if (carta.equals(t1.carta)) {
            Carta aux = t1;
            if (outraCarta.equals(pilhaCopas.carta)) {
                if (aux.naipe.equals(pilhaCopas.naipe) && aux.num == pilhaCopas.num) {
                    t1.ant.prox = null;
                    t1 = t1.ant;
                    pilhaCopas.prox = aux;
                    pilhaCopas.prox.ant = pilhaCopas;
                    pilhaCopas = pilhaCopas.prox;
                    pilhaCopas.num++;
                }
            } else if (outraCarta.equals(pilhaOuro.carta)) {
                if (aux.naipe.equals(pilhaOuro.naipe) && aux.num == pilhaOuro.num) {
                    t1.ant.prox = null;
                    t1 = t1.ant;
                    pilhaOuro.prox = aux;
                    pilhaOuro.prox.ant = pilhaOuro;
                    pilhaOuro = pilhaOuro.prox;
                    pilhaOuro.num++;
                }
            } else if (outraCarta.equals(pilhaPaus.carta)) {
                if (aux.naipe.equals(pilhaPaus.naipe) && aux.num == pilhaPaus.num) {
                    t1.ant.prox = null;
                    t1 = t1.ant;
                    pilhaPaus.prox = aux;
                    pilhaPaus.prox.ant = pilhaPaus;
                    pilhaPaus = pilhaPaus.prox;
                    pilhaPaus.num++;
                }
            } else if (outraCarta.equals(pilhaEspadas.carta)) {
                if (aux.naipe.equals(pilhaEspadas.naipe) && aux.num == pilhaEspadas.num) {
                    t1.ant.prox = null;
                    t1 = t1.ant;
                    pilhaEspadas.prox = aux;
                    pilhaEspadas.prox.ant = pilhaEspadas;
                    pilhaEspadas = pilhaEspadas.prox;
                    pilhaEspadas.num++;
                }
            }
        } else if (carta.equals(t2.carta)) {
            Carta aux = t2;
            if (outraCarta.equals(pilhaCopas.carta)) {
                if (aux.naipe.equals(pilhaCopas.naipe) && aux.num == pilhaCopas.num) {
                    t2.ant.prox = null;
                    t2 = t2.ant;
                    pilhaCopas.prox = aux;
                    pilhaCopas.prox.ant = pilhaCopas;
                    pilhaCopas = pilhaCopas.prox;
                    pilhaCopas.num++;
                }
            } else if (outraCarta.equals(pilhaOuro.carta)) {
                if (aux.naipe.equals(pilhaOuro.naipe) && aux.num == pilhaOuro.num) {
                    t2.ant.prox = null;
                    t2 = t2.ant;
                    pilhaOuro.prox = aux;
                    pilhaOuro.prox.ant = pilhaOuro;
                    pilhaOuro = pilhaOuro.prox;
                    pilhaOuro.num++;
                }
            } else if (outraCarta.equals(pilhaPaus.carta)) {
                if (aux.naipe.equals(pilhaPaus.naipe) && aux.num == pilhaPaus.num) {
                    t2.ant.prox = null;
                    t2 = t2.ant;
                    pilhaPaus.prox = aux;
                    pilhaPaus.prox.ant = pilhaPaus;
                    pilhaPaus = pilhaPaus.prox;
                    pilhaPaus.num++;
                }
            } else if (outraCarta.equals(pilhaEspadas.carta)) {
                if (aux.naipe.equals(pilhaEspadas.naipe) && aux.num == pilhaEspadas.num) {
                    t2.ant.prox = null;
                    t2 = t2.ant;
                    pilhaEspadas.prox = aux;
                    pilhaEspadas.prox.ant = pilhaEspadas;
                    pilhaEspadas = pilhaEspadas.prox;
                    pilhaEspadas.num++;
                }
            }
        } else if (carta.equals(t3.carta)) {
            Carta aux = t3;
            if (outraCarta.equals(pilhaCopas.carta)) {
                if (aux.naipe.equals(pilhaCopas.naipe) && aux.num == pilhaCopas.num) {
                    t3.ant.prox = null;
                    t3 = t3.ant;
                    pilhaCopas.prox = aux;
                    pilhaCopas.prox.ant = pilhaCopas;
                    pilhaCopas = pilhaCopas.prox;
                    pilhaCopas.num++;
                }
            } else if (outraCarta.equals(pilhaOuro.carta)) {
                if (aux.naipe.equals(pilhaOuro.naipe) && aux.num == pilhaOuro.num) {
                    t3.ant.prox = null;
                    t3 = t3.ant;
                    pilhaOuro.prox = aux;
                    pilhaOuro.prox.ant = pilhaOuro;
                    pilhaOuro = pilhaOuro.prox;
                    pilhaOuro.num++;
                }
            } else if (outraCarta.equals(pilhaPaus.carta)) {
                if (aux.naipe.equals(pilhaPaus.naipe) && aux.num == pilhaPaus.num) {
                    t3.ant.prox = null;
                    t3 = t3.ant;
                    pilhaPaus.prox = aux;
                    pilhaPaus.prox.ant = pilhaPaus;
                    pilhaPaus = pilhaPaus.prox;
                    pilhaPaus.num++;
                }
            } else if (outraCarta.equals(pilhaEspadas.carta)) {
                if (aux.naipe.equals(pilhaEspadas.naipe) && aux.num == pilhaEspadas.num) {
                    t3.ant.prox = null;
                    t3 = t3.ant;
                    pilhaEspadas.prox = aux;
                    pilhaEspadas.prox.ant = pilhaEspadas;
                    pilhaEspadas = pilhaEspadas.prox;
                    pilhaEspadas.num++;
                }
            }
        } else if (carta.equals(t4.carta)) {
            Carta aux = t4;
            if (outraCarta.equals(pilhaCopas.carta)) {
                if (aux.naipe.equals(pilhaCopas.naipe) && aux.num == pilhaCopas.num) {
                    t4.ant.prox = null;
                    t4 = t4.ant;
                    pilhaCopas.prox = aux;
                    pilhaCopas.prox.ant = pilhaCopas;
                    pilhaCopas = pilhaCopas.prox;
                    pilhaCopas.num++;
                }
            } else if (outraCarta.equals(pilhaOuro.carta)) {
                if (aux.naipe.equals(pilhaOuro.naipe) && aux.num == pilhaOuro.num) {
                    t4.ant.prox = null;
                    t4 = t4.ant;
                    pilhaOuro.prox = aux;
                    pilhaOuro.prox.ant = pilhaOuro;
                    pilhaOuro = pilhaOuro.prox;
                    pilhaOuro.num++;
                }
            } else if (outraCarta.equals(pilhaPaus.carta)) {
                if (aux.naipe.equals(pilhaPaus.naipe) && aux.num == pilhaPaus.num) {
                    t4.ant.prox = null;
                    t4 = t4.ant;
                    pilhaPaus.prox = aux;
                    pilhaPaus.prox.ant = pilhaPaus;
                    pilhaPaus = pilhaPaus.prox;
                    pilhaPaus.num++;
                }
            } else if (outraCarta.equals(pilhaEspadas.carta)) {
                if (aux.naipe.equals(pilhaEspadas.naipe) && aux.num == pilhaEspadas.num) {
                    t4.ant.prox = null;
                    t4 = t4.ant;
                    pilhaEspadas.prox = aux;
                    pilhaEspadas.prox.ant = pilhaEspadas;
                    pilhaEspadas = pilhaEspadas.prox;
                    pilhaEspadas.num++;
                }
            }
        } else if (carta.equals(t5.carta)) {
            Carta aux = t5;
            if (outraCarta.equals(pilhaCopas.carta)) {
                if (aux.naipe.equals(pilhaCopas.naipe) && aux.num == pilhaCopas.num) {
                    t5.ant.prox = null;
                    t5 = t5.ant;
                    pilhaCopas.prox = aux;
                    pilhaCopas.prox.ant = pilhaCopas;
                    pilhaCopas = pilhaCopas.prox;
                    pilhaCopas.num++;
                }
            } else if (outraCarta.equals(pilhaOuro.carta)) {
                if (aux.naipe.equals(pilhaOuro.naipe) && aux.num == pilhaOuro.num) {
                    t5.ant.prox = null;
                    t5 = t5.ant;
                    pilhaOuro.prox = aux;
                    pilhaOuro.prox.ant = pilhaOuro;
                    pilhaOuro = pilhaOuro.prox;
                    pilhaOuro.num++;
                }
            } else if (outraCarta.equals(pilhaPaus.carta)) {
                if (aux.naipe.equals(pilhaPaus.naipe) && aux.num == pilhaPaus.num) {
                    t5.ant.prox = null;
                    t5 = t5.ant;
                    pilhaPaus.prox = aux;
                    pilhaPaus.prox.ant = pilhaPaus;
                    pilhaPaus = pilhaPaus.prox;
                    pilhaPaus.num++;
                }
            } else if (outraCarta.equals(pilhaEspadas.carta)) {
                if (aux.naipe.equals(pilhaEspadas.naipe) && aux.num == pilhaEspadas.num) {
                    t5.ant.prox = null;
                    t5 = t5.ant;
                    pilhaEspadas.prox = aux;
                    pilhaEspadas.prox.ant = pilhaEspadas;
                    pilhaEspadas = pilhaEspadas.prox;
                    pilhaEspadas.num++;
                }
            }
        } else if (carta.equals(t6.carta)) {
            Carta aux = t6;
            if (outraCarta.equals(pilhaCopas.carta)) {
                if (aux.naipe.equals(pilhaCopas.naipe) && aux.num == pilhaCopas.num) {
                    t6.ant.prox = null;
                    t6 = t6.ant;
                    pilhaCopas.prox = aux;
                    pilhaCopas.prox.ant = pilhaCopas;
                    pilhaCopas = pilhaCopas.prox;
                    pilhaCopas.num++;
                }
            } else if (outraCarta.equals(pilhaOuro.carta)) {
                if (aux.naipe.equals(pilhaOuro.naipe) && aux.num == pilhaOuro.num) {
                    t6.ant.prox = null;
                    t6 = t6.ant;
                    pilhaOuro.prox = aux;
                    pilhaOuro.prox.ant = pilhaOuro;
                    pilhaOuro = pilhaOuro.prox;
                    pilhaOuro.num++;
                }
            } else if (outraCarta.equals(pilhaPaus.carta)) {
                if (aux.naipe.equals(pilhaPaus.naipe) && aux.num == pilhaPaus.num) {
                    t6.ant.prox = null;
                    t6 = t6.ant;
                    pilhaPaus.prox = aux;
                    pilhaPaus.prox.ant = pilhaPaus;
                    pilhaPaus = pilhaPaus.prox;
                    pilhaPaus.num++;
                }
            } else if (outraCarta.equals(pilhaEspadas.carta)) {
                if (aux.naipe.equals(pilhaEspadas.naipe) && aux.num == pilhaEspadas.num) {
                    t6.ant.prox = null;
                    t6 = t6.ant;
                    pilhaEspadas.prox = aux;
                    pilhaEspadas.prox.ant = pilhaEspadas;
                    pilhaEspadas = pilhaEspadas.prox;
                    pilhaEspadas.num++;
                }
            }
        } else if (carta.equals(t7.carta)) {
            Carta aux = t7;
            if (outraCarta.equals(pilhaCopas.carta)) {
                if (aux.naipe.equals(pilhaCopas.naipe) && aux.num == pilhaCopas.num) {
                    t7.ant.prox = null;
                    t7 = t7.ant;
                    pilhaCopas.prox = aux;
                    pilhaCopas.prox.ant = pilhaCopas;
                    pilhaCopas = pilhaCopas.prox;
                    pilhaCopas.num++;
                }
            } else if (outraCarta.equals(pilhaOuro.carta)) {
                if (aux.naipe.equals(pilhaOuro.naipe) && aux.num == pilhaOuro.num) {
                    t7.ant.prox = null;
                    t7 = t7.ant;
                    pilhaOuro.prox = aux;
                    pilhaOuro.prox.ant = pilhaOuro;
                    pilhaOuro = pilhaOuro.prox;
                    pilhaOuro.num++;
                }
            } else if (outraCarta.equals(pilhaPaus.carta)) {
                if (aux.naipe.equals(pilhaPaus.naipe) && aux.num == pilhaPaus.num) {
                    t7.ant.prox = null;
                    t7 = t7.ant;
                    pilhaPaus.prox = aux;
                    pilhaPaus.prox.ant = pilhaPaus;
                    pilhaPaus = pilhaPaus.prox;
                    pilhaPaus.num++;
                }
            } else if (outraCarta.equals(pilhaEspadas.carta)) {
                if (aux.naipe.equals(pilhaEspadas.naipe) && aux.num == pilhaEspadas.num) {
                    t7.ant.prox = null;
                    t7 = t7.ant;
                    pilhaEspadas.prox = aux;
                    pilhaEspadas.prox.ant = pilhaEspadas;
                    pilhaEspadas = pilhaEspadas.prox;
                    pilhaEspadas.num++;
                }
            }
        } else if (carta.equals(t8.carta)) {
            Carta aux = t8;
            if (outraCarta.equals(pilhaCopas.carta)) {
                if (aux.naipe.equals(pilhaCopas.naipe) && aux.num == pilhaCopas.num) {
                    t8.ant.prox = null;
                    t8 = t8.ant;
                    pilhaCopas.prox = aux;
                    pilhaCopas.prox.ant = pilhaCopas;
                    pilhaCopas = pilhaCopas.prox;
                    pilhaCopas.num++;
                }
            } else if (outraCarta.equals(pilhaOuro.carta)) {
                if (aux.naipe.equals(pilhaOuro.naipe) && aux.num == pilhaOuro.num) {
                    t8.ant.prox = null;
                    t8 = t8.ant;
                    pilhaOuro.prox = aux;
                    pilhaOuro.prox.ant = pilhaOuro;
                    pilhaOuro = pilhaOuro.prox;
                    pilhaOuro.num++;
                }
            } else if (outraCarta.equals(pilhaPaus.carta)) {
                if (aux.naipe.equals(pilhaPaus.naipe) && aux.num == pilhaPaus.num) {
                    t8.ant.prox = null;
                    t8 = t8.ant;
                    pilhaPaus.prox = aux;
                    pilhaPaus.prox.ant = pilhaPaus;
                    pilhaPaus = pilhaPaus.prox;
                    pilhaPaus.num++;
                }
            } else if (outraCarta.equals(pilhaEspadas.carta)) {
                if (aux.naipe.equals(pilhaEspadas.naipe) && aux.num == pilhaEspadas.num) {
                    t8.ant.prox = null;
                    t8 = t8.ant;
                    pilhaEspadas.prox = aux;
                    pilhaEspadas.prox.ant = pilhaEspadas;
                    pilhaEspadas = pilhaEspadas.prox;
                    pilhaEspadas.num++;
                }
            }
        }
    } //PRONTO

    public boolean gameOver() {
        if (pilhaCopas.num == 14 && pilhaEspadas.num == 14 && pilhaOuro.num == 14 && pilhaPaus.num == 14) {
            System.out.println("Voce Ganhou!");
            return true;
        }
        return false;
    }

    public void print() {
        System.out.println("Espacos extras");
        if (extra1 == null) {
            System.out.println(extra1);
        } else {
            System.out.println(extra1.carta);
        }
        if (extra2 == null) {
            System.out.println(extra2);
        } else {
            System.out.println(extra2.carta);
        }
        if (extra3 == null) {
            System.out.println(extra3);
        } else {
            System.out.println(extra3.carta);
        }
        if (extra4 == null) {
            System.out.println(extra4);
        } else {
            System.out.println(extra4.carta);
        }
        System.out.println("");

        Carta aux1 = h1;
        Carta aux2 = h2;
        Carta aux3 = h3;
        Carta aux4 = h4;
        Carta aux5 = h5;
        Carta aux6 = h6;
        Carta aux7 = h7;
        Carta aux8 = h8;
        System.out.println("Pilha 1" + "       	" + "Pilha 2" + "      	" + "Pilha 3" + "      	" + "Pilha 4" + "      	" + "Pilha 5" + "      	" + "Pilha 6" + "      	" + "Pilha 7" + "      	" + "Pilha 8");
        while (aux1 != vazia || aux2 != vazia || aux3 != vazia || aux4 != vazia || aux5 != vazia || aux6 != vazia || aux7 != vazia || aux8 != vazia) {
            System.out.print(aux1.carta + "\t" + aux2.carta + "\t" + aux3.carta + "\t" + aux4.carta + "\t" + aux5.carta + "\t" + aux6.carta + "\t" + aux7.carta + "\t" + aux8.carta + "\n");
            if (aux1.prox != null) {
                aux1 = aux1.prox;
            } else if (aux1.prox == null) {
                aux1 = vazia;
            }
            if (aux2.prox != null) {
                aux2 = aux2.prox;
            } else if (aux2.prox == null) {
                aux2 = vazia;
            }
            if (aux3.prox != null) {
                aux3 = aux3.prox;
            } else if (aux3.prox == null) {
                aux3 = vazia;
            }
            if (aux4.prox != null) {
                aux4 = aux4.prox;
            } else if (aux4.prox == null) {
                aux4 = vazia;
            }
            if (aux5.prox != null) {
                aux5 = aux5.prox;
            } else if (aux5.prox == null) {
                aux5 = vazia;
            }
            if (aux6.prox != null) {
                aux6 = aux6.prox;
            } else if (aux6.prox == null) {
                aux6 = vazia;
            }
            if (aux7.prox != null) {
                aux7 = aux7.prox;
            } else if (aux7.prox == null) {
                aux7 = vazia;
            }
            if (aux8.prox != null) {
                aux8 = aux8.prox;
            } else if (aux8.prox == null) {
                aux8 = vazia;
            }
        }
        System.out.println("");

        Carta auxCopas = pilhaCopas;
        Carta auxOuro = pilhaOuro;
        Carta auxEspadas = pilhaEspadas;
        Carta auxPaus = pilhaPaus;
        while (auxCopas != vazia || auxOuro != vazia || auxEspadas != vazia || auxPaus != vazia) {
            System.out.print(auxCopas.carta + "                   " + auxOuro.carta + "                    " + auxEspadas.carta + "                 " + auxPaus.carta + "\n");
            if (auxCopas.prox != null) {
                auxCopas = auxCopas.prox;
            } else if (auxCopas.prox == null) {
                auxCopas = vazia;
            }
            if (auxOuro.prox != null) {
                auxOuro = auxOuro.prox;
            } else if (auxOuro.prox == null) {
                auxOuro = vazia;
            }
            if (auxEspadas.prox != null) {
                auxEspadas = auxEspadas.prox;
            } else if (auxEspadas.prox == null) {
                auxEspadas = vazia;
            }
            if (auxPaus.prox != null) {
                auxPaus = auxPaus.prox;
            } else if (auxPaus.prox == null) {
                auxPaus = vazia;
            }
        }
    }

    public static void main(String[] args) {
        FreeCell freecell = new FreeCell();
        freecell.startGame();

        while (freecell.gameOver() != true) {
            freecell.print();
            freecell.receiveCard();
        }

    }
}
