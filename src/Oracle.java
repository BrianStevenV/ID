public class Oracle extends BaseDatos implements ServicePerson{
    public Oracle(String nameBBDD, String password, String port, String direction) {
        super(nameBBDD, password, port, direction);
    }

    @Override
    public void savePerson(Person person) {
        System.out.println("Person saved in Oracle!");
    }

    @Override
    public void saveBBDD(Person person) {
        savePerson(person);
        System.out.println("I'm an Oracle Data base!");
    }
}
