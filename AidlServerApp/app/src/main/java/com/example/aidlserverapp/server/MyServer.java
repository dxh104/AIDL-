package com.example.aidlserverapp.server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;

import com.example.aidlserverapp.MyServerAidl;
import com.example.aidlserverapp.entity.Person;

/**
 * Created by XHD on 2020/11/19
 */
public class MyServer extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new MyBinder();
    }

    static class MyBinder extends MyServerAidl.Stub {

        @Override
        public Person getPerson() throws RemoteException {
            return new Person("我名字是服务端");
        }

        @Override
        public String getString() throws RemoteException {
            return "I am String";
        }
    }
}
