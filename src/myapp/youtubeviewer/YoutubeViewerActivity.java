package myapp.youtubeviewer;

//import myapp.timer3.R;
import android.app.Activity;
import android.app.TabActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class YoutubeViewerActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // create tabs
//        TabUtils.createTabs(this);
        TabUtils.createTabsN(this, 3);
//        TabUtils.createTabsN(this, 6);
        
//        // get a TabHost
//        TabHost tabHost = getTabHost();
//        
//        // layout xml data
//        LayoutInflater.from(this).inflate(R.layout.youtubeviewer_main, tabHost.getTabContentView(), true);
//        
//        // タブ1の設定
//        TabSpec tab1 = tabHost.newTabSpec("tab1");
//        tab1.setIndicator("Timer1");
//        tab1.setContent(R.id.tab1);
//        
//        // タブ2の設定
//        TabSpec tab2 = tabHost.newTabSpec("tab2");
//        tab2.setIndicator("Timer2",getResources().getDrawable(android.R.drawable.ic_menu_edit));
//        tab2.setContent(R.id.tab2);
//
//        // タブ3の設定
//        TabSpec tab3 = tabHost.newTabSpec("tab3");
//        tab3.setIndicator("Timer3",getResources().getDrawable(android.R.drawable.ic_menu_search));
//        tab3.setContent(R.id.tab3);
//
//        // 各タブをTabHostに設定
//        tabHost.addTab(tab1);
//        tabHost.addTab(tab2);
//        tabHost.addTab(tab3);
//
//        // 初期表示のタブ設定
//        tabHost.setCurrentTab(1);
    }
}