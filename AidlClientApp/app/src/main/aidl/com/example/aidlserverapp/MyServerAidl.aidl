// MyServerAidl.aidl
package com.example.aidlserverapp;

import com.example.aidlserverapp.entity.Person;

interface MyServerAidl {

    Person getPerson();
    String getString();
}
