package com.ni.controller;

import com.ni.domain.Account;
import com.ni.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService as;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("表现层：查询所有账户..");
        List<Account> list = as.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/save")
    public void findAll(Account acct, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("表现层：查询所有账户..");
        as.save(acct);
        resp.sendRedirect(req.getContextPath()+"/account/findAll");
        return;
    }
}
