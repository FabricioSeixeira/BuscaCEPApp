package com.example.fabriciosteixeira.buscacepapp;

/**
 * Created by fabricio.steixeira on 02/04/2018.
 */

public class CEP {

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String toString(){
        return "CEP: "+ getCep()
                + "\nLogradouro: "+getLogradouro()
                + "\nComplemento: "+getComplemento()
                + "\nBairro: "+getBairro()
                + "\nCidade: "+getCidade()
                + "\nEstado: "+getEstado();
    }
}
