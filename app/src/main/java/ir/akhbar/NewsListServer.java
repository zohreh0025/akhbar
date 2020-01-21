package ir.akhbar;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ParsService on 1/21/2020.
 */

public interface NewsListServer {
   @GET("bins/doz9i")
    public Call<NewsData> getnews();
}
