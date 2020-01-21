package ir.akhbar;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ParsService on 1/21/2020.
 */

public class Netwirking {
    private NewsListServer server;
    public Netwirking(){
        OkHttpClient Clint2=new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30,TimeUnit.SECONDS)
                .build();
        Retrofit retrofit=new Retrofit.Builder()
                .client(Clint2)
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.myjson.com/")
                .build();
        server =retrofit.create(NewsListServer.class);

    }
    public void getNewsList(){
        server.getnews()
                .enqueue(new Callback<NewsData>() {
                    @Override
                    public void onResponse(Call<NewsData> call, Response<NewsData> response) {
                        NewsData serverRespons=response.body();
                        System.out.println("loll"+serverRespons.getTitle());
                        System.out.println("loll"+serverRespons.getDescription());
                    }

                    @Override
                    public void onFailure(Call<NewsData> call, Throwable t) {
                        System.out.println("erorr");

                    }
                });
    }
}
