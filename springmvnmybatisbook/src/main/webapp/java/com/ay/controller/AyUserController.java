package com.ay.controller;

import com.ay.model.AyUser;
import com.ay.service.AyUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description
 * Author innjewel
 */
@Controller
@RequestMapping(value = "/user")
public class AyUserController {

    @Resource
    private AyUserService ayUserService;

    @GetMapping("/findAll")
    public String findAll(Model model) {
        List<AyUser> ayUsers = ayUserService.findAll();
        for (AyUser ayUser : ayUsers) {
            System.out.println("id: " + ayUser.getId());
            System.out.println("name: " + ayUser.getName());
        }
        return "hello";
    }


}
