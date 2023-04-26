public class Principal {
    
    public static void main(String args[]){
       
        System.out.println("Testando filas");

        Fila fila = new Fila(10);
        System.out.println("Tamanho da fila " + fila.numeros.length);

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);

        System.out.println("Início da fila " + fila.inicio);
        System.out.println("Fim da fila " + fila.fim);

    }
    

}
