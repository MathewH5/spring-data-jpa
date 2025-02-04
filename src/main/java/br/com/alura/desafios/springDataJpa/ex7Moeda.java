package br.com.alura.desafios.springDataJpa;

public enum ex7Moeda {
    DOLAR,
    EURO,
    REAL;

    public Double converterPara(double valoreEmReais) {
        switch (this) {
            case EURO:
                return valoreEmReais / 6;
            case DOLAR:
                return valoreEmReais / 5;
            case REAL:
                return valoreEmReais;
            default:
                throw new IllegalArgumentException("Moeda inválida");
        }
    }
}
