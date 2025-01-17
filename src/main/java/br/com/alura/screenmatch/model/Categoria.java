package br.com.alura.screenmatch.model;

public enum Categoria {
    DRAMA("Drama"),
    ACAO("Action"),
    ROMANCE("Romance"),
    CRIME("Crime"),
    COMEDIA("Comedy");

    private String categoriaOmdb;

    Categoria(String categoriaOmdb){
        this.categoriaOmdb = categoriaOmdb;
    }

    public static Categoria fromString(String text){
        for(Categoria categoria : Categoria.values()){
            if(categoria.categoriaOmdb.equalsIgnoreCase(text)){
                return categoria;
            }
        }
        throw new IllegalArgumentException("nenhuma categoria encontrada");
    }
}
