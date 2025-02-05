package br.com.alura.desafios.springDataJpa;

public enum ex8CodigoErro {
    NOT_FOUND(404, "Não encontrado - A página que você está procurando não foi encontrada."),
    BAD_REQUEST(400, "Solicitação inválida - A requisição não pode ser processada devido a um erro do cliente."),
    INTERNAL_SERVER_ERROR(500, "Erro interno do servidor - O servidor encontrou uma condição inesperada que o impediu de atender à solicitação."),
    UNAUTHORIZED(401, "Não autorizado - A solicitação requer autenticação de usuário."),
    FORBIDDEN(403, "Proibido - O servidor entendeu a solicitação, mas se recusa a autorizá-la."),
    METHOD_NOT_ALLOWED(405, "Método não permitido - O método usado na solicitação não é suportado pelo recurso."),
    GONE(410, "Gone - O recurso solicitado não está mais disponível e não o será no futuro."),
    SERVICE_UNAVAILABLE(503, "Serviço indisponível - O servidor não está pronto para processar a solicitação.");

    private final int codigo;
    private final String descricao;

    ex8CodigoErro(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }


    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}