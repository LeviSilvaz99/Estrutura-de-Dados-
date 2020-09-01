import java.util.Arrays;

public class PilhaLevi {
    int elemento[];
    int topo; //onde tenho meu ultimo elemento armazenado
    int total;

    public PilhaLevi(){
        elemento = new int[10]; // meu vetor tem 10 posicoes
        topo = -1;
    }

    public void push(int e){
        if(isFull()){
            throw new RuntimeException("Stack Overflow!");
        }
        topo++;
        elemento[topo] = e;

    }
    public void setImprime() {

        for (int i = 0; i < elemento.length; i++) {
            System.out.println("Empilhei " + elemento[i] + " ");

        }
    }
    public int tamanho(){
        int total = 0;
        this.total = this.topo;
        this.total++;
        return this.total;
    }
    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("Stack Empty!");
        }
        int e;
        e = elemento[topo];
        topo--;
        return e;
    }
    @Override
    public String toString() {
        return  Arrays.toString(elemento);
    }




    public boolean isEmpty(){
        return (topo == -1);
    }
    public boolean isFull(){
        return (topo == 9);

    }
    public int top(){
        if(isEmpty()){
            throw new RuntimeException(("Empty Satck"));
        }
        return elemento[topo];
    }


}
