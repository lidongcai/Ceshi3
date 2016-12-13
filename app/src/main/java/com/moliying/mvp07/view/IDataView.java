package com.moliying.mvp07.view;

import com.moliying.mvp07.bean.ImageBean;

import java.util.List;

/**
 * 作者：dongcai on 2016/12/9 14:35
 * 邮箱：lidongcaiocc@163.com
 */

public interface IDataView {
    void showLoading();

    void showData(List<ImageBean> list);
}
