package com.springboot.web.controller;
import com.springboot.web.service.TransactionService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.springboot.web.model.Account;
import com.springboot.web.model.Transaction;
import com.springboot.web.model.TransferResponse;
import com.springboot.web.model.TransferRequest;
import com.springboot.web.service.TransactionService;

@RestController    // This means that this class is a Controller
@RequestMapping(path="/api/") // This means URL's start with /demo (after Application path)
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @RequestMapping(value = "/transaction", method = RequestMethod.POST, headers = "Accept=application/json")
    public TransferResponse transfer(@RequestBody TransferRequest request){
        return transactionService.process(request);
    }

    @RequestMapping(value = "/transaction/all", method = RequestMethod.POST, headers = "Accept=application/json")
    public TransferResponse allTransaction(@RequestBody TransferRequest request){

        return transactionService.getAllTransactions();
    }

    @RequestMapping(value = "/transaction/account/all", method = RequestMethod.POST, headers = "Accept=application/json",consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)

    public TransferResponse allTransactionAccount(@RequestBody TransferRequest request){
        return transactionService.getAllTransactionAccount(request);
    }
}
