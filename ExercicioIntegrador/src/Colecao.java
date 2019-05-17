import java.util.ArrayList;
import java.util.List;

public class Colecao {

    private String codigoColecao;
    private String descricaoColecao;
    private float precoColecao;
    List<Livro> colecaoLivro = new ArrayList<>();

    public String getCodigoColecao() {
        return codigoColecao;
    }

    public void setCodigoColecao(String codigoColecao) {
        this.codigoColecao = codigoColecao;
    }

    public String getDescricaoColecao() {
        return descricaoColecao;
    }

    public void setDescricaoColecao(String descricaoColecao) {
        this.descricaoColecao = descricaoColecao;
    }

    public float getPrecoColecao() {
        return precoColecao;
    }

    public void setPrecoColecao(float precoColecao) {
        this.precoColecao = precoColecao;
    }

    public void cadastrarLivroNaColecao (Livro livro){
        colecaoLivro.add(livro);
        System.out.println("Livro adicionado à coleção");
    }

    @Override
    public String toString() {
        return "Colecao{" +
                "codigoColecao='" + codigoColecao + '\n' +
                ", descricaoColecao='" + descricaoColecao + '\n' +
                ", precoColecao=" + precoColecao +
                ", colecaoLivro=" + colecaoLivro +
                '}';
    }
}
