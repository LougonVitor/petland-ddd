package com.petland.start;

import com.petland.register.model.Address;
import com.petland.register.model.Profile;
import com.petland.register.model.entity.RegisterEntity;
import com.petland.register.repository.IRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppStart implements ApplicationRunner {

    @Autowired
    private IRegisterRepository registerRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        RegisterEntity vitor = new RegisterEntity();
        vitor.setName("test");

        Profile profile = new Profile();
        profile.setCustomer(true);

        Address address = new Address();
        address.setPublicPlace("Antonio Secatti");
        address.setNumber("136b");

        vitor.setProfile(profile);
        vitor.setAddress(address);

        registerRepository.save(vitor);
    }
}