package co.vjlcode;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /**
     * método que recebe um parâmetro em String
     *
     * @param elemento
     */

    public void adiciona(String elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
            this.elementos[i] = elemento;
            break;
        }
    }

    /**
     * método que recebe um parâmetro e controle o tamanho de um vetor
     *
     * @param elemento
     * @throws Exception
     */

    public void adiciona2(String elemento) throws Exception {

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("vetor cheio, não é possível adicionar mais elementos");
        }

    }

    public boolean adiciona3(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }

        return true;
    }

    public String busca(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição Invalida");
        }

        return this.elementos[posicao];
    }

    public int tamanho() {
        return this.tamanho;
    }

    /**
     * esse toString retorna os elementos do vetor de forma eficiente
     *
     * @return toString;
     */

    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }

}
