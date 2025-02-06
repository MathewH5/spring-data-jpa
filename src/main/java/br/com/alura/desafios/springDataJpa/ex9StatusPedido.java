package br.com.alura.desafios.springDataJpa;

public enum ex9StatusPedido {
    PENDENTE(1,"pedio feito..."),
    PROCESSANDO(2, "estamos processando seu pedido"),
    ENVIADO(3,"pedidp enviado"),
    ENTREGUE(4,"pedido entregue ao cliente");

    private final int cod;
    private final String descricaoStatus;

    ex9StatusPedido(int cod, String descricaoStatus) {
        this.cod =cod ;
        this.descricaoStatus  = descricaoStatus;
    }

    public int codigo(){
        return cod;
    }

    public String descricaoStatus(){
        return descricaoStatus;
    }

}
