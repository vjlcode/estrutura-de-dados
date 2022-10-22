package co.vjlcode;

import org.junit.Test;

public class Teste {

    @Test
    public void testeVetorAdiciona(){
        Vetor vetor = new Vetor(5);

        vetor.adiciona("elemento1");
    }

    @Test
    public void testeVetorAdiciona2(){

        Vetor vetor = new Vetor(2);

        try {
            vetor.adiciona2("elemento1");
            vetor.adiciona2("elemento2");
            vetor.adiciona2("elemento3");
        } catch (Exception e){
            e.printStackTrace();
        }
    }


}
