package com.serialport.funtionpage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.serialport.R;
import com.zillion.evm.jssc.SerialPortException;
import com.zillion.evm.jssc.tools.MC_SerialToolsListener;
import com.zillion.evm.jssc.tools.MyFunc;
import com.zillion.evm.jssc.tools.SerialTools;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kjh08490 on 2016/10/28.
 */

public class KeyBoradActivity extends AppCompatActivity implements MC_SerialToolsListener {

    boolean isOperating = false;
    private boolean isRFID;

    Handler handler = new Handler() {
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 1:
                    KeyBoradActivity.this.keyBoardReturn((String) msg.obj, msg.what);
                    return;
                case 2:
                    // KeyBoradActivity.this.cardPasswordValidate();
                    Log.e(getClass().getName(), "2");
                    return;
                case 6:
                    //Map<String, Object> map = msg.obj;
                    //KeyBoradActivity.this.openVender((String) map.get("keyValue"), (VendingChnData) map.get("vendingChn"));
                    return;
                default:
                    return;
            }
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.keyboardlayout);
    }

    @Override
    protected void onResume() {
        openKeyBoard();
        openRFID();
        super.onResume();
    }

    private void openKeyBoard() {
        SerialTools.getInstance().openKeyBoard();
        SerialTools.getInstance().addToolsListener(this);
    }

    private void openRFID() {
        SerialTools.getInstance().openRFIDReader();
        SerialTools.getInstance().addToolsListener(this);
    }

    private void closeRFID() {
        try {
            SerialTools.getInstance().closeRFIDReader();
        } catch (SerialPortException e) {
            Log.e(getClass().getName(), e.getMessage(), e);
            e.printStackTrace();
        }
    }

    private void closeVender() {
        try {
            SerialTools.getInstance().closeVender();
        } catch (SerialPortException e) {
            Log.e(getClass().getName(), e.getMessage(), e);
            e.printStackTrace();
        }
    }

    @Override
    public void serialReturn(String str, int i) {

    }

    @Override
    public void serialReturn(String value, int serialType, Object userInfo) {
        Message msg = new Message();
        msg.what = serialType;
        msg.obj = value;
        switch (serialType) {
            case 1:
                if (!this.isOperating) {
                    this.handler.sendMessage(msg);
                    this.isRFID = false;
                    return;
                }
                return;
            case 2:
                value = MyFunc.getRFIDSerialNo(value);
                if (!TextUtils.isEmpty(value)) {
                    closeRFID();
                    this.isRFID = true;
                    this.handler.sendMessage(msg);
                    return;
                }
                return;
            case 4:
                this.handler.sendMessage(msg);
                return;
            case 6:
                Map<String, Object> map = new HashMap();
                map.put("keyValue", value);
                map.put("vendingChn", userInfo);
                msg.obj = map;
                this.handler.sendMessage(msg);
                return;
            default:
                return;
        }
    }

    private void keyBoardReturn(String value, int serialType) {
        if (!SerialTools.FUNCTION_KEY_COMBINATION.equals(value) && !SerialTools.FUNCTION_KEY_BORROW.equals(value) && !SerialTools.FUNCTION_KEY_BACK.equals(value) && !SerialTools.FUNCTION_KEY_SET.equals(value)) {
            if (SerialTools.FUNCTION_KEY_CANCEL.equals(value)) {
                // this.et_password.getText().toString(), true
                if (TextUtils.isEmpty("")) {
                    closeRFID();
                    finish();
                    return;
                }
                //this.et_password.setText("");
                openRFID();
            } else if (SerialTools.FUNCTION_KEY_CONFIRM.equals(value)) {
                //cardPasswordValidate();
                Log.e(getClass().getName(), "cardPasswordValidate" + value);
                Toast.makeText(this, "cardPasswordValidate: " + value, Toast.LENGTH_SHORT).show();
            } else {
                //resetTextView(SerialTools.getInstance().getKeyValue(value), serialType);
                Log.e(getClass().getName(), "resetTextView");
                Toast.makeText(this, "resetTextView" + value, Toast.LENGTH_SHORT).show();
            }
        }
    }
}
