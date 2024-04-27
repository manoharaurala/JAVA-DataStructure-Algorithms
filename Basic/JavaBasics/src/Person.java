import java.util.HashMap;

public class Person {

    int id;
    int age;
    String name;

    public Person(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
       Person p1=this;
       Person p2= (Person) obj;

     /*  if(p1.getAge()== p2.getAge() && p1.getId()==p2.getId() && p1.getName()== p2.getName()){
           return true;
       }*/

       return true;

    }

    @Override
    public int hashCode() {
        return 1234;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person p1=new Person(1,25,"Ruby");
        Person p2=new Person(1,25,"Ruby");

        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
        System.out.println("p1 hascode: "+p1.hashCode()+"p2 hashcode "+p2.hashCode());

        HashMap<Person,Boolean> hm=new HashMap<Person, Boolean>();
        hm.put(p1,true);
        hm.put(p2,true);

        System.out.println("HashMap size: "+hm.size());

        Person person3 = new Person(2, 15, "ABC");
        hm.put(person3, false );



        System.out.println("HashMap size: "+hm.size());

        boolean ans=hm.get(person3);
        System.out.println(ans);



    }
}
