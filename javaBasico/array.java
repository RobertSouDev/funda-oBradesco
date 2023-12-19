import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        String[] paises = {"Brasil", "Rússia", "Índia", "China"};
        System.out.println("Primeiro país: " + paises[0]);
        System.out.println("Todos os países: " + Arrays.toString(paises));

        int posicao = Arrays.binarySearch (paises, "Brasil");
        System.out.println(posicao);

        Arrays.sort (paises,0, paises.length);
        System.out.println(Arrays.toString(paises));
    }
}
