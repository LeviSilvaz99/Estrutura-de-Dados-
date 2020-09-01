package estruturadadoslista;

/*LISTA
//TAD(Tipo abstrato de dados) LISTA:
boolean isFull(); --> Verifica se tá vazia
boolean isEmpty(); --> Verifica se tá cheia
int size(); --> Retorna a quantidade de elementos
boolean buscar(interger chave); --> Verifica se o valor está na lista
Integer get(int posição); --> Retorna o valor na posição
void inserir(Integer valor); --> Por default insere no final
void inserir(int posicao,Integer valor) --> Insere o valor em uma posição valida(que não deixe buracos)
                                            e que não extrapole o tamanho. Ele empura os valores a partir
                                            da posição indicada
Integer remover(int posição) --> Remove o elemento de uma lista não vazia e em uma posição válida(se for valida,
                                 não pode deixar buraco empurando tudo para trás)
void imprimirLista();
 */

public interface Lista {
    public boolean isFull();
    public boolean isEmpty();
    public int size();
    public boolean buscar(Integer chave);
    public Integer get(int posicao);
    public void inserir(Integer valor);
    public void inserir(int posicao, Integer valor);
    public Integer remover(int posição);
    public void imprimirLista();
    public void imprimir();
}
