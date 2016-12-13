package com.moliying.mvp07.model;

import com.moliying.mvp07.bean.ImageBean;
import com.moliying.mvp07.locationdata.DataUtil;

import java.util.List;

/**
 * 作者：dongcai on 2016/12/9 14:37
 * 邮箱：lidongcaiocc@163.com
 */

public class IDataModelImplV1 implements IDataMedel {
    @Override
    public void getData(onDataLoadListener onDataLoadListener) {
        List<ImageBean> data = DataUtil.getData();
//        onDataLoadListener.onComplete(data);
    }

    @Override
    public List<ImageBean> getData() {
        return null;
    }
}
