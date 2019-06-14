package com.example.p2p.adapter.delegte;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.baseadapter.BaseViewHolder;
import com.example.baseadapter.mutiple.MutiItemDelegate;
import com.example.p2p.R;
import com.example.p2p.bean.Message;
import com.example.p2p.config.Constant;

/**
 * 接收音频的item
 * Created by 陈健宇 at 2019/6/14
 */
public class AudioReceiveDelegte extends MutiItemDelegate<Message> {

    @Override
    protected boolean isForViewType(Message items, int position) {
        return items.getId() == Constant.TYPE_ITEM_RECEIVE_AUDIO;
    }

    @Override
    protected BaseViewHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat_receive_audio, null);
        return new BaseViewHolder(view);
    }

    @Override
    protected void onBindView(BaseViewHolder holder, Message items, int position) {

    }
}
