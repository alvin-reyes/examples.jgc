package com.areyes1.jgc.intf;
import java.util.List;

import com.areyes1.jgc.obj.Account;
import com.areyes1.jgc.obj.Transaction;

public interface AccountService {

  public Account createNewAccount(Account account);

  public Account updateAccount(Account account);

  public boolean removeAccount(Account account);

  public List<Transaction> listAllTransactions(Account account);

}