import com.example.TopicProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext-jms-provider.xml")
public class TopicText {
    @Autowired
    private TopicProducer topicProducer;
    @Test
    public void sendTextQueue(){
        topicProducer.sendTextMessage("测试多对多！");
    }
}
