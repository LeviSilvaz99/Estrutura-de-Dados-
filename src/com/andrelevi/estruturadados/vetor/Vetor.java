package com.andrelevi.estruturadados.vetor;

    public class Vetor {
        private String[] elementos;
        private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    /*public void adiciona(String elemento){
         for(int i = 0; i < this.elementos.length; i++){
                if( this.elementos[i] == null){
                    this.elementos[i] = elemento;
                }
         }
    }*/
    public boolean adiciona(String elemento){
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            return true;
        }
        return false;
    }
}