package estudos_em_java01;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args){
        // condicional
        int idade = 15;
        boolean isAutorizadoCompraBebida = idade >= 18;
        // negação "!"

        // só executa se o if for "true"
        if(isAutorizadoCompraBebida == false){
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }

        // esta negando esse IF se for de menor
        // esse codigo é independente
        if(! isAutorizadoCompraBebida){
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }


        // associação da boolean com o if para saber se é falso ou não
        boolean c = false;
        if(c = true){
            System.out.println("Dentro de algo que nunca pode ser feito");
        }

        System.out.println("fora do IF");
    }

}
