package com.yesbuter.demo;

import com.yesbuter.demo.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringDemoInvokeApplicationTests {

    @Autowired
    AccountService accountService;
    @Test
    public void contextLoads() {
        accountService.SearchAccount();
    }

}
