package com.sdkimplementation;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;
import global.watu.pos.WatuPOSInterface;
import global.watu.pos.WatuPOS;
import org.json.JSONObject;
import android.util.Log;
import android.app.Activity;

public class WatuModule extends ReactContextBaseJavaModule implements WatuPOSInterface{
    WatuPOS watuPOS;
    WatuModule(ReactApplicationContext context) {
        super(context);
        final Activity activity = getCurrentActivity();
        watuPOS = new WatuPOS(activity,"YOUR-SECRET-KEY","TERMINAL-ID","DEVICE-TYPE");
    }



    @Override
    public String getName() {
        return "WatuModule";
    }

    @Override
    public void watuCallback(JSONObject response){
        Log.d("WaturResponse",response.toString());
    }
}