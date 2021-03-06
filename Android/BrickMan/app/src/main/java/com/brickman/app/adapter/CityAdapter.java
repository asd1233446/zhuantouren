package com.brickman.app.adapter;

import com.brickman.app.R;
import com.brickman.app.model.Bean.CityBean;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Created by mayu on 16/7/25,下午2:17.
 */

public class CityAdapter extends BaseMultiItemQuickAdapter<CityBean> {

    public CityAdapter(List<CityBean> data) {
        super(data);
        addItemType(0, R.layout.item_city);
        addItemType(1, R.layout.item_pinned_header);
    }

    @Override
    protected void convert(BaseViewHolder helper, CityBean item) {
        switch (helper.getItemViewType()) {
            case 0:
                helper.setText(R.id.city_name, item.name);
                break;
            case 1:
                helper.setText(R.id.city_tip, item.pys);
                break;
        }
    }

    public int getLetterPosition(String letter){
        for (int i = 0 ; i < getData().size(); i++){
            if(((CityBean)getData().get(i)).type ==1 && ((CityBean)getData().get(i)).pys.equals(letter)){
                return i;
            }
        }
        return -1;
    }

}