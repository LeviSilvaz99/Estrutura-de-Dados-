public class MainLista {
    public static void main(String[] args){
        Lista l = new Lista();
        l.inserir(872);
        l.inserir(123);
        l.inserir(1597);
        l.inserir(2);

        l.listar();

        while (!l.isEmpty()){
            int x = l.retirar();
            System.out.println("RETIREI O ELEMENTO ->"+x);
        }
    }
}
