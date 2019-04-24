package br.com.apsoo.pedidos.domain.enumerations;

public enum TipoCliente {

    PESSOAFISICA("Pessao Física"),
    PESSOAJURIDICA("Pessoa Jurídica");

    private String descricao;

    TipoCliente(String descricao) {
       this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
