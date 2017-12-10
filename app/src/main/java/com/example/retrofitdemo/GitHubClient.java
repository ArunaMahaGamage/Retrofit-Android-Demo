package com.example.retrofitdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by aruna on 12/10/17.
 */

public interface GitHubClient {

    @GET("/users/{user}/repos")
    Call<List<GitHubRepo>> repoForUser(@Path("user") String user);
}
