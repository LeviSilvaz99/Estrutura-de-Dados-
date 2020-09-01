public class Pilha{
    private int valores[];
    private int topo;

    public Pilha(){ //construtor
        valores = new int[10];
        topo    = -1;
    }
    public void push(int elemento){ // empilhar
        topo = topo + 1;
        valores[topo] = elemento;
    }
    public boolean isEmpty(){ //verifica se esta vazia
        return(topo == -1);

    }
    public boolean isFull(){ // verfica se esta cheia
        return (topo == 9);
    }
    public int pop(){ // desempilha
        int elem = valores[topo];
        topo--;
        return elem;
    }
}