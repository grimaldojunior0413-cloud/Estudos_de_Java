package estudos_de_java;

public class Aula05EstrutuasCondicionais02 {
    public static void main(String[] args){
        // idade <15 categoria infantil
        //idade >= 15 && idade <18 categoria juvenil
        // idade >= categoria adulto
        int idade = 14;
        String categoria;
        if (idade < 15){
            categoria = "Categoria Infantil";
            System.out.println("Categoria Infantil");
        }else if(idade >= 15  && idade < 18){
            categoria = "Categoria Juvenil";
            System.out.println("Categoria Juvenil");
        }else {
            categoria = "Categoria Adulto";
            System.out.println(categoria);

        }
    }
    // anotações
    // && tem que ser todas verdadeira
   // or se for todos verdadeiro é verdadeira ou se for todos falso vai ser falso, só quando todos são falso se não, vai ser verdadeira
}
