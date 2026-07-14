package estudos_em_java01;

public class Aula07Array02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double é igual a 0
        // char = '\u0000'
        //boolean = false
        //String = null
        // Arrys tambem é um objeto
        String[] nomes = new String[4];
        nomes [0] = "Goku";
        nomes [1] = "Kurosaki";
        nomes [2] = "Luffy";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}