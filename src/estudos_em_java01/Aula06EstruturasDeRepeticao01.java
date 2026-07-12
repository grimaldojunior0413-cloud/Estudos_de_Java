package estudos_em_java01;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args){
        // while, do while, for
        int cont = 0;
        while(cont <= 10){
            System.out.println(cont);
            cont = cont + 2;
        }
        cont = 0;
        do{
            System.out.println("dentro do do-while" + ++cont);
        }while (cont < 10);


        for(int i = 0; i < 10 ; i++){
            System.out.println("For" +i);
            }

        for(cont = 0 ; cont < 10 ; cont ++){
            System.out.println("For" +cont);
        }

    }
}
