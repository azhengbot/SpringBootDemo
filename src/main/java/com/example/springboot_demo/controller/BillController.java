package com.example.springboot_demo.controller;

import com.example.springboot_demo.domain.bill.BillRecord;
import com.example.springboot_demo.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bill")
public class BillController {

    private final BillService billService;

    @Autowired
    public BillController(BillService billService) {
        this.billService = billService;
    }

    @PostMapping("")
    public BillRecord postBillRecord(@RequestBody BillRecord billRecord){
        return billService.postBillRecord(billRecord);
    }
}
