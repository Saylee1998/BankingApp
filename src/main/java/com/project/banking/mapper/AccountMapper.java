package com.project.banking.mapper;

import com.project.banking.dto.AccountDto;
import com.project.banking.entity.Account;

public class AccountMapper {
    public  static Account mapToAccount(AccountDto accountDto){
        Account account = new Account(
                accountDto.id(),
                accountDto.accountHolderName(),
                accountDto.balance()

        );
        return account;

    }
   public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAcountHolderName(),
                account.getBalance()
        );
        return  accountDto;
   }
}
