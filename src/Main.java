public class Main {
    public static void main(String[] args){
        Pilha2 p = new Pilha2();

        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);
        p.push(5);

        while(!p.isEmpty()){
            int elemento = p.pop();
            System.out.println("Desempilhei -> "+elemento);
        }
        int elemento = p.pop();

    }
}

