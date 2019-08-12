package com.cinimex.test.controller;

import com.cinimex.test.model.InputString;
import com.cinimex.test.service.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    StringService stringService;

    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcomePage() {
        return "welcomePage";
    }

    @RequestMapping(value = {"/format"}, method = RequestMethod.POST)
    public @ResponseBody String getFormattedString(@RequestBody InputString string) {

        return stringService.getOutputString(string);
    }
}
