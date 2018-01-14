package com.brian.androidarchitecturecomponent.data;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;

import com.brian.androidarchitecturecomponent.data.model.Project;
import com.brian.androidarchitecturecomponent.data.network.GithubService;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * @author Brian
 * @date: 1/14/18
 */

@Singleton
public class GithubRepository {

    private GithubService githubService;

    @Inject
    public GithubRepository(GithubService githubService) {
        this.githubService = githubService;
    }

    /**
     * Get project list by user
     * @param userId the userId
     * @return list projects
     */
    public LiveData<List<Project>> getProjects(String userId) {
        final MutableLiveData<List<Project>> mutableLiveData = new MutableLiveData<>();

        githubService.getProjectList(userId).enqueue(new Callback<List<Project>>() {
            @Override
            public void onResponse(@NonNull Call<List<Project>> call, @NonNull Response<List<Project>> response) {
                mutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<List<Project>> call, @NonNull Throwable t) {
                // handle error
                mutableLiveData.setValue(null);
            }
        });
        return mutableLiveData;
    }

    public LiveData<Project> getProjectDetails(String userId, String projectName) {
        final MutableLiveData<Project> mutableLiveData = new MutableLiveData<>();

        githubService.getProjectDetails(userId, projectName).enqueue(new Callback<Project>() {
            @Override
            public void onResponse(@NonNull Call<Project> call, @NonNull Response<Project> response) {
                mutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(@NonNull Call<Project> call, @NonNull Throwable t) {
                mutableLiveData.setValue(null);
            }
        });

        return mutableLiveData;
    }

}
