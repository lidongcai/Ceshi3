package com.moliying.mvp07.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.Toast;

import com.moliying.mvp07.R;
import com.moliying.mvp07.adapter.ImageListAdapter;
import com.moliying.mvp07.bean.ImageBean;
import com.moliying.mvp07.presenter.DataPresenterV1;
import com.moliying.mvp07.view.IDataView;
import com.orhanobut.logger.Logger;

import java.util.List;

public class Main2Activity extends AppCompatActivity implements IDataView{
    private GridView mGridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mGridView = (GridView) findViewById(R.id.gridview);
        new DataPresenterV1(this).bind();
    }

    @Override
    public void showLoading() {
        Toast.makeText(this,"gridview加载。。。",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showData(List<ImageBean> list) {
        Logger.d(list);
        mGridView.setAdapter(new ImageListAdapter(this,list));
    }
}
