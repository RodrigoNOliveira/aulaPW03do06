public class AlgoritmosRecursivos {



    public static void fatorialIterativo(int fatorial){
        int resultado = 1;
        for (int i = fatorial; i >=1 ; i--) {
            resultado = resultado * i;
        }
        System.out.printf("Fatorial %d = %d", fatorial, resultado);
    }



}
