package br.com.local.loiola_delivery_app;

public class PizzasBrotinhos {

    private String Nome;
    private String Descricao;
    private String Valor;
    private int Imagem;

    public PizzasBrotinhos() {
    }

    public PizzasBrotinhos(String nome, String descricao, String valor, int imagem) {
        Nome = nome;
        Descricao = descricao;
        Valor = valor;
        Imagem = imagem;
    }


    public String getNome() {
        return Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public String getValor() {
        return Valor;
    }

    public int getImagem() {
        return Imagem;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public void setValor(String valor) {
        Valor = valor;
    }

    public void setImagem(int imagem) {
        Imagem = imagem;
    }
}
