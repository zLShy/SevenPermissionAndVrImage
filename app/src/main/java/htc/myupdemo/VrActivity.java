package htc.myupdemo;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import com.google.vr.sdk.widgets.pano.VrPanoramaEventListener;
import com.google.vr.sdk.widgets.pano.VrPanoramaView;

public class VrActivity extends Activity {
    /** Called when the activity is first created. */
    private VrPanoramaView panoramaView;
    private VrPanoramaView.Options paNormalOptions;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.qjt_activity);
       initView();
    }

    private void initView() {
        this.panoramaView = (VrPanoramaView) findViewById(R.id.vrview);
        paNormalOptions = new VrPanoramaView.Options();
        paNormalOptions.inputType = VrPanoramaView.Options.TYPE_STEREO_OVER_UNDER;
//      mVrPanoramaView.setFullscreenButtonEnabled (false); //隐藏全屏模式按钮
        panoramaView.setInfoButtonEnabled(false); //设置隐藏最左边信息的按钮
        panoramaView.setStereoModeButtonEnabled(false); //设置隐藏立体模型的按钮
        panoramaView.setEventListener(new ActivityEventListener()); //设置监听
        //加载本地的图片源
        panoramaView.loadImageFromBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.wechat), paNormalOptions);
    }

    private class ActivityEventListener extends VrPanoramaEventListener {
        @Override
        public void onLoadSuccess() {
            super.onLoadSuccess();
        }

        @Override
        public void onLoadError(String errorMessage) {
            super.onLoadError(errorMessage);
        }

        @Override
        public void onDisplayModeChanged(int newDisplayMode) {
            super.onDisplayModeChanged(newDisplayMode);
        }
    }
}
