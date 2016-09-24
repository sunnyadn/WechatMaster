package sunny.wechatmaster.ui;

import android.content.Intent;
import android.os.Bundle;

import com.hyphenate.easeui.domain.EaseUser;
import com.hyphenate.easeui.widget.EaseAlertDialog;

import sunny.wechatmaster.R;

/**
 * This is a file created by sunny on 4/25/16 for WechatMaster
 * Contact sunny via sunny@mogara.org for cooperation.
 */
public class ForwardMessageActivity extends PickContactNoCheckboxActivity {
    private EaseUser selectUser;
    private String forward_msg_id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        forward_msg_id = getIntent().getStringExtra("forward_msg_id");
    }

    @Override
    protected void onListItemClick(int position) {
//		if (position != 0) {
        selectUser = contactAdapter.getItem(position);
        new EaseAlertDialog(this, null, getString(R.string.confirm_forward_to, selectUser.getNick()), null, new EaseAlertDialog.AlertDialogUser() {
            @Override
            public void onResult(boolean confirmed, Bundle bundle) {
                if (confirmed) {
                    if (selectUser == null)
                        return;
                    try {
                        ChatActivity.activityInstance.finish();
                    } catch (Exception e) {
                    }
                    Intent intent = new Intent(ForwardMessageActivity.this, ChatActivity.class);
                    // it is single chat
                    intent.putExtra("userId", selectUser.getUsername());
                    intent.putExtra("forward_msg_id", forward_msg_id);
                    startActivity(intent);
                    finish();
                }
            }
        }, true).show();
//		}
    }

}
