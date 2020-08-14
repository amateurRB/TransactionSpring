package com.springboot.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.MyRepo;
import com.dao.TransactionDAO;
import com.springboot.web.model.Transaction;
import com.springboot.web.model.TransferRequest;
import com.springboot.web.model.User;

@Service
public class TransactionService {
	
	@Autowired
	TransactionDAO trdao;
	
	
	public List<Transaction> findAll() {

        List it = trdao.findAll();

        List transacts = new ArrayList<Transaction>();
        it.forEach(e -> transacts.add(e));

        return transacts;
    }

	
	/*public Transaction process(TransferRequest tr)
	{
		return trdao.save(tr);
	}*/
	

	
	/*public User matchEmailPassword(String mailid, String password)
	{
		return repo.findByMailidAndPassword(mailid, password);
	}*/
}
