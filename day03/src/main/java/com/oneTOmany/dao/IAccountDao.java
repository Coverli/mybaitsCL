package com.oneTOmany.dao;

import com.oneTOmany.domain.AccountUser;
import com.oneTOmany.domain.Account;

import java.util.List;

public interface IAccountDao {

    /**
     * 查询所有账户，同时还要获取到当前账户的所属用户信息
     * @return
     */
    List<Account> findAll();

    /**
     * 查询所有账户，并且带有用户名称和地址信息
     * @return
     */
    List<AccountUser> findAllAccount();
}
