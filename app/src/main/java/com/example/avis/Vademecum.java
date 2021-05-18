package com.example.avis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;

public class Vademecum extends AppCompatActivity {

    EditText searchBar;
    ArrayList<String> testHeader= new ArrayList<>();
    ArrayList<String> testContent= new ArrayList<>();
    ArrayList<String> filteredArrayHead= new ArrayList<>();
    ArrayList<String> filteredArrayContent= new ArrayList<>();
    int lastPosition = -1;
    View lastView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vademecum);
        //test variables and arrays

        String textHeader="COSA OCCORRE PORTARE PRESENTANDOSI ALL’UNITÀ DI RACCOLTA PER EFFETTUARE LE VISITE?";
        String textContent="Per poter effettuare le visite preliminari o la donazione di sangue è necessario: \n" +
                "\n" +
                "• Tessera sanitaria\n" +
                "• Documento di riconoscimento in corso di validità";
        testHeader.add(textHeader);
        testContent.add(textContent);


        prepareLists(testHeader,testContent);
        searchBar= findViewById(R.id.search_bar_vademecum);
        searchBar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                clearList(expListView);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                //add a method to modify the ArrayLists
                if(editable.toString().isEmpty()){
                prepareLists(testHeader,testContent);
                }else {
                    filtraArray(editable.toString());
                    prepareLists(filteredArrayHead,filteredArrayContent);
                }
            }
        });
    }

    public void Profile(View view){
        HomePage.redirectActivity(this, Profile.class,false);
    }
    public void Contact_us(View view){
        HomePage.redirectActivity(this, Contact_us.class,false);
    }
    public void News(View view){
        HomePage.redirectActivity(this, Logout.class,false);
    }
    public void blood_weather(View view){
        HomePage.redirectActivity(this, blood_weather.class,false);
    }
    public void where_we_are(View view){
        HomePage.redirectActivity(this, where_we_are.class,false);
    }
    public void chi_siamo(View view){
        HomePage.redirectActivity(this, chi_siamo.class,false);
    }
    public void Settings(View view){
        HomePage.redirectActivity(this, Settings.class,false);
    }
    public void Logout(View view){
        HomePage.redirectActivity(this, Logout.class,false);
    }
    public void Home(View view){
        HomePage.redirectActivity(this, HomePage.class,true);
    }

    @Override
    protected void onPause(){
        super.onPause();
    }
    @Override
    public void onBackPressed() {
        Intent setIntent = new Intent(this, HomePage.class);
        setIntent.addCategory(Intent.CATEGORY_HOME);
        setIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(setIntent);
        finish();
    }
    //create varables
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;
    //prepare Lists
    private void prepareLists(ArrayList<String> title,ArrayList<String> Content){
        // get the listview
        expListView=findViewById(R.id.expandable_list);


        // preparing list data
        addData(title,Content);
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);
        // setting list adapter
        LinearLayout linearLayout = new LinearLayout(getApplicationContext());
        expListView.setAdapter(listAdapter);
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                if (lastPosition != -1  && groupPosition != lastPosition && expListView.isGroupExpanded(lastPosition)) {
                    expListView.collapseGroup(lastPosition);
                }
                lastPosition = groupPosition;
            }
        });
    }
    private void addData(ArrayList<String> title,ArrayList<String> Content) {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();
        listDataHeader=title;
        for (int i=0;i<listDataHeader.size();i++){
            List<String> ContentSlave = new ArrayList<>();
            ContentSlave.add(Content.get(i));
            listDataChild.put(listDataHeader.get(i),
                    ContentSlave);
        }
    }
    private void clearList(ExpandableListView expandableListView){
        ArrayList<String> emptyArray=new ArrayList<String>();
        prepareLists(emptyArray,emptyArray);
    }
    private void filtraArray(String word){
        ArrayList<String> arrayListHead=new ArrayList<>();
        ArrayList<String> arrayListContent=new ArrayList<>();
        arrayListHead=testHeader;
        arrayListContent=testContent;
        filteredArrayContent.clear();
        filteredArrayHead.clear();
        for (String names : arrayListHead) {
            if (names.toLowerCase().contains(word.toLowerCase())) {
                filteredArrayHead.add(names);
                filteredArrayContent.add(arrayListContent.get(arrayListHead.indexOf(names)));
            }
        }
        for (String names : arrayListContent) {
            if (names.toLowerCase().contains(word.toLowerCase())) {
                if (!filteredArrayContent.contains(names)){
                filteredArrayContent.add(names);
                filteredArrayHead.add(arrayListHead.get(arrayListContent.indexOf(names)));
                }
            }
        }
    }
}