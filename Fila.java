public class Fila {

    public int inicio;
    public int fim;
    public int[] numeros;
    public int tamanho;

    public Fila(int capacidade) {
        this.numeros = new int[capacidade];
        this.inicio = 0;
        this.fim = 0;
    }

    public int incrementar( int n){
        return (n + 1) % numeros.length;
    }

    //assinatura do metodo = mostra o wue é este metodo
    public void enfileirar( int valor ){
        if(tamanho + 1 >=  numeros.length){
            throw new Error("Número ultrapassou a fila!");
        }
        this.numeros[fim] = valor;
        fim =  incrementar(valor);
        tamanho = tamanho + 1;
    }

    public int desenfileirar(){
        if(estaVazia()){
            throw new Error("Não pode desenfileirar!");
        }
        int temp = numeros[inicio];
        inicio = incrementar(inicio);
        return temp;
    }

    public boolean estaVazia(){
        return inicio == fim;
    }

}