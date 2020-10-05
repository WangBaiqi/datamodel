package com.gk.demo.service.impl;

import com.gk.demo.DemoApplication;
import junit.framework.TestCase;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.seimicrawler.xpath.JXNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Author: 郝振良
 * Date: 2020/9/24 9:50
 * Content:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class GetXpathServiceImplTest extends TestCase {

    @Autowired
    private GetXpathServiceImpl getXpathService;

    @Test
    public void testGetXpathText() throws Exception {
        String url = "http://zt.zjzs.net/xk2020/10001.html";
        String xpath = "//body/div/div[2]/div/div[2]/table/tbody/tr[26]/td[3]/text()";
        List<JXNode> xpathText = getXpathService.getXpathText(xpath,url);
//        System.err.println(xpathText);
    }
}