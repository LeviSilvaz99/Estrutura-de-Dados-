public class ListaEncadeada {
    private int elemento;
    private ListaEncadeada proximo;

    public void setElemento(int elemento){
        this.elemento = elemento;
    }
    public int getElemento(){
        return this.elemento;
    }
    public void setProximo(ListaEncadeada proximo){
        this.proximo = proximo;

    }
    public ListaEncadeada getProximo(){
        return this.proximo;
    }
}
