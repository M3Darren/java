package com.loy.dao.intf;

import java.util.List;

public interface PageDao<T> {
    public int queryForPageTotalCount();
    public List<T> queryForPageItems(int begin, int pageSize);
}
