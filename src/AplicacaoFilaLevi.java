public class AplicacaoFilaLevi {
    public static void main(String[] args){
        FilaLevi f = new FilaLevi();

        f.inserir(1);
        f.inserir(2);
        f.inserir(3);
        f.inserir(4);

        while (!f.isEmpty()){
            int x = f.retirar();
            System.out.println("RETIREI ELEMENTO -> "+x);
        }

        int w = f.retirar();
    }
}
