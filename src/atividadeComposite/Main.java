package atividadeComposite;

public class Main {
    public static void main(String[] args){

//        Criei uma interface chamada Usuario com o método falar(). Tanto o Funcionario quanto o Gerente usam essa interface, então dá
//        pra tratar todo mundo do mesmo jeito. Na classe Gerente, eu fiz uma lista de Usuario, então ele pode adicionar qualquer um
//        — funcionário ou gerente. Isso permite montar a hierarquia de forma recursiva, porque um gerente pode ter outro gerente dentro
//        dele, e assim por diante. No fim, quando eu chamo o método falar() no gerente principal, ele mostra todo mundo que está
//         embaixo dele, mesmo que sejam vários níveis. Assim, consigo exibir toda a estrutura da empresa de um jeito fácil.


         Gerente gerentePrincipal = new Gerente("Julia");
         Funcionario funcionario1 = new Funcionario("Matheus Quost");
         Gerente gerente2 = new Gerente("Raquel");

         gerentePrincipal.adicionar(funcionario1);
         gerentePrincipal.adicionar(gerente2);

         gerente2.adicionar(new Funcionario("Valentim"));
         gerente2.adicionar(new Funcionario("Luana"));

        gerente2.falar();
    }
}
