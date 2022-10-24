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

    @Test
    public void testeVetorAdiciona3(){

        Vetor vetor = new Vetor(10);

        vetor.adiciona3("elemento1");
        vetor.adiciona3("elemento2");
        vetor.adiciona3("elemento3");

        System.out.println(vetor.tamanho());
        System.out.println(vetor);

    }

    @Test
    public void testeVetorBusca(){

        Vetor vetor = new Vetor(10);

        vetor.adiciona3("elemento1");
        vetor.adiciona3("elemento2");
        vetor.adiciona3("elemento3");

        System.out.println(vetor.busca(2));

    }

    @Test
    public void testeVetorBuscaSequencial(){

        Vetor vetor = new Vetor(10);

        vetor.adiciona3("elemento1");
        vetor.adiciona3("elemento2");
        vetor.adiciona3("elemento3");

        System.out.println(vetor.busca("elemento0"));

    }


    @Test
    public void testeVetorBuscaSequencialPosicao(){

        Vetor vetor = new Vetor(10);

        vetor.adiciona3("B");
        vetor.adiciona3("C");
        vetor.adiciona3("E");
        vetor.adiciona3("F");
        vetor.adiciona3("G");

        System.out.println(vetor);

        vetor.adiciona3(4, "A");

        System.out.println(vetor);

        vetor.adiciona3(0, "D");

        System.out.println(vetor);

    }

}
