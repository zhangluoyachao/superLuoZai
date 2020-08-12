package com.sc.util;

import java.util.List;

/**
 * 分页的工具类
 */
public class Page<T> {
    //当前页数  通过前台获取
    private Integer pageIndex;
    //每页条数  有默认值，也可以前台获取
    private Integer pageSize;
    //总页数   总条数/每页条数
    private Integer totalPage;
    //总条数   数据库获取
    private Integer totalCount;
    //每页的数据 数据库
    private List<T> list;

    public Page() {
    }

    public Page(Integer pageIndex, Integer pageSize, Integer totalCount, List<T> list) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.list = list;

        //设置总页数
        if (totalCount % pageSize == 0) {
            totalPage = totalCount / pageSize;
        } else {
            totalPage = totalCount / pageSize + 1;
        }
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }


    public Integer getTotalPage() {
        return totalPage;
    }


    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        if (totalCount != null) {
            //设置每页显示的同时设置总页数
            if (totalCount % pageSize == 0) {
                totalPage = totalCount / pageSize;
            } else {
                totalPage = totalCount / pageSize + 1;
            }
        }
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        if (pageSize != null) {
            //设置总条数的同时设置总页数
            if (totalCount % pageSize == 0) {
                totalPage = totalCount / pageSize;
            } else {
                totalPage = totalCount / pageSize + 1;
            }
        }
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
