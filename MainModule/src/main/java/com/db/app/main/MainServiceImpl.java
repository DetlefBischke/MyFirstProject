package com.db.app.main;

import com.db.mockito.backend.BackendServieFactory;

/**
 * Created by phoenix on 22.07.17.
 */
public class MainServiceImpl implements MainService {

    @Override
    public String sayHello() {

        String hello = BackendServieFactory.getInstance().getHello();
        return hello;
    }
}
