public class ListaEncadeada {
    
    public static class Elemento {
        String valor;
        Elemento prox;

        public Elemento(String valor) {
            this.valor = valor;
            this.prox = null;
        }

        public void addFirst(String valor){
            Elemento  novo = new Elemento(valor);
            if(isEmpty()){
                inicio = novo;
                fim = novo;
            } else {
                //fazendo o novo apontar para o inicio e o novo se torno o inicio;
                novo.prox = inicio;
                inicio = novo;
            }
        }

        public boolean isEmpty() {
            return this.inicio == null;
        }

        public void printar() {
            Elemento atual = inicio;
            while(atual != null) {
                System.out.println(atual.valor);
                atual = atual.prox;
            } System.out.println("");
        } 

        Elemento inicio;
        Elemento fim;

        public void ListaEncadeada() {
            this.inicio = null;
            this.fim = null;
        }
    }
    private String addFirst;
    public static void main(String[] args) {

        ListaEncadeada lista = new ListaEncadeada();

        lista.addFirst =("A");
        lista.addFirst =("B");
        lista.addFirst = ("C");

        System.out.println(a);
        
    }
}
