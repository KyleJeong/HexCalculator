package com.young2000.hexcalculator;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Locale;

public class MainActivity extends Activity implements OnClickListener {
    public String versionName;
    private Long HexNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TableRow tr;
        TextView tv;
        LinearLayout.LayoutParams llp;
        Button btn;
        LinearLayout ll;
        HexNumber = (long) 0;
        super.onCreate(savedInstanceState);
        //Remove title bar
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_main);

        // 5. Update LatestAppVersion.
        PackageInfo pinfo;
        //String versionName;
        try {
            pinfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            versionName = pinfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            versionName = "Unknown";
        }

        TextView textview = findViewById(R.id.versionname);
        textview.setText(versionName);

        // Create HexLayout
        tr = findViewById(R.id.tableRow3);

        for (int idx = 15; idx >= 0; idx--) {
            ll = new LinearLayout(this);
            ll.setOrientation(LinearLayout.VERTICAL);

            tv = new TextView(this);
            tv.setTextSize(10);
            //tv.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
            tv.setTypeface(Typeface.MONOSPACE);
            tv.setText(Integer.toString(idx + 48));
            if (idx % 2 == 0)
                tv.setBackgroundColor(Color.parseColor("#B0B0B0"));
            else
                tv.setBackgroundColor(Color.parseColor("#C0C0C0"));
            tv.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
            ll.addView(tv);

            tv = new TextView(this);
            tv.setTextSize(24);
            llp = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
            llp.setMargins(10, 10, 10, 10); //substitute parameters for left, top, right, bottom
            tv.setLayoutParams(llp);
            tv.setText("0");
            tv.setId(500 + idx + 48);
            tv.setOnClickListener(this);
            if (idx % 2 == 0)
                tv.setBackgroundColor(Color.parseColor("#B0B0B0"));
            else
                tv.setBackgroundColor(Color.parseColor("#C0C0C0"));
            ll.addView(tv);

            tr.addView(ll);
        }
        tr = findViewById(R.id.tableRow2);
        for (int idx = 15; idx >= 0; idx--) {
            ll = new LinearLayout(this);
            ll.setOrientation(LinearLayout.VERTICAL);
            tv = new TextView(this);
            tv.setTextSize(10);
            tv.setTypeface(Typeface.MONOSPACE);
            tv.setText(Integer.toString(idx + 32));
            if (idx % 2 == 0)
                tv.setBackgroundColor(Color.parseColor("#B0B0B0"));
            else
                tv.setBackgroundColor(Color.parseColor("#C0C0C0"));
            tv.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
            ll.addView(tv);

            tv = new TextView(this);
            tv.setTextSize(24);
            llp = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
            llp.setMargins(10, 10, 10, 10); //substitute parameters for left, top, right, bottom
            tv.setLayoutParams(llp);
            tv.setText("0");
            tv.setId(500 + idx + 32);
            tv.setOnClickListener(this);
            if (idx % 2 == 0)
                tv.setBackgroundColor(Color.parseColor("#B0B0B0"));
            else
                tv.setBackgroundColor(Color.parseColor("#C0C0C0"));
            ll.addView(tv);

            tr.addView(ll);
        }
        tr = findViewById(R.id.tableRow1);
        for (int idx = 15; idx >= 0; idx--) {
            ll = new LinearLayout(this);
            ll.setOrientation(LinearLayout.VERTICAL);
            tv = new TextView(this);
            tv.setTextSize(10);
            tv.setTypeface(Typeface.MONOSPACE);
            tv.setText(Integer.toString(idx + 16));
            if (idx % 2 == 0)
                tv.setBackgroundColor(Color.parseColor("#B0B0B0"));
            else
                tv.setBackgroundColor(Color.parseColor("#C0C0C0"));
            tv.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
            ll.addView(tv);

            tv = new TextView(this);
            tv.setTextSize(24);
            llp = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
            llp.setMargins(10, 10, 10, 10); //substitute parameters for left, top, right, bottom
            tv.setLayoutParams(llp);
            tv.setText("0");
            tv.setId(500 + idx + 16);
            tv.setOnClickListener(this);
            if (idx % 2 == 0)
                tv.setBackgroundColor(Color.parseColor("#B0B0B0"));
            else
                tv.setBackgroundColor(Color.parseColor("#C0C0C0"));
            ll.addView(tv);

            tr.addView(ll);
        }
        tr = findViewById(R.id.tableRow0);
        for (int idx = 15; idx >= 0; idx--) {
            ll = new LinearLayout(this);
            ll.setOrientation(LinearLayout.VERTICAL);
            tv = new TextView(this);
            tv.setTextSize(10);
            tv.setTypeface(Typeface.MONOSPACE);
            tv.setText(Integer.toString(idx));
            if (idx % 2 == 0) {
                tv.setBackgroundColor(Color.parseColor("#B0B0B0"));
            } else {
                tv.setBackgroundColor(Color.parseColor("#C0C0C0"));
            }
            tv.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
            ll.addView(tv);

            tv = new TextView(this);
            tv.setTextSize(24);
            llp = new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
            llp.setMargins(10, 10, 10, 10); //substitute parameters for left, top, right, bottom
            tv.setLayoutParams(llp);
            tv.setText("0");
            tv.setId(500 + idx + 0);
            tv.setOnClickListener(this);
            if (idx % 2 == 0)
                tv.setBackgroundColor(Color.parseColor("#B0B0B0"));
            else
                tv.setBackgroundColor(Color.parseColor("#C0C0C0"));
            ll.addView(tv);

            tr.addView(ll);
        }
        ll = findViewById(R.id.LLBtn1);
        int num;
        for (num = 12; num < 16; num++) {
            btn = new Button(this, null, android.R.attr.buttonStyleSmall);
            btn.setId(200 + num);
            btn.setText(Integer.toHexString(num).toUpperCase(Locale.US));
            btn.setOnClickListener(this);
            ll.addView(btn);
        }
        btn = new Button(this, null, android.R.attr.buttonStyleSmall);
        //btn.setBackgroundColor(Color.CYAN);
        btn.setId(200 + 50);
        btn.setText("Clr");
        //btn.setBackgroundColor(color.holo_orange_light);
        btn.setOnClickListener(this);
        ll.addView(btn);
        btn = new Button(this, null, android.R.attr.buttonStyleSmall);
        btn.setId(200 + 52);
        btn.setText("<<");
        //btn.setBackgroundColor(color.holo_orange_light);
        btn.setOnClickListener(this);
        ll.addView(btn);

        ll = findViewById(R.id.LLBtn2);
        for (num = 8; num < 12; num++) {
            btn = new Button(this, null, android.R.attr.buttonStyleSmall);
            btn.setId(200 + num);
            btn.setText(Integer.toHexString(num).toUpperCase(Locale.US));
            btn.setOnClickListener(this);
            ll.addView(btn);
        }
        btn = new Button(this, null, android.R.attr.buttonStyleSmall);
        btn.setId(200 + 51);
        btn.setText("Inv");
        //btn.setBackgroundColor(color.holo_orange_light);
        btn.setOnClickListener(this);
        ll.addView(btn);

        btn = new Button(this, null, android.R.attr.buttonStyleSmall);
        btn.setId(200 + 53);
        btn.setText(">>");
        //btn.setBackgroundColor(color.holo_orange_light);
        btn.setOnClickListener(this);
        ll.addView(btn);

        ll = findViewById(R.id.LLBtn3);
        for (num = 4; num < 8; num++) {
            btn = new Button(this, null, android.R.attr.buttonStyleSmall);
            btn.setId(200 + num);
            btn.setText(Integer.toHexString(num).toUpperCase(Locale.US));
            btn.setOnClickListener(this);
            ll.addView(btn);
        }

        ll = findViewById(R.id.LLBtn4);
        for (num = 0; num < 4; num++) {
            btn = new Button(this, null, android.R.attr.buttonStyleSmall);
            btn.setId(200 + num);
            btn.setText(Integer.toHexString(num).toUpperCase(Locale.US));
            btn.setOnClickListener(this);
            ll.addView(btn);
        }

        UpdateNumber();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return id == R.id.action_settings || super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View arg0) {
        int pos = arg0.getId() - 200;
        if (pos < 16) {
            HexNumber <<= 4;
            HexNumber |= (long) pos;
            UpdateNumber();
            UpdateBits();
        } else if (pos == 50) {
            HexNumber = (long) 0;
            UpdateNumber();
            UpdateBits();
        } else if (pos == 51) {
            HexNumber = ~HexNumber;
            UpdateNumber();
            UpdateBits();
        } else if (pos == 52) {
            HexNumber <<= 1;
            UpdateNumber();
            UpdateBits();
        } else if (pos == 53) {
            HexNumber >>= 1;
            /* Shift must remove MSB */
            if (HexNumber < (long) 0) {
                HexNumber &= ~((long) 1 << 63);
            }
            UpdateNumber();
            UpdateBits();
        } else {
            long lpos = (long) (arg0.getId() - 500);
            if (((TextView) arg0).getText().equals("0")) {
                HexNumber |= ((long) 1 << lpos);
                ((TextView) arg0).setText("1");
            } else {
                HexNumber &= ~((long) 1 << lpos);
                ((TextView) arg0).setText("0");
            }
            UpdateNumber();
        }
    }

    private void UpdateNumber() {
        TextView tv;
        String hex_value = Long.toHexString(HexNumber);
        hex_value = hex_value.toUpperCase(Locale.US);
        int len = hex_value.length();
        if (len < 16) {
            char[] chars = new char[16 - len];
            Arrays.fill(chars, '0');
            hex_value = new String(chars) + hex_value;
        }
        hex_value = hex_value.substring(0, 4) + " " +
                hex_value.substring(4, 8) + " " +
                hex_value.substring(8, 12) + " " +
                hex_value.substring(12, 16);
        tv = findViewById(R.id.textView1);
        tv.setText("0x" + hex_value);

    }

    private void UpdateBits() {
        TextView arg0;
        for (int pos = 0; pos < 64; pos++) {
            arg0 = findViewById(500 + pos);
            if ((HexNumber & ((long) 1 << pos)) != (long) 0) {
                arg0.setText("1");
            } else {
                arg0.setText("0");
            }
        }
    }
}
