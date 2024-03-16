package strategy;


public class H2BdStrategy implements RepositoryStrategy{

    String consulta = "Heeloo";
    @Override
    public void conecta() {
        System.out.println(consulta);
    }
}
