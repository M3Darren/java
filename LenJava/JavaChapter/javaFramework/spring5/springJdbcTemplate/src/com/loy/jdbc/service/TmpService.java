package com.loy.jdbc.service;

import com.loy.jdbc.bean.Tmp;
import com.loy.jdbc.dao.TmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TmpService {

    @Autowired
    @Qualifier(value = "tmpDaoImpl")
    private TmpDao tmpDao;
    public void addTmp(Tmp tmp){
        tmpDao.add(tmp);
    }
    public void delTmp(int id){tmpDao.del(id);}
    public void uptTmp(Tmp tmp){tmpDao.upd(tmp);}
    public List<Tmp> selTmp(){return tmpDao.sel();}
    public Tmp findTmpById(int id){return tmpDao.findTmpById(id);}
}
