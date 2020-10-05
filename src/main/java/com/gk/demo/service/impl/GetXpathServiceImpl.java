package com.gk.demo.service.impl;

import com.gk.demo.service.GetXpathService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.seimicrawler.xpath.JXDocument;
import org.seimicrawler.xpath.JXNode;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.util.Arrays;
import java.util.List;


/**
 * Author: 郝振良
 * Date: 2020/9/24 9:32
 * Content:
 */
@Service
public class GetXpathServiceImpl implements GetXpathService {

    @Override
    public List<JXNode> getXpathText(String xpath, String url) throws Exception {

        Document doc = null;
        try {
            doc = Jsoup.connect(url).userAgent("Mozilla/5.0").timeout(3000).post();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Elements elements = new Elements();
        elements.add(doc);
        JXDocument jxDocument = new JXDocument(elements);

        return jxDocument.selN(xpath);
    }


}

