package com.example.springboot_demo.service;

import com.example.springboot_demo.domain.bill.BillRecord;
import com.example.springboot_demo.mapper.BillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillService {

    private final BillMapper billMapper;

    @Autowired
    public BillService(BillMapper billMapper) {
        this.billMapper = billMapper;
    }

    public BillRecord postBillRecord(BillRecord billRecord) {
        billMapper.insertBillRecord(billRecord);
        return billRecord;
    }
}
