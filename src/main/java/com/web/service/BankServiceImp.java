package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.BankModel;
import com.web.model.Bank_of_Rathod;
import com.web.model.DipositeModel;
import com.web.model.Getbalance;
import com.web.model.TransferModel;
import com.web.model.WithdrawModel;
import com.web.repo.BankRepo;
@Service
public class BankServiceImp implements BankService {
	
	@Autowired
	private BankRepo bankRepo;

	@Override
	public String save(BankModel bank) {
		Bank_of_Rathod ba=new Bank_of_Rathod();
		String res;
	if(bank.getcPassword().equals(bank.getcPassword())) {
		ba.setAccountNo(bank.getAccountNo());
		ba.setName(bank.getName());
		ba.setPassword(bank.getPassword());
		ba.setAmount(bank.getAmount());
		ba.setAddress(bank.getAddress());
		ba.setMobileNo(bank.getMobileNo());
		Bank_of_Rathod b=bankRepo.save(ba);
		res="Account Createded.. SucessFully...";
	}
	else {
		res="inCorrect Password";
	}

		return res;
	}

	@Override
	public String getBanlanePage(Long accountNo) {   
		Bank_of_Rathod ba=bankRepo.findById(accountNo).get();
		Getbalance bal=new Getbalance();
		
		if(ba.getAccountNo()==accountNo) {
			bal.setName(ba.getName());
			bal.setAccountNo(accountNo);
		
		}
		return "AccountNo"+bal.getAccountNo()+"\n Name"+bal.getName();
	}

	@Override
	public String diposite(DipositeModel model) {
		Bank_of_Rathod ba=bankRepo.findById(model.getAccountNo()).get();
		String res="Previous Amount is"+ba.getAmount()+"\n Diposite Amount is"+model.getAmount();
		if(ba.getAccountNo()==model.getAccountNo()&&ba.getPassword().equals(model.getPassword())) {
			double dip=ba.getAmount()+model.getAmount();
			ba.setAmount(dip);
			bankRepo.save(ba);
			res="\n current amount is"+ba.getAmount();
		}
		else {
			res="chick the details onces";
		}
		return res;
	}

	@Override
	public String withDraw(WithdrawModel with) {
		Bank_of_Rathod ba=bankRepo.findById(with.getAccountNo()).get();
		String res="Previous Amount is"+ba.getAmount()+"\n Diposite Amount is"+with.getAmount();
		if(ba.getAccountNo()==with.getAccountNo()&&ba.getPassword().equals(with.getPassword())) {
			double dip=ba.getAmount()-with.getAmount();
			ba.setAmount(dip);
			bankRepo.save(ba);
			res="\n current amount is"+ba.getAmount();
		}
		else {
			res="chick the details onces";
		}
		return res;
	}

	@Override
	public String transfer(TransferModel trans) {
		Bank_of_Rathod ba=bankRepo.findById(trans.getAccountNo()).get();
		Bank_of_Rathod bb=bankRepo.findById(trans.getTargetaccount()).get();
		
		if(ba.getAccountNo()==trans.getAccountNo()&& ba.getPassword().equals(trans.getPassword())) {
			double les=ba.getAmount()-trans.getAmount();
			ba.setAmount(les);
			double hig=bb.getAmount()+trans.getAmount();
			bb.setAmount(hig);
			bankRepo.save(ba);
			bankRepo.save(bb);
		}
		  
		return null;
	}
	

}
