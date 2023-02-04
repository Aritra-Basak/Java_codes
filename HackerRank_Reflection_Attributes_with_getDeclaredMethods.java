package technicals;

import java.lang.reflect.Method;
import java.util.*;


/*
 * In this problem, you will be given a class Solution in the editor. You have to fill in the incompleted lines so that it prints all the methods of another class called Student in alphabetical order.
 * The Student class looks like this:

class Student{
    private String name;
    private String id;
    private String email;
    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
    ......
    ......
   some more methods if written

}
You have to print all the methods of the student class in alphabetical order like this:

anothermethod
getName
setEmail
setId
......
......
some more methods if written
*/


class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

class Solutions {

    public static void main(String[] args){
        
       Class student = Student.class;// uses class literal, not a function.Because if we use normal object creation process with new then we cannot use .getDeclaredmethods()
        Method[] methods = student.getDeclaredMethods(); //Method type wrapper class to store the method names after retrieving them.
        ArrayList<String> methodList = new ArrayList<>();
        for(Method method : methods)
        {
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList)
        {
            System.out.println(name);
        }   
     }
    }
