package com.example.guyco.school;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String LINK_PHONEBOOK = "https://docs.google.com/spreadsheets/d/17FPrQvJD7oeCIfKJhq6jNkS3shfv_XudgoAViKF36Qs/edit?usp=sharing";
    private final String LINK_WHOIS = "https://he.wikipedia.org/wiki/%D7%90%D7%91%D7%A0%D7%A8_%D7%91%D7%A8%D7%96%D7%A0%D7%99";
    private final String LINK_EVENTS = "https://docs.google.com/document/d/1kIbqPBPw8_sKHw0XC-yBp8BY_rZqtS5ZH-v353UG6W8/edit?usp=sharing";
    private final String LINK_MESSAGES = "https://docs.google.com/document/d/1AMTO35iar_odnMq9cgOfuwV9MSot_vSrFMkGyoLhNeo/edit?usp=sharing";
    private final String LINK_GALLERY = "https://drive.google.com/drive/folders/17hTsO0oY8KUTS0QD9PdPf-finZtjTSo3?usp=sharing";
    //private final String LINK_SEND_TO_MANAGEMENT = "";
    //private final String LINK_SEND_TO_PARENTS = "";
    //private final String LINK_SEND_TO_NOONCARE = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    public void clickPhoneBook(View view) {
        Intent i= new Intent(this, PhoneBookActivity.class);
        startActivity(i);
        // startIntent(LINK_PHONEBOOK);
    }

    public void clickWhoIs(View view) {
        startIntent(LINK_WHOIS);
    }

    public void clickEvents(View view) {
        startIntent(LINK_EVENTS);
    }

    public void clickMessages(View view) {
        startIntent(LINK_MESSAGES);
    }

    public void clickGallery(View view) {
        startIntent(LINK_GALLERY);
    }

    public void clickSendToManagement(View view) {
        //startIntent(LINK_SEND_TO_MANAGEMENT);
        testToast();
    }

    public void clickSendToParents(View view) {
        //startIntent(LINK_SEND_TO_PARENTS);
        testToast();
    }

    public void clickSendToNoonCare(View view) {
        //startIntent(LINK_SEND_TO_NOONCARE);
        testToast();
    }

    private void testToast (){
        String text = "Not Working Yet...";
        Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        toast.show();
    }

    private void startIntent (String url){
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }


}
