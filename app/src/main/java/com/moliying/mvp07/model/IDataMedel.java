package com.moliying.mvp07.model;

import com.moliying.mvp07.bean.ImageBean;

import java.util.List;

/**
 * 作者：dongcai on 2016/12/9 14:32
 * 邮箱：lidongcaiocc@163.com
 */

public interface IDataMedel {
    void getData(onDataLoadListener onDataLoadListener);
    List<ImageBean> getData();
    interface onDataLoadListener{
        void onComplete(List<ImageBean> list);
    };
}
