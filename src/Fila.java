public class Fila {
    private int[] valores;
    private int primeiro;
    private int ultimo;
    private int total;

    public Fila(){
        valores = new int[6];
        primeiro = 0;
        ultimo = 0;
        total = 0;
    }

    public void inserir(int e){
        if(isFull()){
            throw new RuntimeException("FILA CHEIA");
        }
        valores[ultimo] = e;
        ultimo = (ultimo +1 ) % valores.length;
        total++;


    }
    /*public void setImprime(){
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Enfilerei " + valores[i] + " ");

        }
    }*/
    public int retirar(){
        if(isEmpty()){
            throw new RuntimeException("FILA VAZIA");
        }
        int elemento = valores[primeiro];
        primeiro = (primeiro +1 ) % valores.length;
        total--;
        return elemento;
    }
    public boolean isEmpty(){
        return total == 0;
    }
    public boolean isFull(){
        return total == valores.length;
    }
}
