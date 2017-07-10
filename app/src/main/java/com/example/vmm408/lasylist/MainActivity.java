package com.example.vmm408.lasylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.list_view_container)
    ListView listViewContainer;
    private List<String> globalList = new ArrayList<>();
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        for (int i = 0; i < 1000; i++) globalList.add("Item " + i);

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) list.add(globalList.get(i));


        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        listViewContainer.setAdapter(adapter);
//        listViewContainer.setOnScrollListener();


//        listViewContainer.setOnScrollListener(new EndlessScrollListViewListener() {
//            @Override
//            public boolean onLoadMore(int page, int totalItemsCount) {
//                List<String> tempList = new ArrayList<>();
//                for (int i = 10 + page; i < (10 + page) + 10; i++) {
//                    tempList.add(globalList.get(i));
//                }
//                adapter.addAll(tempList);
//                adapter.notifyDataSetChanged();
//                return true;
//            }
//        });

    }

}
