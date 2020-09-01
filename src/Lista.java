public class Lista {
    private ListaEncadeada inicio;

    //criando lista vazia
    public Lista(){
        this.inicio = null;
    }

    public void inserir(int elemento){
        //tenho que criar uma nova listaencadeada
        ListaEncadeada nova = new ListaEncadeada();
        nova.setElemento(elemento);//inseri o elemento na lista
        nova.setProximo(null);     //depois dela nao vem niguem

        if(inicio == null){ // vai ser a primeira lista encadeada?
            inicio = nova;
        }else{
            ListaEncadeada aux;  //ja tem gente na lista
            aux = inicio;
            while (aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(nova);
        }
    }
    public int retirar(){
        // este metodo considera que a lista sempre tem elementos
        //alguem na aplicacao precisa antes de remover, testar se a lista nao ta vazia
         ListaEncadeada aux = inicio;
         int elemento = aux.getElemento();
         inicio = aux.getProximo();
         return elemento;
    }
    public void listar(){
        if(inicio == null){
            System.out.println("LISTA VAZIA");
        }else{
            ListaEncadeada aux = inicio;
            while (aux != null){
                System.out.println("ELEMENTO VISTO "+aux.getElemento());
                aux = aux.getProximo();
            }
        }
    }
    public boolean isEmpty(){
        return this.inicio == null;
    }
}
