package com.offcn;


import com.example.monitor.MyMessageListener;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext-jms-custom.xml")
public class TextAccept {
    @Test
    public void testAccept(){
        try{
            System.in.read();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
