package br.edu.poo;

public class Jogo {

    public static void main(String[] args) {

        // Implemente a batalha aqui
        Personagem artemis = new Personagem("Artemis", 35, 12, 4);
        Personagem goblin = new Personagem("Goblin", 30, 10, 2);

        Pocao pocaoArtemis = new Pocao("Poção Pequena", 10);
        Pocao pocaoGoblin = new Pocao("Poção Pequena", 10);

        boolean pocaoArtemisUsada = false;
        boolean pocaoGoblinUsada = false;

        // limite de vida para decidir usar a poção (1/3 da vida inicial)
        int vidaMinimaArtemis = 35 / 3;
        int vidaMinimaGoblin = 30 / 3;

        System.out.println("=== BATALHA INICIADA ===");

        int turno = 1;

        while (artemis.estaVivo() && goblin.estaVivo()) {

            if (turno % 2 != 0) {
                if (artemis.getVida() <= vidaMinimaArtemis && !pocaoArtemisUsada) {
                    artemis.usarPocao(pocaoArtemis);
                    pocaoArtemisUsada = true;
                } else {
                    artemis.atacar(goblin);
                }
                
            } else {
                if (goblin.getVida() <= vidaMinimaGoblin && !pocaoGoblinUsada) {
                    goblin.usarPocao(pocaoGoblin);
                    pocaoGoblinUsada = true;
                } else {
                    goblin.atacar(artemis);
                }
            }

            turno++;
        }

        System.out.println("FIM DA BATALHA");

        if (artemis.estaVivo()) {
            System.out.println("Vencedor: " + artemis.getNome());
        } else {
            System.out.println("Vencedor: " + goblin.getNome());
        }
    }

}
