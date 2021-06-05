package br.com.impacta.lab;

public class PessoaFisica implements Pessoa{

  private String documento;
  private String tipo;

  public PessoaFisica(String documento, String tipo) {
    this.documento  = documento;
    this.tipo = tipo;
  }

  public String getDocumento() {
    return this.documento;
  }

  public void setDocumento(String documento) {
    this.documento = documento;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  @Override
  public String falarDocumento() {
    return documento;
  }

  @Override
  public String getTipo() {    
    return tipo;
  }
  
}