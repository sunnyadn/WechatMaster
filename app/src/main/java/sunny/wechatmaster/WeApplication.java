package sunny.wechatmaster;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * This is a file created by sunny on 4/25/16 for WechatMaster
 * Contact sunny via sunny@mogara.org for cooperation.
 */
public class WeApplication extends Application {

    public static Context applicationContext;
    private static WeApplication instance;
    // login user name
    public final String PREF_USERNAME = "username";

    /**
     * 当前用户nickname,为了苹果推送不是userid而是昵称
     */
    public static String currentUserNick = "";

    @Override
    public void onCreate() {
        MultiDex.install(this);
        super.onCreate();
        applicationContext = this;
        instance = this;

        //init demo helper
        WeHelper.getInstance().init(applicationContext);
    }

    public static WeApplication getInstance() {
        return instance;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
