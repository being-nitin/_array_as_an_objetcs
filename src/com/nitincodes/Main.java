package com.nitincodes;
// java program to create an array as object:
class stu{
    int rollNo;
    String name;
    int marks[];
stu()
{
    rollNo = 10;
    name = "Nitin";
    marks = new int[5];
for(int i=0;i< marks.length;i++){
    marks[i] = 10;
}
}
public void display(){
    System.out.println(rollNo);
    System.out.println(name);
    for (int res:marks){
        System.out.println(res);
    }
}
}
public class Main {

    public static void main(String[] args) {
        stu arr[] = new stu[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = new stu();
        }
    for(int i=0;i< arr.length;i++){
       arr[i].display();
    }

    }
}
