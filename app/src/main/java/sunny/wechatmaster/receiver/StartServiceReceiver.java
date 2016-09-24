package sunny.wechatmaster.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.hyphenate.chat.EMChatService;
import com.hyphenate.util.EMLog;

/**
 * This is a file created by sunny on 4/25/16 for WechatMaster
 * Contact sunny via sunny@mogara.org for cooperation.
 */
public class StartServiceReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        EMLog.d("boot", "start easemob service on boot");
        Intent startServiceIntent=new Intent(context, EMChatService.class);
        startServiceIntent.putExtra("reason", "boot");
        context.startService(startServiceIntent);
    }
}