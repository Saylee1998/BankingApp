package com.project.banking.dto;

import lombok.Data;

@Data
public class AccountDto {
    private  String id;
    private  String accountHolderName;
    private double balance;
}
