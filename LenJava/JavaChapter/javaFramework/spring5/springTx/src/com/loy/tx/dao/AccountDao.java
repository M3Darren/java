package com.loy.tx.dao;

public interface AccountDao {
//    转账进户
    public int income(int id,double money);
//    转账出户
    public int outcome(int id,double money);
}
