package com.ssm.bdqn.entity;

import java.util.List;

public class Pager<T> {
    private int pageNo;
    private int pageSize;
    private int totalCount;   //总记录
    private int totalPager;  //总页
    private List<T> data;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getTotalPager() {
        return totalPager;
    }

    public void setTotalPager(int totalPager) {
        this.totalPager = totalPager;
    }
}
