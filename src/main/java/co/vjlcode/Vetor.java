package co.vjlcode;

public class Vetor {

    private String[] elementos;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
    }

    /**
     * método que recebe um parametro em String
     *
     * @param elemento
     */

    public void adiciona(String elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
            this.elementos[i] = elemento;
            break;
        }
    }


}
