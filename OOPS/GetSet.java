

public class GetSet {
    public static void main(String[] args){

        employee emp = new employee();

        emp.setName("Deepak");
        System.out.println(emp.getName());

        emp.setID(32);
        System.out.println(emp.getID());

        emp.setAge(21);
        System.out.println(emp.getAge());
    }
}

class employee {
    String name;
    int id;
    int age;

    String getName(){
        return this.name;
    }

    void setName(String newname){
        this.name = newname;
    }

    int getID(){
        return this.id;
    }

    void setID(int newID){
        this.id = newID;
    }

    int getAge(){
        return this.age;
    }

    void setAge(int newAge){
        this.age = newAge;
    }
}