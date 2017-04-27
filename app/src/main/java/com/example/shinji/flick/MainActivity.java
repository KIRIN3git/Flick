package com.example.shinji.flick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity{

	// レイアウトの定数を省略してメンバに保持
	private final int MP = ViewGroup.LayoutParams.MATCH_PARENT;

	//--------------------------------------------------------------------------
	// ライフサイクル 1 : アクティビティ初期化（iOSの、viewDidLoad）
	//--------------------------------------------------------------------------
	public void onCreate( Bundle saved_instance_state_ )
	{
		super.onCreate( saved_instance_state_ );

		// レイアウトを作成する
		LinearLayout linear_layout = new LinearLayout( this );
		setContentView( linear_layout );

		// タッチジェスチャー検出用のイベントを付加したviewを設置する
		View touch_view = new View( this );
		touch_view.setOnTouchListener( new FlickTouchListener() );
		linear_layout.addView( touch_view,  new LinearLayout.LayoutParams( MP, MP ) );
	}

}
