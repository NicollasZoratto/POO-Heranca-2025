package app;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Month;

public class PessoaJuridica extends Pessoa {
    private String nome;
    private String endereco;
    private LocalDate dataCriacao;
    private String nomeFantasia;
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String nomeFantasia, String cnpj) {
    this.setNome(nome);
    this.setEndereco(endereco);
    this.setDataCriacao(LocalDate.now());
    this.setNomeFantasia(nomeFantasia);
    this.setCnpj(cnpj);
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cpf) {
        this.cnpj = cnpj;
    }

    @Override
    public String exibirInformacoes() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.getNome() + "," + this.getEndereco() + "," + this.getDataCriacao() + "," + this.getNomeFantasia() + "," + this.getCnpj();
    }
}