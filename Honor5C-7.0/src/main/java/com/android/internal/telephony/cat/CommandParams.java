package com.android.internal.telephony.cat;

import android.graphics.Bitmap;
import com.android.internal.telephony.cat.AppInterface.CommandType;

public class CommandParams {
    CommandDetails mCmdDet;
    boolean mLoadIconFailed;

    CommandParams(CommandDetails cmdDet) {
        this.mLoadIconFailed = false;
        this.mCmdDet = cmdDet;
    }

    CommandType getCommandType() {
        return CommandType.fromInt(this.mCmdDet.typeOfCommand);
    }

    boolean setIcon(Bitmap icon) {
        return true;
    }

    public String toString() {
        return this.mCmdDet.toString();
    }
}
