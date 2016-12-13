package com.moliying.mvp07.model;

import com.moliying.mvp07.R;
import com.moliying.mvp07.bean.ImageBean;
import com.moliying.mvp07.locationdata.DataUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：dongcai on 2016/12/9 15:12
 * 邮箱：lidongcaiocc@163.com
 */

public class IDataModelImplV2 implements IDataMedel {
    @Override
    public void getData(onDataLoadListener onDataLoadListener) {
        List<ImageBean> list = new ArrayList<>();
        int[] imageNum = new int[]{R.mipmap.m_0,R.mipmap.m_1,R.mipmap.m_2,R.mipmap.m_3
                ,R.mipmap.m_4,R.mipmap.m_5,R.mipmap.m_6,R.mipmap.m_7,R.mipmap.m_8,R.mipmap.m_9
                ,R.mipmap.m_10,R.mipmap.m_11,R.mipmap.m_12,R.mipmap.m_13,R.mipmap.m_14,R.mipmap.m_15
                ,R.mipmap.m_16,R.mipmap.m_17,R.mipmap.m_18,R.mipmap.m_19,R.mipmap.m_20,R.mipmap.m_21
                ,R.mipmap.m_22,R.mipmap.m_23,R.mipmap.m_24,R.mipmap.m_25,R.mipmap.m_26,R.mipmap.m_27
                ,R.mipmap.m_28,R.mipmap.m_29,R.mipmap.m_30};
        for (int i = 0;i<31;i++){
            list.add(new ImageBean(imageNum[i],"第"+i+"个妹子"));
        }
        onDataLoadListener.onComplete(list);
    }

    @Override
    public List<ImageBean> getData() {
        return DataUtil.getData();
    }
}
