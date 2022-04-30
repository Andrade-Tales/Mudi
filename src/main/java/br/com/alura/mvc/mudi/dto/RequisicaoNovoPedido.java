package br.com.alura.mvc.mudi.dto;

import br.com.alura.mvc.mudi.model.Pedido;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class RequisicaoNovoPedido {
	
    @NotBlank(message = "O nome do produto é obrigatório!") @Min(5) @Max(20)
    private String nomeProduto;
    @NotBlank(message = "A url do produto é obrigatório!")
    private String urlProduto;
    @NotBlank(message = "A url da imagem é obrigatório!")
    private String urlImagem;
    private String descricao;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public Pedido toPedido() {

        Pedido pedido = new Pedido();
        pedido.setDescricao(descricao);
        pedido.setUrlImagem(urlImagem);
        pedido.setUrlProduto(urlProduto);
        pedido.setNomeProduto(nomeProduto);
        return pedido;
    }
}
