package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {


    /**
     * @param customerDto - CustomerDto Object
     */

    void createAccount(CustomerDto customerDto);


      CustomerDto fetchAccount(String mobileName);

    /**
     *
     * @param customerDto CustomerDto Object
     * @return boolean indicates if the Account Details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);
}
