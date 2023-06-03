package com.web.service;

import com.web.model.BankModel;
import com.web.model.DipositeModel;
import com.web.model.TransferModel;
import com.web.model.WithdrawModel;

public interface BankService {

	public String save(BankModel bank);
	public String getBanlanePage(Long accountNo);
	public String diposite(DipositeModel model);
	public String withDraw(WithdrawModel with);
	public String transfer(TransferModel trans);
}
