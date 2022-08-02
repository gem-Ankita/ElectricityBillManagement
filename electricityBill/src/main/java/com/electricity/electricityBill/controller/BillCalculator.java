package com.electricity.electricityBill.controller;

import com.electricity.electricityBill.model.User;
import com.electricity.electricityBill.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.Inet4Address;

@RestController
@RequestMapping("/bill")
public class BillCalculator {

    @Autowired
    BillService billService;
    @GetMapping("/{input}")
    public ResponseEntity calculateBill(@PathVariable("input") Integer unit) {
        Double bill=this.billService.calculateBill(unit);
        return new ResponseEntity(bill,HttpStatus.OK);
    }
}
