package com.electricity.electricityBill.Repo;

import com.electricity.electricityBill.model.Grievance;
import com.electricity.electricityBill.service.GrievanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrievanceRepo extends JpaRepository<Grievance,Long> {


}
