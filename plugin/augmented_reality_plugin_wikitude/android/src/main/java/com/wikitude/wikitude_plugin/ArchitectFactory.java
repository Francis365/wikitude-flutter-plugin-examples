package com.wikitude.wikitude_plugin;

import android.app.Activity;
import android.content.Context;

//import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;

import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

import static io.flutter.plugin.common.PluginRegistry.Registrar;

public class ArchitectFactory extends PlatformViewFactory {

    private final FlutterPluginBinding mBinding;
    private final Activity activity;

    private ArchitectWidget architectWidget;

    public ArchitectFactory(FlutterPluginBinding binding, Activity activity) {
        super(StandardMessageCodec.INSTANCE);
        mBinding = binding;
        this.activity = activity;
    }

    @Override
    public PlatformView create(Context context, int i, Object o) {
        architectWidget = new ArchitectWidget(activity, mBinding, i, o);
        return architectWidget;
    }

    void captureScreen() {
        if (architectWidget != null) {
            architectWidget.captureScreen();
        }
    }

    void captureScreenError(String error) {
        if (architectWidget != null) {
            architectWidget.captureScreenError(error);
        }
    }

    int getExternalStoragePermissionRequestCode() {
        if (architectWidget != null) {
            return architectWidget.getExternalStoragePermissionRequestCode();
        } else {
            return 0;
        }
    }

}

//package com.wikitude.wikitude_plugin;
//
//import android.app.Activity;
//import android.content.Context;
//
//import io.flutter.plugin.common.StandardMessageCodec;
//import io.flutter.plugin.platform.PlatformView;
//import io.flutter.plugin.platform.PlatformViewFactory;
//
//public class ArchitectFactory extends PlatformViewFactory {
//
//    private final Activity activity;
//
//    private ArchitectWidget architectWidget;
//
//    // Constructor updated to remove Registrar and use Activity only
//    public ArchitectFactory(Activity activity) {
//        super(StandardMessageCodec.INSTANCE);
//        this.activity = activity;
//    }
//
//    @Override
//    public PlatformView create(Context context, int i, Object o) {
//        architectWidget = new ArchitectWidget(activity, i, o);
//        return architectWidget;
//    }
//
//    void captureScreen() {
//        if (architectWidget != null) {
//            architectWidget.captureScreen();
//        }
//    }
//
//    void captureScreenError(String error) {
//        if (architectWidget != null) {
//            architectWidget.captureScreenError(error);
//        }
//    }
//
//    int getExternalStoragePermissionRequestCode() {
//        if (architectWidget != null) {
//            return architectWidget.getExternalStoragePermissionRequestCode();
//        } else {
//            return 0;
//        }
//    }
//}
