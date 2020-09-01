public class FilaLevi {
    private int valores[];
    private int primeiro;
    private int ultimo;
    private int total;

    public FilaLevi(){ // inicializando nosso construtor
        valores = new int[10]; //inicializando um vetor com 6 posicoçoes
        primeiro = 0;
        ultimo =0;
        total = 0;
    }

    public void inserir(int e){
        if (isFull()){
            throw new RuntimeException("FILA CHEIA ");
        }
        valores[ultimo] = e; //vamos pegar a posicao do ultimo que é zero e armazenas o valor que usuario digitou
        ultimo = (ultimo + 1) % valores.length; //0 = 0 + 1 % valor total do vetor = 0
        total++; // 0 + 1 = 1
        //continua
    }

    public int retirar(){
        if(isEmpty()){
            throw new RuntimeException("FILA VAZIA");
        }
        int elemento = valores[primeiro]; // posicao 0 ou seja primeiro vetor
        primeiro = (primeiro + 1) % valores.length; // primeiro recebe resto 0
        total--; //
        return elemento;
    }

    public boolean isEmpty(){
        return total == 0;//fila vazia
    }
    public boolean isFull(){
        return total == valores.length; //fila chei pelo tamanho do vetor
    }
}
