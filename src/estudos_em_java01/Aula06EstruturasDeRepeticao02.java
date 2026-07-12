package estudos_em_java01;

public class Aula06EstruturasDeRepeticao02 {
    // Imprima todos os numeros pares de 0 até 1000000
    public static void main(String[] args) {
        int cont = 1;
        while (cont <= 1000000){
            cont = cont + 1;
            if (cont % 2 == 0 ){
                System.out.println(cont);
            }
        }

        for(cont = 1; cont <= 1000000; cont ++) {
            if (cont % 2 == 0 ){
                System.out.println("pares" + cont);
            }

        }


    }
}