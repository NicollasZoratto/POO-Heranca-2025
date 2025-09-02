package app;

public class Tarefa extends Atividade {
    private boolean isConcluido;
    
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