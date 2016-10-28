package com.zillion.evm.jssc.tools;

/**
 * Created by kjh08490 on 2016/10/28.
 */

public interface MC_SerialToolsListener {
    void serialReturn(String str, int i);

    void serialReturn(String str, int i, Object obj);

}
