package com.example.demo.businness.utilitarios;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

@Component
public class RetrofitApi {

    public Retrofit getRetrofit(String url) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client())
                .build();
        return retrofit;
    }

    public <T> T create(String url, final Class<T> api) {
        Retrofit retrofit = getRetrofit(url);
        T myClass = retrofit.create(api);

        return myClass;
    }

    public <T> T response(Call<T> response) throws IOException {
        Response<T> rs = response.execute();
        T list = rs.body();
        return list;
    }

    OkHttpClient client() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(5, TimeUnit.SECONDS)
                .writeTimeout(2, TimeUnit.SECONDS)
                .readTimeout(2, TimeUnit.SECONDS)
                .retryOnConnectionFailure(false)
                .build();
        return okHttpClient;
    }

}
