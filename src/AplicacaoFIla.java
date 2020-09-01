public class AplicacaoFIla {
    public static void main(String[] args){
        Fila f = new Fila();

        f.inserir(1);
        f.inserir(2);
        f.inserir(3);
        f.inserir(4);


        while(!f.isEmpty()){
            int x = f.retirar();
            System.out.println("Retirei o elemento -> "+x);
        }
        //int y = f.retirar();

    }
}
