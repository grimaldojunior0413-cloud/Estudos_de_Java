package estudos_em_java01;

public class Exercicio06 {
    //Declare uma variável contendo o valor do consumo de energia (em kWh). Se for até 100, o preço é 0,50 por kWh. Se for maior que 100, o preço é 0,70 por kWh. Calcule e mostre o valor total.
    public static void main(String[] args) {
        double kWh = 102;
        if (kWh <= 100){
            kWh = kWh * 0.5;
        }else {
            kWh = kWh * 0.7;
        }
        System.out.println(kWh);
    }
}
