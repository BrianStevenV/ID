public  abstract class BaseDatos {
    protected String nameBBDD;
    protected String password;
    protected String port;

    protected String direction;

    public BaseDatos(String nameBBDD, String password, String port, String direction) {
        this.nameBBDD = nameBBDD;
        this.password = password;
        this.port = port;
        this.direction = direction;
    }
}
