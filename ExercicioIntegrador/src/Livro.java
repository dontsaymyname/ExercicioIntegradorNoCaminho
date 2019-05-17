public class Livro {

    private String codigo;
    private String titulo;
    private String autor;
    private int anoLancamento;
    private String codigoISBN;
    private int quantidade;
    private float preco;



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getCodigoISBN() {
        return codigoISBN;
    }

    public void setCodigoISBN(String codigoISBN) {
        this.codigoISBN = codigoISBN;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void vender(){
        quantidade = quantidade - 1;
    }

    @Override
    public String toString() {
        return  "Código: " + codigo + '\n' +
                "Título: " + titulo + '\n' +
                "Autor: " + autor + '\n' +
                "Ano de lançamento: " + anoLancamento + '\n' +
                "Código ISBN: " + codigoISBN + '\n' +
                "Quantidade: " + quantidade + '\n' +
                "Preço: R$" + preco;
    }
}

