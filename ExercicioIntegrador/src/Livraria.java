import java.util.HashMap;
import java.util.Map;

public class Livraria {

    private Map<String, Livro> estoque = new HashMap<>();
    private Map<String, Colecao> mapColecao = new HashMap<>();

    public Livraria (){

        estoque = new HashMap<>();

        Livro livro1 = new Livro();
        livro1.setCodigo("1");
        livro1.setTitulo("A Arte da Guerra");
        livro1.setAutor("Sun Tzu");
        livro1.setAnoLancamento(1927);
        livro1.setQuantidade(5);
        livro1.setCodigoISBN("12345");
        livro1.setPreco(15F);

        Livro livro2 = new Livro();
        livro2.setCodigo("2");
        livro2.setTitulo("O homem mais rico da Babilonia");
        livro2.setAutor("George Samuel Clanson");
        livro2.setAnoLancamento(1926);
        livro2.setQuantidade(5);
        livro2.setCodigoISBN("23451");
        livro2.setPreco(20F);

        Livro livro3 = new Livro();
        livro3.setCodigo("3");
        livro3.setTitulo("Os axiomas de Zurique");
        livro3.setAutor("Max Gunther");
        livro3.setAnoLancamento(1985);
        livro3.setQuantidade(5);
        livro3.setCodigoISBN("34512");
        livro3.setPreco(25F);

        Livro livro4 = new Livro();
        livro4.setCodigo("4");
        livro4.setTitulo("A arte da persuasão");
        livro4.setAutor("James Borg");
        livro4.setAnoLancamento(2011);
        livro4.setQuantidade(5);
        livro4.setCodigoISBN("45123");
        livro4.setPreco(30F);

        estoque.put(livro1.getCodigo(), livro1);
        estoque.put(livro2.getCodigo(), livro2);
        estoque.put(livro3.getCodigo(), livro3);
        estoque.put(livro4.getCodigo(), livro4);
    }

    public void cadastrarColecao (Colecao colecao){
        mapColecao.put(colecao.getCodigoColecao(), colecao);
        System.out.println("Coleção cadastrada com sucesso");
    }

    public void cadastrarLivro(Livro livro){

        estoque.put(livro.getCodigo(), livro);
        System.out.println("Livro cadastrado com sucesso");

    }

    public Livro consultarLivroPorCodigo (String codigo){

        return estoque.get(codigo);
    }

    public Colecao consultarColecaoPorCodigo (String codigo){
        return mapColecao.get(codigo);
    }

    public void efetuarVendaPorCodigo (String codigo){

        if (estoque.get(codigo).getQuantidade() == 0){
            System.out.println("Livro esgotado");
        } else {
            estoque.get(codigo).vender();
            System.out.println("Compra realizada com sucesso");

        }


    }

}
