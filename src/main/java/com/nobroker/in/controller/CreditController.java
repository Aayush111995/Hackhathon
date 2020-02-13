package com.nobroker.in.controller;

//import com.nobroker.in.entity.CreditActivityEntity;

import com.nobroker.in.entity.Credit;
import com.nobroker.in.service.CreditService;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/credit")

public class CreditController {
    @Autowired
    private CreditService creditService;

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Credit updateCreditDataById(@RequestParam String creditId, @RequestParam String amount){
        Credit credit = creditService.updateCredit(creditId, amount);
        return credit;
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<Credit> getAllCreditData() throws IOException {
        List<Credit> allCredits = creditService.getAll();
        return allCredits;
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public Credit deleteCredit(@RequestParam String id) throws IOException {
        Credit credit = creditService.deleteCredit(id);
        return credit;
    }
    @CrossOrigin
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Credit addNewCredit(@RequestParam String activity,
                                       @RequestParam String amount) throws IOException {
        Credit credit = creditService.addNewCredit(activity, amount);

        return credit;
    }

}
