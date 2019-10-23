package ouyj.hyena.com.intentserver;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 */
public class MessageService extends IntentService {

    private final String TAG = this.getClass().getSimpleName();
    public static final String EXTRA_MESSAGE = "message.key";

    /**
     * 构造方法
     */
    public MessageService() {
        super("MessageService");
        //setIntentRedelivery(false);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d(TAG, "onHandleIntent！");
        synchronized (this) {
            try {
                wait(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String text = intent.getStringExtra(EXTRA_MESSAGE);
        showText(text);
    }
    private void showText(String text) {
        Log.d(TAG, text);
    }

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate！");
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy！");
        super.onDestroy();
    }

    @Override
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand！" + startId);
        return super.onStartCommand(intent, flags, startId);
    }
}
