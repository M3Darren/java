package com.loy.dao.impl;

import com.loy.dao.intf.PageDao;
import com.loy.pojo.Page;

public class PageUtils {
    public static Page  pageT(Page tPage,PageDao tImpl,int pageNo,int pageSize){
//        获取总记录数
        int totalCount = tImpl.queryForPageTotalCount();
        tPage.setPageTotalCount(totalCount);
        //       计算总页数
        int pageTotal = totalCount / pageSize;
        if (totalCount % pageSize > 0) pageTotal++;
        tPage.setPageTotal(pageTotal);

        tPage.setPageNo(pageNo);
        tPage.setPageSize(pageSize);

//        获取当前页数据
        int begin = (tPage.getPageNo() - 1) * pageSize;//当前页开始索引
        tPage.setItems(tImpl.queryForPageItems(begin, pageSize));
return tPage;
    }
}
