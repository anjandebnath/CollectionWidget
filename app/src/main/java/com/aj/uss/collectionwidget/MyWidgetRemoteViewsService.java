package com.aj.uss.collectionwidget;

import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViewsService;

/**
 * Created by Anjan on 6/3/2018.
 */

/**
 * The main purpose of RemoteViewsService is to return a RemoteViewsFactory object
 * which further handles the task of filling the widget with appropriate data.
 */
public class MyWidgetRemoteViewsService extends RemoteViewsService {

    private static final String TAG = "WidgetService";

    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        Log.d(TAG, "onGetViewFactory: " + "Service called");
        return new MyWidgetRemoteViewsFactory(this.getApplicationContext(), intent);
    }
}
