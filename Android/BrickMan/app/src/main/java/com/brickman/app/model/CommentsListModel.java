package com.brickman.app.model;

import com.brickman.app.common.base.Api;
import com.brickman.app.common.http.HttpListener;
import com.brickman.app.common.http.RequestHelper;
import com.brickman.app.common.http.param.ParamBuilder;
import com.brickman.app.common.http.param.RequestParam;
import com.brickman.app.contract.CommentsListContract;

/**
 * Created by mayu on 16/7/21,下午1:21.
 */
public class CommentsListModel implements CommentsListContract.Model {
    @Override
    public void loadCommentsList(int pageNO, HttpListener httpListener) {
        RequestParam param = ParamBuilder.buildParam("pageSize", "10").append("pageNO", pageNO+"");
        RequestHelper.sendPOSTRequest(true, Api.REQUEST_DETAIL_SLIST, param, httpListener);
    }

    @Override
    public void comment(String id, String text, String date, HttpListener httpListener) {

    }

    @Override
    public void flower(String id, HttpListener httpListener) {

    }

    @Override
    public void share(String title, String content, String url, String imgUrl, HttpListener httpListener) {

    }
}