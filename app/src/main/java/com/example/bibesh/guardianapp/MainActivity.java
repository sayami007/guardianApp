package com.example.bibesh.guardianapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.bibesh.guardianapp.API.InterfaceAPI;
import com.example.bibesh.guardianapp.Listener.ClickListener;
import com.example.bibesh.guardianapp.Model.Headline;
import com.google.gson.Gson;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements ClickListener {

    @BindView(R.id.rv_headline)
    RecyclerView rvHeadline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        rvHeadline.setLayoutManager(new LinearLayoutManager(this));

        Retrofit builder = new Retrofit.Builder().baseUrl(Constant.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        InterfaceAPI interfaceAPI = builder.create(InterfaceAPI.class);
        Call<Headline> headlineCall = interfaceAPI.getHeadlines();

        headlineCall.enqueue(new Callback<Headline>() {
            @Override
            public void onResponse(Call<Headline> call, Response<Headline> response) {
                if (response.isSuccessful()) {
                    Headline headline = response.body();
                    List<Headline.ResponseBean.ResultsBean> result = headline.getResponse().getResults();
                    CustomAdapter adapter = new CustomAdapter(getApplicationContext(), result, MainActivity.this);
                    rvHeadline.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<Headline> call, Throwable t) {
                Log.v("ERROR", t.getMessage());
            }
        });
    }

    @Override
    public void onCardViewClick(int position, Headline.ResponseBean.ResultsBean result) {
        Log.v("VALUES", result.getWebTitle());
    }
}
