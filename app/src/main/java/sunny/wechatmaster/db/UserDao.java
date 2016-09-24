package sunny.wechatmaster.db;

import android.content.Context;

import com.hyphenate.easeui.domain.EaseUser;

import java.util.List;
import java.util.Map;

import sunny.wechatmaster.domain.RobotUser;

/**
 * This is a file created by sunny on 4/25/16 for WechatMaster
 * Contact sunny via sunny@mogara.org for cooperation.
 */
public class UserDao {
    public static final String TABLE_NAME = "uers";
    public static final String COLUMN_NAME_ID = "username";
    public static final String COLUMN_NAME_NICK = "nick";
    public static final String COLUMN_NAME_AVATAR = "avatar";

    public static final String PREF_TABLE_NAME = "pref";
    public static final String COLUMN_NAME_DISABLED_GROUPS = "disabled_groups";
    public static final String COLUMN_NAME_DISABLED_IDS = "disabled_ids";

    public static final String ROBOT_TABLE_NAME = "robots";
    public static final String ROBOT_COLUMN_NAME_ID = "username";
    public static final String ROBOT_COLUMN_NAME_NICK = "nick";
    public static final String ROBOT_COLUMN_NAME_AVATAR = "avatar";


    public UserDao(Context context) {
    }

    /**
     * 保存好友list
     *
     * @param contactList
     */
    public void saveContactList(List<EaseUser> contactList) {
        WeDBManager.getInstance().saveContactList(contactList);
    }

    /**
     * 获取好友list
     *
     * @return
     */
    public Map<String, EaseUser> getContactList() {

        return WeDBManager.getInstance().getContactList();
    }

    /**
     * 删除一个联系人
     * @param username
     */
    public void deleteContact(String username){
        WeDBManager.getInstance().deleteContact(username);
    }

    /**
     * 保存一个联系人
     * @param user
     */
    public void saveContact(EaseUser user){
        WeDBManager.getInstance().saveContact(user);
    }

    public void setDisabledGroups(List<String> groups){
        WeDBManager.getInstance().setDisabledGroups(groups);
    }

    public List<String>  getDisabledGroups(){
        return WeDBManager.getInstance().getDisabledGroups();
    }

    public void setDisabledIds(List<String> ids){
        WeDBManager.getInstance().setDisabledIds(ids);
    }

    public List<String> getDisabledIds(){
        return WeDBManager.getInstance().getDisabledIds();
    }

    public Map<String, RobotUser> getRobotUser(){
        return WeDBManager.getInstance().getRobotList();
    }

    public void saveRobotUser(List<RobotUser> robotList){
        WeDBManager.getInstance().saveRobotList(robotList);
    }
}
