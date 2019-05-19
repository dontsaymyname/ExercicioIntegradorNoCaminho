import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Livro livro = new Livro();

        Colecao colecao = new Colecao();

        Livraria livraria = new Livraria();

        Scanner scanner = new Scanner(System.in);

        int acao = 0;

        while (acao != 5){


            System.out.println(" ");
            System.out.println(" ");
        System.out.println("Digite o número correspondente à ação que deseja realizar");
        System.out.println("1 - Consultar livro");
        System.out.println("2 - Cadastrar livro");
        System.out.println("3 - Consultar coleção");
        System.out.println("4 - Cadastrar coleção");
        System.out.println("5 - Efetuar venda");
        System.out.println("6 - Finalizar");
        acao = scanner.nextInt();



        if (acao == 1){

            //Consultar livro
            System.out.println("Digite o código do livro");
            String codigoLivro = scanner.next();
            try{
                System.out.println(livraria.consultarLivroPorCodigo(codigoLivro).toString());}
            catch (Exception exception){
                System.out.println("Livro não encontrado");
            }
        }

        if (acao == 2){

            //Cadastrar livro
            System.out.println("Digite o código do livro");
            livro.setCodigo(scanner.next());
            System.out.println("Digite o título");
            livro.setTitulo(scanner.next());
            System.out.println("Digite o nome do autor");
            livro.setAutor(scanner.next());
            System.out.println("Digite o ano de lançamento");
            livro.setAnoLancamento(scanner.nextInt());
            System.out.println("Digite a quantidade");
            livro.setQuantidade(scanner.nextInt());
            System.out.println("Digite o código ISBN");
            livro.setCodigoISBN(scanner.next());
            System.out.println("Digite o preço");
            livro.setPreco(scanner.nextFloat());
            livraria.cadastrarLivro(livro);

        }

        if (acao == 3){

            //Consultar coleção
            System.out.println("Digite o código da coleção");
            String codigoDaColeca = scanner.next();
            try {
                System.out.println(livraria.consultarColecaoPorCodigo(codigoDaColeca).toString());
            } catch (Exception exception){
                System.out.println("Coleção não encontrada");
            }
        }

        if (acao == 4){

            //Cadastrar coleção



            int adicionarMaisLivros = 0;
            while (adicionarMaisLivros != 2){

                System.out.println("1 - Adicionar livro");
                System.out.println("2 - Encerrar");

                adicionarMaisLivros = scanner.nextInt();

                if (adicionarMaisLivros == 1){

                    System.out.println("Digite o código da coleção");
                    colecao.setCodigoColecao(scanner.next());
                    System.out.println("Digite a descrição");
                    colecao.setDescricaoColecao(scanner.next());
                    System.out.println("Digite o preço");
                    colecao.setPrecoColecao(scanner.nextFloat());
                    System.out.println("Digite o código do livro que deseja adicionar a coleção");
                    Livro livroColecao = livraria.consultarLivroPorCodigo(scanner.next());
                    colecao.cadastrarLivroNaColecao(livroColecao);

                }
                if (adicionarMaisLivros == 2) {
                    System.out.println("Cadastro de coleção finalizado");
                }

                if (acao == 5){
                    System.out.println("Digite o código do livro que deseja comprar");
                    //Não imprime nada e finaliza


                }

                if (acao == 6){
                    System.out.println("Sistema finalizado");
                    //Também não imprime nada e finaliza
                }



                }





            }





        }
    }

}
