package com.moliying.mvp07.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.moliying.mvp07.R;
import com.moliying.mvp07.bean.ImageBean;

import java.util.List;

/**
 * 作者：dongcai on 2016/9/21 10:48
 * 邮箱：lidongcaiocc@163.com
 */
public class ImageListAdapter extends BaseAdapter {
    private Context mContext;
    private List<ImageBean> mImageBeanList;

    public ImageListAdapter(Context mContext, List<ImageBean> mImageBeanList) {
        this.mContext = mContext;
        this.mImageBeanList = mImageBeanList;
    }

    @Override
    public int getCount() {
        if (null == mImageBeanList){
            return 0;
        }
        return mImageBeanList.size();
    }

    @Override
    public Object getItem(int position) {
        return mImageBeanList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_image_listview,null);
            viewHolder = new ViewHolder();
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.item_image_list);
            viewHolder.textView = (TextView) convertView.findViewById(R.id.item_textview);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.imageView.setImageResource(mImageBeanList.get(position).resource);
        viewHolder.textView.setText(mImageBeanList.get(position).text);


        return convertView;
    }

    class ViewHolder{
        ImageView imageView;
        TextView textView;
    }
}
