package com.mycompany.calculator.additionservice.service;

import com.mycompany.calculator.additionservice.domain.CalculationResult;
import org.springframework.stereotype.Service;

@Service
public class IAdditionService implements AdditionService {


    @Override
    public CalculationResult addition(Integer numberOne, Integer numberTwo) {
        return new CalculationResult("SUCCESS", numberOne + numberTwo);
    }
}
