public class Fila {

    public int inicio;
    public int fim;
    public int[] numeros;

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
        this.numeros[fim] = valor;
        fim =  incrementar(valor);
    }

}