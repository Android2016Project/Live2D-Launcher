package us.nijikon.livelylauncher.assistant;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import us.nijikon.livelylauncher.R;
import us.nijikon.livelylauncher.adapters.CategoryAdapter;

public class CategoryActivity extends Activity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private String[] category= {"Contact","Note","Movie","Eat","Shop","Sport"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        mRecyclerView = (RecyclerView) findViewById(R.id.rv);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.getBackground().setAlpha(130);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new CategoryAdapter(category);

        mRecyclerView.setAdapter(mAdapter);

    }
}