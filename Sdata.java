package mytable;

public class Sdata {
    private String name;
    private Integer age;
    public Sdata(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    public Integer getAge(){
        return age;
    }
}
