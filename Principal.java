public class Principal {
    
    public static void main(String args[]){
       
        System.out.println("Testando filas");

        Fila fila = new Fila(10);
        System.out.println("Tamanho da fila " + fila.numeros.length);

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        fila.enfileirar(4);
        fila.enfileirar(5);
        fila.enfileirar(6);
        fila.enfileirar(7);
        fila.enfileirar(8);
        fila.enfileirar(9);
        fila.enfileirar(10);
        fila.enfileirar(11);


        System.out.println("Início da fila " + fila.inicio);
        System.out.println("Fim da fila " + fila.fim);

        System.out.println(fila.desenfileirar());
        System.out.println(fila.desenfileirar());
        System.out.println(fila.desenfileirar());
    }
    

}
