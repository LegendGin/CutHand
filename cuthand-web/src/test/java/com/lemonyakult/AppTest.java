package com.lemonyakult;

import com.lemonyakult.dao.TbItemDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    }

    @Test
    public void daoTest()
    {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        TbItemDao dao = ac.getBean(TbItemDao.class);
        System.out.println(dao.getClass().getSimpleName());
        assertNotNull(dao);
    }
}
