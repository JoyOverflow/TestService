package ouyj.hyena.com.intentserver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 按钮事件处理
     * @param view
     */
    public void onTestClick(View view) {
        //创建意图启动服务
        Intent intent = new Intent(this, MessageService.class);
        intent.putExtra(
                MessageService.EXTRA_MESSAGE,
                getResources().getString(R.string.btn_value)
        );
        startService(intent);
    }



}
