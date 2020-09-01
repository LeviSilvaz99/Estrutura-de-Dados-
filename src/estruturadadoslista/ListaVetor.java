package estruturadadoslista;

public class ListaVetor implements Lista {

    private Integer[] Lista; //Vetor de Interger
    private int quantidade=0;
    public ListaVetor(int tamanho){
        Lista= new Integer[tamanho]; //Criando o vetor de posições determinadas
    }

    @Override
    public boolean isFull() {
        if(quantidade==Lista.length/*Se a quantidade de elementos for igual o tamanho da minha lista*/){ //Tá cheia
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean isEmpty() {
        if(quantidade==0){ //A fila está vazia
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int size() {
        return quantidade;
    }

    @Override
    public boolean buscar(Integer chave) {
        for(int i = 0 ; i < quantidade;i++){ // Percorre a lista até quantidade de numeros da lista
            if(Lista[i]==chave){ //Se o valor está em alguma posição da lista
                return true;//Se retornar true ele já para a função
            }
        }
        return false;
    }

    @Override
    public Integer get(int posicao) {//A posição contém elementos(ela está ocupada)?
        //A posição é menor que a quantidade de elementos
        if(posicao<quantidade && posicao>=0){//Se a posição indicada estiver entre a quantidade de numeros da lista e 0.
            return Lista[posicao];
        }else{
            System.out.println("Posição invalidade");
            return null;
        }
    }

    @Override
    public void inserir(Integer valor) {
        if(!isFull()){//Se a lista não estiver cheia
            Lista[quantidade]=valor;//Coloco o valor na posição da quantidade .
            quantidade++;//Aumento a quantidade em mais 1
        }else{//Se ela estiver cheia
            System.out.println("A lista está cheia");
        }

    }

    @Override
    public void inserir(int posicao, Integer valor) {
        if(!isFull()){//Se a lista não estiver cheia
            if(posicao>=0 && posicao<=quantidade){//Se a posição é válida, pois ele tem que está entre a posição 0
                //e a ultima posição+1(quantidade--> posições ocupadas mais 1)
                for(int i=(quantidade-1);i>=posicao;i--){//Vou decrementando o i a partir da quantidade-1(ultima posição ocupada) até a posição indicada
                    Lista[i+1]=Lista[i];
                }
                Lista[posicao]=valor;//Só colocar o valor na posição
                quantidade++;

            }else{
                System.out.println("Posicao invalida");
            }
        }else{
            System.out.println("Lista cheia");
        }

    }

    @Override
    public Integer remover(int posicao) {
        Integer aux = null; //Crio uma variavel auxiliar
        if(!isEmpty()){ //Se a lista não estiver cheia
            if(posicao>=0 && posicao<=quantidade){//Se a posição é válida, pois ele tem que está entre a posição 0
                //e a ultima posição+1(quantidade--> posições ocupadas mais 1)

                aux=Lista[posicao];//Seto o valor da posição da lista na variavel auxiliar
                for(int i =posicao;i<quantidade-1; i++){//Vou incrementando o i a partir da posição indicada até a
                    //quantidade de numeros da lista - 1.
                    Lista[i]=Lista[i+1];//Pego o numero da frente e coloco no de traz
                }
                Lista[quantidade-1]=null;//Apago a variavel da ultima posição
                quantidade--;//Decremento a quantidade
                System.out.println("Posição "+posicao+ " valida!");
            }else{
                System.out.println("Posição "+posicao+ " invalida!");
            }

        }else{
            System.out.println("Lista vazia!");
        }
        return aux;
    }

    @Override
    public void imprimirLista() {
        for(int i=0; i<Lista.length; i++){
            System.out.print("["+Lista[i]+"] ");
        }
        System.out.println("");
    }

    public void imprimir(){
        if(!isEmpty()){
            System.out.print("["+Lista[0]);
            for(int i=1; i<quantidade; i++){
                System.out.print(", "+Lista[i]);
            }
            System.out.print("]");
        }else{
            System.out.print("Lista Vazia");
        }
        System.out.println("");
    }
}