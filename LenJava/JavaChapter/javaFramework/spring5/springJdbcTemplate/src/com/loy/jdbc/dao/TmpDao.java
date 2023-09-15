package com.loy.jdbc.dao;

import com.loy.jdbc.bean.Tmp;

import java.util.List;

public interface TmpDao {
public void add(Tmp tmp);
public void del(int id);
public void upd(Tmp tmp);
public List<Tmp> sel();
public Tmp findTmpById(int id);
}
