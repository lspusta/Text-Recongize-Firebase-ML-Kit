package itkido.me.mlkitfirebasetextrecongize;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.camerakit.CameraKitView;
import com.jpegkit.JpegImageView;

public class activity_livepreviewtest extends AppCompatActivity {
    //private CameraKitView cameraKitView;
    //private JpegImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livepreviewtest);
       // cameraKitView = findViewById(R.id.camera);


//        cameraKitView.setCameraListener(new CameraKitView.CameraListener() {
//            @Override
//            public void onOpened() {
//                Log.v("CameraKitView", "CameraListener: onOpened()");
//            }
//
//            @Override
//            public void onClosed() {
//                Log.v("CameraKitView", "CameraListener: onClosed()");
//            }
//        });
//
//        cameraKitView.setPreviewListener(new CameraKitView.PreviewListener() {
//            @Override
//            public void onStart() {
//                Log.v("CameraKitView", "PreviewListener: onStart()");
//
//            }
//
//            @Override
//            public void onStop() {
//                Log.v("CameraKitView", "PreviewListener: onStop()");
//            }
//        });

    }


//    @Override
//    protected void onStart() {
//        super.onStart();
//        cameraKitView.onStart();
//    }
//
//    @Override
//    public void onResume() {
//        super.onResume();
//        cameraKitView.onResume();
//    }
//
//    @Override
//    public void onPause() {
//        cameraKitView.onPause();
//        super.onPause();
//    }
//
//    @Override
//    protected void onStop() {
//        cameraKitView.onStop();
//        super.onStop();
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        cameraKitView.onRequestPermissionsResult(requestCode, permissions, grantResults);
//    }


}
