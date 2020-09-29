package br.com.kempfer.poc.domain;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.Date;

public class Ordem {

    @Id
    public String id;

    public String ativo;
    public Date data;
    public Integer quantidade;
    public BigDecimal precoUnitario;
    public char operacao;

    public String getId() {
        return id;
    }

    public String getAtivo() {
        return ativo;
    }

    public Date getData() {
        return data;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public char getOperacao() {
        return operacao;
    }

    public Boolean isCompra(){
       return operacao == 'C' ? true : false;
    }

    public Boolean isVenda(){
        return operacao == 'V' ? true : false;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public void setOperacao(char operacao) {
        this.operacao = operacao;
    }

    public void setCompra(){
        this.operacao = 'C';
    }

    public void setVenda(){
        this.operacao = 'V';
    }

    public Ordem() {}

    public Ordem(String ativo, Date data, Integer quantidade, BigDecimal precoUnitario, char operacao) {
        this.ativo = ativo;
        this.data = data;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.operacao = operacao;
    }

    @Override
    public String toString() {
        return "Ordem{" +
                "id='" + id + '\'' +
                ", ativo='" + ativo + '\'' +
                ", data=" + data +
                ", quantidade=" + quantidade +
                ", precoUnitario=" + precoUnitario +
                ", operacao=" + operacao +
                '}';
    }
}
