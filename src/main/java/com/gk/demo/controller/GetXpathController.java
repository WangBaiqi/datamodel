package com.gk.demo.controller;

import com.gk.demo.service.impl.GetXpathServiceImpl;
import com.gk.demo.utils.AjaxResult;
import org.jsoup.nodes.Document;
import org.seimicrawler.xpath.JXNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

/**
 * Author: 郝振良
 * Date: 2020/9/24 9:15
 * Content:
 */

@RestController
@RequestMapping("/system")
public class GetXpathController {

    @Autowired
    private GetXpathServiceImpl getXpathService;

    @PostMapping("/getText")
    public AjaxResult getText(@RequestParam String xpath,@RequestParam String url) throws  Exception {
        System.err.println(xpath);
        List<JXNode> xpathText = getXpathService.getXpathText(xpath,url);

        return AjaxResult.success("操作成功", xpathText.get(0).toString());
    }
}
