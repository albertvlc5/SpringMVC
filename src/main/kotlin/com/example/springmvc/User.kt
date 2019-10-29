package com.example.springmvc

class User constructor() {
    var user:String="";
    var pass:String="";
    //Le paso dos strings, y que se lo pase al constructor primario
    constructor(user:String, pass:String): this() {
        this.user = user;
        this.pass=pass;
    }

    override fun toString(): String {
        return "User{" +
                "user='" + user + '\'' +
                ", pass= ' " + pass + '\'' +
                '}';
    }
}