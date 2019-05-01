package br.com.apsoo.pedidos.domain.enumerations;

public enum EstadoPagamento {

    PENDENTE("Pedente"),
    QUITADO("Quitado"),
    CANCELADO("Cancelado");

    private String descricao;

    EstadoPagamento(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
