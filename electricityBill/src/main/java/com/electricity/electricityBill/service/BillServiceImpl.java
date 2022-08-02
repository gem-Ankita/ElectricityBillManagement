package com.electricity.electricityBill.service;

import org.springframework.stereotype.Service;

@Service
public class BillServiceImpl implements BillService {
    @Override
    public Double calculateBill(Integer unit) {
        Double calculator = Double.valueOf(0);
        Double finalBill;
        if (unit > 0 && unit < 100) {
            calculator = Double.valueOf(unit * 5);
        } else if (unit > 100 && unit < 400) {
            calculator = Double.valueOf(unit * 6);
        } else if (unit > 400) {
            calculator = Double.valueOf(unit * 8);
        }
        finalBill=calculator;
        finalBill=finalBill+finalBill*3/100;
        finalBill=finalBill+finalBill*18/100;

        return finalBill;
    }
}
