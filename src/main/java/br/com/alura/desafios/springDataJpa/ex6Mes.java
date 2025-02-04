package br.com.alura.desafios.springDataJpa;

public enum ex6Mes {
    JANEIRO,
    FEVEREIRO,
    MARCO,
    ABRIL,
    MAIO,
    JUNHO,
    JULHO,
    AGOSTO,
    SETEMBRO,
    OUTUBRO,
    NOVEMBRO,
    DEZEMBRO;

    public int getNumeroDeDias(){
        switch (this) {
            case JANEIRO:
            case MARCO:
            case MAIO:
            case JULHO:
            case AGOSTO:
            case OUTUBRO:
            case DEZEMBRO:
                return 31;
            case ABRIL:
            case JUNHO:
            case SETEMBRO:
            case NOVEMBRO:
                return 30;
            case FEVEREIRO:
                return 28;
            default:
                throw new IllegalArgumentException("Mês inválido");
        }
    }
}
