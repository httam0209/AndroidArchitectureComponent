package com.brian.androidarchitecturecomponent.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import com.brian.androidarchitecturecomponent.data.GithubRepository;
import com.brian.androidarchitecturecomponent.data.model.Project;

import java.util.List;

import javax.inject.Inject;

/**
 * @author Brian
 * @date: 1/13/18
 */


public class ProjectsViewModel extends AndroidViewModel {

    private LiveData<List<Project>> projectsListLiveData;

    @Inject
    public ProjectsViewModel(GithubRepository githubRepository, Application application) {
        super(application);

        projectsListLiveData = githubRepository.getProjects("Google");
    }

    public LiveData<List<Project>> getProjectsListLiveData() {
        return projectsListLiveData;
    }
}
