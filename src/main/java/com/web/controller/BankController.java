package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.model.BankModel;
import com.web.model.DipositeModel;
import com.web.model.TransferModel;
import com.web.model.WithdrawModel;
import com.web.service.BankService;

@Controller
public class BankController {

	@Autowired
	 private BankService bankser;
	
	@RequestMapping("/")
	public String home() {
		
		return "home";
	}
	@RequestMapping("/reg")
	public String newAccount() {
		BankModel bbb=new BankModel();
		return "account";
	}
	@RequestMapping("/save")
	public String save(@ModelAttribute BankModel model) {
		bankser.save(model);
		return "sucess";
		
	}
	@RequestMapping("/bal")
	public String getBal() {
		return "BalForm";
	}
	@RequestMapping("/savebal")
	public String saveBalance(Long accountNo) {
	
		bankser.getBanlanePage(accountNo);
		return"showbal";
	}
	@RequestMapping("/dip")
	public String Dip() {
		return "dipositePage";
	}
	@RequestMapping("/savepage")
	public String DipositePage(@ModelAttribute DipositeModel dip) {
		 bankser.diposite(dip);
		
		return "dipsucess";
	}
	@RequestMapping("/with")
	public String with() {
		return "withdrawPage";
	}
	@RequestMapping("/savewith")
	public String withdrawPage(@ModelAttribute WithdrawModel with) {
		 bankser.withDraw(with);
		return "withsucess";
	}
	@RequestMapping("/trans")
	public String transsfer() {
		return "transferPage";
	}
	@RequestMapping("/savetrans")
	public String transPage(@ModelAttribute TransferModel trans) {
		bankser.transfer(trans);
		return "transfersucess";
		
	}
	@RequestMapping("/about")
	public String aboutBank() {
		return "BankDetails";
	}
	
}
