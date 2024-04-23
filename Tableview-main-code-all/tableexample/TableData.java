
package tableexample;

public class TableData {
    private String name;
    private Integer age;
    
    public TableData(String name, Integer age){
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
