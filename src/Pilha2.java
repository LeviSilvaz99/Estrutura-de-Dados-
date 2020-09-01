
public class Pilha2 {
    int elementos[];
    int topo;

    public Pilha2(){
        elementos = new int[10];
        topo = -1; //posicao invalida do vetor;
    }

    public void push(int e){
        if(isFull()){
            throw new RuntimeException("Stack Overflow!");
        }
        topo++;
        elementos[topo] = e;
    }
    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("Stack Empty!");
        }
        int e;
        e = elementos[topo];
        topo--;
        return e;

    }
    public boolean isEmpty(){ //verifica se esta vazia
        return (topo == -1);
    }
    public boolean isFull(){ // verfica se esta cheia
        return (topo == 9);
    }
    public int top(){ //ver quem ta no topo
        if(isEmpty()){
            throw new RuntimeException(("Empty Satck"));
        }
        return elementos[topo];
    }


}
