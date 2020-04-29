import com.dao.UnionQueryMapper;
import com.model.pojo.Cards;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import javax.annotation.Resource;
import javax.xml.soap.Detail;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class TestSpring {
    @Resource
    private UnionQueryMapper unionQueryMapper;
    @Test
    public void testCode() {
        List<Cards> cards = unionQueryMapper.queryCardsPerson("");
        System.out.println(cards.get(0).getPerson().getPerId());

    }
}
