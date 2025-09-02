package app;

public class Tarefa {
    private long id;
    private String descrição;
    private boolean isConcluido;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descrição;
    }

    public void setDescricao(String descrição) {
        this.descrição = descrição;
    }

    public boolean isConcluido() {
        return isConcluido;
    }

    public void setConcluido(boolean isConcluido) {
        this.isConcluido = isConcluido;
    }

    public Tarefa(long id, String descrição, boolean isConcluido) {
        this.setId(id);
        this.setDescricao(descrição);
        this.setConcluido(isConcluido);
    }

    
}