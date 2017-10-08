package com.db.mockito.backend;

/**
 * Created by phoenix on 23.07.17.
 */
public class BackendServieFactory {

    public static BackendService getInstance() {
        return new BackendServiceImpl();
    }
}
