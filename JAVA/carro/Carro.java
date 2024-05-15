package carro;

class Carro {
    private String marca = " ";
    private String modelo = " ";
    private int ano;

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public Carro(String marca, String modelo, int ano){
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String verMeuCarro(){
        String carro ="Marca: "+marca+" Ano: "+ano+" Modelo: "+modelo;
        return(carro); 
    }
}
