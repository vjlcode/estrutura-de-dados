package co.vjlcode;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
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

    public void adiciona2(String elemento) throws Exception {

        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("vetor cheio, não é possivel adicionar mais elementos");
        }

    }

}
