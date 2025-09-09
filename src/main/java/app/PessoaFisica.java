package app;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Month;

public class PessoaFisica extends Pessoa {
    private String nome;
    private String endereco;
    private LocalDate dataCriacao;
    private LocalDate dataNascimento;
    private String cpf;

    public PessoaFisica(String nome, String endereco, LocalDate dataNascimento, String cpf) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setDataCriacao(LocalDate.now());
        this.setDataNascmineto(dataNascimento);
        this.setCpf(cpf);
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascmineto(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String exibirInformacoes() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.getNome() + "," + this.getEndereco() + "," + this.getDataCriacao() + "," + this.getDataNascimento() + "," + this.getCpf();
    }
}

