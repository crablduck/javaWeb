package com.qf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.qf.entity.Account;
import com.qf.entity.Page;
import com.qf.entity.User;
import com.qf.service.IAccountService;

@Controller
@RequestMapping(value = "/account")
public class AccountController {

	@Autowired
	private IAccountService accountService;
	
	@Value("${jdbc.url}")
	private String url;

	@RequestMapping(value = "getAccountList", method = RequestMethod.GET)
	public String getAccountList(Page page, ModelMap map) {
		System.out.println(url);
		// 1.第一次进来的时候page为空
		if (page == null) {
			page = new Page();
		}
		accountService.getPage(page);
		map.put("page", page);
		page.setUrl("account/getAccountList?");
		// ssh/account/getAccontList
		return "account/accountList"; // 此时路径跳转不会参考当前路径
	}

	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(Account account) {
		accountService.add(account);
		return "redirect:getAccountList";
	}

	@RequestMapping(value = "update/{currentPage}", method = RequestMethod.POST)
	public String update(Account account,@PathVariable("currentPage")Integer currentPage) {
		accountService.update(account);
		return "redirect:../getAccountList?currentPage="+currentPage;
	}

	@RequestMapping(value = "getById/{id}/{currentPage}", method = RequestMethod.GET)
	public String getById(@PathVariable("id") Integer id, ModelMap map,@PathVariable("currentPage")Integer currentPage) {
		map.put("account", accountService.getById(id));
		map.put("currentPage", currentPage);
		return "account/updateAccount";
	}
	
	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") Integer id) {
		accountService.delete(id);
		return "redirect:../getAccountList";
	}

}
