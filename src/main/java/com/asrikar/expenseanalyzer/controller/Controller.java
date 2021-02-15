package com.asrikar.expenseanalyzer.controller;

import com.asrikar.expenseanalyzer.object.ExpenseRecord;
import com.asrikar.expenseanalyzer.repository.ExpenseRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private ExpenseRecordRepository expenseRecordRepository;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "test";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ExpenseRecord getAllRecords(@PathParam("id") Long id) {
        return expenseRecordRepository.findById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void save(ExpenseRecord expenseRecord) {
        expenseRecordRepository.save(expenseRecord);
    }
}
