package estudos_em_java01;


//String resultado,  operador ternario tem que ser verdadeiro ou falso

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args){
        double salario = 680;
        String resultado = salario > 5000 ? "Eu vou dor 500 pra Grimaldo " : "ainda não tenho condições, mais vou ter " ;
        boolean possoDoar = salario> 5000;
        System.out.println(resultado);

    }
}
