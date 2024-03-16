package strategy;

public class RepositoryContext {

    public RepositoryContext() {
    }

    public void interacaoBD(RepositoryStrategy repositoryStrategy){
        repositoryStrategy.conecta();
    }
}
