import strategy.MysqlStrategy;
import strategy.RepositoryContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RepositoryContext repositoryContext = new RepositoryContext();
        repositoryContext.interacaoBD(new MysqlStrategy());
    }
}