package estudos_em_java01;

public class Aula05EstruturasCondicionais06 {
    // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana
    // Considerenado 1 como domingo

    public static void main(String[] args){
        byte dia = 8;

        if (dia >= 2 && dia <= 6 ){
            System.out.println("Dia util");
        }else {
            System.out.println("Final de semana");
        }
    }
}
