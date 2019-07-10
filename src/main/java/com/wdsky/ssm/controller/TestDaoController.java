package com.wdsky.ssm.controller;

import com.wdsky.ssm.model.Test;
import com.wdsky.ssm.service.ITestDoaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/test")
public class TestDaoController {
    @Resource
    ITestDoaService testDoaService;

    @RequestMapping("/index_page")
    public String showIndex(HttpServletRequest request, Model model){
        int id = Integer.parseInt(request.getParameter("id"));
        Test test = testDoaService.getModelById(id);
        //绑定对象到test/index.jsp
        model.addAttribute("test", test);
        return "test/index";
    }

    @RequestMapping("/index_api")
    @ResponseBody
    public Test Index(HttpServletRequest request,Model model) {
        int id = Integer.parseInt(request.getParameter("id"));
        return testDoaService.getModelById(id);
    }
}
