package com.moliying.mvp07.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import com.moliying.mvp07.R;
import com.moliying.mvp07.adapter.ImageListAdapter;
import com.moliying.mvp07.bean.ImageBean;
import com.moliying.mvp07.presenter.DataPresenterV1;
import com.moliying.mvp07.view.IDataView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IDataView{
    private ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.listview);

        new DataPresenterV1(this).bind();
//        mListView.setAdapter(new ImageListAdapter(this, DataUtil.getData()));

    }

    @Override
    public void showLoading() {
        Toast.makeText(this,"玩命加载中。。。",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showData(List<ImageBean> list) {
        mListView.setAdapter(new ImageListAdapter(this,list));
    }
}
