package com.generics;

public class Book {
	int id;
    String name;

    Book(int id,String name){
        this.id=id;
        this.name=name;
    }
    @Override
    public String toString() {
        return "["+this.id+", "+this.name+"]";
    }

    
    
}
