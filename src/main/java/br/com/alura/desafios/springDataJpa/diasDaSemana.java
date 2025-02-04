package br.com.alura.desafios.springDataJpa;

public enum diasDaSemana {
    DOMINGO,
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO;

    public boolean diaUtil(){
        if (this == DOMINGO || this == SABADO) {
            return false;
        }else {
            return true;
        }
    }
}
