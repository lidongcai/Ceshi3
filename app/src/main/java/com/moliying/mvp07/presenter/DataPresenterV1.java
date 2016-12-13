package com.moliying.mvp07.presenter;

import com.moliying.mvp07.bean.ImageBean;
import com.moliying.mvp07.model.IDataMedel;
import com.moliying.mvp07.model.IDataModelImplV2;
import com.moliying.mvp07.view.IDataView;

import java.util.List;

/**
 * 作者：dongcai on 2016/12/9 14:39
 * 邮箱：lidongcaiocc@163.com
 */

public class DataPresenterV1 {
    IDataView mIDataView;
    IDataMedel mIDataMedel = new IDataModelImplV2();

    public DataPresenterV1(IDataView mIDataView) {
        this.mIDataView = mIDataView;
    }

//    public void setDataModel(int i){
//        switch (i){
//            case 1:
//                mIDataMedel = new IDataModelImplV1();
//                break;
//            case 2:
//                mIDataMedel = new IDataModelImplV2();
//                break;
//        }
//    }

    /**
     * 绑定view和model
     */
    public void bind(){
        mIDataView.showLoading();
//        mIDataMedel.getData(new IDataMedel.onDataLoadListener() {
//            @Override
//            public void onComplete(List<ImageBean> list) {
//                mIDataView.showData(list);
//            }
//        });
        List<ImageBean> data = mIDataMedel.getData();
        mIDataView.showData(data);
    }
}
