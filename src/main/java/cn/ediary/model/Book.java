package cn.ediary.model;

public class Book {
	private Integer id;   
    private String name;   
    private int price;   
    
    public Book(){}   
    
    public Book(int id,String name,int price){
    	this.id = id;
    	this.name = name;
    	this.price = price;
    }
    
    public void setId(Integer id)   
    {   
        this.id = id;   
    }
    
    public Integer getId()   
    {   
        return this.id;   
    }   
}
