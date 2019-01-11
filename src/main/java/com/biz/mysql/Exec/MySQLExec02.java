package com.biz.mysql.Exec;

import com.biz.mysql.service.AddrService;

public class MySQLExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddrService as = new AddrService();
		
		as.findByName();
	}

}
