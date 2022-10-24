package co.vjlcode;

import java.util.Arrays;

public class Vetor {

    /**
     * Variáveis
     * ----------------------------------------------------------------------------------------------------------------
     */

    private String[] elementos;
    private int tamanho;

    /**
     * Construtor
     * ----------------------------------------------------------------------------------------------------------------
     */

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /**
     * Método que recebe um parâmetro de String
     * ----------------------------------------------------------------------------------------------------------------
     */

    public void adiciona(String elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
            this.elementos[i] = elemento;
            break;
        }
    }

    /**
     * Método que recebe um parâmetro e retorna um throw Exception caso o tamanho seja maior
     * ----------------------------------------------------------------------------------------------------------------
     */

    public void adiciona2(String elemento) throws Exception {

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("vetor cheio, não é possível adicionar mais elementos");
        }

    }

    /**
     * Método que retorna true quando elemento é menor que o tamanho do vetor
     * ----------------------------------------------------------------------------------------------------------------
     */

    public boolean adiciona3(String elemento) {
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }

        return true;
    }

    /**
     * Método que adiciona um elemento em qualquer posição do vetor
     * ----------------------------------------------------------------------------------------------------------------
     */

    public boolean adiciona3(int posicao, String elemento){

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição Invalida");
        }

        //mover todos os elementos
        for(int i=this.tamanho-1; i>=posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return false;
    }



    /**
     * Método que retorna uma String
     * ----------------------------------------------------------------------------------------------------------------
     */

    public String busca(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição Invalida");
        }

        return this.elementos[posicao];
    }

    /**
     * Método que retorna um inteiro de valor positivo se não um valor negativo
     * ----------------------------------------------------------------------------------------------------------------
     */

    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Método que retorna o tamanho do vetor
     * ----------------------------------------------------------------------------------------------------------------
     */

    public int tamanho() {
        return this.tamanho;
    }

    /**
     * Método toString que retorna os elementos do vetor de forma eficiente
     * ----------------------------------------------------------------------------------------------------------------
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
