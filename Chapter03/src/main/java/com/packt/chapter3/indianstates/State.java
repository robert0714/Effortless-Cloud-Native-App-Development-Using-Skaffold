package com.packt.chapter3.indianstates;


public class State {

    private String name , capital ;

    public State ( String name, String capital){
        this.name = name ;
        this.capital = capital ;
    }
    public String getName(){
        return this.name ;
    }
    public String getCapital(){
        return this.capital ;
    }
}