public class MySQL extends BaseDatos implements ServicePerson{

    public MySQL(String nameBBDD, String password, String port, String direction) {
        super(nameBBDD, password, port, direction);
    }

    public void savePerson(Person person){
        System.out.println("Person saved!");
    }

    public void saveBBDD(Person person){
        savePerson(person);
        System.out.println("I'm a Data base!");
    }
}
