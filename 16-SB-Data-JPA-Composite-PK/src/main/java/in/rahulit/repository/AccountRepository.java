package in.rahulit.repository;

 
import org.springframework.data.jpa.repository.JpaRepository;

import in.rahulit.entity.Account;
import in.rahulit.entity.AccountPK;
 
public interface AccountRepository extends JpaRepository<Account, AccountPK> {

}
