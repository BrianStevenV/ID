public class Main {
    public static void main(String[] args) {

        Person person = new Person("Balduino", "Babilonia");
        MySQL sql = new MySQL("balduinodb","balduinito", "8000", "localhost/");
        sql.saveBBDD(person);

        Person person2 = new Person("Pancho", "Paredes");
        Oracle oracle = new Oracle("panchitodb", "lapanza", "5000", "host/");
        oracle.saveBBDD(person2);
    }
}