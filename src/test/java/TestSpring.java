import com.dao.AssociationMapper;
import com.dao.BatchesMapper;
import com.dao.ItemMapper;
import com.dao.UnionQueryMapper;
import com.model.pojo.Batches;
import com.model.pojo.Cards;
import com.model.pojo.Person;
import com.service.ICheckStationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import javax.annotation.Resource;
import java.awt.image.renderable.RenderableImage;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml"})
public class TestSpring {
    @Resource
    private UnionQueryMapper unionQueryMapper;
    @Resource
    private BatchesMapper batchesMapper;
    @Resource
    private Batches batches;
    @Resource
    private AssociationMapper associationMapper;
    @Resource
    private ItemMapper itemMapper;
    @Resource
    private ICheckStationService checkStationService;
    @Test
    public void testCode() {
//        List<Cards> cards = unionQueryMapper.queryCardsPerson("1001");
//        System.out.println(cards.get(0).getPerson());
//        System.out.println(cards.get(0).getPerson().getPerId());
//        boolean flag = batchesMapper.insertBatches(batches);
//        System.out.println(flag);
//        System.out.println(getNumberForBatchNo());
//        batches.setPerId(cards.get(0).getPerson().getPerId());
//        batches.setBatchNo(getNumberForBatchNo());
//        batches.setBatchPay("未缴费");
//        batches.setBatchCmp("未完成");
//        batchesMapper.insertBatches(batches);
//        associationMapper.findAssociation("");
        List<String> list = new ArrayList<String>();
        list.add("a");
        checkStationService.createList("1001", list);


    }

    public String getNumberForBatchNo() {
        String id="";
        SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmss");
        String temp = sf.format(new Date());
        //int random=(int) (Math.random()*100);
        //id=temp+random;
        id = temp;
        return id;
    }

}
