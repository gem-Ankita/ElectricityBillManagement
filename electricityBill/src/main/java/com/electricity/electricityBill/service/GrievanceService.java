package com.electricity.electricityBill.service;

import com.electricity.electricityBill.model.Grievance;

import java.util.Map;

public interface GrievanceService {
    public Map<String, Object> saveComplain(Grievance grievance);
}
