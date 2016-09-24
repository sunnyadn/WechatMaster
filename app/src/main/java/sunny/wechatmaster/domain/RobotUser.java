package sunny.wechatmaster.domain;

import com.hyphenate.easeui.domain.EaseUser;

/**
 * This is a file created by sunny on 4/25/16 for WechatMaster
 * Contact sunny via sunny@mogara.org for cooperation.
 */
public class RobotUser extends EaseUser {
    public RobotUser(String username) {
        super(username.toLowerCase());
    }
}
