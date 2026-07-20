package estudos_em_java01;

public class Exercicios05 {
    //Declare uma variável contendo a nota de um aluno (de 0 a 10). Se a nota for 6.8 ou mais, mostre “Aprovado”. Senão, mostre “Reprovado”.
    public static void main(String[] args) {
        double notadeUmAluno = 7;
        if (notadeUmAluno >= 6.8){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }
    }
}
