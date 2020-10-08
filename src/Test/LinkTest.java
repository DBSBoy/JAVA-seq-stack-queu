package Test;

import Linklist.CLType;
import Linklist.data2;

import java.util.Scanner;

public class LinkTest {
    public static void main(String[] args) {
        CLType node,head=null;
        CLType cl=new CLType();
        String key,findkey;
        Scanner in=new Scanner(System.in);
        System.out.println("输入数据，格式为：key name age");
        do{
            data2 nodeData=new data2();
            nodeData.key=in.next();
            if (nodeData.key.equals("0")){
                break;
            }
            else {
                nodeData.name=in.next();
                nodeData.age=in.nextInt();
                head=cl.CLAddEnd(head,nodeData);
            }
        }while (true);
        cl.CLALLNode(head);

        System.out.println("插入结点，请在下一行输入插入位置关键字:");
        findkey=in.next();
        System.out.println("输入结点的数据（key name age）");
        data2 nodeData=new data2();
        nodeData.key=in.next();
        nodeData.name=in.next();
        nodeData.age=in.nextInt();
        head=cl.CLInsertNode(head,findkey,nodeData);

        System.out.println("删除结点，输入要删除的关键字");
        key=in.next();
        cl.CLDeleteNode(head,key);
        cl.CLALLNode(head);

        System.out.println("链表中查找，输入关键字");
        key=in.next();
        node=cl.CLFindNode(head,key);
        if (node!=null){
            nodeData=node.nodeData;
            System.out.printf("关键字%s对应结点(%s,%s,%d)\n",key,nodeData.key,nodeData.name,nodeData.age);
        }
        else {
            System.out.println("链表没有相关关键字");
        }
    }


}
