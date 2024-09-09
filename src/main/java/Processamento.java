import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class Processamento {
    private static int numero(){
        return new Random().nextInt(1000000 - 1 + 1) + 1;
    }

    private static String duracao(LocalTime inicio, LocalTime fim){
        Duration duration = Duration.between(inicio, fim);
        return " duração de: "+duration.getSeconds()+" segundos, "+duration.toMillis()%1000+" milésimos";
    }

    public static String padrao(){
        LocalTime inicio = LocalTime.now();
        int[] matriz = new int[10000000];
        for (int i = 0; i < matriz.length; i++){
            matriz[i] = numero();
        }
        for (int i = 0; i < matriz.length; i++){
            System.out.println("posição: "+(i+1)+" valor "+matriz[i]);
        }
        LocalTime fim = LocalTime.now();
        return "O padrão com 2 iterações na matriz teve"+duracao(inicio,fim);
    }

    public static String padraoUnico(){
        LocalTime inicio = LocalTime.now();
        int[] matriz = new int[10000000];
        for (int i = 0; i < matriz.length; i++){
            matriz[i] = numero();
            System.out.println("posição: "+(i+1)+" valor "+matriz[i]);
        }
        LocalTime fim = LocalTime.now();
        return "O padrão com 1 iteração na matriz teve"+duracao(inicio,fim);
    }

    public static String builderDuplo(){
        LocalTime inicio = LocalTime.now();
        int[] matriz = new int[10000000];
        for (int i = 0; i < matriz.length; i++){
            matriz[i] = numero();
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < matriz.length; i++){
            builder.append("posição: "+(i+1)+" valor "+matriz[i]+"\n");
        }
        System.out.println(builder);
        LocalTime fim = LocalTime.now();
        return "StringBuilder com 2 iterações na matriz teve"+duracao(inicio,fim);
    }

    public static String builderUnico(){
        LocalTime inicio = LocalTime.now();
        int[] matriz = new int[10000000];
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < matriz.length; i++){
            matriz[i] = numero();
            builder.append("posição: "+(i+1)+" valor "+matriz[i]+"\n");
        }
        System.out.println(builder);
        LocalTime fim = LocalTime.now();
        return "StringBuilder com 1 iteração na matriz teve"+duracao(inicio,fim);
    }
}
