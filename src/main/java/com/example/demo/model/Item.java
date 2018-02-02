package com.example.demo.model;

/**
 * @author shi.jiake
 * @time 2018/2/2 11:27
 */
public class Item {

    private String no;
    private String name;

    public Item() { }

    public Item(String no, String name) {
        this.no = no;
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "no='" + no + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
