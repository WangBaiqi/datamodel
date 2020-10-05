package com.gk.demo.service;

import org.seimicrawler.xpath.JXNode;

import java.util.List;

/**
 * Author: 郝振良
 * Date: 2020/9/24 9:27
 * Content:
 */
public interface GetXpathService {

    public List<JXNode> getXpathText(String xpath, String url) throws  Exception;
}
