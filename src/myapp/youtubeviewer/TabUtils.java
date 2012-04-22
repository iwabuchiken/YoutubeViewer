package myapp.youtubeviewer;

import myapp.youtubeviewer.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


public class TabUtils {

	// get a TabHost
    static TabHost tabHost;// = new TabActivity().getTabHost();
    
    // onCreate
    public void onCreate(Bundle savedInstanceState) {
    	
    }//public void onCreate(Bundle savedInstanceState)
    
    public static void createTabs(YoutubeViewerActivity mainActivity) {
    	// tabHost
//    	tabHost = new TabActivity().getTabHost();
    	tabHost = mainActivity.getTabHost();
    	
    	// inflater
    	LayoutInflater.from(mainActivity)
    				.inflate(R.layout.youtubeviewer_main, 
    						tabHost.getTabContentView(), true);
 
    	// タブ1の設定
        TabSpec tab1 = tabHost.newTabSpec("tab1");
        tab1.setIndicator("Timer1");
        tab1.setContent(R.id.tab1);
        
        // タブ2の設定
        TabSpec tab2 = tabHost.newTabSpec("tab2");
        tab2.setIndicator("Timer2",mainActivity.getResources().getDrawable(android.R.drawable.ic_menu_edit));
        tab2.setContent(R.id.tab2);

        // タブ3の設定
        TabSpec tab3 = tabHost.newTabSpec("tab3");
        tab3.setIndicator("Timer3",mainActivity.getResources().getDrawable(android.R.drawable.ic_menu_search));
        tab3.setContent(R.id.tab3);

        // 各タブをTabHostに設定
        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);

        // 初期表示のタブ設定
        tabHost.setCurrentTab(1);
 
    }

    public static void createTabsN(YoutubeViewerActivity mainActivity, int number) {
    	// tabHost
//    	tabHost = new TabActivity().getTabHost();
    	tabHost = mainActivity.getTabHost();
    	
    	// inflater
    	LayoutInflater.from(mainActivity)
    				.inflate(R.layout.youtubeviewer_main, 
    						tabHost.getTabContentView(), true);
 
    	//debug
    	TabSpec[] tabs = new TabSpec[number];
    	
    	for (int i = 0; i < tabs.length; i++) {
			tabs[i] = tabHost.newTabSpec("tab" + String.valueOf(i));
		}
    	
    	for (int i = 0; i < tabs.length; i++) {
    		tabHost.addTab(tabs[i]);
		}
    	
//    	// タブ1の設定
//        TabSpec tab1 = tabHost.newTabSpec("tab1");
//        tab1.setIndicator("Timer1");
//        tab1.setContent(R.id.tab1);
//
//        // タブ2の設定
//        TabSpec tab2 = tabHost.newTabSpec("tab2");
//        tab2.setIndicator("Timer2",mainActivity.getResources().getDrawable(android.R.drawable.ic_menu_edit));
//        tab2.setContent(R.id.tab2);
//
//        // タブ3の設定
//        TabSpec tab3 = tabHost.newTabSpec("tab3");
//        tab3.setIndicator("Timer3",mainActivity.getResources().getDrawable(android.R.drawable.ic_menu_search));
//        tab3.setContent(R.id.tab3);

//        // 各タブをTabHostに設定
//        tabHost.addTab(tab1);
//        tabHost.addTab(tab2);
//        tabHost.addTab(tab3);

        // 初期表示のタブ設定
        tabHost.setCurrentTab(2);
 
    }//public static void createTabsN(YoutubeViewerActivity mainActivity, int number)

}
