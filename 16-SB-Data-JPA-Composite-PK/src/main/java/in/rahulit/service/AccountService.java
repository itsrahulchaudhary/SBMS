package in.rahulit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.rahulit.entity.Account;
import in.rahulit.repository.AccountRepository;
 

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public void saveAccData() {
		Account act = new Account();
		act.setBranchName("Noida");
		act.setMinBal(12000.00);
		act.setAccId(103);
		act.setAccType("SAVING");
		act.setHolderName("IBM");
		
		accountRepository.save(act);

	}

}
