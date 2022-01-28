package com.example.springboot_demo.mapper;

import com.example.springboot_demo.domain.bill.BillRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BillMapper {

    void insertBillRecord(BillRecord billRecord);
}
