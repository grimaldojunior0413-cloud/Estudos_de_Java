package estudos_em_java01;

public class Aula06EstruturasDeRepeticao04 {
    // dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // condições valorParcela >= 1000
    public static void main(String[] args) {
        double valorDoCarro = 30000;
        for (int parcela = 1; parcela <= valorDoCarro; parcela++){
            double valorParcela = valorDoCarro / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println ("Parcela:" + parcela + "R$" + valorParcela);
        }
    }
}
