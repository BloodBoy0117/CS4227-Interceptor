package test;

import Interceptor.Application;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class test {

    @Before
    public void before1(){
    }

    @Test
    public void test1(){
        Application.do_work();
    }

    @After
    public void after(){
    }

}
