package com.db.app.main;

/**
 * Created by phoenix on 23.07.17.
 */
public class MainServiceFactory {

   public static MainService getInstance() {
       return new MainServiceImpl();
    }

}
