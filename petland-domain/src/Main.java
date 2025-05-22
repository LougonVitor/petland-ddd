import com.petland.domain.register.Address;
import com.petland.domain.register.Profile;
import com.petland.domain.register.Register;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Register register = new Register();

        register.setId(1);
        register.setName("Vítor Lougon");

        Profile profile = new Profile();
        profile.setCustomer(true);

        Address address = new Address();
        address.setPublicPlace("My street.");
        address.setNumber("136B");

        register.setProfile(profile);
        register.setAddress(address);

        System.out.println("Register created, name: " + register.getName());
        System.out.println("Address: " + register.getAddress().getNumber() + " " + register.getAddress().getNumber());


    }
}