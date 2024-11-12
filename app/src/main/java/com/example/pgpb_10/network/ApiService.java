package com.example.pgpb_10.network;

import com.example.pgpb_10.model.Data;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("3672")
    Call<List<Data>> getAllUsers();
}
