package strategy;

public class MysqlStrategy implements RepositoryStrategy{

    String buscar = "OLáa";
    @Override
    public void conecta() {
        System.out.println(buscar);
    }
}
