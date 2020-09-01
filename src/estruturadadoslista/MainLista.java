package estruturadadoslista;

public class MainLista {
    public static void main(String[] args) {
        Lista l = new ListaVetor(4);
        l.inserir(0,10);
        l.inserir(20);
        l.inserir(30);
        l.inserir(40);
        l.imprimirLista();
        l.remover(3);
        l.imprimirLista();
        l.inserir(1, 10);
        l.imprimir();
        System.out.println(l.buscar(6));
    }
}