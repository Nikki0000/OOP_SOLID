package homework;

//Dependency Inversion Principle
public class Persister implements UserSaved{

    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
