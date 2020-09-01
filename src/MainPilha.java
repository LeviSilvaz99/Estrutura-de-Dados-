public class MainPilha {
    public static void main (String[] args){
        PilhaLevi p = new PilhaLevi();

        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);
        p.push(10);

        System.out.println("Tamanho do vetor = "+p.tamanho());

        //imprimindo tudo da pilha dois metodos
        //System.out.println(p.toString());
        //p.setImprime();

        //vamos desempilhar
        while(!p.isEmpty()){
            int elementos = p.pop();
            System.out.println("Desempilhei "+elementos);
        }
        int i = p.pop();




    }
}
