package com.petland.start;

import com.petland.model.Register;
import com.petland.repository.IRegisterRepository;
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
        Register vitor = new Register();
        vitor.setId(1);
        vitor.setName("test");
        registerRepository.save(vitor);
    }
}