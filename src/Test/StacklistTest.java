package Test;

import Stack.Stacklist.StackType;
import Stack.Stacklist.data3;

import java.util.Scanner;

public class StacklistTest {
    public static void main(String[] args) {
        StackType st=new StackType();
        data3 data3=new data3();

        StackType sta=st.STInit();
        Scanner sc=new Scanner(System.in);
        System.out.println("入栈");
        System.out.println("输入(格式如此)-->: name age");
        do {
            data3 data31=new data3();
            data31.name=sc.next();
            if(data31.name.equals("0")){
                break;//输入0退出
            }
            else{
                data31.age=sc.nextInt();
                st.Push(sta,data31);
            }
        }while (true);
        String temp="1";
        System.out.println("出栈，输入任意非0键继续：");
        temp=sc.next();
        while (!temp.equals("0")){
            data3=st.Pop(sta);
            System.out.printf("出栈数据-->(%s,%d)",data3.name,data3.age);
            temp=sc.next();
        }
        System.out.println("演示结束");
        st.STFree(st);
    }


}
